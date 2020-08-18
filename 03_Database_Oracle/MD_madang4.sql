/*
DROP table orders;
DROP table book;
DROP table customer;
DROP table mybook;


CREATE TABLE Book (
  bookid      NUMBER(2) PRIMARY KEY,
  bookname    VARCHAR2(40),
  publisher   VARCHAR2(40),
  price       NUMBER(8) 
);

CREATE TABLE  Customer (
  custid      NUMBER(2) PRIMARY KEY,  
  name        VARCHAR2(40),
  address     VARCHAR2(50),
  phone       VARCHAR2(20)
);


CREATE TABLE Orders (
  orderid NUMBER(2) PRIMARY KEY,
  custid  NUMBER(2) REFERENCES Customer(custid),
  bookid  NUMBER(2) REFERENCES Book(bookid),
  saleprice NUMBER(8) ,
  orderdate DATE
);


CREATE TABLE Mybook (
  bookid      NUMBER,
  price       NUMBER,
  primary key(bookid)
);

-- Book, Customer, Orders 데이터 생성
INSERT INTO Book VALUES(1, '축구의 역사', '굿스포츠', 7000);
INSERT INTO Book VALUES(2, '축구아는 여자', '나무수', 13000);
INSERT INTO Book VALUES(3, '축구의 이해', '대한미디어', 22000);
INSERT INTO Book VALUES(4, '골프 바이블', '대한미디어', 35000);
INSERT INTO Book VALUES(5, '피겨 교본', '굿스포츠', 8000);
INSERT INTO Book VALUES(6, '역도 단계별기술', '굿스포츠', 6000);
INSERT INTO Book VALUES(7, '야구의 추억', '이상미디어', 20000);
INSERT INTO Book VALUES(8, '야구를 부탁해', '이상미디어', 13000);
INSERT INTO Book VALUES(9, '올림픽 이야기', '삼성당', 7500);
INSERT INTO Book VALUES(10, 'Olympic Champions', 'Pearson', 13000);

INSERT INTO Customer VALUES (1, '박지성', '영국 맨체스타', '000-5000-0001');
INSERT INTO Customer VALUES (2, '김연아', '대한민국 서울', '000-6000-0001');  
INSERT INTO Customer VALUES (3, '장미란', '대한민국 강원도', '000-7000-0001');
INSERT INTO Customer VALUES (4, '추신수', '미국 클리블랜드', '000-8000-0001');
INSERT INTO Customer VALUES (5, '박세리', '대한민국 대전',  NULL);

INSERT INTO Orders VALUES (1, 1, 1, 6000, TO_DATE('2014-07-01','yyyy-mm-dd')); 
INSERT INTO Orders VALUES (2, 1, 3, 21000, TO_DATE('2014-07-03','yyyy-mm-dd'));
INSERT INTO Orders VALUES (3, 2, 5, 8000, TO_DATE('2014-07-03','yyyy-mm-dd')); 
INSERT INTO Orders VALUES (4, 3, 6, 6000, TO_DATE('2014-07-04','yyyy-mm-dd')); 
INSERT INTO Orders VALUES (5, 4, 7, 20000, TO_DATE('2014-07-05','yyyy-mm-dd'));
INSERT INTO Orders VALUES (6, 1, 2, 12000, TO_DATE('2014-07-07','yyyy-mm-dd'));
INSERT INTO Orders VALUES (7, 4, 8, 13000, TO_DATE( '2014-07-07','yyyy-mm-dd'));
INSERT INTO Orders VALUES (8, 3, 10, 12000, TO_DATE('2014-07-08','yyyy-mm-dd')); 
INSERT INTO Orders VALUES (9, 2, 10, 7000, TO_DATE('2014-07-09','yyyy-mm-dd')); 
INSERT INTO Orders VALUES (10, 3, 8, 13000, TO_DATE('2014-07-10','yyyy-mm-dd'));

INSERT INTO Mybook VALUES(1, 10000);
INSERT INTO Mybook VALUES(2, 20000);
INSERT INTO Mybook VALUES(3, NULL);

COMMIT;
*/

--alter table orders add (bookname varchar(20));
--alter table orders modify (bookname varchar(40));
--alter table orders add (name varchar(20));

/* NULL값 처리 */
--select sum(price), avg(price), count(*), count(price) from mybook where bookid>=2;
--select sum(price), avg(price), count(*) from mybook where bookid>=4;
--select * from mybook where price is null;
--select * from mybook where price = '';
--select name "이름", nvl(phone, '연락처 없음') "전화번호" from customer;
--select bookid "책번호", nvl(price, 0) "가격" from mybook;
--
/* ROWNUM */
--select rownum "순번", custid, name, phone from customer where rownum<=2;

/* 연습문제 */
--select * from mybook;
--select bookid,nvl(price,0) from mybook;
--select * from mybook where price is null;
--select * from mybook where price='';
--select bookid,price+100 from mybook;
--select sum(price),avg(price),count(*) from mybook where bookid>=4;
--select count(*),count(price) from mybook;
--select sum(price),avg(price) from mybook;

--select * from book;
--select * from book where rownum<=5;
--select * from book where rownum<=5 order by price;
--select * from (select * from book order by price) b where rownum<=5;
--select * from (select * from book where rownum<=5) b order by price;
--select * from (select * from book where rownum<=5 order by price) b;

/* 스칼라 부속질의 - SELECT문 */
--select (select name from customer where customer.custid=orders.custid) "이름", sum(saleprice) "합계" from orders group by custid;
--update orders set bookname = (select bookname from book where book.bookid=orders.bookid);
--update orders set name = (select name from customer where customer.custid=orders.custid);
--select * from orders;

/* 인라인 뷰 - FROM문 */
--select cs.custid, cs.name, sum(od.saleprice) "total"
--from (select custid, name from customer where custid<=2) cs, orders od
--where cs.custid=od.custid
--group by cs.custid, cs.name;

/* 중첩질의 - WHERE문 */
--select orderid,bookname,saleprice from orders where saleprice<=(select avg(saleprice) from orders);
--select orderid, od.custid, saleprice from orders od where saleprice>(select avg(saleprice) from orders so where od.custid=so.custid);
--select custid,avg(saleprice) from orders group by custid;
--select orderid,custid,saleprice from orders o1 where saleprice>(select avg(saleprice) from orders o2 where o1.custid=o2.custid group by custid);

--select orderid,custid,saleprice,(select name from customer where customer.custid=orders.custid) from orders;
--select sum(saleprice) "total" from orders where custid in (select custid from customer where address like '%대한민국%');
--select sum(saleprice) "total" from orders where custid not in (select custid from customer where address like '%대한민국%');

--select orderid,saleprice from orders where saleprice>(select max(saleprice) from orders where custid=3);
--select orderid,saleprice from orders where saleprice>all(select saleprice from orders where custid='3');

--select sum(saleprice) "total" from orders od where exists (select custid from customer cs where cs.custid=od.custid and address like '%대한민국%');
--select sum(saleprice) "total" from orders od where not exists (select custid from customer cs where cs.custid=od.custid and address like '%대한민국%');

/* 연습문제 */
--select custid, (select address from customer cs where cs.custid=od.custid) "address", sum(saleprice) "total" from orders od group by custid;
--select cs.name, s from (select custid, avg(saleprice) s from orders group by custid) od, customer cs where cs.custid=od.custid;
--select sum(saleprice) "total" from orders od where exists (select * from customer cs where cs.custid=od.custid and custid<=3);