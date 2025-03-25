-- 글의 상태에 따라 글의 id, 제목, 카테고리, 작성자, 작성 시간 조회

SELECT
       P.ID
     , P.TITLE
     , P.CATEGORY
     , P.UPLOAD_AT
     , P.UPDATE_AT
     , P.STATUS
     , P.MEMBER_ID
     , M.NICKNAME AS MEMBER_NICKNAME
  FROM POST P
  JOIN MEMBER M ON (P.MEMBER_ID = M.ID)
 WHERE P.STATUS = ?
 ORDER BY P.ID ASC;