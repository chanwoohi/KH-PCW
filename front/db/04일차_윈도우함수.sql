# 예제를 위한 DB 생성 및 테이블 생성
DROP DATABASE IF EXISTS PRODUCT;

CREATE DATABASE PRODUCT;

USE PRODUCT;

DROP TABLE IF EXISTS CATEGORY;

CREATE TABLE CATEGORY(
	CA_CODE CHAR(2) PRIMARY KEY,
    CA_NAME VARCHAR(10) NOT NULL
);

DROP TABLE IF EXISTS PRODUCT;

CREATE TABLE PRODUCT(
	PR_CODE CHAR(3) PRIMARY KEY,
    PR_NAME VARCHAR(10) NOT NULL,
    PR_PRICE INT NOT NULL DEFAULT 0,
    PR_CA_CODE CHAR(2),
    FOREIGN KEY(PR_CA_CODE) REFERENCES CATEGORY(CA_CODE)
);
# 예제를 위한 샘플 데이터 추가
INSERT INTO CATEGORY VALUES('AB', '가전'), ('CD', '의류'),('EF','식품');
INSERT INTO PRODUCT VALUES
('AB1', '컴퓨터', 1000000, 'AB'),
('AB2', '마우스', 10000, 'AB'),
('CD1', '셔츠', 15000, 'CD'),
('CD2', '청바지', 50000, 'CD'),
('CD3', '양말', 1000, 'CD'),
('EF1', '사과', 10000, 'EF'),
('EF2', '복숭아', 6000, 'EF');

# ROW_NUMBER : 값이 같더라도 순위를 다르게 부여
SELECT 
	ROW_NUMBER() OVER(ORDER BY PR_PRICE DESC) 순위,
    PR_CODE 제품코드,
    PR_NAME 제품명,
    FORMAT(PR_PRICE,0) 가격
FROM 
	PRODUCT;
# RANK : 값이 같으면 순위가 같게, 다음 순위는 연속된 수가 아님
SELECT 
	RANK() OVER(ORDER BY PR_PRICE DESC) 순위,
    PR_CODE 제품코드,
    PR_NAME 제품명,
    FORMAT(PR_PRICE,0) 가격
FROM 
	PRODUCT;
# DENSE_RANK : 값이 같으면 순위가 같게, 다음 순위는 연속된 수
SELECT 
	DENSE_RANK() OVER(ORDER BY PR_PRICE DESC) 순위,
    PR_CODE 제품코드,
    PR_NAME 제품명,
    FORMAT(PR_PRICE, 0) 가격
FROM
	PRODUCT;