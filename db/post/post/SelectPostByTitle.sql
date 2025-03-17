-- 활성화된 글 중 제목에 검색어가 포함된 글 조회

SELECT
       id
     , title
     , category
     , member_id
     , upload_time
  FROM POST
 WHERE status = 'YES'
   AND title LIKE CONCAT('%', ?, '%');