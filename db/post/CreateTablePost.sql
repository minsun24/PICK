DROP TABLE IF EXISTS POST_IMAGE CASCADE;
DROP TABLE IF EXISTS COMMENT CASCADE;
DROP TABLE IF EXISTS POST CASCADE;

CREATE TABLE IF NOT EXISTS POST
(
    id          INT                                NOT NULL AUTO_INCREMENT COMMENT '게시글 번호',
    title       VARCHAR(255)                       NOT NULL COMMENT '게시글 제목',
    content     TEXT                               NOT NULL COMMENT '게시글 내용',
    category    INT                                NOT NULL COMMENT '게시글 카테고리 번호',
    upload_time VARCHAR(255)                       NOT NULL COMMENT '작성 시간',
    update_time VARCHAR(255)                       NOT NULL COMMENT '수정 시간',
    status      ENUM ('YES', 'BLINDED', 'DELETED') NOT NULL COMMENT '활성화 여부',
    member_id   INT                                NOT NULL COMMENT '게시글 작성자',
    PRIMARY KEY (id)
-- , FOREIGN KEY (member_id) REFERENCES MEMBER (id)
) ENGINE = INNODB
  AUTO_INCREMENT = 1 COMMENT ='게시글'
  DEFAULT CHARSET UTF8;

CREATE TABLE IF NOT EXISTS POST_IMAGE
(
    id           INT          NOT NULL AUTO_INCREMENT COMMENT '게시글 사진 번호',
    path         VARCHAR(255) NOT NULL UNIQUE COMMENT '파일 경로',
    renamed_name VARCHAR(255) NOT NULL UNIQUE COMMENT '저장 이름',
    is_thumbnail VARCHAR(4)   NOT NULL DEFAULT FALSE COMMENT '썸네일 여부',
    post_id      INT          NOT NULL COMMENT '게시글 번호',
    PRIMARY KEY (id),
    FOREIGN KEY (post_id) REFERENCES POST (id)
) ENGINE = INNODB
  AUTO_INCREMENT = 1 COMMENT ='게시글 사진'
  DEFAULT CHARSET UTF8;

CREATE TABLE IF NOT EXISTS COMMENT
(
    id              INT                                NOT NULL AUTO_INCREMENT COMMENT '댓글 번호',
    author          VARCHAR(255)                       NOT NULL COMMENT '댓글 작성자',
    is_adopted      VARCHAR(4)                         NULL COMMENT '채택 여부',
    upload_time     VARCHAR(255)                       NOT NULL COMMENT '작성 시각',
    update_time     VARCHAR(255)                       NOT NULL COMMENT '수정 시각',
    content         TEXT                               NOT NULL COMMENT '댓글 내용',
    status          ENUM ('YES', 'BLINDED', 'DELETED') NOT NULL COMMENT '활성화 여부',
    post_id         INT                                NOT NULL COMMENT '게시글 번호',
    root_comment_id INT                                NULL COMMENT '부모 댓글 번호',
    PRIMARY KEY (id),
    FOREIGN KEY (post_id) REFERENCES POST (id),
    FOREIGN KEY (root_comment_id) REFERENCES COMMENT (id)
) ENGINE = INNODB
  AUTO_INCREMENT = 1 COMMENT ='댓글'
  DEFAULT CHARSET UTF8;