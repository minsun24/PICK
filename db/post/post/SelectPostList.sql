-- 활성화된 글의 id, 제목, 카테고리, 작성자, 작성 시간 조회

SELECT
       id
     , title
     , category
     , member_id
     , upload_at
  FROM POST
 WHERE status = 'YES';