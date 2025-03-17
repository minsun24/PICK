-- 프로젝트 관련 SELECT 쿼리


-- 프로젝트 방 전체 목록 조회
SELECT
    pr.id,
    pr.name,
    pr.content,
    pr.is_finished,
    pr.duration_time,
    pr.maximum_participant,
    pr.session_code,
    pr.start_date,
    pr.end_date,
    tc.name AS technology_category
FROM
    project_room pr
        JOIN
    technology_category tc ON pr.technology_category_id = tc.id
WHERE
    pr.is_finished = 'N';


--  특정 방(1번) 상세 조회
SELECT
    pr.id,
    pr.name,
    pr.content,
    pr.is_finished,
    pr.duration_time,
    pr.maximum_participant,
    pr.session_code,
    pr.start_date,
    pr.end_date,
    tc.name AS technology_category
FROM
    project_room pr
        JOIN
    technology_category tc ON pr.technology_category_id = tc.id
WHERE
    pr.id = 1;  -- #{projectRoomId}


-- 프로젝트 (1번) 팀원 목록
SELECT
    p.id AS participant_id,
    m.id AS member_id,
    m.name,
    m.nickname,
    p.is_manager
FROM
    participant p
        JOIN
    member m ON p.member_id = m.id
WHERE
    p.project_room_id = 1;   -- #{projectRoomId}



-- 전체 팀원 후기 목록 조회
SELECT
    *
FROM member_review;

-- 특정 팀원의 후기 목록 조회

SELECT
    mr.id,
    mr.rate,
    mr.content,
    mr.reviewer_id,
    r_member.nickname AS reviewer_nickname
FROM
    member_review mr
        JOIN
    participant p ON mr.reviewee_id = p.id
        JOIN
    participant rp ON mr.reviewer_id = rp.id
        JOIN
    member r_member ON rp.member_id = r_member.id
WHERE
    p.member_id = 2;


-- 특정 프로젝트에 대한 후기 목록 조회
SELECT
    pr.id,
    pr.content,
    pr.reviewer_id,
    m.nickname AS reviewer_nickname
FROM
    project_review pr
        JOIN
    participant p ON pr.reviewer_id = p.id
        JOIN
    member m ON p.member_id = m.id
WHERE
    pr.project_room_id = 1;


-- 특정 프로젝트에 대한 회의록 목록 조회
SELECT
    pm.id,
    pm.title,
    pm.content,
    pm.author,
    pm.upload_time,
    pm.update_time
FROM
    project_meeting pm
WHERE
    pm.project_room_id = 2;


-- 특정 회의록 사진 리스트 조회
SELECT
    pmi.id,
    pmi.img_path,
    pmi.renamed,
    pmi.is_thumbnail
FROM
    project_meeting_image pmi
WHERE
    pmi.meeting_id = 1;

-- 프로젝트 방 검색(이름, 기술 카테고리 기준)
-- ex) 백엔드(1번) 카테고리 프로젝트 방 검색
SELECT
    pr.id,
    pr.name,
    pr.content,
    pr.start_date,
    pr.end_date,
    tc.name AS technology_category
FROM
    project_room pr
        JOIN
    technology_category tc ON pr.technology_category_id = tc.id
WHERE
    -- pr.name LIKE CONCAT('%', #{searchKeyword}, '%')
    -- AND
    tc.id = 1;