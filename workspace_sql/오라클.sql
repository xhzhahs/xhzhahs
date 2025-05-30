-- 한줄 주석

/* 범위 주석 */
/* 
    여러줄
    주석
*/

-- SQL : Structured Query Language

SELECT * from emp;
select * from dept;

select empno, ename, deptno
from emp;

-- 이름과 급여만 출력
select
    sal,
    ename,
    123,
    'a'
 from
    emp;

select
    job, deptno
from emp;

select
    distinct job, deptno
from emp;

select * from emp, dept;

select
    sal as 월급, sal * 12 "연 봉"
from emp;

select
    ename, sal, 
    sal*12+comm as s1, 
    sal*12+comm s2, 
    sal*12+comm "s s", -- sql에서 유일하게 "가 들어가는 곳
    comm as 추가수당
from emp;

select * from emp
order by sal; -- sal 컬럼 기준으로 오름차순-작은 것부터 큰 것 순서로
-- 오름차순은 asc인데 생략되어 있음

select * from emp
order by sal desc; -- sal 컬럼 기준으로 내림차순-큰 것부터 작은 것 순서로

-- 가장 먼저 입사한 순서로 출력
select * from emp
order by hiredate;

select * from emp
order by ename desc;


select * from emp
order by deptno, sal desc;
-- deptno가 1순위 sal이 2순위
-- 1순위부터 한 다음 2순위 정렬

-- deptno, sal desc; 이 상황에서 연봉이 같으면 사원번호 내림차순으로 정렬해 보기

select * from emp
order by deptno, sal desc, empno desc;


