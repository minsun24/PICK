-- 프로젝트 이름 검색 조회
SELECT
    id                  AS project_id
     , name                AS project_name
     , introduction        AS introduction
FROM PROJECT_ROOM
WHERE is_deleted = 'N'
AND name LIKE CONCAT('%', #{keyword}, '%')
ORDER BY id DESC;


-- 특정 기술 분류 프로젝트 조회 (다중 선택 가능)
SELECT
    pr.id                     AS project_id
     , pr.name                   AS project_name
     , pr.introduction           AS introduction
     , pr.thumbnail_image        AS thumbnail_image
     , pr.project_url            AS project_url
     , tc.name                   AS technology_category_name
FROM PROJECT_ROOM pr
         JOIN TECHNOLOGY_CATEGORY tc
              ON pr.technology_category_id = tc.id
WHERE pr.is_deleted = 'N'
  AND pr.is_finished = 'N'
  AND pr.technology_category_id IN (?, ?)
ORDER BY pr.id DESC
    LIMIT ? OFFSET ?;



-- 프로젝트 기술 분류, 이름 검색 조회
SELECT
    pr.id,
    pr.name,
    pr.content,
    pr.start_date,
    pr.end_date,
    tc.name         AS technology_category
FROM PROJECT_ROOM pr
    INNER JOIN
    TECHNOLOGY_CATEGORY tc
    ON pr.technology_category_id = tc.id
WHERE
    tc.id = #{categoryId}
AND pr.name LIKE CONCAT('%', #{searchKeyword} , '%');
