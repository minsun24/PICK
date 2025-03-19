-- 완료된 프로젝트 목록 보기

SELECT
       pr.id                  AS project_id
     , pr.name                AS project_name
     , pr.introduction        AS introduction
     , pr.thumbnail_image     AS thumbnail_image
     , pr.project_url         AS project_url
     , pr.start_date		  AS start_date
     , pr.end_date		      AS end_date
FROM project_room pr
WHERE is_finished = 'Y'
  AND is_deleted = 'N'
ORDER BY id DESC;