create table tboard (
	num number primary key,
	name varchar(30) not null,
	title varchar2(150) not null,
	passwd varchar2(10) not null,
	content varchar2(4000) not null,
	reg_date date not null
);

create sequence board_seq;	/*중복X, unique한 값을 가져다 쓸 수 있음*/