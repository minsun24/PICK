-- 진행 중인 프로젝트 목록 전체 조회

SELECT
    pr.id               AS project_id
     , pr.name             AS project_name
     , pr.start_date       AS start_date
     , pr.end_date         AS end_date
     , pr.duration_time    AS durtion_time
     , COUNT(p.id)         AS current_participant_count
FROM PROJECT_ROOM pr
         LEFT JOIN PARTICIPANT p
                   ON pr.id = p.project_room_id
WHERE pr.is_finished = 'N'
  AND pr.is_deleted = 'N'
GROUP BY pr.id
ORDER BY end_date ASC;