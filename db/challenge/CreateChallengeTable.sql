DROP TABLE IF EXISTS MEMBER_BADGE;
DROP TABLE IF EXISTS MEMBER_DAILY_MISSION;
DROP TABLE IF EXISTS MEMBER_ACHIEVEMENT;
DROP TABLE IF EXISTS BADGE;
DROP TABLE IF EXISTS DAILY_MISSION;
DROP TABLE IF EXISTS ACHIEVEMENT;
DROP TABLE IF EXISTS CHALLENGE;

-- 챌린지 테이블
CREATE TABLE IF NOT EXISTS CHALLENGE (
    id   INTEGER      NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

-- 도전 과제 테이블
CREATE TABLE IF NOT EXISTS ACHIEVEMENT (
    id           INTEGER    NOT NULL AUTO_INCREMENT PRIMARY KEY,
    requirement  INTEGER    NOT NULL,
    exp          INTEGER    NOT NULL,
    is_deleted   VARCHAR(4) NOT NULL DEFAULT 'N',
    challenge_id INTEGER    NOT NULL,
    FOREIGN KEY (challenge_id) REFERENCES CHALLENGE(id) ON DELETE CASCADE
);

-- 일일 미션 테이블
CREATE TABLE IF NOT EXISTS DAILY_MISSION (
    id           INTEGER      NOT NULL AUTO_INCREMENT PRIMARY KEY,
    content      TEXT         NOT NULL,
    target_date  VARCHAR(255) NOT NULL,
    exp_point    INTEGER      NOT NULL,
    is_deleted   VARCHAR(4)   NOT NULL DEFAULT 'N',
    challenge_id INTEGER      NOT NULL,
    FOREIGN KEY (challenge_id) REFERENCES CHALLENGE(id) ON DELETE CASCADE
);

-- 뱃지 테이블
CREATE TABLE IF NOT EXISTS BADGE (
    id           INTEGER    NOT NULL AUTO_INCREMENT PRIMARY KEY,
    requirement  INTEGER,
    description  TEXT       NOT NULL,
    is_deleted   VARCHAR(4) NOT NULL DEFAULT 'N',
    challenge_id INTEGER    NOT NULL,
    FOREIGN KEY (challenge_id) REFERENCES CHALLENGE(id) ON DELETE CASCADE
);

-- 회원별 도전 과제 테이블
CREATE TABLE IF NOT EXISTS MEMBER_ACHIEVEMENT (
    id             INTEGER       NOT NULL AUTO_INCREMENT PRIMARY KEY,
    achieved_date  VARCHAR(255),
    progress       INTEGER,
    achieved_time  INTEGER,
    achievement_id INTEGER       NOT NULL,
    member_id      INTEGER       NOT NULL,
    FOREIGN KEY (achievement_id) REFERENCES ACHIEVEMENT(id) ON DELETE CASCADE,
    FOREIGN KEY (member_id) REFERENCES MEMBER(id) ON DELETE CASCADE,
    CONSTRAINT unique_member_achievement UNIQUE (member_id, achievement_id)
);

-- 회원별 일일 미션 테이블
CREATE TABLE IF NOT EXISTS MEMBER_DAILY_MISSION (
    id               INTEGER       NOT NULL AUTO_INCREMENT PRIMARY KEY,
    is_completed     VARCHAR(4)    NOT NULL DEFAULT 'N',
    completed_date   VARCHAR(255),
    daily_mission_id INTEGER       NOT NULL,
    member_id        INTEGER       NOT NULL,
    FOREIGN KEY (daily_mission_id) REFERENCES DAILY_MISSION(id) ON DELETE CASCADE,
    FOREIGN KEY (member_id) REFERENCES MEMBER(id) ON DELETE CASCADE,
    CONSTRAINT unique_member_daily_mission UNIQUE (member_id, daily_mission_id)
);

-- 회원별 뱃지 테이블
CREATE TABLE IF NOT EXISTS MEMBER_BADGE (
    id            INTEGER      NOT NULL AUTO_INCREMENT PRIMARY KEY,
    acquired_date VARCHAR(255) NOT NULL,
    level         INTEGER      NOT NULL,
    badge_id      INTEGER      NOT NULL,
    member_id     INTEGER      NOT NULL,
    FOREIGN KEY (badge_id) REFERENCES BADGE(id) ON DELETE CASCADE,
    FOREIGN KEY (member_id) REFERENCES MEMBER(id) ON DELETE CASCADE,
    CONSTRAINT unique_member_badge UNIQUE (member_id, badge_id)
);