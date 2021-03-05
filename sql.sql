create table member1 (
	username varchar2(20) primary key,
	password varchar2(20)
);

insert into member1 values('minjung', '1234');
insert into member1 values('hana', '1111');

update sr_member set mem_confirm='y' where mem_id='0';

update sr_room set mem_id='1' where room_id=1 or room_id=3 or room_id=5 or room_id=7 or room_id=9;
update sr_room set mem_id='1' where room_id=11 or room_id=13 or room_id=15 or room_id=17 or room_id=19;
update sr_room set mem_id='1' where room_id=21 or room_id=23 or room_id=25 or room_id=27 or room_id=29;
update sr_room set mem_id='1' where room_id=31 or room_id=33 or room_id=35 or room_id=37 or room_id=39;
update sr_room set mem_id='1' where room_id=41 or room_id=43 or room_id=45 or room_id=47 or room_id=49;
update sr_room set mem_id='1' where room_id=51 or room_id=53 or room_id=55 or room_id=57 or room_id=59;
update sr_room set mem_id='1' where room_id=61 or room_id=63 or room_id=65 or room_id=67 or room_id=69;
update sr_room set mem_id='1' where room_id=71 or room_id=73 or room_id=75 or room_id=77 or room_id=79;
update sr_room set mem_id='1' where room_id=81 or room_id=83 or room_id=85 or room_id=87 or room_id=89;
update sr_room set mem_id='1' where room_id=91 or room_id=93 or room_id=95 or room_id=97 or room_id=99;

select*from sr_room

select*from sr_member

select a.room_id, a.room_title, a.room_address, a.room_deposit, a.room_rent, a.room_images,
		b.mem_age, b.mem_gender, b.mem_confirm
		from sr_room a, sr_member b where a.mem_id=b.mem_id order by room_id

update sr_member set mem_confirm='y' where mem_id='0'
--select a.room_title, a.room_address, a.room_deposit, a.room_rent, a.room_images, b.tag_content 
--from sr_room a, sr_tag b where a.room_id=b.room_id order by room_address;

select room_id, room_title, room_address, room_deposit, room_rent, room_images 
from sr_room order by room_id

select tag_id, tag_content from sr_tag where room_id=17 order by tag_id

select room_id from sr_tag where tag_content like '%반려동물%'

select a.room_id, b.option_group, b.option_name from sr_room_option a, sr_option b 
where room_id=17 and a.option_id=b.option_id;

select room_id, mem_id, room_title, room_address, room_images, room_deposit, 
room_rent, room_mem_phone, room_indate, 
replace(room_report, chr(13)||chr(10), '<br/>') room_report 
from sr_room where room_id=57

select room_id, mem_id, room_title, room_address, room_images, room_deposit, 
		room_rent, room_mem_phone, room_indate, 
		replace(room_report, chr(13)||chr(10), '<![CDATA[ < ]]>br/<![CDATA[ > ]]>') room_report 
		from sr_room where room_id=#{param1}
