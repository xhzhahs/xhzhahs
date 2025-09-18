insert into orders (order_key, order_number, order_date, order_pay, order_state, client_id, worker_id, dapart_ID2)
values('발주키', '발주번호', '2025-07-11', '2025-09-11', 1, '거래처ID', '사번', '부서ID'); 

select  * from orders;

drop table order_detail;

CREATE TABLE order_detail (
	order_index	number		NOT NULL,
	order_key	varchar2(20)		NOT NULL,
	item_code	varchar2(20)		NOT NULL
);
CREATE TABLE order_detail (
    order_key   VARCHAR2(20)   NOT NULL,  -- 상위 orders.order_key (문자형을 쓰는 현재 DTO에 맞춤)
    item_code   VARCHAR2(20)   NOT NULL,  -- 품목 코드 (items.item_code)
    item_price  VARCHAR2(20)   NOT NULL,  -- 단가 (원 단위, 소수 쓰면 (15,2) 권장)
    quantity    NUMBER   NOT NULL   -- 수량 (정수)
);  

commit;


select * from orders;
where order_key = '18';

select * from order_detail;


alter table orders add business_number varchar2(20) NULL;

alter table orders add totalAmt varchar2(10) default '0' NOT NULL;

alter table item drop COLUMN quantity;

delete from orders
where order_key = '5';



select * from item;


select w.worker_id, w.worker_name, w.dapart_ID2, d.depart_level 
from worker w 
join department d on w.dapart_ID2 = d.dapart_ID2;

CREATE SEQUENCE order_seq
    START WITH 1       -- 첫 시작 값
    INCREMENT BY 1     -- 1씩 증가
    NOCACHE            -- 캐시 안 씀 (옵션)
    NOCYCLE;           -- 최대값 도달해도 초기화 안함
    
    
INSERT INTO orders (order_key, order_number, order_date, order_state, client_id, worker_id, dapart_ID2) 
VALUES (order_seq.NEXTVAL, 'B'|| TO_CHAR(SYSDATE, 'YYYYMMDD') || LPAD(order_seq.CURRVAL, 2, '0'), SYSDATE, 0, 'cl1000', '20250905', 'D001');
    
SELECT order_key, LENGTH(order_key)
FROM orders
WHERE order_key = :key;   -- DTO에서 넘긴 그대로

-- ② 혹시 키가 order_number였나?
SELECT order_number
FROM orders
WHERE order_number = :key;

-- ③ 눈에 안 보이는 공백/문자 문제 추적
SELECT order_key, LENGTH(order_key), DUMP(order_key)
FROM orders
WHERE order_key LIKE :key || '%';   


SELECT s.stock_id, s.stock_date, s.stock_loc, s.stock_div, s.stock_stat, 
s.stock_number, s.item_code, NVL(i.item_name, s.item_code) AS item_name
FROM stock s
LEFT JOIN item i ON i.item_code = s.item_code 
ORDER BY s.stock_date DESC, s.stock_id DESC;
    
    commit;
    
    
select * from stock;    
    
    
-- J2P4 사용자로 접속(또는 명시적 스키마로 생성)
CREATE SEQUENCE stock_seq
  START WITH 1
  INCREMENT BY 1
  MINVALUE 1
  NOMAXVALUE
  CACHE 50
  NOCYCLE;

-- (다른 스키마에서 호출해야 한다면) 퍼블릭/프라이빗 시노님 또는 권한 필요
-- GRANT SELECT ON J2P4.stock_seq TO <APP_USER>;
-- CREATE SYNONYM <APP_USER>.stock_seq FOR J2P4.stock_seq;
    
    
    
    
    