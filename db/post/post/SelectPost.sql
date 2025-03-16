-- 단일 게시글 조회

SELECT id
     , title
     , content
     , category
     , upload_time
     , update_time
     , member_id
  FROM post
 WHERE id = ?;