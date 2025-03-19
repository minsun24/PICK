-- 단일 게시글 조회

SELECT id
     , title
     , content
     , category
     , upload_at
     , update_at
     , member_id
  FROM POST
 WHERE id = ?;