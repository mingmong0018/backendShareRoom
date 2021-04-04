--<<모두삭제>>
--drop table sr_member cascade constraints;
--drop table sr_room cascade constraints;
--drop table sr_room_rep cascade constraints;
--drop table sr_room_re_rep cascade constraints;
--drop table sr_option cascade constraints;
--drop table sr_room_option cascade constraints;
--drop table sr_wish_list cascade constraints;
--drop table sr_tag cascade constraints;
--drop table sr_notice cascade constraints;
--drop table sr_notify_group cascade constraints;
--drop table sr_notify cascade constraints;
--drop table sr_keyword cascade constraints;

--drop sequence seq_sr_keyword;
--drop sequence seq_sr_member;
--drop sequence seq_sr_room;
--drop sequence seq_sr_room_rep;
--drop sequence seq_sr_room_re_rep;
--drop sequence seq_sr_option;
--drop sequence seq_sr_room_option;
--drop sequence seq_sr_tag;
--drop sequence seq_sr_notice;
--drop sequence seq_sr_notify;
--drop sequence seq_sr_wish_list;
update sr_member set mem_age=0 where mem_id='google_110756038095356896059';

select * from sr_member where mem_id='google_110756038095356896059';

update sr_member set mem_nickname='김민정' where mem_id='google_110756038095356896059';

select*from sr_member


create 	table 	sr_member(	mem_id	 varchar2(50) 	primary key,	
			mem_email varchar2(60) ,
			mem_name	 varchar2(20) 	not null,	
			mem_age	 number(3),	
			mem_nickname	 varchar2(15 char) 	not null,	
			mem_image	 varchar2(200) default 'noProfile.jpg',		
			mem_gender	 char(1), check(mem_gender in('f', 'm',null)),
			mem_confirm	 char(1) 	 default 'n',	check(mem_confirm in('y', 'n')) ,
			mem_indate 	 timestamp 	 default 	sysdate) ;		
						
create 	table 	sr_room(	room_id	 number(6) 	primary key,	
			mem_id	 varchar2(50) 	references 	sr_member(mem_id) ,
			room_title	 varchar2(50 char) 	not null,	
			room_address	 varchar2(50 char) 	not null,	
			room_images	 varchar2(1000) ,		
			room_deposit	 number(10) 	not null,	
			room_rent	 number(10) 	not null,	
			room_report	 varchar2(1000 char) ,		
			room_indate	 timestamp	 default 	sysdate) ;

create 	sequence	seq_sr_room	increment by 	1;		

select * from sr_room;

create 	sequence	 seq_sr_room	 start with 1 increment by 1;	

						
--create 	table 	sr_room_rep(	room_rep_id 	 number(6) 	primary key,	
--			room_id 	 number(6) 	references 	sr_room(room_id) ,
--			mem_id 	 varchar2(50) 	references 	sr_member(mem_id) ,
--			room_rep_content 	 varchar2(100) 	not null,	
--			room_rep_secure 	 char(1) 	default 'n',	check(room_rep_secure in('y', 'n')) ,
--			room_rep_indate 	 timestamp 	 default 	sysdate) ;
--create 	sequence	seq_sr_room_rep	start with 1 increment by 1;	
--						
--create 	table 	sr_room_re_rep(	room_re_rep_id 	 number(6) 	primary key,	
--			room_rep_id 	 number(6) 	references 	sr_room_rep(room_rep_id) ,
--			mem_id 	 varchar2(50) 	references 	sr_member(mem_id) ,
--			room_re_rep_content 	 varchar2(100) 	not null,	
--			room_re_rep_indate 	 timestamp 	 default 	sysdate) ;
--create 	sequence	seq_sr_room_re_rep	start with 1 increment by 1;	
						
create 	table 	sr_option(	option_id	 number(6) 	primary key,	
			option_group	 varchar2(50) 	not null,	
			option_name	 varchar2(100) 	not null) ;	
create 	sequence	seq_sr_option	start with 1 increment by 1;	
						
create 	table 	sr_room_option(	room_option_id	 number(6) 	primary key,	
			room_id	 number(6) 	references 	sr_room(room_id) ,
			option_id	 number(6) 	references 	sr_option(option_id)) ;
create 	sequence	seq_sr_room_option	start with 1 increment by 1;	
--drop table sr_wish_list cascade constraints;
--
--drop sequence seq_sr_wish_list;
select * from sr_wish_list
create 	table 	sr_wish_list(	wish_id	 number(6) 	primary key,	
			mem_id	 varchar2(50) 	references 	sr_member(mem_id) ,
			room_id	 number(6) 	references 	sr_room(room_id),
			wish_indate timeStamp default sysdate);
create 	sequence	seq_sr_wish_list start with 1 increment by 1;	
						
create 	table 	sr_tag(	tag_id	 number(10) 	primary key,	
			room_id	 number(6) 	references 	sr_room(room_id) ,
			tag_content	 varchar2(100) 	not null);
create 	sequence	seq_sr_tag start with 1 increment by 1;	
						
--create 	table 	sr_notice(	notice_id 	 number(6) 	primary key,	
--			member_id 	 varchar2(50) 	references 	sr_member(mem_id) ,
--			notice_name 	 varchar2(20) ,	check(notice_name in('room_rep', 'notify_disp', 're_rep')) ,	
--			notice_check 	 char(1) 	default 'n',	check(notice_check in('y', 'n')) ,
--			notice_indate 	 timestamp 	 default 	sysdate) ;
--create 	sequence	seq_sr_notice	start with 1 increment by 1;	
						
--create 	table 	sr_notify_group(	notify_group_id 	 number(6) 	primary key,	
--			notify_group_name 	 varchar2(50)) ;		
--						
--create 	table 	sr_notify(	notify_id 	 number(6) 	primary key,	
--			mem_id 	 varchar2(50) 	references 	sr_member(mem_id) ,
--			notify_area 	 varchar2(20) ,		
--			notify_group_id 	 number(6) 	references 	sr_notify_group(notify_group_id) ,
--			notify_content 	 varchar2(200 char),		
--			notify_check 	 char(1) 	default 'n',	check(notify_check in('y', 'n')),
--			notify_delete 	 char(1) 	default 'n',	check(notify_delete in('y', 'n')),
--			notify_indate 	 timestamp 	 default 	sysdate) ;
--create 	sequence	seq_sr_notify	start with 1 increment by 1;	

create 	table 	sr_keyword(	keywordId 	number(10) 	primary key,	
			memId 	varchar2(50) 	references 	sr_member(mem_id),
			keywordContent 	varchar2(100) 	not null,	
			keywordIndate 	timestamp 	default sysdate);	
create 	sequence	seq_sr_keyword start with 1 increment by 1;