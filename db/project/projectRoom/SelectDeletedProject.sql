-- 삭제된 프로젝트 목록 전체 조회

SELECT
    id                  AS project_id
     , name                AS project_name
     , introduction        AS project_intro
     , thumbnail_image     AS thumbnail_url
     , project_url         AS project_url
     , content             AS project_content
     , duration_time       AS duration_time
     , maximum_participant AS maximum_participant
     , start_date          AS start_date
     , end_date            AS end_date
     , is_finished
     , is_deleted
FROM PROJECT_ROOM
WHERE is_deleted = 'Y'
ORDER BY id DESC;
