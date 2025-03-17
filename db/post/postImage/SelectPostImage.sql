-- 현재 글에 맞는 사진 조회

SELECT
       id
     , path
     , renamed_name
     , is_thumbnail
  FROM post_image
 WHERE post_id = ?;