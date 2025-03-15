DROP TABLE IF EXISTS MEMBER CASCADE;
DROP TABLE IF EXISTS MEMBER_PROFILE_PAGE CASCADE;
DROP TABLE IF EXISTS PROFILE_IMAGE CASCADE;
DROP TABLE IF EXISTS MEMBER_PROGRAMMING_LANGUAGE CASCADE;
DROP TABLE IF EXISTS PROGRAMMING_LANGUAGE CASCADE;


CREATE TABLE IF NOT EXISTS MEMBER
(
    id             INTEGER      NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name           VARCHAR(255) NOT NULL,
    age            INTEGER      NOT NULL,
    ihidnum        VARCHAR(255) NOT NULL UNIQUE,
    phone_number   VARCHAR(255) NOT NULL UNIQUE,
    email          VARCHAR(255) NOT NULL UNIQUE,
    password       VARCHAR(255) NOT NULL,
    nickname       VARCHAR(255) NOT NULL UNIQUE,
    status         TINYINT      NOT NULL COMMENT '활성화, 비활성화(정지), 탈퇴 한번에 관리 (Enum)',
    reported_count INTEGER      NOT NULL COMMENT '조회 덜하기 위해 회원 테이블 속성 추가',
    user_grant     TINYINT      NOT NULL COMMENT 'ADMIN, MEMBER'
# 설명. Enum 타입은 TINYINT로
);

CREATE TABLE IF NOT EXISTS MEMBER_PROFILE_PAGE
(
    id               INTEGER      NOT NULL AUTO_INCREMENT PRIMARY KEY,
    exp              INTEGER      NOT NULL,
    level            INTEGER      NOT NULL,
    introduce        TEXT         NULL,
    preferred_area   VARCHAR(255) NULL,
    git_address      VARCHAR(255) NULL,
    score            INTEGER      NULL,
    is_profile_image VARCHAR(4)   NOT NULL DEFAULT 'N',
    Field            VARCHAR(255) NULL,
    member_id        INTEGER      NOT NULL COMMENT 'MEMBER 테이블의 id 참조 (FK 사용 안함)'
);

CREATE TABLE IF NOT EXISTS PROFILE_IMAGE
(
    id                     INTEGER      NOT NULL AUTO_INCREMENT PRIMARY KEY,
    image_name             VARCHAR(255) NOT NULL,
    path                   VARCHAR(255) NOT NULL,
    member_profile_page_id INTEGER      NOT NULL COMMENT 'MEMBER_PROFILE_PAGE 테이블의 id 참조 (FK 사용 안함)'
);

CREATE TABLE IF NOT EXISTS MEMBER_PROGRAMMING_LANGUAGE
(
    id                      INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
    programming_language_id INTEGER NOT NULL COMMENT 'PROGRAMMING_LANGUAGE 테이블의 id 참조 (FK 사용 안함)',
    member_profile_page_id  INTEGER NOT NULL COMMENT 'MEMBER_PROFILE_PAGE 테이블의 id 참조 (FK 사용 안함)'
);

CREATE TABLE IF NOT EXISTS PROGRAMMING_LANGUAGE
(
    id         INTEGER      NOT NULL AUTO_INCREMENT PRIMARY KEY,
    language   VARCHAR(255) NOT NULL,
    is_deleted VARCHAR(4)   NOT NULL DEFAULT 'N'
);
