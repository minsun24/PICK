-- 게시글 중 제목에 검색어가 포함된 글 조회

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
 WHERE P.TITLE LIKE CONCAT('%', ?, '%')
 ORDER BY P.ID ASC;