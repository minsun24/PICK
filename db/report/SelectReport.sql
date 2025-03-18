-- 신고 목록 조회 (전체 조회)
SELECT
       R.id
     , R.date
     , R.status
     , R.category
     , R.reported_id
     , RR.reason
     , M.id
  FROM REPORT R
  JOIN REPORT_REASON RR ON R.report_reason_id = RR.id
  JOIN MEMBER M ON R.member_id = M.id;


-- 신고 상세 조회 (회원 1번)
-- 회원(직접 신고된 경우)
SELECT
       R.id
     , R.date
     , R.status
     , R.category
     , R.reported_id
     , RR.reason
     , M.id
  FROM REPORT R
  JOIN REPORT_REASON RR ON R.report_reason_id = RR.id
  JOIN MEMBER M ON R.member_id = M.id
 WHERE R.category = '회원' AND R.reported_id = 1;

-- 게시글(POST 테이블을 통해 회원 1번이 작성한 게시글이 신고된 경우)
SELECT
       R.id
     , R.date
     , R.status
     , R.category
     , R.reported_id
     , RR.reason
     , M.id
  FROM REPORT R
  JOIN REPORT_REASON RR ON R.report_reason_id = RR.id
  JOIN MEMBER M ON R.member_id = M.id
 WHERE (R.category = '게시글' AND EXISTS
       (SELECT 1
          FROM POST P
         WHERE P.id = R.reported_id AND P.member_id = 1));

-- 댓글(COMMENT 테이블을 통해 회원 1번이 작성한 댓글이 신고된 경우)
SELECT
       R.id
     , R.date
     , R.status
     , R.category
     , R.reported_id
     , RR.reason
     , M.id
  FROM REPORT R
  JOIN REPORT_REASON RR ON R.report_reason_id = RR.id
  JOIN MEMBER M ON R.member_id = M.id
 WHERE (R.category = '댓글' AND EXISTS
       (SELECT 1
          FROM COMMENT C
         WHERE C.id = R.reported_id AND C.member_id = 1));


-- 규제 목록 조회
SELECT
       RG.id
     , RG.start_date
     , RG.end_date
     , M.id
  FROM REGULATION RG
  JOIN MEMBER M ON RG.member_id = M.id;

-- 규제 상세 조회 (회원 1번)
SELECT
       RG.id
     , RG.start_date
     , RG.end_date
     , M.id
  FROM REGULATION RG
  JOIN MEMBER M ON RG.member_id = M.id
 WHERE RG.member_id = 1;