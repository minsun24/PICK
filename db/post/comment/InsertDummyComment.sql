-- 댓글 테이블 더미 데이터

INSERT
INTO COMMENT
(member_id, is_adopted, upload_time, content, status, post_id, root_comment_id)
VALUES (1, NULL, '2025-03-17', '1번 댓글 내용', 'YES', '1', NULL)
     , (2, NULL, '2025-03-17', '2번 댓글 내용', 'YES', '2', NULL)
     , (3, NULL, '2025-03-17', '3번 댓글 내용', 'YES', '1', '1')
     , (4, NULL, '2025-03-17', '4번 댓글 내용', 'YES', '3', NULL)
     , (5, 'N', '2025-03-17', '5번 댓글 내용', 'YES', '4', NULL)
     , (6, NULL, '2025-03-17', '6번 댓글 내용', 'YES', '3', NULL)
     , (7, 'Y', '2025-03-17', '7번 댓글 내용', 'YES', '5', NULL)
     , (8, NULL, '2025-03-17', '8번 댓글 내용', 'YES', '1', '3')
     , (9, NULL, '2025-03-17', '9번 댓글 내용', 'YES', '1', '1')
     , (10, NULL, '2025-03-17', '10번 댓글 내용', 'YES', '1', '8')