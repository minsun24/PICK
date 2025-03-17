-- 현재 글에 맞는 댓글 조회

SELECT upload_time
     , update_time
     , content
     , root_comment_id
     , member_id
  FROM comment
 WHERE post_id = ?
 ORDER BY id;