/*
DROP table orders;
DROP table book;
DROP table customer;

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

COMMIT;
*/

/*
SELECT * from Book;
SELECT * from Customer;
SELECT * from Orders;

SELECT phone FROM Customer WHERE name='김연아';
SELECT bookname, price FROM Book;
SELECT price, bookname FROM Book;
SELECT bookid, bookname, publisher, price FROM Book;
SELECT DISTINCT publisher FROM Book;
*/
/*
SELECT * FROM Book WHERE price between 10000 AND 20000; --price>=10000 AND price<=20000;
SELECT * FROM Book WHERE price<10000 OR price>20000;
SELECT * FROM Book WHERE publisher='굿스포츠' OR publisher='대한미디어';
SELECT * FROM Book WHERE publisher NOT IN('굿스포츠', '대한미디어');

SELECT bookname,publisher FROM Book WHERE bookname='축구의 역사'; --LIKE '축구의 역사';
SELECT bookname,publisher FROM Book WHERE bookname LIKE '%축구%';

SELECT * FROM Book WHERE bookname LIKE '_구%';
SELECT * FROM Book WHERE bookname LIKE '%축구%' AND price>=20000;
SELECT * FROM Book WHERE publisher='굿스포츠' OR publisher='대한미디어';
*/

/* 실습 */
/*
SELECT bookname,price FROM Book WHERE bookname LIKE '%야구%';
SELECT bookname FROM Book WHERE publisher='삼성당';
SELECT bookname,price,publisher FROM Book WHERE bookname LIKE '%피겨%';
SELECT bookname,price FROM Book WHERE price>=15000 AND bookname LIKE '%바이블%';
SELECT bookname,price FROM Book WHERE NOT bookname LIKE ('%추억%') AND price>=20000;  --NOT을 앞에 사용
SELECT bookname FROM Book WHERE publisher='굿스포츠' ORDER BY bookname ASC;
*/

/*
SELECT * FROM Book ORDER BY bookname;
SELECT * FROM Book ORDER BY price,bookname;
SELECT * FROM Book ORDER BY price DESC, publisher ASC;
*/
/*
SELECT SUM(saleprice) FROM Orders;
SELECT SUM(saleprice) AS 총매출 FROM Orders;
SELECT SUM(saleprice) AS 총매출 FROM Orders WHERE custid=2;
SELECT SUM(saleprice) AS Total, AVG(saleprice) AS Average, MIN(saleprice) AS Minimum, Max(saleprice) AS Maximum FROM Orders;
SELECT COUNT(*) AS 총판매건수 FROM Orders;

SELECT custid,COUNT(*) AS 도서수량, SUM(saleprice) AS 총액 FROM Orders GROUP BY custid;
SELECT custid,COUNT(*) AS 도서수량 FROM Orders WHERE saleprice>=8000 group by custid HAVING count(*)>=2;
*/

/* 연습문제 풀이 */
Select bookname From Book Where bookid=1;
Select bookname From Book Where price>=20000;
Select SUM(saleprice) From Orders Where custid=1;
Select COUNT(*) From Orders Where custid=1;

Select COUNT(*) AS 도서수량 From Book;
Select COUNT(distinct publisher) AS 출판사개수 From Book;
Select name,address From Customer;
Select orderid From Orders Where orderdate between '20140704' and '20140707';   --orderdate는 date타입
Select orderid From Orders Where orderdate not between '20140704' and '20140707';
Select name,address From Customer Where name Like '김%';
Select name,address From Customer Where name Like '김%아';