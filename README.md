# ShareRoom
<p align="center"><img src="https://user-images.githubusercontent.com/64251016/115559901-1188e600-a2ef-11eb-9e40-406ee649c9b6.png"></p>

<p align="center">
  1인 가구가 증가하고 내 집 마련은 멀게만 느껴지는 요즘,<br>
  주거비 부담을 덜고 싶고 외로운 도시생활에 지친 사람들을 위해<br>
  '룸메이트를 찾는 사이트가 있으면 좋겠다'는 생각에서 시작되었습니다 :-)
</p>
<p align="center">
  SNS 계정을 이용하여 불필요한 절차 없이 회원가입 및 로그인이 가능합니다.<br>
  '방(Room)'은 일종의 게시판 형태로 CRUD기능을 구현하였고,<br>
  등록된 방들은 목록 및 지도(Kakao map)위에서도 확인할 수 있습니다.
</p>
  

## Developing

Vue.js와 Node.js로 프론트엔드를 구성하였고,  
백엔드는 SpringBoot를 이용하여 SpringFramework 기반으로 구축하였습니다.  
Axios를 이용하여 클라이언트와 백엔드 서버간의 Http통신이 이루어지며,  
Rest API를 구현하고자 노력했습니다.  

### built with
* Spring Boot 2.4.1 (SpringFramework 5.3.2, Java 1.8, Maven 3.6.3)
* Mybatis v2.1.4
* tomcat 9.0
* Vue.js v4.5.12
* Node.js v14.15.4
* BootstrapVue 
* KaKao API
* Axios
* Oracle Database 11g

### Authorization
* JWT(JSON Web Token)
* Oauth 2.0

### 프로젝트 기능

+ 로그인   
  Oauth2.0를 사용하여 sns 로그인을 구현하였습니다.  
  Google, Kakao, Naver 로그인이 가능하며, 각 서비스에서 인증이 완료되면 유저의 정보를 DB에 저장하고  
  JWT를 발행해 redis에 저장합니다.  
  이후에 로그인 정보가 필요한 요청 시, 클라이언트는 헤더에 해당 토큰정보를 실어보내고  
  백엔드 서버에서 토큰이 유효한지 검증 후에 요청에 대한 응답을 반환하도록 설계하였습니다.
  
  <img src="https://user-images.githubusercontent.com/64251016/115677899-e86a6300-a38b-11eb-8c28-84bade7c9306.png" width="600">

  accessToken을 이용하여 사용자 정보를 요청 및 얻기
  ```Java
  @Override
   public String getUserInfo(String access_token,String apiURL) {
      String header="Bearer "+access_token;
      
      try {
         // 호출할 url
         URL url=new URL(apiURL);
         HttpURLConnection con=(HttpURLConnection)url.openConnection();   
         con.setRequestMethod("GET");
         // 요청에 필요한 Header에 포함될 내용
         con.setRequestProperty("Authorization", header);
         int responseCode = con.getResponseCode();
         BufferedReader br;
         
         if(responseCode==200) {// 정상적으로 응답
            br=new BufferedReader(new InputStreamReader(con.getInputStream()));
         }else {// 에러 발생
            br=new BufferedReader(new InputStreamReader(con.getErrorStream()));
         }
         String inputLine;
         StringBuffer res=new StringBuffer();
         // 사용자 정보 저장함
         while((inputLine = br.readLine())!=null) {
            res.append(inputLine);
         }
         br.close();
         return res.toString();
      } catch (Exception e) {
         return "Err";
      }
      
   }  
  ```
  사용자 권한을 인증할 JWT를 발행
  ```Java
  @Override
     // 토큰 생성
   public String createJWT(String id, String name) {
      System.out.println("SECRET : "+tokenSecret);
      String token = null;
        try {
            Long EXPIRATION_TIME = 1000L * 60L * 100L;   // 토큰 만료 시간 -> 1시간 설정
            Date issuedAt = new Date();
            Date notBefore = new Date(issuedAt.getTime());
            Date expiresAt = new Date(issuedAt.getTime() + EXPIRATION_TIME);

            Algorithm algorithm = Algorithm.HMAC256(tokenSecret);
            token = JWT.create()   // 아이디와 이름 등 토큰 정보를 담음
                    .withIssuer("ShareRoom")
                    .withSubject(name)
                    .withAudience(name)
                    .withClaim("id", id)
                    .withClaim("name", name)
                    .withNotBefore(notBefore)
                    .withExpiresAt(expiresAt)
                    .sign(algorithm);
        } catch (Exception e) {
            System.err.println("err: " + e);
        }
        return token;
   }  
   ```

+ 주요 기능
  + 방(Room) 조회
    + 방의 정보를 DB에서 조회하여(GET) 목록으로 표출하고,  
      이를 Kakao 지도 API를 이용하여 지도 위에 표시하였습니다.  
      검색을 하지 않으면 기본으로 설정한 범위의 지도가 띄워지고,  
      해당 범위 안의 방이 마커로 표시되며 화면 왼쪽에 목록화 됩니다.  
      
      <img src="https://user-images.githubusercontent.com/64251016/115676109-39795780-a38a-11eb-9edf-53d6063ceffd.png" width="600">
      

  + 방(Room) 검색 기능
    + Kakao 로컬 API를 이용하여 장소 검색 기능을 구현하였습니다.  
      Request Header에 검색어를 담아 Kakao에 API 요청을 보내 연관된 장소의 좌표를 받아 지도에 반영합니다.  
      해당 범위안에 등록된 방이 있으면 마커로 표시됩니다.  
        
      <img src="https://user-images.githubusercontent.com/64251016/115676130-3e3e0b80-a38a-11eb-965d-229d4fcbd65e.png" width="600">
      
      또한 Kakao 로컬 API로 연관 검색어 추천 기능을 구현하였습니다.  
      단어를 검색하면 해당 단어가 포함된 장소를 검색창 아래에 리스트 형태로 표시합니다.  
      
      <img src="https://user-images.githubusercontent.com/64251016/115676125-3c744800-a38a-11eb-9eb2-2a5b88c51c48.png" width="600">
      
      최근검색어는 로그인 시 백엔드 서버에, 비로그인 시 Vuex에 저장됩니다.  
      
      ```Javascript
      if(this.$store.state.Login.userId!=null){               // 로그인 정보가 있으면
         const param=new URLSearchParams({                   // 검색어와 아이디, 토큰 정보를 담아
            id:this.$store.state.Login.userId,
            searchText:this.searchText
        })
        axios.post(process.env.VUE_APP_AXIOS_URL+'/savingSearchText',param,{     // 백엔드 서버에 api 요청을 보냄
            headers:{
                Authorization : "Bearer "+this.$store.state.Login.accessToken
                }
        }).then()
       }else{                              // 로그인 정보가 없으면
         const keyword=this.searchText;
         this.$store.dispatch("Login/ADDKEYWORD",{keyword})              // Vuex Store에 저장
       }
      

  + 방(Room) 등록/수정/삭제
    + 사용자에 의해 등록된 방은 formData에 저장되어 백엔드 서버로 보내지고,  
      백엔드 서버에서는 해당 데이터를 받아 MultipartRequest를 이용하여  
      방의 정보는 DB에, image file은 프로젝트 외부의 경로에 별도로 저장/관리합니다.  
      외부에 저장한 이미지는 ResourceHandler를 통해 경로를 매핑하여 불러올 수 있도록 설정하였습니다. (아래 설정 참고)
      
       ```Java
       @Configuration
       public class WebConfig implements WebMvcConfigurer{

       private final String uploadImagesPath;

       public WebConfig(@Value("${custom.path.upload-images}") String uploadImagesPath) {
          this.uploadImagesPath=uploadImagesPath;
       }

       @Override
       public void addResourceHandlers(ResourceHandlerRegistry registry) {
          List<String> imageFolders=Arrays.asList("profile","room");
          for(String imageFolder:imageFolders) {
             registry.addResourceHandler("/upload/"+imageFolder+"/**")
             .addResourceLocations("file:///"+uploadImagesPath+imageFolder+"/")
             .setCachePeriod(3600)
             .resourceChain(true)
             .addResolver(new PathResourceResolver());
          }
       }
       
     + 방의 정보를 수정하거나 삭제할 때 고려한 점은,  
       메모리 낭비를 줄이기 위해 불필요한 데이터가 남지 않도록 하는 것이었습니다.  
       방의 옵션 및 해시태그 등 별도의 테이블에 관리되는 데이터와 파일은  
       수정되는 즉시 기존의 데이터를 일괄 삭제하고, 새로운 데이터를 등록하도록 하였습니다.  
       
      ```Java  
      // 이미지 파일이 수정되었을 경우 기존 파일 삭제하는 로직
      String updateImage="";
      RoomDetailVO room = rs.getRoom(roomId);       // 기존 방 정보 불러옴(수정되기전)

      String roomImages[]=room.getRoom_images().split(",");
      if(imageUrlArr.size()>0) {             // 새로 등록된 이미지 파일이 있으면
        for(int i=0; i<roomImages.length; i++) {        // 기존에 DB에 저장되어있는 이미지 url의 배열을 돌면서
          String roomImage = roomImages[i].replace("<백엔드서버주소>/upload/room/", ""); 
          File file=new File(savePath+roomImage);       // 이미지 url을 실제 저장된 경로로 치환
          if(file.exists()) {
            file.delete();                 // 해당 파일 삭제
            System.out.print("파일 삭제 성공");
          }else {
            System.out.print("파일이 존재하지 않습니다");
          }
        }
      }

  + 찜(Wish List) 기능
    + 마음에 드는 방을 저장해 둘 수 있는 찜 기능을 추가하였습니다.  
      찜 추가/삭제는 버튼 하나로 간편하게 동작하도록 구현하였고,  
      목록은 별도로 메뉴를 만들어 확인할 수 있게 했습니다.  
      
      <img src="https://user-images.githubusercontent.com/64251016/115822752-02657d80-a440-11eb-956d-1ad95c889bdd.png" width="600">
      
      찜 버튼은 컴포넌트로 만들어 방 목록, 방 상세화면 등 어느 곳에 등록하여도  
      Vuex store에 저장된 사용자 아이디와 props로 전달받은 해당 방의 고유한 ID를 가지고  
      백엔드서버와 통신할 수 있도록 구현하였습니다.
      
  + 회원 정보 수정(Member Update) 기능
    + 사용자의 정보를 DB에서 조회하여 보여주고,  
      이메일, 닉네임, 프로필 사진, 나이, 성별을 수정할 수 있습니다.  
      이메일을 통하여 본인 인증할 수 있게 했습니다.
      
      <img src="https://user-images.githubusercontent.com/75728196/116044573-0c8bb400-a6ac-11eb-9fb2-b854b3e1f8f4.PNG" width="600">
      
      
      

### Link
* Frontend Github : https://github.com/mingmong0018/frontend
* View Working : [ShareRoom](http://shareroom-frontend.s3-website.ap-northeast-2.amazonaws.com/)   
                 (test account - ID : shareroomtest / PW : shareroom1234)
<br><br>
## Contact

* **1kimm**

  email : anyionee1@gmail.com


* **mingmong**

  email : mingmong0018@gmail.com
