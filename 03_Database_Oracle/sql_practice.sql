-- SELECT
SELECT empno, ename, job, mgr, hiredate, sal, comm, deptno FROM emp;
SELECT * FROM emp;

-- DUAL : 함수 및 계산의 결과를 볼 때 사용할 수 있는 공용(public) 테이블
SELECT SYSDATE FROM dual;   -- 년/월/일 출력
SELECT 7+20 FROM dual;
SELECT ascii('A') FROM dual;

-- 알리아스 : 별칭
SELECT sal*12 ASal FROM emp;
SELECT sal*12 as ASal FROM emp;
SELECT sal*12 "Annual Salary" FROM emp;

-- 연결연산자
SELECT ename || ' has $' || sal FROM emp;

-- WHERE절(알리아스는 사용할 수 없음)
SELECT * FROM emp WHERE deptno=10;  -- 부서번호=10
SELECT * FROM emp WHERE ename='SMITH';
SELECT * FROM emp WHERE hiredate='81-12-03';

-- 비교연산자
SELECT * FROM emp WHERE sal>=1000 AND sal<=1500;

-- BETWEEN ... AND ... : 두 값 사이(지정한 값 포함)
SELECT * FROM emp WHERE sal BETWEEN 1000 AND 1500;
SELECT * FROM emp WHERE sal NOT BETWEEN 1000 AND 1500;  -- NOT은 BETWEEN 앞에 위치
SELECT * FROM emp WHERE ename BETWEEN 'KING' AND 'SMITH';

-- IN : 값 목록 중의 값과 일치
SELECT * FROM emp WHERE sal IN (1300, 2450, 3000);
SELECT * FROM emp WHERE sal NOT IN (1300, 2450, 3000);
SELECT * FROM emp WHERE ename IN ('ALLEN', 'FORD');

/*
    LIKE : LIKE연산자를 사용하여 패턴 일치
    % -> 0개 이상의 문자를 나타냄
    _ -> 한 문자를 나타냄
*/
SELECT * FROM emp WHERE ename LIKE '%S%';
SELECT * FROM emp WHERE ename NOT LIKE '%S%';
SELECT * FROM emp WHERE ename LIKE 'FOR_';  -- FOR 다음에 꼭 한 글자


--NULL 조건 사용
--오라클에서 NULL이란 입력이 안 된 값.
SELECT * FROM emp WHERE comm IS NULL;   -- equal 사용 불가, IS NULL은 NULL인 것만 읽어옴
SELECT * FROM emp WHERE comm IS NOT NULL;   -- NULL이 아닌 것만 읽어옴

-- 논리연산자(AND, OR , NOT)
SELECT empno, ename, job, sal FROM emp WHERE sal>=2000 AND job LIKE '%MAN%';
SELECT empno, ename, job, sal FROM emp WHERE sal>=2000 OR job LIKE '%MAN%';

-- ORDER BY절
SELECT * FROM emp WHERE deptno=10 ORDER BY sal; -- ASC가 DEFAULT
SELECT * FROM emp WHERE deptno=10 ORDER BY sal ASC; -- 오름차순
SELECT * FROM emp WHERE deptno=10 ORDER BY sal DESC; -- 내림차순
SELECT * FROM emp ORDER BY sal ASC, ename ASC;
-- 열 알리아스를 기준으로 정렬
SELECT empno, ename, sal*12 annual FROM emp ORDER BY annual;
-- 열의 숫자 위치를 사용하여 정렬
SELECT ename, job, deptno, hiredate FROM emp ORDER BY 3;    --3열은 deptno, 부서번호를 기준으로 정렬

-- 그룹 함수
-- 그룹 함수를 사용하면 단일행이 결과로 보여짐
SELECT MAX(sal), MIN(sal), ROUND(AVG(sal)), SUM(sal) FROM emp;  --ROUND함수는 소수점 반올림

/*
    GROUP BY
    SELECT절에 그룹 함수 적용 시 개별 컬럼을 지정할 수 없음
    개별 컬럼을 지정할 경우에는 반드시 GROUP BY절에 지정된 컬럼만 사용
*/
-- 오류 발생 -> error: 단일 그룹의 그룹 함수가 아닙니다.
--SELECT deptno, MAX(sal), MIN(sal), ROUND(AVG(sal)), SUM(sal) FROM emp;

SELECT deptno, MAX(sal), MIN(sal), ROUND(AVG(sal)), SUM(sal)
FROM emp
GROUP BY deptno;

-- WHERE절 - GROUP BY - ORDER BY 순서로 사용
SELECT deptno, SUM(sal)
FROM emp
WHERE deptno>10
GROUP BY deptno
ORDER BY deptno;

/*
    HAVING
    그룹 처리 결과를 제한하고자 할 때 HAVING절 이용
    WHERE절은 일반 컬럼을 조건 체크할 수 있으나
    그룹 함수에 의해 만들어진 데이터는 HAVING절을 이용해야 함
    알리아스는 사용 불가
*/
-- 오류 발생 -> error: 그룹 함수는 허가되지 않습니다.
--SELECT deptno, AVG(sal) FROM emp WHERE AVG(sal)>=2000 GROUP BY deptno;

-- 정상 구문 : 그룹 함수로부터 만들어진 데이터에서는 HAVING절을 사용
SELECT deptno, AVG(sal)
FROM emp
GROUP BY deptno
HAVING AVG(sal)>=2000;

SELECT deptno, ROUND(AVG(sal))
FROM emp
WHERE deptno>10
GROUP BY deptno
HAVING ROUND(AVG(sal))>=2000
ORDER BY deptno;

/*
    [실습]
    1. 월급이 2500이상 3500미만인 사원의 이름, 입사일, 월급을 구하시오.
    2. 부서번호(deptno) 30번에서 근무하며 월 2,000달러 이하를 받는 1981년 5월 1일 이전에 입사한 사원의 이름, 급여, 부서번호, 입사일을 출력하시오.
    3. emp테이블에서 업무(job)별 최고 월급을 구하고 업무, 최고 월급을 출력하시오.
    4. emp테이블에서 부서별로 지급되는 총월급에서 금액이 9,000이상인 부서번호, 총월급을 출력하시오.
*/
--1번
SELECT ename, hiredate, sal
FROM emp
WHERE sal>=2500 AND sal<3500;

--2번
SELECT ename, sal, deptno, hiredate
FROM emp
WHERE deptno=30 AND sal<=2000 AND hiredate<'81-05-01';

--3번
SELECT job, MAX(sal)
FROM emp
GROUP BY job;

--4번
SELECT deptno, SUM(sal)
FROM emp
GROUP BY deptno
HAVING SUM(sal)>=9000;

/********************************************************/

/* 변환 함수 */
-- To_CHAR <*중요*>
-- 형식 : SELECT TO_CHAR(날짜, '포맷문자') FROM dual;

SELECT SYSDATE FROM dual;

-- 날짜 -> 문자
SELECT TO_CHAR(SYSDATE, 'YYYY-MM-DD HH:MI:SS') FROM dual;
SELECT ename, hiredate FROM emp;
SELECT ename, TO_CHAR(hiredate, 'YYYY-MM-DD') FROM emp;

-- 숫자 -> 문자, 9는 자리를 의미
SELECT TO_CHAR(1234, 9999) FROM dual;
SELECT TO_CHAR(1234, '9999') FROM dual;

-- ##으로 출력 오류 발생
SELECT TO_CHAR(1234, 0000) FROM dual;   --오류 발생
SELECT TO_CHAR(1234, '0000') FROM dual; --정상 출력

-- 자리수가 모자람 -> ####
SELECT TO_CHAR(1234, 999) FROM dual;
SELECT TO_CHAR(1234, '999') FROM dual;
SELECT TO_CHAR(1234, '000') FROM dual;

-- 실제 자리수보다 많은 자리수 지정
SELECT TO_CHAR(1234, 99999) FROM dual;      --1234
SELECT TO_CHAR(1234, '99999') FROM dual;    --1234
SELECT TO_CHAR(1234, '00000') FROM dual;    --01234

-- 소수점 자리
SELECT TO_CHAR(1234, 9999.99) FROM dual;    --1234.00
SELECT TO_CHAR(1234, '9999.99') FROM dual;  --1234.00
SELECT TO_CHAR(1234, '0000.00') FROM dual;  --1234.00

-- 반올림해서 소수점 둘째자리까지 표시
SELECT TO_CHAR(25.897, 99.99) FROM dual;    --25.90
SELECT TO_CHAR(25.897, '99.99') FROM dual;  --25.90
SELECT TO_CHAR(25.897, '00.00') FROM dual;  --25.90

SELECT sal, TO_CHAR(sal*1.15, '9,999.9') FROM emp;

-- 통화 표시
SELECT TO_CHAR(1234, '$0000') FROM dual;    --$1234
-- 지역통화 표시
SELECT TO_CHAR(1234, 'L0000') FROM dual;    --\1234

SELECT ename, TO_CHAR(sal, '$9,999'), TO_CHAR(hiredate, 'YYYY-MM-DD') FROM emp WHERE ename='KING';

-- TO_DATE
-- 문자 -> 날짜
SELECT TO_DATE('20/09/29', 'YYYY-MM-DD') FROM dual; --20/09/29, sql developer에서 두 자리만 표현

-- TO_NUMBER
-- 문자 -> 숫자
SELECT TO_NUMBER('100', '999') FROM dual;   --100, 숫자로 인식
SELECT TO_NUMBER('100', '000') FROM dual;   --100
SELECT TO_NUMBER('100') FROM dual;          --100

/*
    NVL <*중요*>
    NVL(value1, value2) : value1이 null이면 value2를 사용
    value1과 value2의 자료형이 일치해야 함
*/
SELECT ename, sal, comm, sal+NVL(comm, 0) FROM emp; --comm이 null이면 0을 사용
SELECT ename, NVL(TO_CHAR(comm), 'No Commission') FROM emp; --comm을 문자로 포맷팅해줘야 함


/* 표준 SQL에서 지원 */
/*
    CASE 컬럼 WHEN 비교값 THEN 결과값
            WHEN 비교값 THEN 결과값
            (ELSE 결과값)
    END
*/
--급여 보너스 구하기, BONUS라는 열
SELECT ename, sal, job,
    CASE job
        WHEN 'SALESMAN' THEN sal*0.1
        WHEN 'MANAGER' THEN sal*0.2
        WHEN 'ANALYST' THEN sal*0.3
        ELSE sal*0.4
    END "BONUS" --컬럼 알리아스
FROM emp;

SELECT ename, sal, job,
    CASE
        WHEN sal>=4000 AND sal<=5000 THEN 'A'   --비교식, 결과값
        WHEN sal>=3000 AND sal<4000 THEN 'B'
        WHEN sal>=2000 AND sal<3000 THEN 'C'
        WHEN sal>=1000 AND sal<2000 THEN 'D'
        ELSE 'F'
    END "Grade"
FROM emp
ORDER BY "Grade", sal DESC;

/* 오라클 전용 */
/*
    DECODE : = 비교만 가능
    DECODE(컬럼, 비교값, 반환값,
                비교값, 반환값,
                비교값, 반환값,
                반환값)
*/
--급여 보너스 구하기
SELECT ename, sal, job,
    DECODE(job, 'SALESMAN', sal*0.1,
                'MANAGER', sal*0.2,
                'ANALYST', sal*0.3,
                sal*0.4) "Bonus"    --알리아스
FROM emp;

SELECT ename, sal, job,
    DECODE(TRUNC(sal/1000), 5, 'A',  --TRUNC는 소수점자리 절삭
                            4, 'A',
                            3, 'B',
                            2, 'C',
                            1, 'D',
                            'F') "Grade"   
FROM emp;

/*
    [실습]
    1. 사원이름, 월급, 월급과 커미션을 더한 값을 컬럼명 실급여라고 해서 출력하시오.
      단, NULL값은 나타나지 않게 작성하시오.
    2. 월급과 커미션을 합친 금액이 2,000 이상인 급여를 받는 사원의 이름, 업무, 월급, 커미션, 고용날짜를 출력하시오.
      단, 고용날짜는 1980-12-17 형태로 출력하시오.
    3. 사원의 이름은 소문자로 표시하고 업무, 근무연차를 출력하시오.
*/
--1번
SELECT ename, sal, sal+NVL(comm, 0) as "실급여" FROM emp;

--2번
SELECT ename, job, sal, NVL(comm, 0), sal+NVL(comm, 0) "실급여", TO_CHAR(hiredate, 'YYYY-MM-DD') hiredate
FROM emp
WHERE sal+NVL(comm, 0)>=2000;

--3번
SELECT MONTHS_BETWEEN('2020-09-29', '2020-03-01') FROM dual;    --예시
SELECT LOWER(ename), job, TRUNC(MONTHS_BETWEEN(SYSDATE, hiredate)/12) FROM emp;


-- JOIN : 오라클 전용 <*중요*>
-- 동등 조인
SELECT emp.ename, dept.dname
FROM emp, dept
WHERE emp.deptno = dept.deptno
ORDER BY dept.dname, emp.ename;

-- 테이블 알리아스 사용
SELECT e.ename, d.dname
FROM emp e, dept d
WHERE e.deptno=d.deptno;

-- 추가적인 조건 명시
SELECT e.ename, d.dname
FROM emp e, dept d
WHERE e.deptno=d.deptno AND e.ename='ALLEN';

-- 비동등조인 : 같은 데이터가 없기 때문에 = 사용 불가
--Q. 사원이름, 급여, 급여등급 구하기(emp, salgrage 테이블 이용)
SELECT e.ename, e.sal, s.grade
FROM emp e, salgrade s
WHERE e.sal BETWEEN s.losal AND s.hisal;

-- Self Join
--Q. 사원이름과 해당 사원의 관리자 이름 구하기(관리자가 없는 사원 제외)
SELECT a.ename 사원이름, m.ename 관리자이름
FROM emp a, emp m
WHERE a.mgr=m.empno;

-- 외부 조인
-- 누락된 행의 반대 테이블에 (+) 기호를 표시
SELECT distinct(e.deptno), d.deptno
FROM emp e, dept d
WHERE e.deptno(+)=d.deptno;

/*
    [실습]
    1. 모든 사원의 이름, 부서번호, 부서이름을 표시하시오.
    2. 업무가 MANAGER인 사원의 정보를 이름, 업무, 부서명, 근무지 순으로 출력하시오.(emp, dept)
    3. 커미션을 받고 있고 급여가 1,600이상인 사원의 사원이름, 급여, 부서명, 근무지를 출력하시오.(emp, dept)
*/
--1번
SELECT e.ename, e.deptno, d.dname
FROM emp e, dept d
WHERE e.deptno=d.deptno;

--2번
SELECT e.ename, e.job, d.dname, d.loc
FROM emp e, dept d
WHERE e.deptno=d.deptno AND e.job='MANAGER';

--3번
SELECT e.ename, e.sal, d.dname, d.loc
FROM emp e, dept d
WHERE e.deptno=d.deptno AND e.comm IS NOT NULL AND e.sal>=1600;


--JOIN : 표준 SQL <*중요*>
-- 내부 조인(INNER JOIN)
-- INNER JOIN 또는 JOIN이라고 명시
SELECT e.ename, d.dname
FROM emp e INNER JOIN dept d
ON e.deptno=d.deptno;

-- 부가조건이 있으면 WHERE절 사용
SELECT e.ename, d.dname
FROM emp e JOIN dept d
ON e.deptno=d.deptno
WHERE e.ename='ALLEN';

-- 만약 조인 조건에 사용된 컬럼의 이름이 같다면 USING절을 사용하여 조인 조건을 정의할 수 있음
SELECT e.ename, d.dname, deptno -- USING을 사용하면 e.deptno나 d.deptno는 오류 발생
FROM emp e JOIN dept d
USING(deptno)
WHERE e.ename='ALLEN';

-- 셀프 조인
---Q. 사원이름과 해당 사원의 관리자 이름 구하기(관리자 없는 사원은 제외)
SELECT e.ename name, m.ename manager_name
FROM emp e JOIN emp m
ON e.mgr=m.empno;   --USING 사용 불가능

-- 외부 조인(OUTER JOIN)
-- 누락된 행의 방향을 표시
SELECT distinct(e.deptno), d.deptno
FROM emp e RIGHT JOIN dept d
ON e.deptno=d.deptno;

/*
    [실습]
    1. 근무지가 CHICAGO인 모든 사원의 이름, 업무, 부서번호 및 부서이름을 표시하시오.
    2. 근무지(loc)별로 근무하는 사원의 수가 5명 이하인 겨우, 인원이 적은 도시순으로 정렬하시오.
      (근무 인원이 0명인 곳도 포함)
    3. 커미션이 책정된 사원들의 사원번호, 이름, 연봉, 급여+커미션, 급여등급을 출력하는데
      각각의 컬럼명을 "사원번호", "사원이름", "연봉", "실급여", "급여등급" 으로 출력하시오.
      단, 커미션이 NULL인 것은 제외하고 출력(emp, salgrade 테이블 이용)
*/
--1번
SELECT e.ename, e.job, d.deptno, d.dname
FROM emp e JOIN dept d
ON e.deptno=d.deptno
WHERE d.loc='CHICAGO';

--2번(**)
-- COUNT -> GROUP BY 등장, GROUP BY에는 HAVING 사용, 알리아스 사용 불가능
SELECT d.loc, COUNT(e.empno) emp_member
FROM emp e RIGHT JOIN dept d    --누락된 도시까지 출력
ON e.deptno=d.deptno
GROUP BY d.loc
HAVING COUNT(e.empno)<=5
ORDER BY emp_member ASC, d.loc ASC;

--3번
SELECT e.empno "사원번호", e.ename "사원이름", e.sal*12 "연봉", e.sal+e.comm "실급여", s.grade "급여등급"
FROM emp e JOIN salgrade s
ON e.sal BETWEEN s.losal AND s.hisal
WHERE comm IS NOT NULL;


-- Subquery  <*중요*>
-- 단일행 서브쿼리 : 오직 한 개의 행(값)을 반환
SELECT empno, ename, job FROM emp
WHERE job = (SELECT job FROM emp WHERE empno=7369);

SELECT ename, sal FROM emp
WHERE sal > (SELECT sal FROM emp WHERE ename='BLAKE');

-- 다중행 서브쿼리 : 하나 이상의 행을 반환하는 서브쿼리
-- IN 연산자의 사용
--Q. 부서별로 가장 급여를 적게 받는 사원과 동일한 급여를 받는 사원의 정보를 출력
SELECT empno, ename, sal FROM emp
WHERE sal IN (SELECT MIN(sal) FROM emp GROUP BY deptno);

-- ANY 연산자의 사용
-- 서브쿼리의 결과값 중 어느 하나의 값이라도 만족이 되면 결과값을 반환
SELECT ename, sal FROM emp
WHERE sal > ANY (SELECT sal FROM emp WHERE job='SALESMAN'); --or||의 개념

-- ALL 연산자의 사용
-- 서브쿼리의 결과와 모든 값이 일치
SELECT empno, ename, sal, deptno FROM emp
WHERE sal > All (SELECT sal FROM emp WHERE deptno=20);  --and&&의 개념

-- 다중행 서브쿼리
-- 서브쿼리의 결과가 두 개 이상의 컬럼으로 반환되어 메인 쿼리에 전달하는 쿼리
SELECT empno, ename, sal, deptno FROM emp
WHERE (deptno, sal) IN (SELECT deptno, sal FROM emp WHERE deptno=30);

/*
    [실습]
    1. "BLAKE"와 같은 부서에 있는 사원들의 이름과 입사일을 구하는데 "BLAKE"는 제외하고 출력하시오.
      (BLAKE가 여러명일 수 있음) -> 다중행
    2. 평균급여보다 많은 급여를 받는 사원들의 사원번호, 이름, 월급을 출력하는데
      단, 월급이 높은 사람 순으로 출력하시오.
    3. 10번 부서에서 급여를 가장 많이 적게 받는 사원과 동일한 급여를 받는 사원의 이름을 출력하시오.
    4. 사원 수가 3명이 넘는 부서의 부서명과 사원수를 출력하시오.
    5. 직속상사(mgr)가 KING인 모든 사원의 이름과 급여를 출력하시오.
*/
--1번
SELECT ename, hiredate FROM emp
WHERE deptno IN (SELECT deptno FROM emp WHERE ename='BLAKE') AND ename NOT IN 'BLAKE';

--2번 : 단일행
SELECT empno, ename, sal FROM emp
WHERE sal > (SELECT AVG(sal) FROM emp)
ORDER BY sal DESC;

--3번 : WHERE절
SELECT ename FROM emp
WHERE sal = (SELECT MIN(sal) FROM emp WHERE deptno=10);

--4번(**) : 조인 + HAVING절
SELECT d.dname "부서명", COUNT(e.empno) "사원수"
FROM emp e JOIN dept d
ON e.deptno=d.deptno
GROUP BY d.dname
HAVING COUNT(e.empno)>3;

--5번 : 단일행이므로 = 사용, 다중행일 경우 IN을 사용
SELECT ename, sal FROM emp
WHERE mgr = (SELECT empno FROM emp WHERE ename='KING');

/********************************************************/