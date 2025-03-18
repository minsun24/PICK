-- 팀원 모집 중인 프로젝트
-- 유예기간(생성 후 일주일) 이내 최대 팀원이 채워지지 않은 프로젝트

SELECT
    pr.id                   AS project_id
     , pr.name                 AS project_name
     , pr.maximum_participant  AS maximum_participant
     , COUNT(p.id)             AS current_participant_count
     , pr.start_date
     , pr.end_date
     , pr.duration_time
FROM PROJECT_ROOM pr
         LEFT JOIN PARTICIPANT p
                   ON pr.id = p.project_room_id
WHERE pr.is_deleted = 'N'
  AND pr.is_finished = 'N'
  AND pr.start_date >= DATE_SUB(NOW(), INTERVAL 7 DAY)  -- 생성된 지 7일 이내
GROUP BY pr.id
HAVING current_participant_count < pr.maximum_participant
ORDER BY pr.start_date DESC;