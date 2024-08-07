# 등록된 모든 영화를 조회하는 쿼리
use cgv;

select * from movie;

# 등록된 모든 영화를 조회하는 쿼리(장르도 함께 검색)
select * from movie
	join movie_genre on mg_mo_num = mo_num;
    
# 장르가 액션인 영화를 조회하는 쿼리
	#1 조인 이용
	select * from movie
		join movie_genre on mg_mo_num = mo_num
		where mg_ge_name = '액션';
	#2 서브쿼리 이용
	select * from movie 
		where mo_num 
		in (select mg_mo_num from movie_genre where mg_ge_name = '액션');

# 장르가 액션으로 등록된 영화 수를 조회하는 쿼리
	#1 조인 이용
	select count(*) from movie
		join movie_genre on mg_mo_num = mo_num
		where mg_ge_name = '액션';
	#2 그룹바이 이용
    select mg_ge_name, count(mg_mo_num) from movie_genre where mg_ge_name = '액션' group by mg_ge_name ;
    
# 모든 장르에 등록된 영화 수를 조회하는 쿼리(단, 영화가 등록되지 않은 장르들은 조회가 X)
select mg_ge_name, count(mg_mo_num) from movie_genre group by mg_ge_name;

# 모든 장르에 등록된 영화 수를 조회하는 쿼리(단, 영화가 등록되지 않은 장르들은 조회가 O)
# 등록되지 않은 장르도 조회하려면 outter 조인
select ge_name, count(mg_mo_num) from movie_genre
	right join genre on mg_ge_name = ge_name
	group by ge_name;
    
# 등록된 영화를 이름순으로 6개 조회하는 쿼리(내림차순(DESC), 1페이지)
# 내림차순(DESC) // 오름차순(생략가능)
select * from movie order by mo_title desc limit 0, 6;

# 등록된 영화를 이름순으로 6개 조회하는 쿼리(내림차순(DESC), 2페이지)
select * from movie order by mo_title desc limit 6, 12;

# 데드풀과 울버린을 관람한 관객수를 조회하는 쿼리
select '데드풀과 울버린' 영화제목, sum(ti_adult + ti_teenager) 관객수 
from ticketing 
join schedule on ti_sd_num = sd_num
where sd_mo_num = (select mo_num from movie where mo_title = '데드풀과 울버린')
group by sd_mo_num;

# 영화별 관객수를 조회하는 쿼리 (영화를 기준으로 하기위해 right 조인) 
select mo_title 영화제목, sum(ti_adult + ti_teenager) 관객수 
from ticketing 
right join schedule on ti_sd_num = sd_num
right join movie on sd_mo_num = mo_num
group by mo_num;

# 데드풀과 울버린 영화 상영시간을 조회하는 쿼리
select * from schedule
where sd_mo_num = (select mo_num from movie where mo_title = '데드풀과 울버린')
;

# 데드풀과 울버린 영화 상영시간을 조회하는 쿼리 (7/27 오후 상영시간을 조회)
select * from schedule
where sd_mo_num = (select mo_num from movie where mo_title = '데드풀과 울버린')
	and sd_date = '2024-07-27' and sd_time > '12:00:00';
    
# 2번 상영시간에 예약된 좌석을 조회하는 쿼리
select se_name from ticketing_list
join ticketing on tl_ti_num = ti_num
join seat on tl_se_num = se_num
where ti_sd_num = 2;

# 2번 상영시간에 예약 가능한 좌석을 조회하는 쿼리 (Not in)
select se_name from schedule 
join screen on sd_sc_num = sc_num 
join seat on sc_num = se_sc_num
where sd_num = 2 and se_name not in(
	select se_name from ticketing_list
	join ticketing on tl_ti_num = ti_num
	join seat on tl_se_num = se_num
	where ti_sd_num = 2
);

# 휴 잭맨이 참여한 영화 목록을 조회하는 쿼리
select mo_title from movie 
join casting on cs_mo_num = mo_num
join `character` on cs_ch_num = ch_num
join person on ps_num = ch_ps_num
where ps_name = '휴 잭맨';

# CGV강남에서 상영했거나 상영 중, 또는 상영 예정인 영화들을 조회하는 쿼리
	#1 join 여러번
	select distinct mo_title from movie
		join schedule on sd_mo_num = mo_num
		join screen on sc_num = sd_sc_num
		join theater on sc_th_num = th_num
		where th_name = 'CGV강남';
	#2 서브쿼리 이용 (속도 빠름)
		select distinct mo_title from movie
			join schedule on sd_mo_num = mo_num
			join (select * from screen
				where sc_th_num = (select th_num from theater where th_name = 'CGV강남')) sc on sd_sc_num = sc_num;	

# 게시글을 조회하는 쿼리(번호 내림차순, 3개, 1페이지)
select * from post order by po_num desc limit 0, 3;

# 게시글 제목에 '구'가 들어가는 게시글을 조회하는 쿼리(번호 내림차순, 3개, 1페이지)
select * from post 
where po_title like '%구%' 
order by po_num desc limit 0, 3;

# 축구 커뮤니티에 등록된 게시글을 조회하는 쿼리(커뮤니티 번호가 2번)
select * from post
where po_co_num = 2;

# 1번 게시글의 댓글들을 조회하는 쿼리(단, 대댓은 댓글 다음에 와야 함)
/*
댓글1
	- 댓글1-1
    - 댓글1-2
    - 댓글1-3
댓글2
*/
select * from comment where cm_po_num = 1 order by cm_ori_num, cm_num;

# 1번 게시글을 댓글 1페이지를 조회하는 쿼리(한 페이지에 5개)
select * from comment where cm_po_num = 1 order by cm_ori_num, cm_num limit 0, 5;

# 게시글을 조회(조회수가 많은 순으로 조회)
select * from post order by po_view desc;

# 게시글을 조회(조회수가 많은 순으로 조회, 조회순으로 했을 때 3위 게시글까지 조회, RANK()를 이용)
# 윈도우 함수를 where에 직접 사용할 수 없어서 검색 결과를 하나의 테이블처럼 처리해야 함
select * from (select rank() over(order by po_view desc) as ranking, post.* from post) as po
where ranking <= 3;

select (row_number() over(order by po_view desc)) as rownum , po_title, po_view
from post
where rownum <= 3;


