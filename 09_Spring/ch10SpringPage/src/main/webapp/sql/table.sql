create table spmember(
  mem_num number not null,
  id varchar2(12) unique not null,
  auth number(1) default 2 not null,/*0탈퇴회원, 1정지회원, 2일반회원, 3관리자*/
  constraint spmember_pk primary key (mem_num)
);

create table spmember_detail(
  mem_num number not null,
  name varchar2(30) not null,
  passwd varchar2(35) not null,
  phone varchar2(15) not null,
  email varchar2(50) not null,
  zipcode varchar2(5) not null,
  address1 varchar2(90) not null,
  address2 varchar2(90) not null,
  photo blob,
  photoname varchar2(100),
  reg_date date default sysdate not null,
  modify_date date default sysdate not null,
  constraint spmember_detail_pk primary key (mem_num),
  constraint spmember_detail_fk foreign key (mem_num) references spmember (mem_num)
);

create sequence member_seq start with 100;

/*관리자 입력*/
INSERT INTO spmember (mem_num,id,auth) VALUES (1,'admin',3);
INSERT INTO spmember_detail (mem_num,name,passwd,phone,email,zipcode,address1,address2)
VALUES (1,'관리자','1234','010-1234-5678','test@test.com','12345','서울시','강남구');

COMMIT;


/*게시판*/
create table spboard(
	board_num number not null,
	title varchar2(100) not null,
	content clob not null,
	hit number(5) default 0 not null,
	reg_date date default sysdate not null,
	modify_date date default sysdate not null,
	uploadfile blob,
	filename varchar2(100),
	ip varchar2(40) not null,
	mem_num number not null,
	constraint spboard_pk primary key (board_num),
	constraint spboard_fk foreign key (mem_num) references spmember (mem_num)
);

create sequence board_seq;