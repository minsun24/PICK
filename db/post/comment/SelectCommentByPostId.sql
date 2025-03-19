-- 현재 글에 맞는 댓글 조회

SELECT upload_at
     , update_at
     , content
     , root_comment_id
     , member_id
  FROM COMMENT
 WHERE post_id = ?
 ORDER BY id;