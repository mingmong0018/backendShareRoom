
insert into sr_member(mem_id,mem_email,  mem_name, mem_age, mem_nickname, mem_gender, mem_confirm) 
values('0','test1@gmail.com', '테스트', '30', 'testNickname', 'f', 'y');
insert into sr_member(mem_id,mem_email, mem_name, mem_age, mem_nickname, mem_gender) 
values('1','test2@gmail.com', '테스트_미인증', '20', 'noconfirmTest', 'm');
insert into sr_member(mem_id,mem_email, mem_name, mem_age, mem_nickname, mem_gender) 
values('2','test2@gmail.com', '테스트_미인증', '25', 'noconfirmTest2', 'm');

insert into sr_room values (seq_sr_room.nextval, '1', '고시원 임대합니다', '서울 용산구 후암동 30-33', 'http://3.36.55.232:8070/roomImages/ 1_1.webp, http://3.36.55.232:8070/roomImages/ 1_2.webp, http://3.36.55.232:8070/roomImages/ 1_3.webp, http://3.36.55.232:8070/roomImages/ 1_4.webp, http://3.36.55.232:8070/roomImages/ 1_5.webp', 50, 30, ' 고시원 임대합니다헬로우 환영합니다 환영해요 ', TO_DATE( '2021-01-05' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '쉐어하우스 임대합니다', '서울 용산구 용산동2가 45-4', 'http://3.36.55.232:8070/roomImages/ 2_1.webp, http://3.36.55.232:8070/roomImages/ 2_2.webp, http://3.36.55.232:8070/roomImages/ 2_3.webp, http://3.36.55.232:8070/roomImages/ 2_4.webp, http://3.36.55.232:8070/roomImages/ 2_5.webp', 20, 15, ' 쉐어하우스 임대합니다 헬로우 환영합니다 환영해요 ', TO_DATE( '2021-01-05' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '고양이를 키워요!', '서울 용산구 이태원동 523', 'http://3.36.55.232:8070/roomImages/ 3_1.webp, http://3.36.55.232:8070/roomImages/ 3_2.webp, http://3.36.55.232:8070/roomImages/ 3_3.webp, http://3.36.55.232:8070/roomImages/ 3_4.webp, http://3.36.55.232:8070/roomImages/ 3_5.webp', 0, 27, ' 고양이를 키워요! 헬로우 환영합니다 환영해요 ', TO_DATE( '2021-01-05' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '전입신고해주실분', '서울 중랑구 면목동 284-3', 'http://3.36.55.232:8070/roomImages/ 4_1.webp, http://3.36.55.232:8070/roomImages/ 4_2.webp, http://3.36.55.232:8070/roomImages/ 4_3.webp, http://3.36.55.232:8070/roomImages/ 4_4.webp, http://3.36.55.232:8070/roomImages/ 4_5.webp', 30, 25, ' 전입신고해주실분 헬로우 환영합니다 환영해요 ', TO_DATE( '2021-01-05' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '룸메이트 구해요', '서울 중랑구 중화동 50-5', 'http://3.36.55.232:8070/roomImages/ 5_1.webp, http://3.36.55.232:8070/roomImages/ 5_2.webp, http://3.36.55.232:8070/roomImages/ 5_3.webp, http://3.36.55.232:8070/roomImages/ 5_4.webp, http://3.36.55.232:8070/roomImages/ 5_5.webp', 50, 23, ' 룸메이트 구해요 헬로우 환영합니다 환영해요 ', TO_DATE( '2021-01-05' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '룸메필요하시면 연락주세요', '서울 중랑구 묵동 189-4', 'http://3.36.55.232:8070/roomImages/ 6_1.webp, http://3.36.55.232:8070/roomImages/ 6_2.webp, http://3.36.55.232:8070/roomImages/ 6_3.webp, http://3.36.55.232:8070/roomImages/ 6_4.webp, http://3.36.55.232:8070/roomImages/ 6_5.webp', 300, 27, ' 룸메필요하시면 연락주세요 헬로우 환영합니다 환영해요 ', TO_DATE( '2021-01-05' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '룸메나 하메구해요', '서울 노원구 공릉동 589-15', 'http://3.36.55.232:8070/roomImages/ 7_1.webp, http://3.36.55.232:8070/roomImages/ 7_2.webp, http://3.36.55.232:8070/roomImages/ 7_3.webp, http://3.36.55.232:8070/roomImages/ 7_4.webp, http://3.36.55.232:8070/roomImages/ 7_5.webp', 0, 47, ' 룸메나 하메구해요 헬로우 환영합니다 환영해요 ', TO_DATE( '2021-01-05' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '집 같이 구하실분', '서울 노원구 월계동 401-4', 'http://3.36.55.232:8070/roomImages/ 8_1.webp, http://3.36.55.232:8070/roomImages/ 8_2.webp, http://3.36.55.232:8070/roomImages/ 8_3.webp, http://3.36.55.232:8070/roomImages/ 8_4.webp, http://3.36.55.232:8070/roomImages/ 8_5.webp', 60, 20, ' 집 같이 구하실분 헬로우 환영합니다 환영해요 ', TO_DATE( '2021-01-05' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '같이 사실 룸메 구합니다', '서울 노원구 상계동 606-12', 'http://3.36.55.232:8070/roomImages/ 9_1.webp, http://3.36.55.232:8070/roomImages/ 9_2.webp, http://3.36.55.232:8070/roomImages/ 9_3.webp, http://3.36.55.232:8070/roomImages/ 9_4.webp, http://3.36.55.232:8070/roomImages/ 9_5.webp', 70, 23, ' 같이 사실 룸메 구합니다 헬로우 환영합니다 환영해요 ', TO_DATE( '2021-01-05' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '하우스 메이트 구합니다', '서울 은평구 갈현동 267-56', 'http://3.36.55.232:8070/roomImages/ 10_1.webp, http://3.36.55.232:8070/roomImages/ 10_2.webp, http://3.36.55.232:8070/roomImages/ 10_3.webp, http://3.36.55.232:8070/roomImages/ 10_4.webp, http://3.36.55.232:8070/roomImages/ 10_5.webp', 50, 20, ' 하우스 메이트 구합니다 헬로우 환영합니다 환영해요 ', TO_DATE( '2021-01-05' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '저렴한 미니원룸', '서울 은평구 진관동 190-8', 'http://3.36.55.232:8070/roomImages/ 11_1.webp, http://3.36.55.232:8070/roomImages/ 11_2.webp, http://3.36.55.232:8070/roomImages/ 11_3.webp, http://3.36.55.232:8070/roomImages/ 11_4.webp, http://3.36.55.232:8070/roomImages/ 11_5.webp', 30, 30, ' 저렴한 미니원룸 헬로우 환영합니다 환영해요 ', TO_DATE( '2021-01-05' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '예쁘고 깨끗한 원룸', '서울 은평구 응암동 71-1', 'http://3.36.55.232:8070/roomImages/ 12_1.webp, http://3.36.55.232:8070/roomImages/ 12_2.webp, http://3.36.55.232:8070/roomImages/ 12_3.webp, http://3.36.55.232:8070/roomImages/ 12_4.webp, http://3.36.55.232:8070/roomImages/ 12_5.webp', 70, 25, ' 예쁘고 깨끗한 원룸 헬로우 환영합니다 환영해요 ', TO_DATE( '2021-01-05' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '쾌적한 꽃집 원룸', '서울 서대문구 남가좌동 183-6', 'http://3.36.55.232:8070/roomImages/ 13_1.webp, http://3.36.55.232:8070/roomImages/ 13_2.webp, http://3.36.55.232:8070/roomImages/ 13_3.webp, http://3.36.55.232:8070/roomImages/ 13_4.webp, http://3.36.55.232:8070/roomImages/ 13_5.webp', 30, 30, ' 쾌적한 꽃집 원룸 헬로우 환영합니다 환영해요 ', TO_DATE( '2021-01-05' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '다세대주택.옥상.옥탑방', '서울 서대문구 북아현동 3-136', 'http://3.36.55.232:8070/roomImages/ 14_1.webp, http://3.36.55.232:8070/roomImages/ 14_2.webp, http://3.36.55.232:8070/roomImages/ 14_3.webp, http://3.36.55.232:8070/roomImages/ 14_4.webp, http://3.36.55.232:8070/roomImages/ 14_5.webp', 50, 22, ' 다세대주택.옥상.옥탑방 헬로우 환영합니다 환영해요 ', TO_DATE( '2021-01-05' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '깨끗한 투룸 하메구합니다', '서울 서대문구 홍제동 134-2', 'http://3.36.55.232:8070/roomImages/ 15_1.webp, http://3.36.55.232:8070/roomImages/ 15_2.webp, http://3.36.55.232:8070/roomImages/ 15_3.webp, http://3.36.55.232:8070/roomImages/ 15_4.webp, http://3.36.55.232:8070/roomImages/ 15_5.webp', 60, 25, ' 깨끗한 투룸 하메구합니다 헬로우 환영합니다 환영해요 ', TO_DATE( '2021-01-05' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '독방 단기입주 가능', '서울 서대문구 홍제동 471', 'http://3.36.55.232:8070/roomImages/ 16_1.webp, http://3.36.55.232:8070/roomImages/ 16_2.webp, http://3.36.55.232:8070/roomImages/ 16_3.webp, http://3.36.55.232:8070/roomImages/ 16_4.webp, http://3.36.55.232:8070/roomImages/ 16_5.webp', 0, 35, ' 독방 단기입주 가능 헬로우 환영합니다 환영해요 ', TO_DATE( '2021-01-05' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '현대 고시원', '서울 종로구 계동 3-2', 'http://3.36.55.232:8070/roomImages/ 17_1.webp, http://3.36.55.232:8070/roomImages/ 17_2.webp, http://3.36.55.232:8070/roomImages/ 17_3.webp, http://3.36.55.232:8070/roomImages/ 17_4.webp, http://3.36.55.232:8070/roomImages/ 17_5.webp', 50, 29, ' 현대 고시원 책임집니다 책임져 ', TO_DATE( '2021-01-05' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '원룸텔로 가성비 good', '서울 종로구 연지동 188-12', 'http://3.36.55.232:8070/roomImages/ 18_1.webp, http://3.36.55.232:8070/roomImages/ 18_2.webp, http://3.36.55.232:8070/roomImages/ 18_3.webp, http://3.36.55.232:8070/roomImages/ 18_4.webp, http://3.36.55.232:8070/roomImages/ 18_5.webp', 0, 21, ' 원룸텔로 가성비 good 책임집니다 책임져 ', TO_DATE( '2021-01-05' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '즉시 입주 가능한 원룸!', '서울 종로구 익선동 78-1', 'http://3.36.55.232:8070/roomImages/ 19_1.webp, http://3.36.55.232:8070/roomImages/ 19_2.webp, http://3.36.55.232:8070/roomImages/ 19_3.webp, http://3.36.55.232:8070/roomImages/ 19_4.webp, http://3.36.55.232:8070/roomImages/ 19_5.jpg', 30, 25, ' 즉시 입주 가능한 원룸! 책임집니다 책임져 ', TO_DATE( '2021-01-05' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '테라스 있는 신축 오피스텔', '서울 종로구 홍파동 199', 'http://3.36.55.232:8070/roomImages/ 20_1.webp, http://3.36.55.232:8070/roomImages/ 20_2.webp, http://3.36.55.232:8070/roomImages/ 20_3.webp, http://3.36.55.232:8070/roomImages/ 20_4.webp, http://3.36.55.232:8070/roomImages/ 20_5.webp', 35, 30, ' 테라스 있는 신축 오피스텔 책임집니다 책임져 ', TO_DATE( '2021-01-05' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '같이 지낼 룸메~ 다 맞춰 드리는 성격입니다.', '서울 성북구 보문동1가 128-6', 'http://3.36.55.232:8070/roomImages/ 21_1.webp, http://3.36.55.232:8070/roomImages/ 21_2.webp, http://3.36.55.232:8070/roomImages/ 21_3.webp, http://3.36.55.232:8070/roomImages/ 21_4.webp, http://3.36.55.232:8070/roomImages/ 21_5.webp', 10, 10, ' 같이 지낼 룸메~ 다 맞춰 드리는 성격입니다. 책임집니다 책임져 ', TO_DATE( '2021-01-05' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '오피스텔 룸메이트 구해요^^', '서울 성북구 안암동2가 141-5', 'http://3.36.55.232:8070/roomImages/ 22_1.webp, http://3.36.55.232:8070/roomImages/ 22_2.webp, http://3.36.55.232:8070/roomImages/ 22_3.webp, http://3.36.55.232:8070/roomImages/ 22_4.webp, http://3.36.55.232:8070/roomImages/ 22_5.webp', 25, 18, ' 오피스텔 룸메이트 구해요^^ 책임집니다 책임져 ', TO_DATE( '2021-01-05' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '무보증금,무관리비 원룸', '서울 성북구 길음동 1088-4', 'http://3.36.55.232:8070/roomImages/ 23_1.webp, http://3.36.55.232:8070/roomImages/ 23_2.webp, http://3.36.55.232:8070/roomImages/ 23_3.webp, http://3.36.55.232:8070/roomImages/ 23_4.webp, http://3.36.55.232:8070/roomImages/ 23_5.webp', 0, 33, ' 무보증금,무관리비 원룸 책임집니다 책임져 ', TO_DATE( '2021-01-05' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '단기가능 원룸', '서울 성북구 정릉동 226-24', 'http://3.36.55.232:8070/roomImages/ 24_1.webp, http://3.36.55.232:8070/roomImages/ 24_2.webp, http://3.36.55.232:8070/roomImages/ 24_3.webp, http://3.36.55.232:8070/roomImages/ 24_4.webp, http://3.36.55.232:8070/roomImages/ 24_5.webp', 0, 47, ' 단기가능 원룸 책임집니다 책임져 ', TO_DATE( '2021-01-05' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '월세방, 풀옵션, 단기가능 - 원룸', '서울 동대문구 답십리동 464-1', 'http://3.36.55.232:8070/roomImages/ 25_1.webp, http://3.36.55.232:8070/roomImages/ 25_2.webp, http://3.36.55.232:8070/roomImages/ 25_3.webp, http://3.36.55.232:8070/roomImages/ 25_4.webp, http://3.36.55.232:8070/roomImages/ 25_5.webp', 0, 65, ' 월세방, 풀옵션, 단기가능 - 원룸 책임집니다 책임져 ', TO_DATE( '2020-12-28' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '단기원룸 위치좋고 깔끔합니다', '서울 동대문구 전농동 648-11', 'http://3.36.55.232:8070/roomImages/ 26_1.webp, http://3.36.55.232:8070/roomImages/ 26_2.webp, http://3.36.55.232:8070/roomImages/ 26_3.webp, http://3.36.55.232:8070/roomImages/ 26_4.webp, http://3.36.55.232:8070/roomImages/ 26_5.webp', 80, 80, ' 단기원룸 위치좋고 깔끔합니다 책임집니다 책임져 ', TO_DATE( '2020-12-29' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '좋은 방 있어 양도합니다.', '서울 동대문구 전농동 644-82', 'http://3.36.55.232:8070/roomImages/ 27_1.webp, http://3.36.55.232:8070/roomImages/ 27_2.webp, http://3.36.55.232:8070/roomImages/ 27_3.webp, http://3.36.55.232:8070/roomImages/ 27_4.webp, http://3.36.55.232:8070/roomImages/ 27_5.webp', 100, 23, ' 좋은 방 있어 양도합니다. 책임집니다 책임져 ', TO_DATE( '2020-12-30' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '단기 하메 구합니다', '서울 도봉구 도봉동 611-10', 'http://3.36.55.232:8070/roomImages/ 28_1.webp, http://3.36.55.232:8070/roomImages/ 28_2.webp, http://3.36.55.232:8070/roomImages/ 28_3.webp, http://3.36.55.232:8070/roomImages/ 28_4.webp, http://3.36.55.232:8070/roomImages/ 28_5.webp', 120, 50, ' 단기 하메 구합니다 책임집니다 책임져 ', TO_DATE( '2020-12-31' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '(초저렴) 남자만 가능', '서울 도봉구 쌍문동 85-35', 'http://3.36.55.232:8070/roomImages/ 29_1.webp, http://3.36.55.232:8070/roomImages/ 29_2.webp, http://3.36.55.232:8070/roomImages/ 29_3.jpg, http://3.36.55.232:8070/roomImages/ 29_4.webp, http://3.36.55.232:8070/roomImages/ 29_5.webp', 20, 20, ' (초저렴) 남자만 가능 책임집니다 책임져 ', TO_DATE( '2021-01-01' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '가족같은 하메 구해용', '서울 도봉구 창동 330-4', 'http://3.36.55.232:8070/roomImages/ 30_1.webp, http://3.36.55.232:8070/roomImages/ 30_2.jpg, http://3.36.55.232:8070/roomImages/ 30_3.webp, http://3.36.55.232:8070/roomImages/ 30_4.jpg, http://3.36.55.232:8070/roomImages/ 30_5.webp', 100, 33, ' 가족같은 하메 구해용 책임집니다 책임져 ', TO_DATE( '2021-01-02' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '원룸팔아요 쉐어', '서울 도봉구 도봉동 597-28', 'http://3.36.55.232:8070/roomImages/ 31_1.webp, http://3.36.55.232:8070/roomImages/ 31_2.webp, http://3.36.55.232:8070/roomImages/ 31_3.webp, http://3.36.55.232:8070/roomImages/ 31_4.webp, http://3.36.55.232:8070/roomImages/ 31_5.webp', 10, 35, ' 원룸팔아요 쉐어 책임집니다 책임져 ', TO_DATE( '2021-01-03' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '저렴한 원룸', '서울 강북구 수유동 584-2', 'http://3.36.55.232:8070/roomImages/ 32_1.webp, http://3.36.55.232:8070/roomImages/ 32_2.webp, http://3.36.55.232:8070/roomImages/ 32_3.webp, http://3.36.55.232:8070/roomImages/ 32_4.webp, http://3.36.55.232:8070/roomImages/ 32_5.webp', 10, 40, ' 저렴한 원룸 책임집니다 책임져 ', TO_DATE( '2021-01-04' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '1인1방 쉐어하우스', '서울 강북구 번동 436-3', 'http://3.36.55.232:8070/roomImages/ 33_1.webp, http://3.36.55.232:8070/roomImages/ 33_2.webp, http://3.36.55.232:8070/roomImages/ 33_3.webp, http://3.36.55.232:8070/roomImages/ 33_4.webp, http://3.36.55.232:8070/roomImages/ 33_5.webp', 30, 25, ' 1인1방 쉐어하우스 책임집니다 책임져 ', TO_DATE( '2021-01-03' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '언제든 입주 가능.깨끗.', '서울 강북구 우이동 139-4', 'http://3.36.55.232:8070/roomImages/ 34_1.webp, http://3.36.55.232:8070/roomImages/ 34_2.webp, http://3.36.55.232:8070/roomImages/ 34_3.webp, http://3.36.55.232:8070/roomImages/ 34_4.webp, http://3.36.55.232:8070/roomImages/ 34_5.webp', 300, 25, ' 언제든 입주 가능.깨끗. 책임집니다 책임져 ', TO_DATE( '2021-01-03' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '여성전용 쉐어하우스 입주자 모집합니다', '서울 강북구 수유동 168-6', 'http://3.36.55.232:8070/roomImages/ 35_1.webp, http://3.36.55.232:8070/roomImages/ 35_2.webp, http://3.36.55.232:8070/roomImages/ 35_3.webp, http://3.36.55.232:8070/roomImages/ 35_4.webp, http://3.36.55.232:8070/roomImages/ 35_5.webp', 5, 20, ' 여성전용 쉐어하우스 입주자 모집합니다 책임집니다 책임져 ', TO_DATE( '2021-01-03' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '서울 수도권 보증 200 투룸 실화~?', '서울 강북구 미아동 762-40', 'http://3.36.55.232:8070/roomImages/ 36_1.webp, http://3.36.55.232:8070/roomImages/ 36_2.webp, http://3.36.55.232:8070/roomImages/ 36_3.webp, http://3.36.55.232:8070/roomImages/ 36_4.webp, http://3.36.55.232:8070/roomImages/ 36_5.webp', 300, 29, ' 서울 수도권 보증 200 투룸 실화~? 책임집니다 책임져 ', TO_DATE( '2021-01-03' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '룸메 구해요', '서울 서대문구 홍은동 274-67', 'http://3.36.55.232:8070/roomImages/ 37_1.webp, http://3.36.55.232:8070/roomImages/ 37_2.webp, http://3.36.55.232:8070/roomImages/ 37_3.webp, http://3.36.55.232:8070/roomImages/ 37_4.webp, http://3.36.55.232:8070/roomImages/ 37_5.webp', 200, 40, ' 룸메 구해요 사생활 지켜드립니다 ', TO_DATE( '2021-01-03' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '[남성전용] 쉐어하우스', '서울 서대문구 홍은동 272-2', 'http://3.36.55.232:8070/roomImages/ 38_1.webp, http://3.36.55.232:8070/roomImages/ 38_2.webp, http://3.36.55.232:8070/roomImages/ 38_3.webp, http://3.36.55.232:8070/roomImages/ 38_4.webp, http://3.36.55.232:8070/roomImages/ 38_5.webp', 0, 40, ' [남성전용] 쉐어하우스 사생활 지켜드립니다 ', TO_DATE( '2021-01-03' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '20만원 지원 프로모션~!!/[남성전용]', '서울 서대문구 홍은동 268-26', 'http://3.36.55.232:8070/roomImages/ 39_1.webp, http://3.36.55.232:8070/roomImages/ 39_2.webp, http://3.36.55.232:8070/roomImages/ 39_3.webp, http://3.36.55.232:8070/roomImages/ 39_4.webp, http://3.36.55.232:8070/roomImages/ 39_5.webp', 0, 35, ' 20만원 지원 프로모션~!!/[남성전용] 사생활 지켜드립니다 ', TO_DATE( '2021-01-03' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '룸메이트 구해요((원룸오피스텔))', '서울 서대문구 홍은동 268-27', 'http://3.36.55.232:8070/roomImages/ 40_1.webp, http://3.36.55.232:8070/roomImages/ 40_2.webp, http://3.36.55.232:8070/roomImages/ 40_3.webp, http://3.36.55.232:8070/roomImages/ 40_4.webp, http://3.36.55.232:8070/roomImages/ 40_5.webp', 0, 65, ' 룸메이트 구해요((원룸오피스텔)) 사생활 지켜드립니다 ', TO_DATE( '2021-01-03' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '화장실 있는 큰방2인실', '서울 서대문구 홍은동 268-18', 'http://3.36.55.232:8070/roomImages/ 41_1.webp, http://3.36.55.232:8070/roomImages/ 41_2.webp, http://3.36.55.232:8070/roomImages/ 41_3.webp, http://3.36.55.232:8070/roomImages/ 41_4.webp, http://3.36.55.232:8070/roomImages/ 41_5.webp', 50, 25, ' 화장실 있는 큰방2인실 사생활 지켜드립니다 ', TO_DATE( '2021-01-03' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '분리형 원룸이에요 투룸아닙니다', '서울 서대문구 연희동 1-37', 'http://3.36.55.232:8070/roomImages/ 42_1.webp, http://3.36.55.232:8070/roomImages/ 42_2.webp, http://3.36.55.232:8070/roomImages/ 42_3.webp, http://3.36.55.232:8070/roomImages/ 42_4.webp, http://3.36.55.232:8070/roomImages/ 42_5.webp', 29, 29, ' 분리형 원룸이에요 투룸아닙니다 사생활 지켜드립니다 ', TO_DATE( '2021-01-03' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '풀옵션 원룸입니당', '서울 서대문구 연희동 1-100', 'http://3.36.55.232:8070/roomImages/ 43_1.webp, http://3.36.55.232:8070/roomImages/ 43_2.webp, http://3.36.55.232:8070/roomImages/ 43_3.webp, http://3.36.55.232:8070/roomImages/ 43_4.webp, http://3.36.55.232:8070/roomImages/ 43_5.webp', 100, 38, ' 풀옵션 원룸입니당 사생활 지켜드립니다 ', TO_DATE( '2021-01-03' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '아파트 룸메이트 구함', '서울 동대문구 전농동 536-23', 'http://3.36.55.232:8070/roomImages/ 44_1.webp, http://3.36.55.232:8070/roomImages/ 44_2.webp, http://3.36.55.232:8070/roomImages/ 44_3.webp, http://3.36.55.232:8070/roomImages/ 44_4.webp, http://3.36.55.232:8070/roomImages/ 44_5.webp', 50, 25, ' 아파트 룸메이트 구함 사생활 지켜드립니다 ', TO_DATE( '2021-01-03' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '같이 지낼 룸메 찾아용', '서울 동대문구 전농동 206-108', 'http://3.36.55.232:8070/roomImages/ 45_1.webp, http://3.36.55.232:8070/roomImages/ 45_2.webp, http://3.36.55.232:8070/roomImages/ 45_3.webp, http://3.36.55.232:8070/roomImages/ 45_4.webp, http://3.36.55.232:8070/roomImages/ 45_5.webp', 30, 25, ' 같이 지낼 룸메 찾아용 사생활 지켜드립니다 ', TO_DATE( '2021-01-03' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '룸메나 하메 구해용', '서울 동대문구 이문동 264-53', 'http://3.36.55.232:8070/roomImages/ 46_1.webp, http://3.36.55.232:8070/roomImages/ 46_2.webp, http://3.36.55.232:8070/roomImages/ 46_3.webp, http://3.36.55.232:8070/roomImages/ 46_4.webp, http://3.36.55.232:8070/roomImages/ 46_5.webp', 50, 33, ' 룸메나 하메 구해용 사생활 지켜드립니다 ', TO_DATE( '2021-01-03' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '원룸.10평.깨끗.조용', '서울 동대문구 장안동 405-11', 'http://3.36.55.232:8070/roomImages/ 47_1.webp, http://3.36.55.232:8070/roomImages/ 47_2.webp, http://3.36.55.232:8070/roomImages/ 47_3.webp, http://3.36.55.232:8070/roomImages/ 47_4.webp, http://3.36.55.232:8070/roomImages/ 47_5.webp', 0, 47, ' 원룸.10평.깨끗.조용 사생활 지켜드립니다 ', TO_DATE( '2020-12-21' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '사람 구합니다', '서울 마포구 노고산동 1-39', 'http://3.36.55.232:8070/roomImages/ 48_1.webp, http://3.36.55.232:8070/roomImages/ 48_2.webp, http://3.36.55.232:8070/roomImages/ 48_3.webp, http://3.36.55.232:8070/roomImages/ 48_4.webp, http://3.36.55.232:8070/roomImages/ 48_5.webp', 0, 57, ' 사람 구합니다 사생활 지켜드립니다 ', TO_DATE( '2020-12-21' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '단기로 지내실분 .단기무보증 가능', '서울 마포구 노고산동 1-23', 'http://3.36.55.232:8070/roomImages/ 49_1.webp, http://3.36.55.232:8070/roomImages/ 49_2.webp, http://3.36.55.232:8070/roomImages/ 49_3.webp, http://3.36.55.232:8070/roomImages/ 49_4.webp, http://3.36.55.232:8070/roomImages/ 49_5.webp', 70, 35, ' 단기로 지내실분 .단기무보증 가능 사생활 지켜드립니다 ', TO_DATE( '2020-12-21' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '여성룸메보증금 50만 월세 25만(2인실)', '서울 서대문구 창천동 229', 'http://3.36.55.232:8070/roomImages/ 50_1.webp, http://3.36.55.232:8070/roomImages/ 50_2.webp, http://3.36.55.232:8070/roomImages/ 50_3.webp, http://3.36.55.232:8070/roomImages/ 50_4.webp, http://3.36.55.232:8070/roomImages/ 50_5.webp', 50, 25, ' 여성룸메보증금 50만 월세 25만(2인실) 사생활 지켜드립니다 ', TO_DATE( '2020-12-21' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '이태원역 도보 2분 넓고 깨끗한 방', '서울 용산구 이태원동 135-50', 'http://3.36.55.232:8070/roomImages/ 51_1.jpg, http://3.36.55.232:8070/roomImages/ 51_2.jpg, http://3.36.55.232:8070/roomImages/ 51_3.jpg, http://3.36.55.232:8070/roomImages/ 51_4.jpg, http://3.36.55.232:8070/roomImages/ 51_5.jpg', 50, 44, '* 풀옵션이며, 간단한 짐만 가져오셔도 생활에 전혀 문제가 없습니다.chr(13)||chr(10)
* 객실들은 건물의 조용한 곳에 위치하여 편하게 지내실수 있습니다.chr(13)||chr(10)
* 남산 공원과 한강과도 매우 가까워 운동하시기에도 최적의 조건입니다.chr(13)||chr(10)', TO_DATE( '2020-12-21' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '여러분들을 집순이로 만들어줄 수니하우스', '서울 관악구 봉천동 1688-152', 'http://3.36.55.232:8070/roomImages/ 52_1.jpg, http://3.36.55.232:8070/roomImages/ 52_2.jpg, http://3.36.55.232:8070/roomImages/ 52_3.jpg, http://3.36.55.232:8070/roomImages/ 52_4.jpg, http://3.36.55.232:8070/roomImages/ 52_5.jpg', 70, 35, ' 서울대입구역에서 5분거리로 정말 너무너무 가깝고 버스정류장과 인접하여 굉장히 이동이 편리합니다.chr(13)||chr(10) (언덕X) ', TO_DATE( '2020-12-21' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '신림동 로랑하우스 룸메이트 구해요', '서울 관악구 신림동 251', 'http://3.36.55.232:8070/roomImages/ 53_1.jpg, http://3.36.55.232:8070/roomImages/ 53_2.jpg, http://3.36.55.232:8070/roomImages/ 53_3.jpg, http://3.36.55.232:8070/roomImages/ 53_4.jpg, http://3.36.55.232:8070/roomImages/ 53_5.jpg', 50, 35, '새롭게 리모델링해서 정말 깔끔한 집입니다.chr(13)||chr(10)
주변 대학기숙사와 원룸대비 가격면에서도 합리적이라고 생각해요!chr(13)||chr(10)
넓은 평수에 개별화장실, 세탁기 2대, 정수기도 있으니 몸만 오시면 됩니다chr(13)||chr(10)', TO_DATE( '2020-12-21' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '서울대입구역 투룸 룸쉐어', '서울 관악구 봉천동 196-310', 'http://3.36.55.232:8070/roomImages/ 54_1.jpg, http://3.36.55.232:8070/roomImages/ 54_2.jpg, http://3.36.55.232:8070/roomImages/ 54_3.jpg, http://3.36.55.232:8070/roomImages/ 54_4.jpg, http://3.36.55.232:8070/roomImages/ 54_5.jpg', 70, 35, 'ㅇ 서울 지하철 2호선 서울대입구역 부근입니다.chr(13)||chr(10) / 강남역 지하철 11분 / 홍대입구역 지하철 30분 이내chr(13)||chr(10)
ㅇ 구립독서실 및 편의점등 편의시설 주변에 위치하고 있어서 편리한 생활이 가능 chr(13)||chr(10)', TO_DATE( '2020-12-21' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '낙성대역 10분 아파트 룸메이트 구해요', '서울 관악구 봉천동 878-3', 'http://3.36.55.232:8070/roomImages/ 55_1.jpg, http://3.36.55.232:8070/roomImages/ 55_2.jpg, http://3.36.55.232:8070/roomImages/ 55_3.jpg, http://3.36.55.232:8070/roomImages/ 55_4.jpg, http://3.36.55.232:8070/roomImages/ 55_5.jpg', 40, 38, '공용공간은 정기적으로 청소해요chr(13)||chr(10)
침대/책상 등 가구는 모두 있습니다chr(13)||chr(10)', TO_DATE( '2020-12-21' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '숭실대 근처 룸메이트 구함', '서울 동작구 상도동 252-8', 'http://3.36.55.232:8070/roomImages/ 56_1.jpg, http://3.36.55.232:8070/roomImages/ 56_2.jpg, http://3.36.55.232:8070/roomImages/ 56_3.jpg, http://3.36.55.232:8070/roomImages/ 56_4.jpg, http://3.36.55.232:8070/roomImages/ 56_5.jpg', 50, 40, '▲월세에 생필품까지 모두 포함이예요chr(13)||chr(10)
(난방비, 수도, 전기, 휴지, 세탁세제, 섬유유연제, 주방세제, 조미료 등등)chr(13)||chr(10)
▲풀옵션chr(13)||chr(10)
(세탁기, 냉장고, 2단 행거, 무선 인터넷, 전자레인지, 에어컨, chr(13)||chr(10)침대, 식기구, 조리도구, 건조대, 책상, 선풍기 등 다 있어요.chr(13)||chr(10) 개인용품과 이불만 가지고 오시면 됩니다)', TO_DATE( '2021-01-06' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '중앙대, 흑석역 5분거리 룸쉐어', '서울 동작구 흑석동 188-10', 'http://3.36.55.232:8070/roomImages/ 57_1.jpg, http://3.36.55.232:8070/roomImages/ 57_2.jpg, http://3.36.55.232:8070/roomImages/ 57_3.jpg, http://3.36.55.232:8070/roomImages/ 57_4.jpg, http://3.36.55.232:8070/roomImages/ 57_5.jpg', 60, 49, '흑석역 도보5분 중앙대정문 도보1분에 있는 방입니다.chr(13)||chr(10) 가까운 중앙대병원,여의도,노량진으로 퇴근하시거나 근방 7호선 숭실대까지 이용가능합니다.chr(13)||chr(10)
풀옵션이라 개인물건만 가지고 오시면 OK!', TO_DATE( '2021-01-06' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '이수역 5분 쓰리룸 빌라 룸메이트 찾아요', '서울 동작구 사당동 1038-37', 'http://3.36.55.232:8070/roomImages/ 58_1.jpg, http://3.36.55.232:8070/roomImages/ 58_2.jpg, http://3.36.55.232:8070/roomImages/ 58_3.jpg, http://3.36.55.232:8070/roomImages/ 58_4.jpg, http://3.36.55.232:8070/roomImages/ 58_5.jpg', 65, 36, '이수역과 가까운 쓰리룸 빌라예요.chr(13)||chr(10)
현재 2명 거주중이고 남은 방에 들어오실 분 찾고있습니다.chr(13)||chr(10)
세탁기, 에어컨, 와이파이, 조리도구 등 풀옵션에 침대와 책상도 구비되어 있습니다.chr(13)||chr(10) 사용하실 이불과 개인용품만 챙겨서 오시면 돼요chr(13)||chr(10)
자세한 사항은 연락 부탁드립니다!', TO_DATE( '2021-01-06' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '햇살좋은 노량진 역세권 아파트 룸메이트', '서울 동작구 노량진동 39-9', 'http://3.36.55.232:8070/roomImages/ 59_1.jpg, http://3.36.55.232:8070/roomImages/ 59_2.jpg, http://3.36.55.232:8070/roomImages/ 59_3.jpg, http://3.36.55.232:8070/roomImages/ 59_4.jpg, http://3.36.55.232:8070/roomImages/ 59_5.jpg', 70, 33, '노량진역 근처 아파트에 같이 지내실 룸메이트 구합니다.chr(13)||chr(10)
풀옵션에 개인방 침대 구비되어있습니다.chr(13)||chr(10)
이불은 가져오시면 되고, 생필품은 월세에 포함입니다.chr(13)||chr(10)
연락 주세요', TO_DATE( '2021-01-06' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '흑석동 라이프 함께해요', '서울 동작구 흑석동 204-17', 'http://3.36.55.232:8070/roomImages/ 60_1.jpg, http://3.36.55.232:8070/roomImages/ 60_2.jpg, http://3.36.55.232:8070/roomImages/ 60_3.jpg, http://3.36.55.232:8070/roomImages/ 60_4.jpg, http://3.36.55.232:8070/roomImages/ 60_5.jpg', 55, 35, '중앙대 정문 바로 앞에 위치한 방이예요! 9호선이나 7호선을 이용하시는 분들, chr(13)||chr(10)그리고 중앙대, 숭실대 학생들에게도 살기 좋은 위치랍니다.chr(13)||chr(10) 
외관은 물론 내부도 깔끔한 인테리어로 구성되어 있어 따로 또 같이 지내기에 너무 좋은 공간이랍니다.chr(13)||chr(10) 채광도 좋아서 여름, 겨울 쾌적하게 지내실 수 있으실 거에요~! ', TO_DATE( '2021-01-06' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '잠원역 2분거리 룸메이트 구해요', '서울 서초구 잠원동 34-6', 'http://3.36.55.232:8070/roomImages/ 61_1.jpg, http://3.36.55.232:8070/roomImages/ 61_2.jpg, http://3.36.55.232:8070/roomImages/ 61_3.jpg, http://3.36.55.232:8070/roomImages/ 61_4.jpg, http://3.36.55.232:8070/roomImages/ 61_5.jpg', 80, 38, '지하철역(잠원역 3호선)에서 도보로 2분 거리에 있는 방입니다.chr(13)||chr(10) 
주변은 모두 아파트단지로 이루어져 있고, 나무가 굉장히 많은 평지예요.chr(13)||chr(10)
한강공원도 슬슬 걸어서 10분 거리에 있습니다.chr(13)||chr(10) 
천천히 산책하기 정말 좋아요^^
연락 주시면 자세히 설명드리겠습니다~', TO_DATE( '2021-01-06' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '반포동 룸메이트 구해요', '서울 서초구 반포동 99-1', 'http://3.36.55.232:8070/roomImages/ 62_1.jpg, http://3.36.55.232:8070/roomImages/ 62_2.jpg, http://3.36.55.232:8070/roomImages/ 62_3.jpg, http://3.36.55.232:8070/roomImages/ 62_4.jpg, http://3.36.55.232:8070/roomImages/ 62_5.jpg', 80, 60, '논현역(신논현역)과 3-4분이내 아주 가까운 거리에 있어요.chr(13)||chr(10)
투룸 같이 사용하실 룸메이트 구합니다.chr(13)||chr(10)
주변에 맛집이 많고 강남역과도 가까워서 생활이 편리합니다.chr(13)||chr(10)
', TO_DATE( '2021-01-06' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '친구처럼 지내실 룸메이트 구해요(신사역)', '서울 서초구 잠원동 19-4', 'http://3.36.55.232:8070/roomImages/ 63_1.jpg, http://3.36.55.232:8070/roomImages/ 63_2.jpg, http://3.36.55.232:8070/roomImages/ 63_3.jpg, http://3.36.55.232:8070/roomImages/ 63_4.jpg, http://3.36.55.232:8070/roomImages/ 63_5.jpg', 25, 15, '주말에는 프로젝터로 영화도보고 게임도 하고! chr(13)||chr(10)
함께 즐기는 Girls night! chr(13)||chr(10)
저와 즐겁게 친구처럼 지내실 룸메이트 구합니다', TO_DATE( '2021-01-06' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '남자 룸메이트 구해요', '서울 서초구 서초동 1622-9', 'http://3.36.55.232:8070/roomImages/ 64_1.jpg, http://3.36.55.232:8070/roomImages/ 64_2.jpg, http://3.36.55.232:8070/roomImages/ 64_3.jpg, http://3.36.55.232:8070/roomImages/ 64_4.jpg, http://3.36.55.232:8070/roomImages/ 64_5.jpg', 80, 39, '강남역 부근 풀옵션 투룸입니다!chr(13)||chr(10)
함께 지내실 남자 룸메이트 구해요chr(13)||chr(10)
깔끔한 편이고 주로 저녁에만 집에 있습니다chr(13)||chr(10)
연락주세요!', TO_DATE( '2021-01-06' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '룸메 구해요', '서울 서초구 반포동 104-5', 'http://3.36.55.232:8070/roomImages/ 65_1.jpg, http://3.36.55.232:8070/roomImages/ 65_2.jpg, http://3.36.55.232:8070/roomImages/ 65_3.jpg, http://3.36.55.232:8070/roomImages/ 65_4.jpg, http://3.36.55.232:8070/roomImages/ 65_5.jpg', 0, 40, '안녕하세요~ 20대 중반 외국인 여성이예요chr(13)||chr(10)
반포동 원룸인데요 학생이라 월세 혼자 내기가 부담되서 룸메 구해요chr(13)||chr(10)
같이 살고 싶으신 분 연락 주세요', TO_DATE( '2021-01-06' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '12월25일 이후로 입실가능합니다', '서울 강남구 역삼동 765-16', 'http://3.36.55.232:8070/roomImages/ 66_1.jpg, http://3.36.55.232:8070/roomImages/ 66_2.jpg, http://3.36.55.232:8070/roomImages/ 66_3.jpg, http://3.36.55.232:8070/roomImages/ 66_4.jpg, http://3.36.55.232:8070/roomImages/ 66_5.jpg', 0, 30, '기존룸메이트가 25일이전에 나간다고합니다chr(13)||chr(10)
25 26 일이후로입실하실분구합니다chr(13)||chr(10)
학생이나 회사원 이면좋켔구요chr(13)||chr(10)
원룸 풀옵션입니다 이불이랑몸만오시면됩니다chr(13)||chr(10)
방은 10평원룸새로 리모델링 해서 깨끗하구요chr(13)||chr(10)
무보증으로  34관리비포함 까지 원합니다chr(13)||chr(10)
역삼역에서도보2분정도입니다', TO_DATE( '2021-01-06' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '역삼역4번출구 도보2분', '서울 강남구 역삼동 785-10', 'http://3.36.55.232:8070/roomImages/ 67_1.jpg, http://3.36.55.232:8070/roomImages/ 67_2.jpg, http://3.36.55.232:8070/roomImages/ 67_3.jpg, http://3.36.55.232:8070/roomImages/ 67_4.jpg, http://3.36.55.232:8070/roomImages/ 67_5.jpg', 30, 30, '역삼역4번출구 도보2분 거리입니다chr(13)||chr(10)
인근편의시설이많아 생활하기편리하세요chr(13)||chr(10)', TO_DATE( '2021-01-06' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '역삼역근처 도보5분거리 룸메하메구해요', '서울 강남구 역삼동 739-12', 'http://3.36.55.232:8070/roomImages/ 68_1.jpg, http://3.36.55.232:8070/roomImages/ 68_2.jpg, http://3.36.55.232:8070/roomImages/ 68_3.jpg, http://3.36.55.232:8070/roomImages/ 68_4.jpg, http://3.36.55.232:8070/roomImages/ 68_5.jpg', 35, 35, '강남쪽 역삼역근처 룸메하메 구해여chr(13)||chr(10)
성별무관이고 집에있는시간은잠만자고chr(13)||chr(10)
거희 일하고있어서 원룸이지만 둘이살기에는chr(13)||chr(10)
불편하지안았어요 방구하시는분들chr(13)||chr(10)
많은문의주시구 성격은 소심하지않고chr(13)||chr(10)
제가정도많고 활발한성격이니 같이잘맞아서 잘지내보실분 구해여 문의주세영', TO_DATE( '2021-01-06' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '강남 논현동 룸메이트구해요', '서울 강남구 논현동 157-11', 'http://3.36.55.232:8070/roomImages/ 69_1.jpg, http://3.36.55.232:8070/roomImages/ 69_2.jpg, http://3.36.55.232:8070/roomImages/ 69_3.jpg, http://3.36.55.232:8070/roomImages/ 69_4.jpg, http://3.36.55.232:8070/roomImages/ 69_5.jpg', 50, 25, '원룸 오피스텔이고chr(13)||chr(10)
같이 지낼 룸메이트 구해요chr(13)||chr(10)
풀옵션이라 개인용품만 챙겨오시면 돼요chr(13)||chr(10)
역이랑 아주 가까워서 생활하기 편리해요chr(13)||chr(10)
연락주세요', TO_DATE( '2021-01-06' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '급구 룸메이트 구합니다 무보증', '서울 강남구 역삼동 639-19', 'http://3.36.55.232:8070/roomImages/ 70_1.jpg, http://3.36.55.232:8070/roomImages/ 70_2.jpg, http://3.36.55.232:8070/roomImages/ 70_3.jpg, http://3.36.55.232:8070/roomImages/ 70_4.jpg, http://3.36.55.232:8070/roomImages/ 70_5.jpg', 0, 30, '10평정도됩니다chr(13)||chr(10)
역삼역 2번출구입니다chr(13)||chr(10)
3분거리chr(13)||chr(10)
풀옵션으로 옷만가지고오시면됩니다chr(13)||chr(10)
문자주시면 사진 더 보내드릴께요', TO_DATE( '2021-01-06' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '강남 학동역 오피스텔 룸메이트구해요^^', '서울 강남구 논현동 249-18', 'http://3.36.55.232:8070/roomImages/ 71_1.jpg, http://3.36.55.232:8070/roomImages/ 71_2.jpg, http://3.36.55.232:8070/roomImages/ 71_3.jpg, http://3.36.55.232:8070/roomImages/ 71_4.jpg, http://3.36.55.232:8070/roomImages/ 71_5.jpg', 30, 30, '학동역 근처 오피스텔 같이지낼 룸메이트 구합니다.chr(13)||chr(10)
풀옵션이라 개인용품만 가져오시면 되고,chr(13)||chr(10)
깔끔한 성격이라 정리정돈 잘 하시고chr(13)||chr(10)
공동 공간 깨끗하게 사용해주실 분이었으면 좋겠습니다chr(13)||chr(10)
연락주세요!', TO_DATE( '2021-01-06' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '같이지낼 친화력좋은 여자룸메구해요!', '서울 영등포구 당산동 173-19', 'http://3.36.55.232:8070/roomImages/ 72_1.jpg, http://3.36.55.232:8070/roomImages/ 72_2.jpg, http://3.36.55.232:8070/roomImages/ 72_3.jpg, http://3.36.55.232:8070/roomImages/ 72_4.jpg, http://3.36.55.232:8070/roomImages/ 72_5.jpg', 100, 35, '월세가 부담이되서 반씩 부담하면서 지낼 룸메구해요!! chr(13)||chr(10)
집앞에 상가가 많아요! 24시 경비도 있어서 보안 및 안전은 걱정없구요.chr(13)||chr(10)
원룸이지만 저는 쇼파에서 자고, 들어오시면 침대퀸사이즈에서 주무실 수 있으세요.chr(13)||chr(10) 
풀옵션이여서 몸만 오시면되시구요!chr(13)||chr(10)
저는 대학원 준비생입니다.chr(13)||chr(10) 친화력 좋은 여자 룸메 구해요!!', TO_DATE( '2021-01-06' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '룸메이트 구해요', '서울 영등포구 영등포동8가 45-17', 'http://3.36.55.232:8070/roomImages/ 73_1.jpg, http://3.36.55.232:8070/roomImages/ 73_2.jpg, http://3.36.55.232:8070/roomImages/ 73_3.jpg, http://3.36.55.232:8070/roomImages/ 73_4.jpg, http://3.36.55.232:8070/roomImages/ 73_5.jpg', 50, 35, '방 2개를 각각 사용하며, 주방과 화장실은 같이 쓰시면 됩니다.chr(13)||chr(10)
개인생활은 터치하지 않으니 개인공간 중요시 하는 분들 편히 지내실 수 있어요.chr(13)||chr(10)
애완동물반입. 실내흡연. 이성출입 불가! 이것만 잘 지켜주시면 됩니다.chr(13)||chr(10)개인 공간 확실하게 구분되고,chr(13)||chr(10)
생활비 절약할 수 있는 집 찾으려는 분이면 잘 맞을 거라 생각합니다.chr(13)||chr(10)', TO_DATE( '2021-01-06' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '서울대입구역 5분거리 하메 구합니다.', '서울 관악구 봉천동 180', 'http://3.36.55.232:8070/roomImages/ 74_1.jpg, http://3.36.55.232:8070/roomImages/ 74_2.jpg, http://3.36.55.232:8070/roomImages/ 74_3.jpg, http://3.36.55.232:8070/roomImages/ 74_4.jpg, http://3.36.55.232:8070/roomImages/ 74_5.jpg', 60, 30, '서울대입구역 8번출구에서 도보 5분 거리에 있습니다.chr(13)||chr(10)
투룸 작은 방 지내실 분 구해요!chr(13)||chr(10)
지금 큰 방은 20대 여자가 쓰고 있어요 :) chr(13)||chr(10)
친구랑 둘이 살고있던 집이라chr(13)||chr(10)
식기구나 대부분 필요한 것들은 다 구비되어 있어요.chr(13)||chr(10)
수납함이나 행거, 탁자 등등 필요하시면 말씀해주세요chr(13)||chr(10)
짐은 거의 다 빼놓은 상태라 즉시 입주 가능해요', TO_DATE( '2021-01-06' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '상도동 중대 근처 하메 구해요', '서울 동작구 상도동 183-28', 'http://3.36.55.232:8070/roomImages/ 75_1.jpg, http://3.36.55.232:8070/roomImages/ 75_2.jpg, http://3.36.55.232:8070/roomImages/ 75_3.jpg, http://3.36.55.232:8070/roomImages/ 75_4.jpg, http://3.36.55.232:8070/roomImages/ 75_5.jpg', 30, 28, '투룸이고 방 하나 쓰실 분 구합니다chr(13)||chr(10)
주방과 화장실은 공유해요chr(13)||chr(10)
강아지 키우고 있습니다chr(13)||chr(10)
강아지 좋아하시는 분이면 좋겠어요chr(13)||chr(10)
사진 참고하시고 연락주세요', TO_DATE( '2021-01-06' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '송파역 3분 투룸 하메 구해요.', '서울 송파구 송파동 174-12', 'http://3.36.55.232:8070/roomImages/ 76_1.jpg, http://3.36.55.232:8070/roomImages/ 76_2.jpg, http://3.36.55.232:8070/roomImages/ 76_3.jpg, http://3.36.55.232:8070/roomImages/ 76_4.jpg, http://3.36.55.232:8070/roomImages/ 76_5.jpg', 70, 34, '송파역 도보 3분거리,chr(13)||chr(10)
8.9호선 석촌역과,석촌호수가 도보 10분 거리에요.chr(13)||chr(10)
2.8호선 잠실역까지도 도보로 가능합니다.chr(13)||chr(10) 
큰방 쓰실 분 구하고 있구요.chr(13)||chr(10)
방에 아무것도 없습니다.chr(13)||chr(10)개인살림 가져오셔야 해요.chr(13)||chr(10)
2층이구요.chr(13)||chr(10) 주차 1대 가능해요~chr(13)||chr(10)
집분위기 너무 자율적이고.chr(13)||chr(10)
서로 피해만 안주시면 되시고chr(13)||chr(10)
관리비+공과금 포함 가격입니다.chr(13)||chr(10)', TO_DATE( '2020-12-21' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '송파 잠실 룸메구해요 고양이 강아지 가능', '서울 송파구 방이동 40', 'http://3.36.55.232:8070/roomImages/ 77_1.jpg, http://3.36.55.232:8070/roomImages/ 77_2.jpg, http://3.36.55.232:8070/roomImages/ 77_3.jpg, http://3.36.55.232:8070/roomImages/ 77_4.jpg, http://3.36.55.232:8070/roomImages/ 77_5.jpg', 0, 40, '옵션 깔끔하고 집도 깔끔 고층이라서 뷰도 좋구여 chr(13)||chr(10)
제가 큰방만써서 작은방 룸메 구해봐여 chr(13)||chr(10)
강아지 한마리 고양이 한마리 키우는데 둘다 얌전해요 chr(13)||chr(10)
작은방에 침대퀸사이즈랑 붙박이옷장들어가있구요 크기또 혼자 쓰기 딱 정당하구 거실도있구 월세 조정가능합니다 chr(13)||chr(10)
여자분만가능하세여 연락주세여! ', TO_DATE( '2020-12-22' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '여성 룸메이트 구합니다', '서울 송파구 잠실동 341-26', 'http://3.36.55.232:8070/roomImages/ 78_1.jpg, http://3.36.55.232:8070/roomImages/ 78_2.jpg, http://3.36.55.232:8070/roomImages/ 78_3.jpg, http://3.36.55.232:8070/roomImages/ 78_4.jpg, http://3.36.55.232:8070/roomImages/ 78_5.jpg', 50, 45, ' 직장인 여성분으로 깔끔하게 사용할분. chr(13)||chr(10)되도록 짐이 없는분이 였음 좋겠네요! chr(13)||chr(10)싱글침대나 침대없으시면 싱글매트 들어가구요.chr(13)||chr(10). 옷,신발만 가지고 오셔도 됩니다! chr(13)||chr(10)연락주세요~ ', TO_DATE( '2020-12-23' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '송파구 룸메 구해요', '서울 송파구 삼전동 110-12', 'http://3.36.55.232:8070/roomImages/ 79_1.jpg, http://3.36.55.232:8070/roomImages/ 79_2.jpg, http://3.36.55.232:8070/roomImages/ 79_3.jpg, http://3.36.55.232:8070/roomImages/ 79_4.jpg, http://3.36.55.232:8070/roomImages/ 79_5.jpg', 50, 20, '  30대 초반 여성입니다  chr(13)||chr(10)송파구 삼전동 석촌고분역 5분거리 위치에요chr(13)||chr(10) 지하철 버스 가능합니다 chr(13)||chr(10)직장이 강남에 계신다면 이동또한 많이 편리해요chr(13)||chr(10) 위치괜찮다 싶으시면 우선 연락주세요 chr(13)||chr(10)여성분만!!입니다 ', TO_DATE( '2020-12-24' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '잠실 오금동 분리형원룸 룸메 구해요', '서울 송파구 오금동 73-3', 'http://3.36.55.232:8070/roomImages/ 80_1.jpg, http://3.36.55.232:8070/roomImages/ 80_2.jpg, http://3.36.55.232:8070/roomImages/ 80_3.jpg, http://3.36.55.232:8070/roomImages/ 80_4.jpg, http://3.36.55.232:8070/roomImages/ 80_5.jpg', 0, 20, '오금동에 신축빌라 분리형원룸이에요.chr(13)||chr(10)
2년계약했는데 월세가 생각보다 너무많이나가서 좀 줄여보고자 룸메 구합니다chr(13)||chr(10)
성격 둥글둥글하고좋으신분 신원확실하신분만 연락주세요chr(13)||chr(10)
반려동물은 안되구요.chr(13)||chr(10)
저는 30살이고 꽉막힌성격아니구 같이 잘지냈으면좋겟어여chr(13)||chr(10)
연락주실때 최소로지내실기간이랑 입주희망 날짜 부탁해요', TO_DATE( '2020-12-25' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '여성하메 구합니다.', '서울 영등포구 영등포동1가 79-2', 'http://3.36.55.232:8070/roomImages/ 81_1.jpg, http://3.36.55.232:8070/roomImages/ 81_2.jpg, http://3.36.55.232:8070/roomImages/ 81_3.jpg, http://3.36.55.232:8070/roomImages/ 81_4.jpg, http://3.36.55.232:8070/roomImages/ 81_5.jpg', 0, 50, '제가 짐도 별로 없고 투룸이라 방이 하나 남아서 여성하메 구합니다chr(13)||chr(10)
관리비랑 월세 해서 50만원 받을려고 합니다.chr(13)||chr(10).
저도 거의 잠만 잘꺼같은데 관심있으시면 연락주세요chr(13)||chr(10)
전철역도 가깝고 여의도도 가깝습니다~ chr(13)||chr(10)냉장고 세탁기는 큼직막한 가전들은
있으나chr(13)||chr(10) 개인 가구는 챙겨오셔야 합니다~', TO_DATE( '2020-12-26' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '역삼동 빌라 투룸 룸메 구합니다', '서울 강남구 역삼동 745-1', 'http://3.36.55.232:8070/roomImages/ 82_1.jpg, http://3.36.55.232:8070/roomImages/ 82_2.jpg, http://3.36.55.232:8070/roomImages/ 82_3.jpg, http://3.36.55.232:8070/roomImages/ 82_4.jpg, http://3.36.55.232:8070/roomImages/ 82_5.jpg', 50, 30, '방두개에 작은거실 하나있습니당.chr(13)||chr(10)
샷시 다 새로해서 우풍없어요.chr(13)||chr(10)
큰방드리구요.chr(13)||chr(10)
세탁기,냉장고,가스렌지,전자레인지,커피포트등등chr(13)||chr(10)
고장내지않고 쓰시면 됩니다.chr(13)||chr(10)
와이파이 제공합니당.chr(13)||chr(10)
제가 지방에서 근무하게되어 chr(13)||chr(10)
휴무날만 갑니다.chr(13)||chr(10)
공과금은 청구되면 그냥 그거내시면 됩니당.chr(13)||chr(10)
여성분만 받을게요.chr(13)||chr(10) 저도 여자입니당.', TO_DATE( '2020-12-27' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '영등포 대림동 룸메 구해요 ^^', '서울 영등포구 대림동 1025-45', 'http://3.36.55.232:8070/roomImages/ 83_1.jpg, http://3.36.55.232:8070/roomImages/ 83_2.jpg, http://3.36.55.232:8070/roomImages/ 83_3.jpg, http://3.36.55.232:8070/roomImages/ 83_4.jpg, http://3.36.55.232:8070/roomImages/ 83_5.jpg', 100, 45, '서울시 영등포구chr(13)||chr(10)
신도림역 2번출구 도보6분 이내 chr(13)||chr(10)
방3/화장실2/풀옵션chr(13)||chr(10)
현재
방이 놀고있어서 룸메 한분 구합니다.chr(13)||chr(10)', TO_DATE( '2020-12-28' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '강남 서초 논현 신논현 함께 지내실 하메님 구해요:)', '서울 서초구 서초동 1493-1', 'http://3.36.55.232:8070/roomImages/ 84_1.jpg, http://3.36.55.232:8070/roomImages/ 84_2.jpg, http://3.36.55.232:8070/roomImages/ 84_3.jpg, http://3.36.55.232:8070/roomImages/ 84_4.jpg, http://3.36.55.232:8070/roomImages/ 84_5.jpg', 30, 30, ' 하메님이 원할경우 혼자 사용할 옵션 지원해드립니다.chr(13)||chr(10) 개인사용 - 냉장고(원문형 가정 냉장고), 책장, 에어컨, 공기청정기, 발러그, 휴지통, 행거, 옷바구니chr(13)||chr(10) 집 앞에(3분 거리) 이마트 편의점, gs편의점, 세븐일레븐, 커피숍, 빨래방 있습니다.chr(13)||chr(10) 더 궁금하신 사항은 문자나 전화주세요~ ', TO_DATE( '2020-12-29' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '신림동 투룸 룸메이트 구합니다', '서울 관악구 신림동 87-1', 'http://3.36.55.232:8070/roomImages/ 85_1.jpg, http://3.36.55.232:8070/roomImages/ 85_2.jpg, http://3.36.55.232:8070/roomImages/ 85_3.jpg, http://3.36.55.232:8070/roomImages/ 85_4.jpg, http://3.36.55.232:8070/roomImages/ 85_5.jpg', 0, 28, ' 월세에 수도세 포함이고 인터넷 가스 전기는 별도로 같이 내면 됩니다.chr(13)||chr(10) 연락주세요 ', TO_DATE( '2020-12-21' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '서울 강남구 9호선 신논현역 하메구해요~', '서울 강남구 논현동 160-4', 'http://3.36.55.232:8070/roomImages/ 86_1.jpg, http://3.36.55.232:8070/roomImages/ 86_2.jpg, http://3.36.55.232:8070/roomImages/ 86_3.jpg, http://3.36.55.232:8070/roomImages/ 86_4.jpg, http://3.36.55.232:8070/roomImages/ 86_5.jpg', 100, 50, '안녕하세요 30살 남자입니다.chr(13)||chr(10) 신논현역 도보로 3~5분 거리에 위치한 빌라 3층입니다.chr(13)||chr(10) 거실에 투룸이고 오시는분 방 한개를 따로 쓰시면 됩니다.chr(13)||chr(10) 방에 싱글침대,행거 있습니다.chr(13)||chr(10) 식기,가전만 공용이고 그 외 개인입니다.chr(13)||chr(10) 전기,가스,수도 공과금은 /n입니다.chr(13)||chr(10)
좋은인연 기다리겠습니다 편하게 연락주세요.chr(13)||chr(10)', TO_DATE( '2020-12-22' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '봉천동 쓰리룸빌라 룸메 한분 구해요', '서울 관악구 봉천동 11-1', 'http://3.36.55.232:8070/roomImages/ 87_1.jpg, http://3.36.55.232:8070/roomImages/ 87_2.jpg, http://3.36.55.232:8070/roomImages/ 87_3.jpg, http://3.36.55.232:8070/roomImages/ 87_4.jpg, http://3.36.55.232:8070/roomImages/ 87_5.jpg', 50, 30, ' 기존에 함께 지내던 동생이 결혼하면서 새로운 룸메를 구하고있어요!chr(13)||chr(10) 저는 30대중반 남자이고 성격은 둥글둥글한편이라 chr(13)||chr(10)모임같은곳에 가도 남녀 모두 잘 지내는 편이구요~ chr(13)||chr(10)반려견 반려묘 둘다 좋아해서 chr(13)||chr(10)혹시 키우시는분이 데리고 들어오신다면 대환영입니다 chr(13)||chr(10)남녀무관 좋은친구 가족처럼 지냈으면 해요~ ', TO_DATE( '2020-12-23' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '신림동 룸메이트구합니다.', '서울 관악구 신림동 1433-112', 'http://3.36.55.232:8070/roomImages/ 88_1.jpg, http://3.36.55.232:8070/roomImages/ 88_2.jpg, http://3.36.55.232:8070/roomImages/ 88_3.jpg, http://3.36.55.232:8070/roomImages/ 88_4.jpg, http://3.36.55.232:8070/roomImages/ 88_5.jpg', 5, 20, '안녕하세요.chr(13)||chr(10)
저는 야간에 일하고 늦은새벽이나 아침에들어와서 잡니다.chr(13)||chr(10)
공부하시는분도 좋고 주간에 일하시는분이면 좋겠네요.chr(13)||chr(10)
생활에 필요한건 다 있습니다.chr(13)||chr(10) 필요한건 추가로 사면되구요.chr(13)||chr(10)
퀸침대 책상 세탁기 건조대 옷장 렌지 있어요.chr(13)||chr(10)
몸만들어오시면 될듯합니다.chr(13)||chr(10)
참고로 20대후반남자입니다.chr(13)||chr(10) 성별은 상관없구요.chr(13)||chr(10)', TO_DATE( '2020-12-24' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '룸메 구합니다.', '서울 동작구 사당동 1047-5', 'http://3.36.55.232:8070/roomImages/ 89_1.jpg, http://3.36.55.232:8070/roomImages/ 89_2.jpg, http://3.36.55.232:8070/roomImages/ 89_3.jpg, http://3.36.55.232:8070/roomImages/ 89_4.jpg, http://3.36.55.232:8070/roomImages/ 89_5.jpg', 25, 25, '같이 사용하는 거실을 깔끔하게 이용하실 분만 연락주세요.chr(13)||chr(10) 그리고 주차는 안 됩니다.chr(13)||chr(10)
최소 3개월 계약입니다.chr(13)||chr(10) 이후 퇴실시 1달 전에만 말해주시면 되요.chr(13)||chr(10) 단기 가능하고 기간 조정 가능하니 톡이나 문자 주세요.chr(13)||chr(10)
남.여 상관없음.chr(13)||chr(10)
만 20세 ~ 40세 까지만.chr(13)||chr(10) 그리고 학생이나 직장인 등 신원이 확실하신 분만 연락주세요~', TO_DATE( '2020-12-25' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '잠원동 룸메 구합니다', '서울 서초구 잠원동 49-9', 'http://3.36.55.232:8070/roomImages/ 90_1.jpg, http://3.36.55.232:8070/roomImages/ 90_2.jpg, http://3.36.55.232:8070/roomImages/ 90_3.jpg, http://3.36.55.232:8070/roomImages/ 90_4.jpg, http://3.36.55.232:8070/roomImages/ 90_5.jpg', 0, 30, '비흡연인 여성분이면 좋겠습니다.chr(13)||chr(10)
방하나 화장실하나 세 놓고, 부엌과 거실은 공동사용이면, 공과금은 1/n입니다.chr(13)||chr(10)
주차가능하나 추가비용 발생합니다.chr(13)||chr(10)
본인관리 잘 하시고, 물건 소중히 쓰시는 분이면 좋겠습니다.chr(13)||chr(10)', TO_DATE( '2020-12-26' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '15평 투룸 룸메 구해요', '서울 구로구 구로동 642-88', 'http://3.36.55.232:8070/roomImages/ 91_1.jpg, http://3.36.55.232:8070/roomImages/ 91_2.jpg, http://3.36.55.232:8070/roomImages/ 91_3.jpg, http://3.36.55.232:8070/roomImages/ 91_4.jpg, http://3.36.55.232:8070/roomImages/ 91_5.jpg', 100, 35, '방하나드려요 방 크기 넓어요chr(13)||chr(10)
들어오시면 퀸침대, 책상, 행거 놔드려요chr(13)||chr(10)
사생활터치xchr(13)||chr(10)
얼음정수기냉장고chr(13)||chr(10)
인터넷chr(13)||chr(10)
수도가스전기세 모두포함금chr(13)||chr(10)
베란다, 창고 있어서 짐같은거 좀 놔둬도 ㄱㅊchr(13)||chr(10)
남녀성별 상관x chr(13)||chr(10)
돈안밀리시는분chr(13)||chr(10)
6개월이상chr(13)||chr(10)
구디,영등포,2호선라인,7호선라인 출근편해요,', TO_DATE( '2020-12-27' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '오피스텔 룸메/하메 구해요.', '서울 송파구 잠실동 221-13', 'http://3.36.55.232:8070/roomImages/ 92_1.jpg, http://3.36.55.232:8070/roomImages/ 92_2.jpg, http://3.36.55.232:8070/roomImages/ 92_3.jpg, http://3.36.55.232:8070/roomImages/ 92_4.jpg, http://3.36.55.232:8070/roomImages/ 92_5.jpg', 40, 40, '애완동물은 강아지는 불가능하고 고양이만 가능합니다chr(13)||chr(10)
직업상 아침 일찍 나가서 저녁에 들어옵니다.chr(13)||chr(10)
제가 30대 초반이라 나이대는 20~30초중반이였으면 하네요 :)chr(13)||chr(10)
연락주세요', TO_DATE( '2020-12-28' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '5호선 양평역 도보3분거리', '서울 영등포구 양평동3가 49-4', 'http://3.36.55.232:8070/roomImages/ 93_1.jpg, http://3.36.55.232:8070/roomImages/ 93_2.jpg, http://3.36.55.232:8070/roomImages/ 93_3.jpg, http://3.36.55.232:8070/roomImages/ 93_4.jpg, http://3.36.55.232:8070/roomImages/ 93_5.jpg', 70, 35, '총 방3개중 현재 2인실 큰방에 한명이 이사 예정이어서 룸메하실분을 구합니다.chr(13)||chr(10) (같은방 룸메는 대학생 여자)chr(13)||chr(10)
건물 7층이고 엘리베이터, cctv, 주차공간 있습니다.chr(13)||chr(10)
2층에 테라스도 있고 전망이 아주 좋습니다.chr(13)||chr(10)
세탁기, 냉장고, 식기, 냄비, 정수기, 세탁기, 건조대 있습니다.chr(13)||chr(10) 
이불과 개인 생필품만 가져오시면 됩니다.chr(13)||chr(10)', TO_DATE( '2020-12-29' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '보라매병원 도보3분, 투룸 방 하나 월세', '서울 관악구 봉천동 890-8', 'http://3.36.55.232:8070/roomImages/ 94_1.jpg, http://3.36.55.232:8070/roomImages/ 94_2.jpg, http://3.36.55.232:8070/roomImages/ 94_3.jpg, http://3.36.55.232:8070/roomImages/ 94_4.jpg, http://3.36.55.232:8070/roomImages/ 94_5.jpg', 40, 35, '신대방삼거리역, 신림역 모두 가깝습니다.chr(13)||chr(10) 
인자한 임대인 할머니, 할아버지가 건물 3층에 거주하시고 계셔요.chr(13)||chr(10) 
무료로 주차도 가능합니다.chr(13)||chr(10) 좋은 방 좋은 조건에 드리니 연락주세요.chr(13)||chr(10)', TO_DATE( '2020-12-30' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '서울대입구 도보5분거리 2호선 라인 룸메 구해요', '서울 관악구 신림동 598-78', 'http://3.36.55.232:8070/roomImages/ 95_1.jpg, http://3.36.55.232:8070/roomImages/ 95_2.jpg, http://3.36.55.232:8070/roomImages/ 95_3.jpg, http://3.36.55.232:8070/roomImages/ 95_4.jpg, http://3.36.55.232:8070/roomImages/ 95_5.jpg', 100, 30, '투룸 오피스텔이고, 실평수는 13평정도 됩니다.chr(13)||chr(10)
방 하나는 제가 거주중이고 나머지 방 하나 쓰실분 구해요 chr(13)||chr(10)
성격좋으시고 유쾌하신분이면 좋겠습니다.chr(13)||chr(10) 
애완동물도 엄청 좋아하지만 중형견 이상이라면 그 강아지가 힘들어할꺼라 사절할게요.chr(13)||chr(10) 소형견은 협의하겠습니다~chr(13)||chr(10)
문의 많이 주세요', TO_DATE( '2021-01-07' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '사당/이수역 투룸 룸메 구합니다!', '서울 동작구 사당동 437-28', 'http://3.36.55.232:8070/roomImages/ 96_1.jpg, http://3.36.55.232:8070/roomImages/ 96_2.jpg, http://3.36.55.232:8070/roomImages/ 96_3.jpg, http://3.36.55.232:8070/roomImages/ 96_4.jpg, http://3.36.55.232:8070/roomImages/ 96_5.jpg', 50, 38, '이수역과 사당역 사이여서 교통이 편리하고 가까운 곳에 큰 마트와 코인세탁 시설이 있어서 살기 편리합니다.chr(13)||chr(10)
월세 : 38만원chr(13)||chr(10)
보증금 : 50만원(협의 가능)chr(13)||chr(10)
공과금 : 수도세, 전기세, 가스비, 인터넷요금 1/nchr(13)||chr(10)
(평균적으로 1인 부담 4만원 정도 되는 것 같습니다.chr(13)||chr(10))', TO_DATE( '2021-01-08' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '논현동 하메 구해요', '서울 강남구 논현동 170-4', 'http://3.36.55.232:8070/roomImages/ 97_1.jpg, http://3.36.55.232:8070/roomImages/ 97_2.jpg, http://3.36.55.232:8070/roomImages/ 97_3.jpg, http://3.36.55.232:8070/roomImages/ 97_4.jpg, http://3.36.55.232:8070/roomImages/ 97_5.jpg', 100, 53, '관리비 함께 내면서 chr(13)||chr(10)
하우스 쉐어할 메이트 구합니다ㅠchr(13)||chr(10)
연락 주세요~chr(13)||chr(10)
1인실 2인실 현재 입주 가능하고,chr(13)||chr(10)
방 네개 화장실 두개 인 하우스입니다.chr(13)||chr(10) 
상당히 쾌적한 환경이예요~', TO_DATE( '2021-01-09' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '송파구삼전동 룸메하매구해요!', '서울 송파구 삼전동 105-3', 'http://3.36.55.232:8070/roomImages/ 98_1.jpg, http://3.36.55.232:8070/roomImages/ 98_2.jpg, http://3.36.55.232:8070/roomImages/ 98_3.jpg, http://3.36.55.232:8070/roomImages/ 98_4.jpg, http://3.36.55.232:8070/roomImages/ 98_5.jpg', 50, 50, '방은 총두개 이구요 작은거실하나 부엌 화장실 이렇게 있습니다! chr(13)||chr(10)엘리베이터 건물에 있구요 . chr(13)||chr(10)신축이라 보안은 잘도어있습니다chr(13)||chr(10) 대중교통은 엄청편리하구요.chr(13)||chr(10) 바로앞 삼전역 , 석촌고분역이있으며 편의점 , 마트 다 있습니다.chr(13)||chr(10)
주변에 초등학교가있어서 동네가 깔끔하고 조용합니다.chr(13)||chr(10)', TO_DATE( '2021-01-10' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '1', '역삼역근처 도보5분거리 룸메하메구해요', '서울 강남구 역삼동 752-59', 'http://3.36.55.232:8070/roomImages/ 99_1.jpg, http://3.36.55.232:8070/roomImages/ 99_2.jpg, http://3.36.55.232:8070/roomImages/ 99_3.jpg, http://3.36.55.232:8070/roomImages/ 99_4.jpg, http://3.36.55.232:8070/roomImages/ 99_5.jpg', 35, 35, '강남쪽 역삼역근처 룸메하메 구해여chr(13)||chr(10)
성별무관이고 집에있는시간은잠만자고chr(13)||chr(10)
거희 일하고있어서 원룸이지만 둘이살기에는chr(13)||chr(10)
불편하지안았어요 방구하시는분들chr(13)||chr(10)
많은문의주시구 성격은 소심하지않고chr(13)||chr(10)
제가정도많고 활발한성격이니 같이잘맞아서 잘지내보실분 구해여 문의주세영', TO_DATE( '2021-01-11' ,'YYYY-MM-DD'));
insert into sr_room values (seq_sr_room.nextval, '0', '봉천동 방 두개 중 하나 내놔요', '서울 관악구 봉천동 673-230', 'http://3.36.55.232:8070/roomImages/ 100_1.jpg, http://3.36.55.232:8070/roomImages/ 100_2.jpg, http://3.36.55.232:8070/roomImages/ 100_3.jpg, http://3.36.55.232:8070/roomImages/ 100_4.jpg, http://3.36.55.232:8070/roomImages/ 100_5.jpg', 30, 30, '도배장판 깔끔하게 되어있고 사생활 보장해드려요chr(13)||chr(10)
풀옵션이라 몸만 오시면 됩니다chr(13)||chr(10)
연락주세요', TO_DATE( '2021-01-12' ,'YYYY-MM-DD'));