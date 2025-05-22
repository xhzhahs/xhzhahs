-- 한줄 주석  단축키 ctrl + /

/* 범위 주석  */
/* 
    여러줄
    주석
*/

-- SQL : Structured Query Language

select * from emp;
select * from dept;

select * from emp;

-- 이름과 급여만 출력
select 
    sal, 
    ename,
    123,
    'a'
  from 
    emp;

select
    deptno
from emp;

select
    distinct deptno
from emp;

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

-- sal 컬럼을 기준으로 오름차순 - 작은 것 부터 큰 것 순서로
select * from emp
order by sal;

select * from emp
order by sal asc;


-- sal 컬럼 기준으로 내림차순 - 크 것부터
select * from emp
order by sal desc;

-- 가장 먼저 입사한 순서로 출력
select * from emp
order by hiredate asc;

select * from emp
order by ename desc;

-- 부서번호로 오름차순, 겹치면 sal 내림차순
select * from emp
order by deptno asc, sal desc;
-- deptno asc, sal desc;이 상황에서 연봉으면 사원번호 내림차순 정렬
select * from emp
order by deptno asc, sal desc, empno desc;

select * 
from emp
where deptno = 30;

select * 
from emp
where deptno = 30
order by sal;

-- sal이 1600인 사람만 출력
select * from emp where sal = 1600;

-- 초과
select * from emp where sal > 1600;

-- 이상
select * from emp where sal >= 1600;  -- =이 오른쪽

-- 이하
select * from emp where sal <= 1600;  -- =이 오른쪽

-- 부정
select * from emp where deptno != 30;
select * from emp where deptno <> 30;

-- AND
select *
from emp
where
    deptno = 30 and job = 'SALESMAN';

-- OR
/*
    emp 테이블에서 
    부서번호deptno가 30 이거나(또는) job이 CLERK인 사원의
    모든 정보를 출력하라
*/
select *
from emp
where
    deptno = 30 or job = 'CLERK';
    
/*
    job이 CLERK이거나 sal이 2000 초과면서 deptno가 10인 사원 조회
*/
select * from emp
where 
    job = 'CLERK' or sal > 1000 and deptno = 10;

select * from emp
where job = 'CLERK' or ( sal > 1000 and deptno = 10 );

select * from emp
where not (job = 'CLERK' or ( sal > 1000 and deptno = 10 ));

/*
    deptno != 30, deptno <> 30, deptno ^= 30, not deptno = 30
*/
-- 월급 2000이상 4000미만인 사원을 출력하시오
select * from emp
where sal >= 2000 and sal < 4000;
-- 2000 <= sal < 4000
--where 2000 <= sal and sal < 4000;

-- 부서번호 10 또는 20인 사원만 출력
select * from emp
where deptno = 10 or deptno = 20;

select * from emp
where deptno in ( 10, 20 );

select * from emp
where deptno not in ( 10, 20 );


--퀴즈

--1. 부서번호 10번인 사람들을 출력
select * from emp
where deptno=10;

--2. 부서번호가 10번이 아닌 사람들을 출력
select * from emp
where not deptno=10;
-- where depino != 10;
-- where depino <> 10;
-- 부정을 입력하고 싶을 때는 그 문장을 가져와서 ()안에 붙여넣기 후 앞에 not 붙이기


--3. 급여가 3000 이상인 사람들을 출력
select * from emp
where sal>=3000;

--4. 급여가 1500~3000 사이(포함)의 사람을 출력
select * from emp
where sal between 1500 and 3000;
-- where sal>= 1500 and sal <= 3000;

--5. 부서번호 10번인 사람 중 급여 2000 이상인 사람을 출력 
select * from emp
where deptno=10 and sal >= 2000;

--6. 부서번호 30번 중 1500~3000 사이(미포함)인 사람을 출력
select * from emp
where deptno=30 
and sal > 1500 and sal < 3000;
-- and (sal > 1500 and sal < 3000);

--7. 부서번호 30번 중 1500~3000 사이(미포함)인 사람을 연봉이 작은 순으로 출력, 연봉이 같은 경우 이름이 빠른 순으로 출력
select * from emp
where deptno=30 
and sal > 1500 and sal < 3000
order by sal, ename;

--8. 부서번호 20,30번 중 1500~3000 사이(미포함)인 사람을 연봉이 작은 순으로 출력, 연봉이 같은 경우 이름이 빠른 순으로 출력
select * from emp
where deptno in(20, 30)
-- where depino = 20 or depino =30
-- 같은 칼럼이 = 과 or로 연결되어 있는 경우 in으로 변경 가능
and sal >1500 and sal <3000
-- and (sal >1500 and sal <3000)
order by sal, ename;

select * from emp
where (deptno = 20 or deptno = 30) and (sal >1500 and sal <3000)
order by sal, ename;
-- or 보다 and가 우선순위가 높기 때문에 값이 다르게 나옴
-- or를 먼저 수행하도록 하기 위해서는 ()활용

--9. 부서번호가 20 또는 30이고 급여가 1500 이상인 직원의 이름과 급여를 급여 오름차순으로 출력하라.
select ename, sal from emp
where deptno in (20, 30) and sal >= 1500
order by sal;

--between
select * from emp
where sal between 2000 and 3000;

select * from emp
where sal not between 2000 and 3000;

select * from emp
where sal not between 2000 and 3000;

-- between 사용하여 2000초과 3000미만
select * from emp
where sal between 2000 and 3000
and sal != 2000
and sal != 3000;

-- like는 대소문자 구분 필요, 글자가 포함된 경우 출력
-- %는 와일드 카드의 존재, 글자의 길이 상관없음
-- _는 와일드 카드의 존재, 글자가 무조건 1자리여야 함

select * from emp
where ename like 'S%';

select * from emp
where ename like '_L%'; -- 첫번째 글자는 상관없고 두번째 글자는 무조건 L이어야 함 뒤쪽은 상관없음

select * from emp
where ename like '%AM%'; -- AM이 들어가는 모든 사람 출력, AM이 맨 앞에 나올 경우도 출력

select * from emp
where ename not like '%A%'; -- A가 들어가지 않는 사람 출력
-- where not ename like '%A%' 도 쓸 수 있다.

select * from emp
where ename like '%A%' or ename like '%S%'; -- A나 S가 들어가는 사람

select * from emp
where ename like '%A%S%' or ename like '%S%A%'; -- A와 S가 같이 들어가는 사람


-- null은 값이 없는 상태를 뜻 함
select * from emp
where comm > 400;

-- 안되는 경우 (연산이 안되기 때문)
select * from emp
where comm = '(null)';

select * from emp
where comm = null;

-- null인 사람만 출력할 때 is null 사용
select * from emp
where comm is null;

select * from emp
where comm is not null;

-- 집합연산자 union
-- 앞에 있는 조회 쿼리(SQL) 결과와 뒤에 있는 조회 쿼리 결과를 위 아래로 합쳐 줌 (즉, 다음줄에 나오게 함)
-- 조회하는 컬럼 수, 컬럼의 타입이 같아야 실행된다.
-- 중복되는 줄은 한번만 나온다

select * from emp where deptno = 10
UNION
select * from emp where deptno = 10;

-- union all 은 중복되는 줄 모두 출력, 실무에서 union보다 많이 사용
select * from emp where deptno = 10
UNION all
select * from emp where deptno = 10;

-- 숫자와 문자를 같이 조회하면 에러
select empno from emp
union all
select ename from emp;

-- 부서 10번을 사원번호 내림차순으로 정렬하여 출력
-- 부서 20번을 사원번호 오름차순으로 정렬하여 출력
select * from emp
where deptno = 10 
order by empno desc;

select * from emp
where deptno = 20 
order by empno;


--union all 그냥 사용시 에러(order by 중간에 사용 불가)
-- 아래 형식으로 서브쿼리를 사용하여 order by 적용
select * from (
select * from emp where deptno = 10 
union all
select * from emp where deptno = 20
)
order by empno;

-- 퀴즈 p131
select empno, ename, job, sal, deptno from emp
where deptno = 30
and job = 'SALESMAN';

select * from emp
where sal < 2000 or sal > 3000;

select ename, empno, sal, deptno from emp
where ename like '%E%'
and deptno = 30
and sal not between 1000 and 2000;

select * from emp
where comm is null
and mgr is not null
and job in ('MANAGER', 'CLERK')
and ename not like '_L%';

-- upper, lower
select ename, upper(ename), lower(ename) from emp;

select ename from emp
where lower(ename) like lower('%aM%');

select ename from emp
where upper(ename) like upper('%aM%');

select upper('aBc') from dual;

select upper('aBc'), lower('aBc'), upper( lower('aBc') ) from dual;

-- length 글자수 세기
select ename, length(ename) from emp;

select * from emp
where length(ename) = 5;

select * from emp
where length(ename) >= 5;

-- lengthb 영문, 숫자, 한글 등의 글씨가 몇 바이트인지 출력
select lengthb ('한글') from dual;

-- substr 문자열 일부를 추출
-- substr(문자열 데이터, 몇번째 글자부터, 몇글자 출력)
select job, substr(job, 1, 2), substr(job, 3, 2), substr(job, 5) from emp;

select substr(ename, 2, 3) from emp;
select substr(ename, 2, 30) from emp;
select substr(ename, 200, 300) from emp; -- 실제 글씨 길이보다 넘어가면 null

select job, substr(job, -3, 2) from emp;
select job, substr(job, -30, 2) from emp; -- 실제 글씨 길이보다 넘어가면 null

select ename, substr(ename, -3) from emp; -- 글씨 길이를 모를 때 마지막 자리에 적지 않으면 3번째부터 쭉 나옴
select ename, substr(ename, -3, 10) from emp; -- 글씨 길이의 끝을 알 때 넉넉하게 적어주면 3번째부터 쭉 나옴

select job, 
    substr(job, -length(job)),
    substr(job, -length(job), 2),
    substr(job, -3)
from emp;

-- instr은 글씨가 몇번째 나오는지 찾기. 실무에서 잘 쓰이지 않음. like가 더 많이 쓰임

-- replace 함수 replace(대상 문자열, 찾는 문자, 대체할 문자)
select 'a-b-c',
    replace('a-b-c', '-', ' '),
    replace('a-b-c', '-'), -- 두번째와 세번째 같은 결과가 나옴
    replace('a-b-c', '-', '')
from emp;     

select ename,
    replace (ename, 'E', '-') from emp;
    
select ename,
    replace (ename, 'TT', '-') from emp;
    
select ename,
    replace (ename, 'T', '------') from emp;    
    
                    
-- pad 함수는 자릿수 맞추는 함수. 넘어가면 자르고 모자르면 채우기. lpad 함수는 왼쪽 채우기, rpad 오른쪽채우기
select lpad(ename, 10, '+') from emp;

select rpad(ename, 10, '+') from emp;


-- 응용 문제
-- 1. ename 앞 두글자만 출력
select ename,
    substr(ename, 1, 2) from emp;    
    
select ename,
    rpad(ename, 2) from emp;     
    
-- 2. 앞 두글자만 원본 출력 후 나머지는 4개 *로 표시    
select ename, 
    rpad(substr(ename, 1, 2), 6, '*') from emp;
    
-- 3. 원래 이름 갯수대로 표시    
select ename, 
    rpad(substr(ename, 1, 2), length(ename), '*') from emp;

-- 4. job을 총 20자 중 가운데 정렬
select job, 
   rpad(lpad(job, (20-length(job))/2+length(job), ' '), 20, ' ') AS CENTER
   from emp;
   
-- concat 함수 문자열을 합쳐줌
select 'ab' || 'cd' || 'ef' from dual;
select empno || ename from emp;
select empno || ' : ' || ename from emp;

-- trim 함수 앞, 뒤 공백을 제거해줌. 단, 문자 사이 공백은 제거하지 않음.
select '  ab c  ', trim('  ab c  ') from dual;

-- round 함수 반올림 해주는 함수
select
    round(14.46),  -- 하나만 입력하면 소수점 첫째자리 반올림 round(14.46, 0)
    round(14.46, 1), -- 소수점 두번째자리 반올림
    round(14.46, -1) -- 양의 자리 첫번째자리 반올림. 음수일 때 정수로 거슬러 올라간다.
from dual;

--trunc 함수 버림해주는 함수
select
    trunc(14.46),  -- 하나만 입력하면 소수점 첫째자리 버림 round(14.46, 0)
    trunc(14.46, 1), -- 소수점 두번째자리 버림
    trunc(14.46, -1), -- 양의 자리 첫번째자리 버림. 음수일 때 정수로 거슬러 올라간다.
    trunc(-14.46)
from dual;

-- ceil 함수 올림해주는 함수, floor 함수 내림해주는 함수 -- 음수일 때 주의하기
select
    ceil(3.14),  -- 하나만 입력하면 소수점 첫째자리 버림 round(14.46, 0)
    floor(3.14), -- 소수점 두번째자리 버림
    ceil(-3.14), -- 양의 자리 첫번째자리 버림. 음수일 때 정수로 거슬러 올라간다.
    floor(-3.14)
from dual;

-- mod 함수 숫자를 나눈 나머지를 구하는 함수, 값은 몫을 넘어갈 수 없다.
select 7 / 3 from dual;
select 7 / 0 from dual;

select mod(7, 3) from dual;
select mod(8, 3) from dual;
select mod(9, 3) from dual;

select mod(6, 3), mod(7, 3), mod(8, 3),mod(9, 3) from dual;

select mod(9.3, 3) from dual;
select mod(9.3, 3.1) from dual;

-- sysdate 함수 날짜 데이터를 다루는 함수 sys = system date = 날짜
select sysdate from dual;
select sysdate-25 from dual;

-- 숫자와 문자열 더하여 출력
select empno, empno + '1000' from emp; -- 문자지만 숫자로 이루어진 문자라면 가능
select empno, empno + 'a' from emp; -- 문자가 숫자로 이루어지지 않아서 에러
select 'a' + 'b' from dual; -- +는 양쪽을 무조건 숫자로 바꾸려고 함
select 'a' || 'b' from dual; -- || 는 양쪽을 무조건 문자로 바꾸려고 함

-- to_char 함수. 날짜, 숫자를 문자열로 변환해주는 함수
select to_char(sysdate, 'yyyy/mm/dd hh24:mi:ss') from dual;
select to_char(sysdate, 'yyyy"년" mm"월" dd"일" hh24"시" mi"분" ss"초"') from dual;

select to_char(hiredate, 'yyyy"년" mm"월" dd"일" hh24"시" mi"분" ss"초"') from emp;

-- to_number 함수. 문자를 숫자로 변환해주는 함수 ''에 쌓여진 숫자인 문자만 숫자로 변환 가능
select to_number('1,500', '999,999') from dual; -- 999,999 는 세자리마다 콤마

-- to_date 함수.
select to_date('2025-05-15', 'yyyy-mm-dd') from dual;
select to_date('2025-05-15', 'yyyy-mm-dd') - to_date('1997-04-20', 'yyyy-mm-dd') from dual;

select * from emp
where hiredate > to_date('1981-06-01', 'yyyy-mm-dd');

-- nvl 함수. null 처리 함수 (데이터, null을 변환할 데이터)
select
    nvl(comm, -1),
    sal*12 + comm,
    sal*12 + nvl(comm,0)
from emp;

-- nvl2 (데이터, null이 아닐 때 출력할 데이터, null일 때 출력할 데이터)


-- 각 사원의 연봉 출력
-- ename과 total_pay로 출력
select ename,
 nvl(comm, 0),
 sal*12 + nvl(comm, 0) as total_pay
from emp;


-- decode 함수. 조건 함수 = 의미만 사용 가능. >, < 하려면  case 함수 사용해야함.
-- 형식은 decode( 대상 값,
--                조건1, 조건1에 해당하는 값,
--                조건2, 조건2에 해당하는 값,
--                조건에 모두 해당하지 않는 값)
select empno, ename, job, sal,
    decode( job,
        'MANAGER', sal*1.1,
        'SALESMAN', sal*1.05,
        'ANALYST', sal,
        sal*1.03) as upsal       
from emp;

-- case 함수. 조건함수. end 필수 사용. 안쓰면 에러남 -- case 사용시 밑에 end 먼저 적는 습관
select job, sal,
    case job
        when 'MANAGER' then sal*1.1
        when 'SALEMAN' then sal*1.05
        when 'ANALYST' then sal
        else sal*1.03
    end  as upsal  
from emp;

-- nvl 사용하지 않고 decode, case로 nvl이랑 동일한 결과 출력하기
select nvl(comm, -1) from emp;

select comm,
    decode( comm,
        null, -1,
        comm) as decode,
    case
        when comm is null then -1
        else comm
    end as case
from emp;    
-- case 문에서는 null을 사용할 때 case 옆에 아무것도 적지 않고, 조건문에 comm is null 이런식으로 조건 넣어주기
select comm,
    case
        when comm is null then '해당 없음'
        when comm = 0 then '0원'
        when comm > 0 then '수당 :' || comm
    end as case
from emp;


-- 퀴즈
-- 1. empno에서 ename 5글자 이상, 6글자 미만까지만 나오도록
--    masking_empno 열에는 empno 앞 두자리 외 뒷자리를 *로 출력
--    masking_ename 열에는 사원 이름의 첫글자만 보여주고 나머지는 *로 출력
/* 
select empno, ename
from emp
where length(ename)>=5 and length(ename)<6;

select empno,
    rpad( substr(empno, 1,2), length(empno), '*') as masking_empno
from emp;    

select ename,
    rpad(substr(ename, 1,1), length(ename), '*') as masking_ename
from emp;  
*/

select empno,
    rpad( substr(empno, 1,2), length(empno), '*') as masking_empno,
    ename,
    rpad(substr(ename, 1,1), length(ename), '*') as masking_ename
from emp
where length(ename)>=5 and length(ename)<6;

-- 2. 월 평균 근무일 수는 21.5, 하루 8시간기준 
--    하루 급여(소수 셋째자리에서 버림)와 시급 계산(소수 둘째 자리에서 반올림) 
select empno, ename, sal,
    trunc(sal/21.5,2) as day_pay,
    round(sal/21.5/8,1) as time_pay
from emp;    

-- 4. 직속상관 사원번호 없으면 0000
    --앞 두 자리가 75면 5555
    --앞 두 자리가 76이면 6666
    --앞 두 자리가 77이면 7777
    --앞 두 자리가 78이면 8888
    --그 외 mgr

select empno, ename, mgr,
    case
        when mgr is null then '0000'
        when substr(mgr, 1, 2) = 75 then '5555'
        when substr(mgr, 1, 2) = 76 then '6666'
        when substr(mgr, 1, 2) = 77 then '7777'
        when substr(mgr, 1, 2) = 78 then '8888'
        else to_char(mgr,'0000')
    end as chg_mgr 
from emp;  
