package Spboot.sroom.util;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.Verification;

@Service
public class JwtUtil implements IJwtUtil{
	
	@Value("${jwt.secret}")
	String tokenSecret;
	
//	public JwtUtil(){
//		System.out.println("jwtUTIL선언했다");
//	}
	

	@Override
	public String verifyToken(String givenJWT) {
		System.out.println("verifyToken : "+givenJWT);
		System.out.println("SECRET : "+tokenSecret);
		try {
		JWTVerifier verifier=JWT.require(Algorithm.HMAC256(tokenSecret))
										.withIssuer("ShareRoom")
										.build();
		String id=verifier.verify(givenJWT).getClaim("id").asString();
			return id;
		
		}catch (JWTVerificationException e){
			return null;
		}
//		System.out.println(verifier.verify(givenJWT).getClaim("name").asString());
		
	}

	@Override
	public String createJWT(String id, String name) {
		System.out.println("SECRET : "+tokenSecret);
		String token = null;
        try {
            Long EXPIRATION_TIME = 1000L * 60L * 10L;
            Date issuedAt = new Date();
            Date notBefore = new Date(issuedAt.getTime());
            Date expiresAt = new Date(issuedAt.getTime() + EXPIRATION_TIME);

            Algorithm algorithm = Algorithm.HMAC256(tokenSecret);
            token = JWT.create()
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

}
