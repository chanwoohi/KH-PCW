# DB 삭제(university)
drop database if exists university;
# DB 생성(university)
create database if not exists university;

use university;

# student 테이블 삭제
drop table if exists student;
# student 테이블 추가
# 학번, 이름(30자), 전공(15자), 학년
create table if not exists student(
	st_num char(10) primary key,
    st_name varchar(30) not null,
    st_major varchar(15) not null,
    st_grade int not null default 1
);

# professor 테이블 삭제
drop table if exists professor;
# professor 테이블 추가
# 학번, 이름(30자), 전공(15자), 교수실(100)
create table if not exists professor(
	pr_num char(10) primary key,
    pr_name varchar(30) not null,
    pr_major varchar(15) not null,
    pr_room varchar(100)
);

# lecture 테이블 삭제
drop table if exists lecture;
# lecture 테이블 추가
# 강의 번호(PK) , 강의명(30자), 강의실(100자), 강의 시간 (시간표, 최대 50자),
# 학점, 시수, 전공 여부(전공 선택, 전공 필수, 교양 선택, 교양 필수), 교수 번호(FK)
create table if not exists lecture(
	le_num int primary key auto_increment,
    le_name varchar(30) not null,
    le_major char(5) not null,
    le_room varchar(100),
    le_schedule varchar(50),
    le_point int,
    le_time int,
    le_pr_num char(10),
    foreign key(le_pr_num) references professor(pr_num)
);