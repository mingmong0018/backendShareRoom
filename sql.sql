create table member1 (
	username varchar2(20) primary key,
	password varchar2(20)
);

insert into member1 values('minjung', '1234');
insert into member1 values('hana', '1111');

select*from sr_room

--select a.room_title, a.room_address, a.room_deposit, a.room_rent, a.room_images, b.tag_content 
--from sr_room a, sr_tag b where a.room_id=b.room_id order by room_address;

select room_id, room_title, room_address, room_deposit, room_rent, room_images 
from sr_room order by room_id