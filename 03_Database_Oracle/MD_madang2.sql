--조인
/*
select * from customer,orders;
select * from customer c, orders o where c.custid=o.custid;
select * from customer c, orders o where c.custid=o.custid order by c.custid;
select name,saleprice from customer c, orders o where c.custid=o.custid;
select name,sum(saleprice) from customer c, orders o where c.custid=o.custid group by c.name;
select name,sum(saleprice) from customer c, orders o where c.custid=o.custid group by c.name order by c.name;
SELECT c.name,b.bookname FROM customer c, orders o, book b WHERE c.custid=o.custid AND o.bookid=b.bookid;
SELECT c.name,b.bookname FROM customer c, orders o, book b WHERE c.custid=o.custid AND o.bookid=b.bookid AND b.price=20000;

SELECT c.name,saleprice FROM customer c LEFT OUTER JOIN orders o ON c.custid=o.custid order by c.name;
*/

--부속질의
/*
SELECT bookname,price FROM book WHERE price=(SELECT MAX(price) FROM book);
SELECT name FROM customer WHERE custid IN (SELECT custid FROM orders);
SELECT name FROM customer WHERE custid IN
    (SELECT custid FROM orders WHERE bookid IN
    (SELECT bookid FROM book WHERE publisher='대한미디어'));
SELECT b1.bookname FROM book b1 WHERE b1.price>
    (SELECT avg(b2.price) FROM book b2 WHERE b2.publisher=b1.publisher);
SELECT name FROM customer c WHERE custid IN
    (SELECT custid FROM orders o WHERE bookid IN
    (SELECT bookid FROM book b WHERE bookname LIKE '%역도%'));
*/

--집합연산
/*
SELECT name FROM customer
MINUS
SELECT name FROM customer WHERE custid IN (SELECT custid FROM orders);
*/

--EXISTS
/*
SELECT name,address FROM customer c WHERE EXISTS(SELECT * FROM orders o WHERE c.custid=o.custid);
*/

--연습문제
/*
SELECT COUNT(Distinct publisher) FROM customer c,book b,orders o
WHERE c.custid=o.custid AND o.bookid=b.bookid AND c.name LIKE '박지성';
SELECT bookname,price,price-saleprice FROM customer c,book b,orders o
WHERE  c.custid=o.custid AND o.bookid=b.bookid AND c.name LIKE '박지성';
SELECT bookname FROM book b WHERE NOT EXISTS
    (SELECT bookname FROM customer c,orders o WHERE c.custid=o.custid AND o.bookid=b.bookid AND c.name LIKE '박지성');
    
SELECT name FROM customer WHERE name NOT IN
    (SELECT name FROM orders o,customer c WHERE o.custid=c.custid);
SELECT SUM(saleprice), AVG(saleprice) FROM orders;
SELECT name,AVG(saleprice) FROM customer c,orders o WHERE c.custid=o.custid GROUP BY c.name;
SELECT name,bookname FROM customer c,orders o,book b WHERE c.custid=o.custid AND o.bookid=b.bookid;
SELECT price-saleprice FROM book,orders WHERE book.bookid=orders.bookid AND price-saleprice=
    (SELECT MAX(price-saleprice) FROM book b,orders o WHERE b.bookid=o.bookid);
SELECT name,AVG(saleprice) FROM customer c,orders o
    WHERE c.custid=o.custid
    GROUP BY name
    HAVING AVG(saleprice)>(SELECT AVG(saleprice) FROM orders);
*/

--데이터 정의어 CREATE/ALTER/DROP
/*
DROP Table NewBook;
DROP Table NewBook2;
DROP Table NewCustomer;
DROP Table NewOrders;

CREATE TABLE NewBook (
    bookid NUMBER PRIMARY KEY,
    bookname VARCHAR2(20),
    publisher VARCHAR2(20),
    price NUMBER
);

CREATE TABLE NewBook2 (
    bookname VARCHAR(20) NOT NULL,
    publisher VARCHAR(20) UNIQUE,
    price NUMBER DEFAULT 10000 CHECK(price>1000),
    PRIMARY KEY(bookname,publisher)
);

CREATE TABLE NewCustomer (
    custid NUMBER PRIMARY KEY,
    name VARCHAR2(40),
    address VARCHAR2(40),
    phone VARCHAR2(30)
);

CREATE TABLE NewOrders (
    orderid NUMBER PRIMARY KEY,
    custid NUMBER NOT NULL,
    bookid NUMBER NOT NULL,
    saleprice NUMBER,
    orderdate DATE,
    FOREIGN KEY(custid) REFERENCES NewCustomer(custid) ON DELETE CASCADE    --연쇄삭제
);

ALTER TABLE NewBook ADD isbn VARCHAR2(13);
ALTER TABLE NewBook MODIFY isbn NUMBER;
ALTER TABLE NewBook DROP COLUMN isbn;
ALTER TABLE NewBook MODIFY bookid NUMBER NOT NULL;
ALTER TABLE NewBook ADD PRIMARY KEY(bookid);

ALTER TABLE NewOrders DROP PRIMARY KEY;
ALTER TABLE NewOrders ADD PRIMARY KEY(orderid);

ALTER TABLE NewCustomer ADD age NUMBER;
ALTER TABLE NewCustomer MODIFY age VARCHAR2(5);
ALTER TABLE NewCustomer DROP COLUMN age;
ALTER TABLE NewCustomer MODIFY name NOT NULL;
ALTER TABLE NewCustomer DROP PRIMARY KEY;

DROP Table NewBook;
DROP Table NewBook2;
DROP Table NewOrders;
DROP Table NewCustomer;
*/

--데이터 조작어 INSERT/UPDATE/DELETE
/*
insert into book(bookid,bookname,publisher,price) values(11,'스포츠 의학', '한솔의학서적', 90000);
insert into book(bookid,bookname,publisher) values(14, '스포츠 의학', '한솔의학서적');

DROP TABLE Imported_Book;

CREATE TABLE Imported_Book (
  bookid      NUMBER ,
  bookname    VARCHAR(40),
  publisher   VARCHAR(40),
  price       NUMBER(8) 
);

INSERT INTO Imported_Book VALUES(21, 'Zen Golf', 'Pearson', 12000);
INSERT INTO Imported_Book VALUES(22, 'Soccer Skills', 'Human Kinetics', 15000);

insert into book(bookid,bookname,price,publisher) select bookid,bookname,price,publisher from Imported_book;

UPDATE customer SET address='대한민국 부산' WHERE custid=5;
UPDATE customer SET address=(SELECT address FROM customer WHERE name='김연아') WHERE name LIKE '박세리';

DELETE FROM customer WHERE custid=5;
DELETE FROM customer;
*/

--연습문제
/*
SELECT distinct name FROM customer c,orders o,book b
WHERE c.custid=o.custid and o.bookid=b.bookid and
    name not like '박지성' and publisher in
    (SELECT publisher FROM customer,orders book
    WHERE c.custid=o.custid and o.bookid=b.bookid and name like '박지성');

SELECT name FROM Customer c1
WHERE 2>=
    (SELECT COUNT(DISTINCT publisher) FROM Customer, Orders, Book 
    WHERE Customer.custid=Orders.custid AND Orders.bookid=Book.bookid AND (name LIKE c1.name));

SELECT bookname FROM Book b1
WHERE((SELECT COUNT(Book.bookid) FROM Book, Orders 
    WHERE Book.bookid=Orders.bookid AND Book.bookid=b1.bookid)>= 0.3*(SELECT COUNT(*) FROM Customer));

insert into book values(17,'스포츠 세계', '대한미디어', 10000);
delete from book where publisher like '삼성당';
--3번. 외래키 제약조건에 위배
update book set publisher='대한출판사' where publisher like '대한미디어';
*/