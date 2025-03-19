-- 조회할 필요 없는 컬럼은 MyBatis로 옮길 때 수정할 예정
-- 전체 매칭방 조회
SELECT 
	     id
 	   , created_date
	   , is_completed
	   , level_range
	   , member_id
	   , technology_category_id
  FROM MATCHING;

-- 신청한 회원 조회
SELECT 
	     id
	   , applied_date
	   , is_canceled
	   , member_id
	   , matching_id
  FROM MATCHING_ENTRY
 WHERE is_cancled = 'N'
   AND matching_id = {사용자 입력};

-- 원하는 분류의 매칭방
SELECT
	     A.id
 	   , A.created_date
	   , A.is_completed
	   , A.level_range
	   , A.member_id
	   , A.technology_category_id
  	 , B.name
	   , B.is_deleted
  FROM MATCHING A
  JOIN TECHNOLOGY_CATEGORY B 
       ON A.technology_category_id = B.id
 WHERE (B.name = {사용자 입력} AND B.is_deleted = 'N') 
       OR (B.ref_technology_category IN (
	         SELECT id FROM TECHNOLOGY_CATEGORY C WHERE C.name = {사용자 입력} AND C.is_deleted = 'N'
       ));
 
 -- 대분류 조회
 SELECT
        A.id
      , A.name
      , A.is_deleted
      , A.ref_technology_category_id
   FROM TECHNOLOGY_CATEGORY A
  WHERE ref_technology_category_id IS NULL;

 -- 전체 기술 조회
   SELECT
        A.id
      , A.name
      , A.is_deleted
      , A.ref_technology_category_id
   FROM TECHNOLOGY_CATEGORY A
  
  -- 대분류에 속하는 기술 조회
   SELECT
        A.id
      , A.name
      , A.is_deleted
      , A.ref_technology_category_id
   FROM TECHNOLOGY_CATEGORY A
  WHERE (A.name = {사용자 입력} AND A.is_deleted = 'N') 
        OR (A.ref_technology_category IN (
	         SELECT id FROM TECHNOLOGY_CATEGORY B WHERE B.name = {사용자 입력} AND B.is_deleted = 'N'
        ));
        
  -- 방장 정보 조회
  SELECT
         A.member_id
    FROM MATCHING A
    JOIN MEMBER B ON A.member_id = B.id
    
  -- 신청자 정보 조회
  SELECT
         A.member_id
    FROM MATCHING_ENTRY A
    JOIN MEMBER B ON A.member_id = B.id