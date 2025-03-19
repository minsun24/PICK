-- PROJECT_REVIEW 프로젝트 후기 테이블
INSERT INTO PROJECT_REVIEW
(
    reviewer_id,
    content,
    project_room_id
)
VALUES
    (1,  '좋은 프로젝트였습니다.',            1),
    (6,  '정말 유익했어요.',                  2),
    (10, '백엔드 경험을 많이 쌓았어요.',      3),
    (16, '프론트엔드 기술이 향상되었습니다.', 4),
    (19, '풀스택 개발이 처음이었는데 흥미로웠어요.', 5);