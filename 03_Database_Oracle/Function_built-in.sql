--ABS: 절대값
SELECT ABS(-78), ABS(78) FROM Dual;
--ROUND: 반올림한 값
SELECT round(4.875, 1) FROM Dual;
--백 원 단위로 반올림
SELECT custid "고객번호", ROUND(sum(saleprice)/count(*), -2) "평균금액"
FROM orders
GROUP BY custid;

--REPLACE: 문자열 치환
SELECT bookid,replace(bookname, '야구','농구') bookname,publisher,price FROM book;
--LENGTH: 글자 수
SELECT bookname "제목",length(bookname) "글자수",lengthb(bookname) "바이트수"
FROM book WHERE publisher='굿스포츠';
--SUBSTR: 지정한 길이만큼의 문자열 반환
SELECT substr(name,1,1) "성",count(*) "인원"
FROM customer group by substr(name,1,1);
SELECT substr(name,2,3) "이름",count(*) "인원"
FROM customer group by substr(name,2,3);

SELECT orderid "주문번호",orderdate "주문일",orderdate+10 "확정" FROM orders;
--TO_DATE: 문자형 날짜를 날짜형으로 변환
--TO_CHAR: 날짜형을 문자형으로 변환
SELECT orderid "주문번호",to_char(orderdate, 'yyyy-mm-dd dy') "주문일",custid "고객번호",bookid "도서번호"
FROM orders WHERE orderdate=to_date('20140707', 'yyyymmdd');
--SYSDATETIME: 오라클 현재 날짜와 시간을 반환
--SYSTIMESTAMP: 현재 날짜, 시간, 초 이하의 시간, 서버의 TIMEZONE까지 출력
SELECT sysdate,to_char(sysdate,'yyyy/mm/dd dy hh24:mi:ss') "SYSDATE_1" FROM Dual;

--연습문제