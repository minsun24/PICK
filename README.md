# 🗝️ Pick

<center>
     https://github.com/user-attachments/assets/3f41e611-297b-4a40-94a4-a7e1927e6f93" width = "80%" />
<!-- <img src = "document/PICK TITLE.png" width="80%" /> -->
</center>

<br><br>

## 👨‍💻 DEVELOPERS

|<img src="https://github.com/user-attachments/assets/96ccc0c2-83b7-492c-9315-75ac3cc51009" width="100" height = "100"> |<img src="https://github.com/user-attachments/assets/edc7debb-83c4-43fd-b39b-fc928318163a" width="100" height = "100"> | <img src="https://github.com/user-attachments/assets/2c0ab92a-c6c3-4d29-afba-73c8c5b3b6aa" width="100" height = "100">|<img src="https://github.com/user-attachments/assets/202b8b37-2b11-4228-8c95-f26eca6dbef3" width="100" height = "100"> | <img src="https://github.com/user-attachments/assets/1b342174-3c7d-4e68-8aa2-773e017e7ad2" width="100" height = "100"> | <img src="https://github.com/user-attachments/assets/daa3e58c-512a-4b01-a289-c84feed2c0b9" width="100" height = "100">|
| :------------------------------------: | :-------------------------------------: | :-----------------------------------: | :--------------------------------------: | :-----------------------------------: | :------------------------------------------: |
| [고성연](https://github.com/Gombo2) | [김석희](https://github.com/yehang218) | [이청민](https://github.com/Bluesky3125) | [장시원](https://github.com/swjang7269) | [정민선](https://github.com/minsun24) | [최혜민](https://github.com/HMYIEN) |

<br>

## 🔖 목차

#### [💡 Tech Stack](#-Tech-Stack) <br>
#### [📢 프로젝트 개요](#-프로젝트-개요) <br>
#### [🛠️ 주요 기능](#-주요-기능) <br>
#### [📅 WBS](#-WBS) <br>
#### [🙆‍♀️ 요구사항 명세서](#-요구사항-명세서) <br>
#### [💭 DDD 설계](#-DDD-설계) <br>
#### [🗃️ DB 모델링](#-DB-모델링) <br>
#### [🪄 MSA 아키텍처](#-MSA-아키텍처) <br>
#### [🛜 Server](#-Server) <br>
#### [🚩 단위 테스트](#-단위-테스트) <br>
#### [📱 API 테스트](#-API-테스트) <br>
#### [📑 API 명세서](#-API-명세서) <br>
#### [🔜 향후 확장 계획](#-향후-확장-계획) <br>
#### [🍪 동료 평가](#-동료-평가) <br>

<br>

## 💡 Tech Stack
### 🌿 Backend
<img src="https://img.shields.io/badge/java-007396?style=flat-square&logo=java&logoColor=white"/> <img src="https://img.shields.io/badge/SpringBoot-6DB33F?style=flat-square&logo=Spring&logoColor=white"/> <img src="https://img.shields.io/badge/JPA-0769GE?style=flat-square&logo=JPA&logoColor=white"/> <img src="https://img.shields.io/badge/Hibernate-61DAFB?style=flat-square&logo=Hibernate&logoColor=white"/> <img src="https://img.shields.io/badge/gradle-0769AD?style=flat-square&logo=gradle&logoColor=white"/> <img src="https://img.shields.io/badge/security-F7DF1E?style=flat-square&logo=security&logoColor=white"/>

### 🗂️ DB
![MariaDB](https://img.shields.io/badge/MariaDB-003545?style=flat&logo=mariadb&logoColor=white) <img src="https://img.shields.io/badge/MyBatis-FFCA28?style=flat-square&logo=MyBatis&logoColor=white"/>

### 🛜 Server
<img src="https://img.shields.io/badge/Eureka-430098?style=flat-square&logo=Eureka&logoColor=white"/> <img     src="https://img.shields.io/badge/gateway-147EFB?style=flat-square&logo=gateway&logoColor=white"/>

### 🔧 Tools
<img src="https://img.shields.io/badge/GitHub-181717?style=flat-square&logo=GitHub&logoColor=white"> <img src="https://img.shields.io/badge/ERD%20cloud-%230000FF.svg?style=flat&logo=erlang&logoColor=white"> <img src="https://img.shields.io/badge/DA%23-0B6121.svg?style=flat&logo=draw.io&logoColor=white"> ![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-2A2A2A.svg?style=flat&logo=intellij-idea&logoColor=white) <img src="https://img.shields.io/badge/Notion-000000?style=flat-square&logo=Notion&logoColor=white"/> 

<br>

## 📢 프로젝트 개요
### 1. 프로젝트 주제
평생 공부해야 하는 개발자를 위한 <b>사이드 프로젝트 매칭 & 관리 플랫폼</b> <br>

### 2. 프로젝트 필요성
<pre>
<b>사이드 프로젝트란?</b>
규모와 수익성과는 상관없이 스스로 원해서 개발해 보고 싶은 서비스, 적용해 보고 싶은 기술 스택 등을
수련하며 스스로 자기 계발을 하는 기회를 마련하는 나만의 프로젝트
</pre>
사이드 프로젝트를 진행할 때는 팀원 간의 협업과 커뮤니케이션이 매우 중요하며, 모집부터 실제 실행, 완성까지 꽤 많은 시간과 노력이 필요합니다. <br>

기존에 사용되던 팀원 매칭 플랫폼인 비사이드는 팀 구성에 용이하지만, 이후의 <b>협업과 프로젝트 관리 기능이 부족</b>하다는 한계가 있습니다. Jira는 체계적인 프로젝트 관리를 도와주지만, 팀원 모집이나 매칭 기능은 전혀 제공하지 않아 <b>초기 팀 구성에 어려움</b>이 있습니다. <br>

이러한 두 플랫폼의 아쉬운 점을 보완하고, 각각의 장점만을 살려 <b>팀원 매칭부터 프로젝트 관리까지 한 번에 가능한 올인원 플랫폼, Pick</b>이 탄생했습니다. Pick은 효율적인 팀 구성과 유연한 협업, 체계적인 진행 관리를 모두 지원하여, 사이드 프로젝트의 시작부터 완성까지 모든 과정을 더 쉽고 효율적으로 만들어줍니다.

<br>

## 🛠️ 주요 기능

<img src="https://github.com/user-attachments/assets/97ae910c-cab7-4453-9c15-062e07119700" width="800"/><br>
매칭을 희망하는 회원이 매칭을 신청하면, 미리 생성된 방의 레벨과 비교하여 레벨 범위에 맞는 방에 <b>신청자 매칭</b>

  
<img src="https://github.com/user-attachments/assets/cd4d605b-a154-49ff-8738-bf45e56247f2" width="800"/><br>
프로젝트 방이 생성되면, 참가자에게 <b>문서화와 일정 관리 서비스</b> 제공.<br>프로젝트가 끝나면 각 팀원은 프로젝트와 서로에 대한 후기 작성 -> 포트폴리오 & 피드백이 됨


<img src="https://github.com/user-attachments/assets/5e264d2e-04a7-4c54-bcf1-032ec0c602f9" width="800"/><br>
매일매일 반복적으로 달성할 수 있는 <b>단기 목표</b> 부여 -> 일정 횟수 반복 시 도전 과제 달성 -> 업적 뱃지 제공<br>
경력, 전공, 자격증 등 스펙 증명 시 <b>스펙 뱃지</b> 제공 <br>


## 📅 WBS
🔗 <a href="https://docs.google.com/spreadsheets/d/e/2PACX-1vScA7f_mLFChQQ5SMSU5AAC6-O3h8PYJg0H-dxRvMKHrePOtW3VIgnlNMcAEWP1Xy8O8LcMe4OFuCWe/pubhtml?gid=88084636&single=true"> WBS 자세히 보기</a><br> <br>
<img src="https://github.com/user-attachments/assets/6677a334-9d8f-4d8d-a756-e98de9b2968f" width = "1000"/>

<br><br>

## 🙆‍♀️ 요구사항 명세서

🔗 <a href="https://docs.google.com/spreadsheets/d/e/2PACX-1vScA7f_mLFChQQ5SMSU5AAC6-O3h8PYJg0H-dxRvMKHrePOtW3VIgnlNMcAEWP1Xy8O8LcMe4OFuCWe/pubhtml?gid=0&single=true"> 요구사항 명세 자세히 보기 </a>

<br>

<img src = "https://github.com/user-attachments/assets/ab620c8f-d9fb-4b72-8005-a0856019b3e4" width = "900"/>

<br><br>


## 💭 DDD 설계
### 1. Domain event storming
<img src="https://github.com/user-attachments/assets/c3ceb302-7ac2-4f8e-a1b3-9161a6192a56"/><br>

<img src="https://github.com/user-attachments/assets/52c49916-efd4-49a1-8c62-36dd0bcbc175"/><br>


<details>
  <summary>설계 과정</summary>

- 이벤트 추출
  <img src="https://github.com/user-attachments/assets/f3962716-5b6b-4e69-b44d-eb375b8ba2ec"/>

- 1차 설계
  <img src="https://github.com/user-attachments/assets/412a165c-25c9-4872-89c4-4274b239c471"/>

- 2차 설계
  <img src="https://github.com/user-attachments/assets/b463c4b2-1261-4215-978a-38ab4e5f90e2"/>
</details> <br>

### 2. Context Map
<img src="https://github.com/user-attachments/assets/36b1f98a-851a-40c1-943d-1ddc11865047"/>


<br>
<br>


## 🗃️ DB 모델링

### 1. 논리 모델링
<img src="https://github.com/user-attachments/assets/75d3f1c6-b56b-454b-9201-6fbd4ce127a3"/>
<br>

### 2. 물리 모델링
<img src="https://github.com/user-attachments/assets/7225af87-56db-41f7-9471-f481ea8234f6"/>
<br>

### 3. 테이블 생성
<details>
     <summary><b>DDL</b></summary>

```sql
-- ----------------- 기존 테이블 삭제 ----------------- --
-- 외래 키 제약 조건을 무시하여 테이블 삭제
SET FOREIGN_KEY_CHECKS = 0;

-- member
DROP TABLE IF EXISTS MEMBER CASCADE;
DROP TABLE IF EXISTS MEMBER_PROFILE_PAGE CASCADE;
DROP TABLE IF EXISTS MEMBER_PROGRAMMING_LANGUAGE CASCADE;
DROP TABLE IF EXISTS PROGRAMMING_LANGUAGE CASCADE;

-- challenge
DROP TABLE IF EXISTS MEMBER_BADGE CASCADE;
DROP TABLE IF EXISTS MEMBER_DAILY_MISSION CASCADE;
DROP TABLE IF EXISTS MEMBER_ACHIEVEMENT CASCADE;
DROP TABLE IF EXISTS BADGE CASCADE;
DROP TABLE IF EXISTS DAILY_MISSION CASCADE;
DROP TABLE IF EXISTS ACHIEVEMENT CASCADE;
DROP TABLE IF EXISTS CHALLENGE CASCADE;

-- matching
DROP TABLE IF EXISTS MATCHING_ENTRY CASCADE;
DROP TABLE IF EXISTS MATCHING CASCADE;
DROP TABLE IF EXISTS TECHNOLOGY_CATEGORY CASCADE;

-- post
DROP TABLE IF EXISTS POST_IMAGE CASCADE;
DROP TABLE IF EXISTS COMMENT CASCADE;
DROP TABLE IF EXISTS POST CASCADE;

-- project
DROP TABLE IF EXISTS PROJECT_MEETING_IMAGE CASCADE; -- 프로젝트 회의록 사진
DROP TABLE IF EXISTS PROJECT_MEETING CASCADE; -- 프로젝트 회의록
DROP TABLE IF EXISTS PROJECT_REVIEW CASCADE; -- 프로젝트 후기
DROP TABLE IF EXISTS MEMBER_REVIEW CASCADE; -- 회원 후기
DROP TABLE IF EXISTS PARTICIPANT CASCADE; -- 프로젝트 팀원
DROP TABLE IF EXISTS PROJECT_ROOM CASCADE; -- 프로젝트 방

-- report
DROP TABLE IF EXISTS REPORT CASCADE;
DROP TABLE IF EXISTS REPORT_REASON CASCADE;
DROP TABLE IF EXISTS REGULATION CASCADE;

SET FOREIGN_KEY_CHECKS = 1;

-- ----------------- 테이블 새로 생성 ----------------- --
CREATE TABLE IF NOT EXISTS MEMBER
(
    id             INTEGER      NOT NULL AUTO_INCREMENT
    ,   name           VARCHAR(255) NOT NULL
    ,   age            INTEGER      NOT NULL
    ,   ihidnum        VARCHAR(255) NOT NULL UNIQUE
    ,   phone_number   VARCHAR(255) NOT NULL UNIQUE
    ,   email          VARCHAR(255) NOT NULL UNIQUE
    ,   password       VARCHAR(255) NOT NULL
    ,   nickname       VARCHAR(255) NOT NULL UNIQUE
    ,   status         TINYINT      NOT NULL COMMENT '활성화, 비활성화(정지), 탈퇴 한번에 관리 (Enum)'
    ,   reported_count INTEGER      NOT NULL COMMENT '조회 덜하기 위해 회원 테이블 속성 추가'
    ,   user_grant     TINYINT      NOT NULL COMMENT 'ADMIN, MEMBER'
    ,   CONSTRAINT pk_member_id PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS MEMBER_PROFILE_PAGE
(
    id               INTEGER      NOT NULL AUTO_INCREMENT
    ,   exp              INTEGER      NOT NULL
    ,   level            INTEGER      NOT NULL
    ,   introduce        TEXT         NULL
    ,   preferred_area   VARCHAR(255) NULL
    ,   git_address      VARCHAR(255) NULL UNIQUE
    ,   score            INTEGER      NULL
    ,   image_path       VARCHAR(255) NULL UNIQUE
    ,   member_id        INTEGER      NOT NULL
    ,   CONSTRAINT pk_member_profile_page_id PRIMARY KEY (id)
    ,   CONSTRAINT fk_member_profile_page_member_id FOREIGN KEY (member_id) REFERENCES MEMBER (id)
);

CREATE TABLE IF NOT EXISTS PROGRAMMING_LANGUAGE
(
    id         INTEGER      NOT NULL AUTO_INCREMENT
    ,   language   VARCHAR(255) NOT NULL UNIQUE
    ,   is_deleted VARCHAR(4)   NOT NULL DEFAULT 'N'
    ,   CONSTRAINT pk_programming_language_id PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS MEMBER_PROGRAMMING_LANGUAGE
(
    id                      INTEGER NOT NULL AUTO_INCREMENT
    ,   programming_language_id INTEGER NOT NULL
    ,   member_profile_page_id  INTEGER NOT NULL
    ,   CONSTRAINT pk_member_programming_language_id PRIMARY KEY (id)
    ,   CONSTRAINT fk_member_programming_language_programming_language_id FOREIGN KEY (programming_language_id) REFERENCES PROGRAMMING_LANGUAGE (id)
    ,   CONSTRAINT fk_member_programming_member_profile_page_id FOREIGN KEY (member_profile_page_id) REFERENCES MEMBER_PROFILE_PAGE (id)
);


-- 챌린지 테이블
CREATE TABLE IF NOT EXISTS CHALLENGE
(
    id   INTEGER      NOT NULL AUTO_INCREMENT
    ,   name VARCHAR(255) NOT NULL
    ,   CONSTRAINT pk_challenge_id PRIMARY KEY (id)
    ,   CONSTRAINT uni_challenge_name UNIQUE (name)
);

-- 도전 과제 테이블
CREATE TABLE IF NOT EXISTS ACHIEVEMENT
(
    id           INTEGER    NOT NULL AUTO_INCREMENT
    ,   requirement  INTEGER    NOT NULL
    ,   exp          INTEGER    NOT NULL
    ,   is_deleted   VARCHAR(4) NOT NULL DEFAULT 'N'
    ,   challenge_id INTEGER    NOT NULL
    ,   CONSTRAINT pk_achievement_id PRIMARY KEY (id)
    ,   CONSTRAINT fk_achievement_challenge_id FOREIGN KEY (challenge_id) REFERENCES challenge(id)
);

-- 일일 미션 테이블
CREATE TABLE IF NOT EXISTS DAILY_MISSION
(
    id           INTEGER      NOT NULL AUTO_INCREMENT
    ,   content      TEXT         NOT NULL
    ,   exp_point    INTEGER      NOT NULL
    ,   is_deleted   VARCHAR(4)   NOT NULL DEFAULT 'N'
    ,   challenge_id INTEGER      NOT NULL
    ,   CONSTRAINT pk_daily_mission_id PRIMARY KEY (id)
    ,   CONSTRAINT fk_daily_mission_challenge_id FOREIGN KEY (challenge_id) REFERENCES challenge(id)
);

-- 뱃지 테이블
CREATE TABLE IF NOT EXISTS BADGE
(
    id           INTEGER    NOT NULL AUTO_INCREMENT
    ,   requirement  INTEGER
    ,   advantage    INTEGER    NOT NULL
    ,   description  TEXT       NOT NULL
    ,   is_deleted   VARCHAR(4) NOT NULL DEFAULT 'N'
    ,   challenge_id INTEGER    NOT NULL
    ,   CONSTRAINT pk_badge_id PRIMARY KEY (id)
    ,   CONSTRAINT fk_badge_challenge_id FOREIGN KEY (challenge_id) REFERENCES challenge(id)
);

-- 회원별 도전 과제 테이블
CREATE TABLE IF NOT EXISTS MEMBER_ACHIEVEMENT
(
    id             INTEGER       NOT NULL AUTO_INCREMENT
    ,   achieved_date  VARCHAR(255)
    ,   progress       INTEGER
    ,   achieved_time  INTEGER
    ,   achievement_id INTEGER       NOT NULL
    ,   member_id      INTEGER       NOT NULL
    ,   CONSTRAINT pk_member_achievement_id PRIMARY KEY (id)
    ,   CONSTRAINT fk_member_achievement_achievement_id FOREIGN KEY (achievement_id) REFERENCES achievement(id)
    ,   CONSTRAINT fk_member_achievement_member_id FOREIGN KEY (member_id) REFERENCES member(id)
    ,   CONSTRAINT uni_member_achievement UNIQUE (member_id, achievement_id)
);

-- 회원별 일일 미션 테이블
CREATE TABLE IF NOT EXISTS MEMBER_DAILY_MISSION
(
    id               INTEGER       NOT NULL AUTO_INCREMENT
    ,   is_completed     VARCHAR(4)    NOT NULL DEFAULT 'N'
    ,   accepted_date   VARCHAR(255)
    ,   daily_mission_id INTEGER       NOT NULL
    ,   member_id        INTEGER       NOT NULL
    ,   CONSTRAINT pk_member_daily_mission_id PRIMARY KEY (id)
    ,   CONSTRAINT fk_member_daily_mission_daily_mission_id FOREIGN KEY (daily_mission_id) REFERENCES daily_mission(id)
    ,   CONSTRAINT fk_member_daily_mission_member_id FOREIGN KEY (member_id) REFERENCES member(id)
);

-- 회원별 뱃지 테이블
CREATE TABLE IF NOT EXISTS MEMBER_BADGE
(
    id            INTEGER      NOT NULL AUTO_INCREMENT
    ,   acquired_date VARCHAR(255) NOT NULL
    ,   level         INTEGER      NOT NULL
    ,   badge_id      INTEGER      NOT NULL
    ,   member_id     INTEGER      NOT NULL
    ,   CONSTRAINT pk_member_badge_id PRIMARY KEY (id)
    ,   CONSTRAINT fk_member_badge_badge_id FOREIGN KEY (badge_id) REFERENCES badge(id)
    ,   CONSTRAINT fk_member_badge_member_id FOREIGN KEY (member_id) REFERENCES member(id)
    ,   CONSTRAINT uni_member_badge UNIQUE (member_id, badge_id)
);


CREATE TABLE IF NOT EXISTS TECHNOLOGY_CATEGORY
(
    id                         INTEGER      NOT NULL AUTO_INCREMENT
    , name                       VARCHAR(255) NOT NULL
    , is_deleted                 VARCHAR(4)   NOT NULL DEFAULT 'N'
    , ref_technology_category_id INTEGER      NULL
    , CONSTRAINT pk_id PRIMARY KEY (id)
    , CONSTRAINT fk_ref_technology_category_id FOREIGN KEY (ref_technology_category_id) REFERENCES TECHNOLOGY_CATEGORY (id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS MATCHING
(
    id                     INTEGER      NOT NULL AUTO_INCREMENT
    , created_date_at        VARCHAR(255) NOT NULL
    , is_completed           VARCHAR(4)   NOT NULL DEFAULT 'N'
    , is_deleted               VARCHAR(4) NOT NULL DEFAULT 'N'
    , maximum_participant INTEGER NOT NULL DEFAULT 5
    , current_participant INTEGER NOT NULL DEFAULT 1
    , level_range            INTEGER      NOT NULL DEFAULT 5
    , member_id              INTEGER      NOT NULL
    , technology_category_id INTEGER      NOT NULL
    , CONSTRAINT pk_id PRIMARY KEY (id)
    , CONSTRAINT fk_matching_member_id FOREIGN KEY (member_id) REFERENCES MEMBER (id)
    , CONSTRAINT fk_matching_technology_category_id FOREIGN KEY (technology_category_id) REFERENCES TECHNOLOGY_CATEGORY (id)
);

CREATE TABLE IF NOT EXISTS MATCHING_ENTRY
(
    id           INTEGER      NOT NULL AUTO_INCREMENT
    , applied_date_at VARCHAR(255) NOT NULL
    , is_canceled   VARCHAR(4)   NOT NULL DEFAULT 'N'
    , is_accepted VARCHAR(4) NOT NULL DEFAULT 'N'
    , member_id    INTEGER      NOT NULL
    , matching_id  INTEGER      NOT NULL
    , CONSTRAINT pk_id PRIMARY KEY (id)
    , CONSTRAINT fk_matching_entry_member_id FOREIGN KEY (member_id) REFERENCES MEMBER(id)
    , CONSTRAINT fk_matching_entry_matching_id FOREIGN KEY (matching_id) REFERENCES MATCHING(id)
);


CREATE TABLE IF NOT EXISTS POST
(
    id        INT          NOT NULL AUTO_INCREMENT COMMENT '게시글 번호'
    ,   title     VARCHAR(255) NOT NULL COMMENT '게시글 제목'
    ,   content   TEXT         NOT NULL COMMENT '게시글 내용'
    ,   category  INT          NOT NULL COMMENT '게시글 카테고리 번호'
    ,   upload_at VARCHAR(255) NOT NULL COMMENT '작성 시각'
    ,   update_at VARCHAR(255) NULL COMMENT '수정 시각'
    ,   status    TINYINT      NOT NULL COMMENT '활성화 여부 기본: 0, 삭제: 1, 규제: 2'
    ,   member_id INT          NOT NULL COMMENT '게시글 작성자'
    ,   CONSTRAINT pk_id PRIMARY KEY (id)
# ,   CONSTRAINT fk_post_member_id FOREIGN KEY (member_id) REFERENCES MEMBER (id)
) ENGINE = INNODB
  AUTO_INCREMENT = 1 COMMENT ='게시글'
  DEFAULT CHARSET UTF8;

CREATE TABLE IF NOT EXISTS POST_IMAGE
(
    id           INT          NOT NULL AUTO_INCREMENT COMMENT '게시글 사진 번호'
    ,   image_path   VARCHAR(255) NOT NULL UNIQUE COMMENT '파일 경로'
    ,   renamed_name VARCHAR(255) NOT NULL UNIQUE COMMENT '저장 이름'
    ,   is_thumbnail VARCHAR(4)   NOT NULL DEFAULT 'N' COMMENT '썸네일 여부'
    ,   post_id      INT          NOT NULL COMMENT '게시글 번호'
    ,   CONSTRAINT pk_id PRIMARY KEY (id)
    ,   CONSTRAINT fk_post_image_post_id FOREIGN KEY (post_id) REFERENCES POST (id)
) ENGINE = INNODB
  AUTO_INCREMENT = 1 COMMENT ='게시글 사진'
  DEFAULT CHARSET UTF8;

CREATE TABLE IF NOT EXISTS COMMENT
(
    id              INT          NOT NULL AUTO_INCREMENT COMMENT '댓글 번호'
    ,   is_adopted      VARCHAR(4)   NULL COMMENT '채택 여부'
    ,   upload_at       VARCHAR(255) NOT NULL COMMENT '작성 시각'
    ,   update_at       VARCHAR(255) NULL COMMENT '수정 시각'
    ,   content         TEXT         NOT NULL COMMENT '댓글 내용'
    ,   status          TINYINT      NOT NULL COMMENT '활성화 여부 기본: 0, 삭제: 1, 규제: 2'
    ,   post_id         INT          NOT NULL COMMENT '게시글 번호'
    ,   root_comment_id INT          NULL COMMENT '부모 댓글 번호'
    ,   member_id       INT          NOT NULL COMMENT '댓글 작성자'
    ,   CONSTRAINT pk_id PRIMARY KEY (id)
    ,   CONSTRAINT fk_comment_post_id FOREIGN KEY (post_id) REFERENCES POST (id)
    ,   CONSTRAINT fk_comment_root_comment_id FOREIGN KEY (root_comment_id) REFERENCES COMMENT (id)
# ,   CONSTRAINT fk_comment_member_id FOREIGN KEY (member_id) REFERENCES MEMBER (id)
) ENGINE = INNODB
  AUTO_INCREMENT = 1 COMMENT ='댓글'
  DEFAULT CHARSET UTF8;


-- 프로젝트 방 테이블
CREATE TABLE if NOT EXISTS project_room
(
    id                       INTEGER NOT NULL AUTO_INCREMENT     COMMENT '프로젝트 방 번호'
    , name                      VARCHAR(255) NOT NULL             COMMENT '프로젝트 이름'
    , content TEXT               NOT NULL                     COMMENT '프로젝트 소개'
    , is_finished               VARCHAR(4) NOT NULL DEFAULT 'N'       COMMENT '프로젝트 완료 여부'
    , is_deleted                VARCHAR(4) NOT NULL DEFAULT 'N'     COMMENT '프로젝트 삭제 여부'
    , duration_time             VARCHAR(100) NOT NULL             COMMENT '프로젝트 기간'
    , maximum_participant       INTEGER NOT NULL                COMMENT '프로젝트 최대 인원'
    , session_code              INTEGER NULL UNIQUE               COMMENT '(자율매칭)프로젝트 입장 코드'
    , start_date                VARCHAR(255) NOT NULL             COMMENT '프로젝트 시작일'
    , end_date                  VARCHAR(255) NOT NULL             COMMENT '프로젝트 종료일'
    , technology_category_id    INTEGER NOT NULL                  COMMENT '프로젝트 기술 분류'
    , thumbnail_image           VARCHAR(255) UNIQUE                 COMMENT '프로젝트 썸네일 이미지'
    , introduction              TEXT                                COMMENT '프로젝트 한줄 소개'
    , project_url               VARCHAR(255) UNIQUE                 COMMENT '프로젝트 링크'
    , CONSTRAINT pk_id PRIMARY KEY (id)
    , CONSTRAINT fk_project_technology_category_id FOREIGN KEY (technology_category_id) REFERENCES TECHNOLOGY_CATEGORY (id)
    , CHECK (maximum_participant > 0)
) ENGINE=INNODB COMMENT '프로젝트 방';


-- 팀원 테이블
CREATE TABLE if NOT EXISTS PARTICIPANT
(
    id                INTEGER NOT NULL AUTO_INCREMENT     COMMENT '팀원 번호'
    , is_manager        VARCHAR(4) NOT NULL DEFAULT 'N'     COMMENT '방장 여부'
    , project_room_id   INTEGER NOT NULL               COMMENT '프로젝트 방 번호'
    , member_id         INTEGER NOT NULL               COMMENT '회원 번호'
    , CONSTRAINT pk_id PRIMARY KEY (id)
    , CONSTRAINT fk_participant_project_room_id FOREIGN KEY (project_room_id) REFERENCES PROJECT_ROOM (id)
    , CONSTRAINT fk_participant_member_id FOREIGN KEY (member_id) REFERENCES MEMBER (id)
    , UNIQUE (project_room_id, member_id)
);


-- 팀원 후기 테이블
CREATE TABLE if NOT EXISTS MEMBER_REVIEW
(
    id           INTEGER NOT NULL AUTO_INCREMENT                   COMMENT '팀원 후기 번호'
    , rate          INTEGER NOT NULL                                    COMMENT '팀원 후기 평점(1~5)'
    , content       TEXT                                        COMMENT '팀원 후기 내용'
    , reviewer_id   INTEGER NOT NULL                             COMMENT '후기 작성자'
    , reviewee_id   INTEGER NOT NULL                             COMMENT '후기 대상자'
    , CONSTRAINT pk_id PRIMARY KEY (id)
    , CONSTRAINT fk_member_review_reviewer_id FOREIGN KEY (reviewer_id) REFERENCES PARTICIPANT (id)
    , CONSTRAINT fk_member_review_reviewee_id FOREIGN KEY (reviewee_id) REFERENCES PARTICIPANT (id)
    , CONSTRAINT chk_range_of_rate CHECK (rate >= 1 AND rate <= 5)
);



-- 프로젝트 후기 테이블
CREATE TABLE if NOT EXISTS PROJECT_REVIEW
(
    id               INTEGER NOT NULL AUTO_INCREMENT         COMMENT '프로젝트 후기 번호'
    , reviewer_id       INTEGER NOT NULL                  COMMENT '후기 작성자'
    , content TEXT       NOT NULL                        COMMENT '후기 내용'
    , project_room_id   INTEGER NOT NULL
    , CONSTRAINT pk_id PRIMARY KEY (id)
    , CONSTRAINT fk_project_review_project_room_id  FOREIGN KEY (project_room_id) REFERENCES PROJECT_ROOM (id)
    , CONSTRAINT fk_preojct_review_reviewer_id  FOREIGN KEY (reviewer_id) REFERENCES PARTICIPANT (id)
);


-- 프로젝트 회의록
CREATE TABLE if NOT EXISTS PROJECT_MEETING
(
    id                INTEGER NOT NULL AUTO_INCREMENT     COMMENT '회의록 번호'
    , project_room_id   INTEGER NOT NULL               COMMENT '프로젝트 방 번호'
    , title             VARCHAR(255) NOT NULL            COMMENT '회의록 제목'
    , content TEXT       NOT NULL                     COMMENT '회의록 내용'
    , author_id           INTEGER NOT NULL                COMMENT '회의록 작성자'
    , upload_time       VARCHAR(255) NOT NULL            COMMENT '작성일'
    , update_time       VARCHAR(255)                     COMMENT '수정일'
    , CONSTRAINT pk_id PRIMARY KEY (id)
    , CONSTRAINT fk_project_meeting_member FOREIGN KEY(author_id) REFERENCES MEMBER(id)
    , CONSTRAINT fk_proejct_meeting_project_room_id FOREIGN KEY (project_room_id) REFERENCES PROJECT_ROOM (id)
);


-- 프로젝트 회의록 사진
CREATE TABLE if NOT EXISTS project_meeting_image
(
    id                INTEGER NOT NULL AUTO_INCREMENT     COMMENT '회의록 사진 번호'
    , image_path        VARCHAR(255) NOT NULL             COMMENT '사진 경로'
    , image_name        VARCHAR(255) NOT NULL            COMMENT '재정의 사진명'
    , is_thumbnail      VARCHAR(4) NOT NULL DEFAULT 'N'     COMMENT '썸네일 여부'
    , meeting_id        INTEGER NOT NULL               COMMENT '회의록 번호'
    , CONSTRAINT pk_id PRIMARY KEY (id)
    , CONSTRAINT fk_project_meeting_image_meeting_id FOREIGN KEY (meeting_id) REFERENCES PROJECT_MEETING (id)
);


DESC PROJECT_MEETING_IMAGE;    -- 프로젝트 회의록 사진
DESC PROJECT_MEETING;        -- 프로젝트 회의록
DESC PROJECT_REVIEW;        -- 프로젝트 후기
DESC PROJECT_MEETING;        -- 프로젝트 회의록
DESC MEMBER_REVIEW;            -- 회원 후기
DESC PARTICIPANT;            -- 프로젝트 팀원
DESC PROJECT_ROOM;            -- 프로젝트 방

-- REPORT_REASON 테이블
CREATE TABLE IF NOT EXISTS REPORT_REASON
(
    id          INT  AUTO_INCREMENT         COMMENT '신고 사유 번호'
    ,   reason      TEXT NOT NULL UNIQUE        COMMENT '신고 사유명'
    ,   CONSTRAINT pk_id PRIMARY KEY (id)
);

-- REPORT 테이블
CREATE TABLE IF NOT EXISTS REPORT
(
    id                  INT AUTO_INCREMENT                      COMMENT '신고 번호'
    ,   reported_at         VARCHAR(255) NOT NULL                   COMMENT '신고 신청일시'
    ,   status              TINYINT NOT NULL DEFAULT 0              COMMENT '처리 상태 (ENUM("처리중", "보류", "승인"))'
    ,   category            TINYINT NOT NULL                        COMMENT '신고 유형 (ENUM("회원", "게시글", "댓글"))'
    ,   reported_id         INTEGER NOT NULL                        COMMENT '신고 대상 id'
    ,   is_deleted          VARCHAR(4) NOT NULL DEFAULT 'N'         COMMENT '신고 삭제 여부'
    ,   report_reason_id    INTEGER NOT NULL                        COMMENT '신고 사유 번호'
    ,   member_id           INTEGER NOT NULL                        COMMENT '신고 신청자'
    ,   CONSTRAINT pk_id PRIMARY KEY (id)
    ,   CONSTRAINT fk_report_report_reason_id FOREIGN KEY (report_reason_id) REFERENCES REPORT_REASON (id)
    ,   CONSTRAINT fk_report_member_id FOREIGN KEY (member_id) REFERENCES MEMBER (id)
);

-- REGULATION 테이블
CREATE TABLE IF NOT EXISTS REGULATION
(
    id              INT AUTO_INCREMENT                      COMMENT '규제 번호'
    ,   start_date      VARCHAR(255) NOT NULL                   COMMENT '시작 날짜'
    ,   end_date        VARCHAR(255) NOT NULL                   COMMENT '종료 날짜'
    ,   is_deleted      VARCHAR(4) NOT NULL DEFAULT 'N'         COMMENT '신고 삭제 여부'
    ,   member_id       INTEGER NOT NULL                        COMMENT '규제 대상 회원'
    ,   CONSTRAINT pk_id PRIMARY KEY (id)
    ,   CONSTRAINT fk_regulation_member_id FOREIGN KEY (member_id) REFERENCES MEMBER (id)
);

```
</details>

<details>
<summary><b>DML</b></summary>

```sql
INSERT INTO MEMBER (name, age, ihidnum, phone_number, email, password, nickname, status, reported_count, user_grant)
VALUES ('김민수', 25, '950101-1234567', '010-1234-5678', 'minsu1@naver.com', 'Pass1234', '민수킹', 0, 1, 0),
       ('이영희', 30, '930215-2345678', '010-2345-6789', 'younghee2@gmail.com', 'Young567', '영희짱', 1, 0, 0),
       ('박지훈', 28, '970430-3456789', '010-3456-7890', 'jihoon3@daum.net', 'Jihoon89', '훈이', 0, 2, 0),
       ('최수진', 22, '990812-4567890', '010-4567-8901', 'sujin4@yahoo.com', 'Sujin101', '수진이', 2, 0, 1),
       ('강태우', 35, '880527-5678901', '010-5678-9012', 'taewoo5@kakao.com', 'Tae12345', '태우님', 0, 3, 0),
       ('윤서연', 27, '960615-1234567', '010-6789-0123', 'seoyeon6@naver.com', 'Seo1234', '서연', 0, 1, 0),
       ('정하늘', 33, '910309-2345678', '010-7890-1234', 'haneul7@gmail.com', 'Haneul56', '하늘님', 1, 2, 0),
       ('한지민', 24, '980722-3456789', '010-8901-2345', 'jimin8@daum.net', 'Jimin78', '지민이', 0, 0, 0),
       ('오준영', 29, '940115-4567890', '010-9012-3456', 'junyoung9@yahoo.com', 'Jun123', '준영', 2, 1, 0),
       ('신동현', 31, '920831-5678901', '010-0123-4567', 'donghyun10@kakao.com', 'Dong567', '동현', 0, 3, 1),
       ('김지영', 26, '950207-1234567', '010-1111-2222', 'jiyoung11@naver.com', 'Ji12345', '지영이', 0, 0, 0),
       ('이수현', 32, '910514-2345678', '010-2222-3333', 'suhyun12@gmail.com', 'Su5678', '수현님', 1, 2, 0),
       ('박민재', 23, '980928-3456789', '010-3333-4444', 'minjae13@daum.net', 'Min901', '민재', 0, 1, 0),
       ('최윤아', 28, '960312-4567890', '010-4444-5555', 'yuna14@yahoo.com', 'Yuna123', '윤아짱', 2, 0, 0),
       ('강도훈', 34, '890619-5678901', '010-5555-6666', 'dohoon15@kakao.com', 'Do5678', '도훈', 0, 3, 1),
       ('윤지우', 21, '000101-1234567', '010-6666-7777', 'jiwoo16@naver.com', 'Jiwoo12', '지우', 0, 1, 0),
       ('정소연', 29, '940225-2345678', '010-7777-8888', 'soyeon17@gmail.com', 'Soy123', '소연이', 1, 0, 0),
       ('한태희', 27, '970808-3456789', '010-8888-9999', 'taehee18@daum.net', 'Tae567', '태희', 0, 2, 0),
       ('오세진', 33, '910915-4567890', '010-9999-0000', 'sejin19@yahoo.com', 'Sej123', '세진님', 2, 1, 0),
       ('신하영', 25, '960502-5678901', '010-0000-1111', 'hayoung20@kakao.com', 'Hay567', '하영', 0, 0, 0),
       ('김영수', 30, '930710-1234567', '010-1212-3434', 'youngsoo21@naver.com', 'Young12', '영수킹', 0, 3, 1),
       ('이재훈', 28, '950824-2345678', '010-2323-4545', 'jaehoon22@gmail.com', 'Jae567', '재훈', 1, 2, 0),
       ('박소영', 24, '990106-3456789', '010-3434-5656', 'soyoung23@daum.net', 'Soy123', '소영이', 0, 0, 0),
       ('최민호', 31, '920413-4567890', '010-4545-6767', 'minho24@yahoo.com', 'Min567', '민호', 2, 1, 0),
       ('강지현', 26, '950527-5678901', '010-5656-7878', 'jihyeon25@kakao.com', 'Ji1234', '지현님', 0, 2, 0),
       ('윤태영', 32, '910701-1234567', '010-6767-8989', 'taeyoung26@naver.com', 'Tae567', '태영', 1, 0, 0),
       ('정민수', 23, '980814-2345678', '010-7878-9090', 'minsu27@gmail.com', 'Min123', '민수', 0, 3, 1),
       ('한서진', 29, '940927-3456789', '010-8989-0101', 'seojin28@daum.net', 'Seo567', '서진이', 2, 1, 0),
       ('오지훈', 35, '890210-4567890', '010-9090-1212', 'jihoon29@yahoo.com', 'Ji1234', '지훈님', 0, 0, 0),
       ('신윤서', 27, '960323-5678901', '010-0101-2323', 'yoonseo30@kakao.com', 'Yoon567', '윤서', 0, 2, 0);
INSERT INTO MEMBER_PROFILE_PAGE (exp, level, introduce, preferred_area, git_address, score, image_path, member_id)
VALUES (1500, 3, '안녕하세요, 김민수입니다.', '서울', 'https://github.com/minsu1', 85, '/images/minsu1.jpg', 1),
       (2000, 4, '코딩 좋아하는 이영희예요.', '부산', 'https://github.com/younghee2', 90, '/images/younghee2.png', 2),
       (800, 2, NULL, '대구', 'https://github.com/jihoon3', 70, '/images/jihoon3.jpg', 3),
       (500, 1, '신입 개발자 최수진입니다.', NULL, 'https://github.com/sujin4', NULL, NULL, 4),
       (3000, 5, '강태우, 10년차 개발자.', '인천', 'https://github.com/taewoo5', 95, '/images/taewoo5.jpeg', 5),
       (1200, 3, '윤서연이에요!', '광주', 'https://github.com/seoyeon6', 80, '/images/seoyeon6.jpg', 6),
       (1800, 4, '정하늘입니다.', '대전', 'https://github.com/haneul7', 88, '/images/haneul7.png', 7),
       (600, 2, NULL, '울산', 'https://github.com/jimin8', 65, '/images/jimin8.jpg', 8),
       (900, 2, '오준영, 열정적인 개발자.', '제주', 'https://github.com/junyoung9', 75, '/images/junyoung9.jpeg', 9),
       (2500, 5, '신동현입니다.', '서울', 'https://github.com/donghyun10', 92, '/images/donghyun10.png', 10),
       (1400, 3, '김지영이에요.', '부산', 'https://github.com/jiyoung11', 82, '/images/jiyoung11.jpg', 11),
       (1700, 4, NULL, '대구', 'https://github.com/suhyun12', 87, '/images/suhyun12.png', 12),
       (700, 2, '박민재입니다.', '인천', 'https://github.com/minjae13', 68, '/images/minjae13.jpg', 13),
       (1100, 3, '최윤아, 개발자 꿈나무.', NULL, 'https://github.com/yuna14', 78, '/images/yuna14.jpeg', 14),
       (2800, 5, '강도훈이에요.', '서울', 'https://github.com/dohoon15', 94, '/images/dohoon15.png', 15),
       (400, 1, '윤지우, 신입이에요.', '부산', 'https://github.com/jiwoo16', NULL, NULL, 16),
       (1300, 3, NULL, '대전', 'https://github.com/soyeon17', 83, '/images/soyeon17.jpg', 17),
       (1000, 2, '한태희입니다.', '광주', 'https://github.com/taehee18', 77, '/images/taehee18.png', 18),
       (1600, 4, '오세진이에요.', '울산', 'https://github.com/sejin19', 86, '/images/sejin19.jpeg', 19),
       (2200, 4, '신하영, 열심히 코딩중!', '제주', 'https://github.com/hayoung20', 89, '/images/hayoung20.jpg', 20),
       (1900, 4, '김영수입니다.', '서울', 'https://github.com/youngsoo21', 91, '/images/youngsoo21.png', 21),
       (300, 1, NULL, '부산', 'https://github.com/jaehoon22', NULL, NULL, 22),
       (850, 2, '박소영이에요.', '대구', 'https://github.com/soyoung23', 72, '/images/soyoung23.jpg', 23),
       (1450, 3, '최민호입니다.', '인천', 'https://github.com/minho24', 84, '/images/minho24.jpeg', 24),
       (2700, 5, '강지현, 개발자입니다.', '서울', 'https://github.com/jihyeon25', 93, '/images/jihyeon25.png', 25),
       (950, 2, NULL, '광주', 'https://github.com/taeyoung26', 76, '/images/taeyoung26.jpg', 26),
       (1750, 4, '정민수예요.', '대전', 'https://github.com/minsu27', 88, '/images/minsu27.png', 27),
       (650, 2, '한서진입니다.', '울산', 'https://github.com/seojin28', 69, '/images/seojin28.jpeg', 28),
       (2000, 4, '오지훈이에요.', '제주', 'https://github.com/jihoon29', 90, '/images/jihoon29.jpg', 29),
       (1250, 3, '신윤서, 코딩 좋아해요.', '서울', 'https://github.com/yoonseo30', 81, '/images/yoonseo30.png', 30);

INSERT INTO PROGRAMMING_LANGUAGE (language, is_deleted)
VALUES ('Java', 'N'),
       ('Python', 'N'),
       ('JavaScript', 'N'),
       ('C++', 'N'),
       ('Ruby', 'N'),
       ('Go', 'N'),
       ('Kotlin', 'N'),
       ('Swift', 'N'),
       ('PHP', 'N'),
       ('Rust', 'N'),
       ('TypeScript', 'N'),
       ('C#', 'N'),
       ('Scala', 'N'),
       ('Perl', 'N'),
       ('Haskell', 'N'),
       ('R', 'N'),
       ('Dart', 'N'),
       ('Lua', 'N'),
       ('MATLAB', 'N'),
       ('SQL', 'N'),
       ('Groovy', 'N'),
       ('Elixir', 'N'),
       ('Clojure', 'N'),
       ('F#', 'N'),
       ('VB.NET', 'N'),
       ('Assembly', 'N'),
       ('Objective-C', 'N'),
       ('Pascal', 'N'),
       ('Fortran', 'N'),
       ('COBOL', 'Y');


INSERT INTO MEMBER_PROGRAMMING_LANGUAGE (programming_language_id, member_profile_page_id)
VALUES (1, 1),   -- 김민수: Java
       (2, 1),   -- 김민수: Python
       (3, 2),   -- 이영희: JavaScript
       (4, 3),   -- 박지훈: C++
       (2, 5),   -- 강태우: Python
       (6, 6),   -- 윤서연: Go
       (7, 7),   -- 정하늘: Kotlin
       (8, 8),   -- 한지민: Swift
       (9, 9),   -- 오준영: PHP
       (10, 10), -- 신동현: Rust
       (11, 11), -- 김지영: TypeScript
       (12, 12), -- 이수현: C#
       (13, 13), -- 박민재: Scala
       (14, 14), -- 최윤아: Perl
       (15, 15), -- 강도훈: Haskell
       (16, 16), -- 윤지우: R
       (17, 17), -- 정소연: Dart
       (18, 18), -- 한태희: Lua
       (19, 19), -- 오세진: MATLAB
       (20, 20), -- 신하영: SQL
       (1, 21),  -- 김영수: Java
       (3, 22),  -- 이재훈: JavaScript
       (4, 23),  -- 박소영: C++
       (2, 24),  -- 최민호: Python
       (6, 25),  -- 강지현: Go
       (7, 26),  -- 윤태영: Kotlin
       (8, 27),  -- 정민수: Swift
       (9, 28),  -- 한서진: PHP
       (10, 29), -- 오지훈: Rust
       (11, 30); -- 신윤서: TypeScript


-- CHALLENGE 테이블 더미 데이터
INSERT INTO CHALLENGE (name)
VALUES
    ('로그인'),
    ('게시글'),
    ('댓글'),
    ('Q&A 채택'),
    ('커밋'),
    ('이슈 생성'),
    ('PR 리뷰'),
    ('PR 생성'),
    ('팀 커밋'),
    ('프로젝트 완료'),
    ('회의록'),   # 여기까지 과제 및 미션 카테고리
    ('현업'),
    ('자격증'),
    ('학력'),
    ('Git');

-- ACHIEVEMENT 테이블 더미 데이터
INSERT INTO ACHIEVEMENT (requirement, exp, is_deleted, challenge_id)
VALUES
    (10, 100, 'N', 1),
    (5, 50, 'N', 2),
    (15, 40, 'N', 3),
    (10, 40, 'N', 4),
    (10, 50, 'N', 5),
    (10, 60, 'N', 6),
    (10, 50, 'N', 7),
    (5, 80, 'N', 8),
    (0, 100, 'N', 9),
    (1, 150, 'N', 10),
    (3, 70, 'N', 11);

-- DAILY_MISSION 테이블 더미 데이터
INSERT INTO DAILY_MISSION (content, exp_point, is_deleted, challenge_id)
VALUES
    ('로그인 하기', 10, 'N', 1),
    ('게시글 작성하기', 20, 'N', 2),
    ('댓글 작성하기', 15, 'N', 3),
    ('Q&A 채택받기', 30, 'N', 4),
    ('일일 커밋하기', 20, 'N', 5),
    ('이슈 생성하기', 20, 'N', 6),
    ('PR 리뷰하기', 25, 'N', 7),
    ('PR 생성하기', 70, 'N', 8),
    ('회의록 작성하기', 90, 'N', 11);

-- BADGE 테이블 더미 데이터
INSERT INTO BADGE (requirement, advantage, description, is_deleted, challenge_id)
VALUES
    (30, 0, '누적 출석', 'N', 1),
    (20, 0, '게시글 작성하기', 'N', 2),
    (30, 0, '댓글 작성하기', 'N', 3),
    (30, 0, 'Q&A 채택되기', 'N', 4),
    (20, 0, '커밋하기', 'N', 5),
    (20, 0, '이슈 생성하기', 'N', 6),
    (20, 0, 'PR 리뷰하기', 'N', 7),
    (10, 0, 'PR 생성하기', 'N', 8),
    (1, 0, '팀 전체 커밋', 'N', 9),
    (3, 0, '프로젝트 완료', 'N', 10),
    (9, 0, '회의록 작성', 'N', 11),
    (3, 5, '경력 3년', 'N',12),  #여기부터 실력 뱃지
    (0,3,'정보처리기사', 'N', 13),
    (0,3,'SQLD', 'N', 13),
    (0,3,'SQLP', 'N', 13),
    (0,3,'정보보안기사', 'N', 13),
    (0,3,'리눅스마스터', 'N', 13),
    (0,3,'네트워크관리사', 'N', 13),
    (0,3,'OCJP', 'N', 13),
    (0,3,'ERP 정보관리사', 'N', 13),
    (0,3,'빅데이터 분석기사', 'N', 13),
    (0,3,'AWS', 'N', 13),
    (0,3,'Java 프로그래밍 전문가', 'N', 13),
    (0,3,'전문학사', 'N', 14),
    (0,3,'학사', 'N', 14),
    (0,3,'석사', 'N', 14),
    (0,3,'박사', 'N', 14),
    (50, 50, 'Git 잔디 개수', 'N', 15);

-- MEMBER_ACHIEVEMENT 테이블 더미 데이터
INSERT INTO MEMBER_ACHIEVEMENT (achieved_date, progress, achieved_time, achievement_id, member_id)
VALUES
    ('2025-03-01', 30, 3, 1, 1),
    ('2025-03-02', 20, 4, 2, 2),
    ('2025-03-03', 30, 2, 3, 3),
    ('2025-03-04', 20, 2, 4, 4),
    ('2025-03-05', 20, 2, 5, 5),
    ('2025-03-06', 20, 2, 6, 1),
    ('2025-03-07', 20, 2, 7, 2),
    ('2025-03-08', 10, 2, 8, 3),
    ('2025-03-09', 1, 1, 9, 4),
    ('2025-03-10', 3, 3, 10, 5),
    ('2025-03-10', 9, 3, 11, 5);

-- MEMBER_DAILY_MISSION 테이블 더미 데이터
INSERT INTO MEMBER_DAILY_MISSION (is_completed, accepted_date, daily_mission_id, member_id)
VALUES
    ('Y', '2025-03-01', 1, 1),
    ('Y', '2025-03-02', 2, 2),
    ('Y', '2025-03-03', 3, 3),
    ('Y', '2025-03-04', 4, 4),
    ('Y', '2025-03-05', 5, 5),
    ('N', '2025-03-06', 6, 1),
    ('N', '2025-03-07', 7, 2),
    ('Y', '2025-03-08', 8, 3),
    ('N', '2025-03-09', 9, 4),
    ('Y', '2025-03-10', 9, 5);

-- MEMBER_BADGE 테이블 더미 데이터
INSERT INTO MEMBER_BADGE (acquired_date, level, badge_id, member_id)
VALUES
    ('2025-03-01', 1, 1, 1),
    ('2025-03-02', 1, 2, 2),
    ('2025-03-03', 1, 3, 3),
    ('2025-03-04', 1, 4, 4),
    ('2025-03-05', 1, 5, 5),
    ('2025-03-06', 1, 6, 1),
    ('2025-03-07', 1, 7, 2),
    ('2025-03-08', 1, 8, 3),
    ('2025-03-09', 1, 9, 4),
    ('2025-03-10', 1, 10, 5),
    ('2025-03-10', 1, 11, 5),
    ('2024-12-15', 1, 12, 1),
    ('2024-12-15', 1, 13, 2),
    ('2024-12-15', 1, 15, 3),
    ('2024-12-15', 1, 14, 4),
    ('2024-12-15', 1, 14, 5);


INSERT INTO TECHNOLOGY_CATEGORY
(
  name
, is_deleted
, ref_technology_category_id
)
VALUES
('PC', 'N', NULL)
     , ('모바일', 'N', NULL)
     , ('보안', 'N', NULL)
     , ('AI', 'N', NULL)
     , ('기타', 'N', NULL)
     , ('웹', 'N', 1)
     , ('게임', 'N', 1)
     , ('게임', 'N', 2)
     , ('VR/AR', 'N', 5)
     , ('IoT', 'N', 5)
     , ('안드로이드', 'N', 2)
     , ('ios', 'N', 2)
     , ('딥러닝', 'N', 4)
     , ('머신러닝', 'N', 4)
     , ('클라우드', 'N', 5)
     , ('블록체인', 'N', 3);

INSERT INTO MATCHING
(
  created_date_at
, is_completed
, is_deleted
, maximum_participant
, current_participant
, level_range
, member_id
, technology_category_id
)
VALUES
    ('2024-03-01 10:30:00', 'N', 'N', 5, 3, 3, 1, 7),
    ('2024-03-02 12:45:00', 'N', 'N', 7, 1, 5, 6, 6),
    ('2024-03-03 15:00:00', 'N', 'N', 4, 3, 2, 18, 6),
    ('2024-03-04 09:20:00', 'N', 'N', 4, 3, 10, 14, 5),
    ('2024-03-05 14:10:00', 'Y', 'N', 5, 5, 7, 10, 4),
    ('2024-03-06 17:30:00', 'N', 'N', 6, 4, 6, 2, 9),
    ('2024-03-07 11:00:00', 'N', 'Y', 6, 4, 5, 5, 8),
    ('2024-03-08 16:40:00', 'N', 'N', 5, 2, 5, 3, 7),
    ('2024-03-09 08:55:00', 'Y', 'N', 4, 4, 11, 15, 9),
    ('2024-03-10 13:25:00', 'N', 'N', 8, 5, 12, 18, 2);

INSERT INTO MATCHING_ENTRY
(
  applied_date_at
, is_canceled
, is_accepted
, member_id
, matching_id
)
VALUES
    ('2024-03-01 11:00:00', 'N', 'N', 4, 1),
    ('2024-03-02 13:00:00', 'N', 'Y', 11, 2),
    ('2024-03-03 15:30:00', 'Y', 'N', 6, 3),
    ('2024-03-04 10:10:00', 'N', 'Y', 2, 4),
    ('2024-03-05 14:40:00', 'N', 'Y', 14, 5),
    ('2024-03-06 18:20:00', 'N', 'N', 10, 3),
    ('2024-03-07 12:30:00', 'Y', 'N', 8, 5),
    ('2024-03-08 17:50:00', 'N', 'N', 9, 2),
    ('2024-03-09 09:15:00', 'N', 'N', 13, 5),
    ('2024-03-10 14:00:00', 'N', 'N', 18, 4);


-- PROJECT_ROOM 프로젝트 방 테이블
INSERT INTO PROJECT_ROOM
(
    name,
    content,
    is_finished,
    duration_time,
    maximum_participant,
    session_code,
    start_date,
    end_date,
    technology_category_id
)
VALUES
    ('AI 프로젝트',            'AI 개발 프로젝트입니다.',                'N', '3개월',  5, 1001, '2024-03-01', '2024-06-01', 4),
    ('웹앱 개발',              '모바일 웹앱 개발 프로젝트입니다.',       'N', '2개월',  4, 1002, '2024-04-01', '2024-06-01', 2),
    ('백엔드 프로젝트',        '백엔드 서버 구축 프로젝트입니다.',       'N', '4개월',  6, 1003, '2024-01-15', '2024-05-15', 1),
    ('프론트엔드 프로젝트',    '프론트엔드 디자인과 개발 프로젝트입니다.','N', '2개월',  3, 1004, '2024-02-01', '2024-04-01', 2),
    ('풀스택 프로젝트',        '풀스택 개발팀 프로젝트입니다.',          'N', '5개월',  7, 1005, '2024-03-10', '2024-08-10', 3);


--  PARTICIPANT 팀원 테이블

INSERT INTO PARTICIPANT
(
  is_manager
, project_room_id
, member_id
)
VALUES
    ('Y', 1, 1),
    ('N', 1, 2),
    ('N', 1, 3),
    ('N', 1, 4),
    ('N', 1, 5),
    ('Y', 2, 6),
    ('N', 2, 7),
    ('N', 2, 8),
    ('N', 2, 9),
    ('Y', 3, 10),
    ('N', 3, 11),
    ('N', 3, 12),
    ('N', 3, 13),
    ('N', 3, 14),
    ('N', 3, 15),
    ('Y', 4, 16),
    ('N', 4, 17),
    ('N', 4, 18),
    ('Y', 5, 19),
    ('N', 5, 20),
    ('N', 5, 1),
    ('N', 5, 2),
    ('N', 5, 3),
    ('N', 5, 4),
    ('N', 5, 5);


-- MEMBER_REVIEW 팀원 후기 테이블
INSERT INTO MEMBER_REVIEW
(
    rate,
    content,
    reviewer_id,
    reviewee_id
)
VALUES
    (5, '매우 훌륭합니다.',        1,  2),
    (4, '성실한 팀원이에요.',      2,  3),
    (5, '의사소통이 원활해요.',    6,  7),
    (3, '조금 늦긴 했지만 잘했어요.', 10, 11),
    (5, '매우 만족합니다.',        16, 17),
    (4, '열심히 참여했어요.',      19, 20),
    (3, '추가적인 노력이 필요합니다.', 1, 3),
    (5, '기여도가 높아요.',        6, 8),
    (4, '책임감이 강합니다.',      10, 12),
    (5, '팀워크가 훌륭합니다.',    16, 18);



-- PROJECT_MEETING 회의록 테이블
INSERT INTO PROJECT_MEETING
(
    project_room_id,
    title,
    content,
    author_id,           -- member_id로 참조됨
    upload_time,
    update_time
)
VALUES
    (1, 'AI 프로젝트 킥오프',        'AI 프로젝트 첫 회의입니다.',        1,  '2024-03-01 10:00:00', '2024-03-01 11:00:00'),
    (2, '웹앱 디자인 회의',          'UI/UX 논의 내용입니다.',            6,  '2024-04-02 10:00:00', '2024-04-02 11:00:00'),
    (3, '백엔드 구조 회의',          '서버 아키텍처 논의입니다.',         10, '2024-01-20 14:00:00', '2024-01-20 15:00:00'),
    (4, '프론트엔드 프레임워크 논의', 'React vs Vue 논쟁.',              16, '2024-02-05 13:00:00', '2024-02-05 14:00:00'),
    (5, '풀스택 일정 조율',          '전체 일정 조율 회의입니다.',        19, '2024-03-15 15:00:00', '2024-03-15 16:00:00');

-- PROJECT_MEETING_IMAGE 회의록 이미지 테이블
INSERT INTO PROJECT_MEETING_IMAGE
(
    image_path,
    image_name,
    is_thumbnail,
    meeting_id
)
VALUES
    ('/images/ai_kickoff.png',          'ai_kickoff_renamed.png',          'Y', 1),
    ('/images/webapp_design.png',       'webapp_design_renamed.png',       'N', 2),
    ('/images/backend_structure.png',   'backend_structure_renamed.png',   'Y', 3),
    ('/images/frontend_framework.png',  'frontend_framework_renamed.png',  'N', 4),
    ('/images/fullstack_schedule.png',  'fullstack_schedule_renamed.png',  'Y', 5);



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

-- -------------- REPORT_REASON 더미 데이터 -------------- --

INSERT INTO REPORT_REASON (reason)
VALUES ('욕설 및 비방')
     , ('스팸 및 광고')
     , ('음란물 게시')
     , ('허위 정보 유포')
     , ('개인정보 유출')
     , ('도배 및 중복 게시')
     , ('사기 및 사칭')
     , ('저작권 침해')
     , ('불법 행위 유도')
     , ('기타');


-- -------------- REPORT 더미 데이터 -------------- --

INSERT INTO REPORT (reported_at, status, category, reported_id, report_reason_id, member_id)
VALUES ('2025-03-01', 0, 1, 1, 1, 1)
     , ('2025-03-02', 2, 0, 1, 2, 1)   -- 회원 1
     , ('2025-03-03', 2, 0, 1, 3, 2)   -- 회원 1
     , ('2025-03-04', 0, 1, 2, 4, 2)
     , ('2025-03-05', 1, 2, 2, 5, 2)
     , ('2025-03-06', 2, 1, 1, 6, 3)   -- 회원 1
     , ('2025-03-07', 2, 1, 2, 7, 3)   -- 회원 1
     , ('2025-03-08', 2, 2, 1, 8, 4)   -- 회원 1
     , ('2025-03-09', 1, 0, 3, 9, 4)
     , ('2025-03-10', 1, 1, 4, 10, 5)
     , ('2025-03-11', 2, 0, 2, 1, 6)   -- 회원 2
     , ('2025-03-12', 2, 1, 4, 2, 4)   -- 회원 2
     , ('2025-03-13', 1, 1, 5, 3, 9)
     , ('2025-03-14', 1, 2, 5, 4, 5)
     , ('2025-03-15', 2, 1, 3, 5, 2)   -- 회원 2
     , ('2025-03-16', 0, 1, 6, 6, 1)
     , ('2025-03-17', 1, 2, 6, 7, 1)
     , ('2025-03-18', 2, 2, 2, 8, 2)   -- 회원 2
     , ('2025-03-19', 0, 1, 7, 9, 10)
     , ('2025-03-20', 2, 2, 7, 10, 8);


-- -------------- REGULATION 더미 데이터 -------------- --

-- status가 2인 경우에서
-- 회원 1번이 게시글(category : 1) 1,2를 쓰고 댓글(category : 2) 1을 쓴 경우
-- 회원 2번이 게시글 3,4를 쓰고 댓글 2를 쓴 경우
INSERT INTO REGULATION (start_date, end_date, member_id)
VALUES ('2025-03-09', '2025-03-22', 1)  -- 회원 1이 신고 3번 당해 규제 1번 : 정지 14일
     , ('2025-04-01', '2025-04-30', 1)  -- 회원 1이 신고 4번 당해 규제 2번 : 정지 30일
     , ('2025-05-14', '2999-05-15', 1)  -- 회원 1이 신고 5번 당해 규제 3번 : 영구 정지
     , ('2025-03-16', '2025-03-19', 2)  -- 회원 2가 신고 3번 당해 규제 1번 : 정지 14일
     , ('2025-05-01', '2025-05-30', 2); -- 회원 2가 신고 4번 당해 규제 2번 : 정지 30일


-- 게시글 테이블 더미 데이터

INSERT INTO POST (title, content, category, upload_at, status, member_id)
VALUES ('1번 게시글 제목', '1번 게시글 내용', 1, '2025-03-17 01:11:11', 0, 1)
     , ('2번 게시글 제목', '2번 게시글 내용', 1, '2025-03-17 01:11:12', 1, 2)
     , ('3번 게시글 제목', '3번 게시글 내용', 1, '2025-03-17 01:11:13', 2, 3)
     , ('4번 게시글 제목', '4번 게시글 내용', 2, '2025-03-17 01:11:14', 1, 4)
     , ('5번 게시글 제목', '5번 게시글 내용', 2, '2025-03-17 01:11:15', 0, 5)
     , ('6번 게시글 제목', '6번 게시글 내용', 1, '2025-03-17 01:11:16', 1, 6)
     , ('7번 게시글 제목', '7번 게시글 내용', 1, '2025-03-17 01:11:17', 2, 7)
     , ('8번 게시글 제목', '8번 게시글 내용', 1, '2025-03-17 01:11:18', 0, 8)
     , ('9번 게시글 제목', '9번 게시글 내용', 1, '2025-03-17 01:11:19', 0, 9)
     , ('10번 게시글 제목', '10번 게시글 내용', 2, '2025-03-17 01:11:20', 0, 10)
     , ('11번 게시글 제목', '11번 게시글 내용', 2, '2025-03-17 01:11:21', 0, 11)
     , ('12번 게시글 제목', '12번 게시글 내용', 1, '2025-03-17 01:11:22', 0, 12)
     , ('13번 게시글 제목', '13번 게시글 내용', 1, '2025-03-17 01:11:23', 0, 13)
     , ('14번 게시글 제목', '14번 게시글 내용', 2, '2025-03-17 01:11:24', 0, 14)
     , ('15번 게시글 제목', '15번 게시글 내용', 2, '2025-03-17 01:11:25', 0, 15)
     , ('16번 게시글 제목', '16번 게시글 내용', 1, '2025-03-17 01:11:26', 0, 16)
     , ('17번 게시글 제목', '17번 게시글 내용', 1, '2025-03-17 01:11:27', 0, 17)
     , ('18번 게시글 제목', '18번 게시글 내용', 2, '2025-03-17 01:11:28', 0, 18)
     , ('19번 게시글 제목', '19번 게시글 내용', 2, '2025-03-17 01:11:29', 0, 19)
     , ('20번 게시글 제목', '20번 게시글 내용', 1, '2025-03-17 01:11:30', 0, 20)
     , ('21번 게시글 제목', '21번 게시글 내용', 1, '2025-03-17 01:11:31', 0, 21)
     , ('22번 게시글 제목', '22번 게시글 내용', 2, '2025-03-17 01:11:32', 0, 22)
     , ('23번 게시글 제목', '23번 게시글 내용', 2, '2025-03-17 01:11:33', 0, 23)
     , ('24번 게시글 제목', '24번 게시글 내용', 1, '2025-03-17 01:11:34', 0, 24)
     , ('25번 게시글 제목', '25번 게시글 내용', 1, '2025-03-17 01:11:35', 0, 25)
     , ('26번 게시글 제목', '26번 게시글 내용', 2, '2025-03-17 01:11:36', 0, 26)
     , ('27번 게시글 제목', '27번 게시글 내용', 2, '2025-03-17 01:11:37', 0, 27)
     , ('28번 게시글 제목', '28번 게시글 내용', 1, '2025-03-17 01:11:38', 0, 28)
     , ('29번 게시글 제목', '29번 게시글 내용', 1, '2025-03-17 01:11:39', 0, 29)
     , ('30번 게시글 제목', '30번 게시글 내용', 2, '2025-03-17 01:11:40', 0, 30)
     , ('1번 회원 1번째 게시글 제목', '1번 회원 1번째 게시글 내용', 1, '2025-03-17 01:11:41', 0, 1)
     , ('1번 회원 2번째 게시글 제목', '1번 회원 2번째 게시글 내용', 1, '2025-03-17 02:11:41', 0, 1)
     , ('1번 회원 3번째 게시글 제목', '1번 회원 3번째 게시글 내용', 1, '2025-03-17 03:11:41', 0, 1)
     , ('1번 회원 4번째 게시글 제목', '1번 회원 4번째 게시글 내용', 1, '2025-03-17 04:11:41', 0, 1)
     , ('1번 회원 5번째 게시글 제목', '1번 회원 5번째 게시글 내용', 1, '2025-03-17 05:11:41', 0, 1)
     , ('1번 회원 6번째 게시글 제목', '1번 회원 6번째 게시글 내용', 1, '2025-03-17 06:11:41', 0, 1)
     , ('1번 회원 7번째 게시글 제목', '1번 회원 7번째 게시글 내용', 1, '2025-03-17 07:11:41', 0, 1)
     , ('1번 회원 8번째 게시글 제목', '1번 회원 8번째 게시글 내용', 1, '2025-03-17 08:11:41', 0, 1)
     , ('1번 회원 9번째 게시글 제목', '1번 회원 9번째 게시글 내용', 1, '2025-03-17 09:11:41', 0, 1)
     , ('1번 회원 10번째 게시글 제목', '1번 회원 10번째 게시글 내용', 1, '2025-03-17 10:11:41', 0, 1);

-- 댓글 테이블 더미 데이터

INSERT INTO COMMENT (is_adopted, upload_at, content, status, post_id, root_comment_id, member_id)
VALUES (NULL, '2025-03-17 01:11:11', '1번 댓글 내용', 0, 1, NULL, 1)
     , (NULL, '2025-03-17 01:11:12', '2번 댓글 내용', 0, 1, 1, 2)
     , (NULL, '2025-03-17 01:11:13', '3번 댓글 내용', 0, 1, 2, 3)
     , (NULL, '2025-03-17 01:11:14', '4번 댓글 내용', 0, 2, NULL, 4)
     , (NULL, '2025-03-17 01:11:15', '5번 댓글 내용', 0, 2, 4, 5)
     , (NULL, '2025-03-17 01:11:16', '6번 댓글 내용', 0, 2, 4, 6)
     , (NULL, '2025-03-17 01:11:17', '7번 댓글 내용', 0, 3, NULL, 7)
     , (NULL, '2025-03-17 01:11:18', '8번 댓글 내용', 0, 3, 7, 8)
     , (NULL, '2025-03-17 01:11:19', '9번 댓글 내용', 0, 3, NULL, 9)
     , (NULL, '2025-03-17 01:11:20', '10번 댓글 내용', 0, 4, NULL, 10)
     , (NULL, '2025-03-17 01:11:21', '11번 댓글 내용', 0, 4, NULL, 11)
     , (NULL, '2025-03-17 01:11:22', '12번 댓글 내용', 0, 4, NULL, 12)
     , (NULL, '2025-03-17 01:11:23', '13번 댓글 내용', 0, 5, NULL, 13)
     , (NULL, '2025-03-17 01:11:24', '14번 댓글 내용', 0, 5, NULL, 14)
     , (NULL, '2025-03-17 01:11:25', '15번 댓글 내용', 0, 5, NULL, 15)
     , (NULL, '2025-03-17 01:11:26', '16번 댓글 내용', 0, 6, NULL, 16)
     , (NULL, '2025-03-17 01:11:27', '17번 댓글 내용', 0, 6, NULL, 17)
     , ('N', '2025-03-17 01:11:28', '18번 댓글 내용', 0, 7, NULL, 18)
     , ('N', '2025-03-17 01:11:29', '19번 댓글 내용', 0, 7, 18, 19)
     , ('N', '2025-03-17 01:11:30', '20번 댓글 내용', 0, 8, NULL, 20)
     , ('N', '2025-03-17 01:11:31', '21번 댓글 내용', 0, 9, NULL, 21)
     , ('N', '2025-03-17 01:11:32', '22번 댓글 내용', 0, 10, NULL, 22)
     , ('N', '2025-03-17 01:11:33', '23번 댓글 내용', 0, 10, NULL, 23)
     , ('N', '2025-03-17 01:11:34', '24번 댓글 내용', 0, 11, NULL, 24)
     , ('N', '2025-03-17 01:11:35', '25번 댓글 내용', 0, 11, NULL, 25)
     , ('Y', '2025-03-17 01:11:36', '26번 댓글 내용', 0, 7, NULL, 26)
     , ('Y', '2025-03-17 01:11:37', '27번 댓글 내용', 0, 8, NULL, 27)
     , ('Y', '2025-03-17 01:11:38', '28번 댓글 내용', 0, 9, NULL, 28)
     , ('Y', '2025-03-17 01:11:39', '29번 댓글 내용', 0, 10, 23, 29)
     , ('Y', '2025-03-17 01:11:40', '30번 댓글 내용', 0, 11, NULL, 30)
     , (NULL, '2025-03-17 01:11:41', '1번 회원 1번째 댓글 내용', 0, 1, NULL, 1)
     , (NULL, '2025-03-17 01:11:42', '1번 회원 2번째 댓글 내용', 0, 1, NULL, 1)
     , (NULL, '2025-03-17 01:11:43', '1번 회원 3번째 댓글 내용', 0, 1, NULL, 1)
     , (NULL, '2025-03-17 01:11:44', '1번 회원 4번째 댓글 내용', 0, 1, NULL, 1)
     , (NULL, '2025-03-17 01:11:45', '1번 회원 5번째 댓글 내용', 0, 1, NULL, 1)
     , (NULL, '2025-03-17 01:11:46', '1번 회원 6번째 댓글 내용', 0, 1, NULL, 1)
     , (NULL, '2025-03-17 01:11:47', '1번 회원 7번째 댓글 내용', 0, 1, NULL, 1)
     , (NULL, '2025-03-17 01:11:48', '1번 회원 8번째 댓글 내용', 0, 1, NULL, 1)
     , (NULL, '2025-03-17 01:11:49', '1번 회원 9번째 댓글 내용', 0, 1, NULL, 1)
     , (NULL, '2025-03-17 01:11:50', '1번 회원 10번째 댓글 내용', 0, 1, NULL, 1);

-- 게시글 사진 더미 데이터

INSERT INTO POST_IMAGE (image_path, renamed_name, is_thumbnail, post_id)
VALUES ('1번 게시글 사진 경로', '1번 게시글 사진 이름', 'Y', 1)
     , ('2번 게시글 사진 경로', '2번 게시글 사진 이름', 'N', 1)
     , ('3번 게시글 사진 경로', '3번 게시글 사진 이름', 'N', 1)
     , ('4번 게시글 사진 경로', '4번 게시글 사진 이름', 'N', 2)
     , ('5번 게시글 사진 경로', '5번 게시글 사진 이름', 'Y', 2)
     , ('6번 게시글 사진 경로', '6번 게시글 사진 이름', 'N', 2)
     , ('7번 게시글 사진 경로', '7번 게시글 사진 이름', 'N', 3)
     , ('8번 게시글 사진 경로', '8번 게시글 사진 이름', 'N', 3)
     , ('9번 게시글 사진 경로', '9번 게시글 사진 이름', 'Y', 3)
     , ('10번 게시글 사진 경로', '10번 게시글 사진 이름', 'Y', 4)
     , ('11번 게시글 사진 경로', '11번 게시글 사진 이름', 'N', 4)
     , ('12번 게시글 사진 경로', '12번 게시글 사진 이름', 'N', 4)
     , ('13번 게시글 사진 경로', '13번 게시글 사진 이름', 'N', 5)
     , ('14번 게시글 사진 경로', '14번 게시글 사진 이름', 'Y', 5)
     , ('15번 게시글 사진 경로', '15번 게시글 사진 이름', 'N', 5)
     , ('16번 게시글 사진 경로', '16번 게시글 사진 이름', 'N', 6)
     , ('17번 게시글 사진 경로', '17번 게시글 사진 이름', 'N', 6)
     , ('18번 게시글 사진 경로', '18번 게시글 사진 이름', 'Y', 6)
     , ('19번 게시글 사진 경로', '19번 게시글 사진 이름', 'Y', 7)
     , ('20번 게시글 사진 경로', '20번 게시글 사진 이름', 'N', 7)
     , ('21번 게시글 사진 경로', '21번 게시글 사진 이름', 'N', 7)
     , ('22번 게시글 사진 경로', '22번 게시글 사진 이름', 'N', 8)
     , ('23번 게시글 사진 경로', '23번 게시글 사진 이름', 'Y', 8)
     , ('24번 게시글 사진 경로', '24번 게시글 사진 이름', 'N', 8)
     , ('25번 게시글 사진 경로', '25번 게시글 사진 이름', 'N', 9)
     , ('26번 게시글 사진 경로', '26번 게시글 사진 이름', 'N', 9)
     , ('27번 게시글 사진 경로', '27번 게시글 사진 이름', 'Y', 9)
     , ('28번 게시글 사진 경로', '28번 게시글 사진 이름', 'N', 10)
     , ('29번 게시글 사진 경로', '29번 게시글 사진 이름', 'Y', 10)
     , ('30번 게시글 사진 경로', '30번 게시글 사진 이름', 'N', 10);
```

</details>
<br>

## 🪄 MSA 아키텍처

<img src = "https://github.com/user-attachments/assets/8e83eca5-0de1-489c-bea3-4c0e38546a04" width = "900"/>

<br><br>

## 🛜 Server
### 1. Eureka 서버 + Config 서버 + GateWay

<img src = "https://github.com/user-attachments/assets/3a7bc440-cd8a-4bfa-a96d-c2fbeaf1b5e8" width = "900"/>

### 2. Actuator
<img src = "https://github.com/user-attachments/assets/27595430-58c5-4ce9-b3cb-9bfd76910902" width = "900"/>

<br>

## 🚩 단위 테스트
### - Member Service
<img src = "https://github.com/user-attachments/assets/b9eb52b5-e6be-4469-bfa1-870179fd2726" width = "600" />
<br>

### - Matching Service
<img src = "https://github.com/user-attachments/assets/1f4a94d8-29cc-4d84-9c1d-4756f081d6f7" width = "600" />
<br>

### - Core
#### Mission, Matching, Post, ProjectRoom, Report
<img src = "https://github.com/user-attachments/assets/6cf1beed-6ebf-440c-9b8c-728fd1ebddbb" width = "600" />
<br>

## 📱 API 테스트
### 👤 회원

<details>
     <summary><b>회원</b></summary>
     <details>
          <summary>회원 가입</summary>
          <details>
	          <summary>성공</summary>
	          <p alian="center">
	          <img src="https://github.com/BE14-NoB/Pick/blob/main/postman/member/%ED%9A%8C%EC%9B%90%EA%B0%80%EC%9E%85(%EC%84%B1%EA%B3%B5%20200).png" width = "600"/>
	          </p>
          </details>
          <details>
	          <summary>실패 400 이메일 중복</summary>
	          <p alian="center">
	          <img src="https://github.com/BE14-NoB/Pick/blob/main/postman/member/%ED%9A%8C%EC%9B%90%EA%B0%80%EC%9E%85(%EC%8B%A4%ED%8C%A8%20400%20%EC%9D%B4%EB%A9%94%EC%9D%BC%20%EC%A4%91%EB%B3%B5).png" width = "600" />
	          </p>
          </details>
     </details>
     <details>
	     <summary>로그인(성공 시 토큰 반환)</summary>
	     <p alian="center">
	     <img src="postman/member/로그인최종수정용.png" width = "600"/>
	     </p>
     </details>
     <details>
	     <summary>로그아웃(토큰 제거)</summary>
	     <p alian="center">
	     <img src="https://github.com/BE14-NoB/Pick/blob/main/postman/member/%EB%A1%9C%EA%B7%B8%EC%95%84%EC%9B%83(%EC%84%B1%EA%B3%B5%20%ED%86%A0%ED%81%B0%20%EC%A0%9C%EA%B1%B0).png" width = "600"/>
	     </p>
     </details>
     <details>
	     <summary>회원 정보 수정</summary>
          <details>
               <summary>수정1</summary>
	          <p alian="center">
	          <img src="https://github.com/BE14-NoB/Pick/blob/main/postman/member/%ED%9A%8C%EC%9B%90%20%EC%A0%95%EB%B3%B4%20%EC%88%98%EC%A0%95(%EC%84%B1%EA%B3%B5%201).png" width = "600"/>
	          </p>
          </details>
          <details>
               <summary>수정2</summary>
	          <p alian="center">
	          <img src="https://github.com/BE14-NoB/Pick/blob/main/postman/member/%ED%9A%8C%EC%9B%90%20%EC%A0%95%EB%B3%B4%20%EC%88%98%EC%A0%95(%EC%84%B1%EA%B3%B5%202).png" width = "600"/>
	          </p>
          </details>
     </details>
     <details>
	     <summary>비밀번호 찾기</summary>
	     <p alian="center">
	     <img src="https://github.com/BE14-NoB/Pick/blob/main/postman/member/%EB%B9%84%EB%B0%80%EB%B2%88%ED%98%B8%20%EC%B0%BE%EA%B8%B0(%EC%84%B1%EA%B3%B5).png" width = "600"/>
	     </p>
     </details>
     <details>
	     <summary>이메일 찾기</summary>
	     <p alian="center">
	     <img src="https://github.com/BE14-NoB/Pick/blob/main/postman/member/%EC%9D%B4%EB%A9%94%EC%9D%BC%20%EC%B0%BE%EA%B8%B0(%EC%84%B1%EA%B3%B5).png" width = "600"/>
	     </p>
     </details>
     <details>
	     <summary>회원 전체 조회</summary>
	     <p alian="center">
	     <img src="https://github.com/BE14-NoB/Pick/blob/main/postman/member/%ED%9A%8C%EC%9B%90%20%EC%A0%84%EC%B2%B4%20%EC%A1%B0%ED%9A%8C(%EC%84%B1%EA%B3%B5).png" width = "600"/>
	     </p>
     </details>
     <details>
	     <summary>ID로 회원 조회</summary>
	     <p alian="center">
	     <img src="https://github.com/BE14-NoB/Pick/blob/main/postman/member/%ED%8A%B9%EC%A0%95%20%ED%9A%8C%EC%9B%90%20%EC%A1%B0%ED%9A%8C(%EC%84%B1%EA%B3%B5).png" width = "600"/>
	     </p>
     </details>
     <details>
	     <summary>이메일 중복 체크</summary>
          <details>
               <summary>사용 가능 이메일</summary>
     	     <p alian="center">
     	     <img src="https://github.com/BE14-NoB/Pick/blob/main/postman/member/%EC%9D%B4%EB%A9%94%EC%9D%BC%20%EC%A4%91%EB%B3%B5%20%EA%B2%80%EC%82%AC%20(%EC%84%B1%EA%B3%B5%2C%20%EC%82%AC%EC%9A%A9%EA%B0%80%EB%8A%A5).png" width = "600"/>
     	     </p>
          </details>
          <details>
               <summary>사용 불가능 이메일</summary>
     	     <p alian="center">
     	     <img src="https://github.com/BE14-NoB/Pick/blob/main/postman/member/%EC%9D%B4%EB%A9%94%EC%9D%BC%20%EC%A4%91%EB%B3%B5%20%EA%B2%80%EC%82%AC%20(%EC%84%B1%EA%B3%B5%2C%20%EC%82%AC%EC%9A%A9%20%EB%B6%88%EA%B0%80%EB%8A%A5).png" width = "600"/>
               </p>
          </details>
     </details>
     <details>
	     <summary>전화번호 중복 체크</summary>
          <details>
               <summary>사용 가능 전화번호</summary>
     	     <p alian="center">
     	     <img src="https://github.com/BE14-NoB/Pick/blob/main/postman/member/%EC%A0%84%ED%99%94%EB%B2%88%ED%98%B8%20%EC%A4%91%EB%B3%B5%20%EC%B2%B4%ED%81%AC(%EC%84%B1%EA%B3%B5%2C%20%EC%82%AC%EC%9A%A9%EA%B0%80%EB%8A%A5).png" width = "600"/>
     	     </p>
          </details>
          <details>
               <summary>사용 불가 전화번호</summary>
     	     <p alian="center">
     	     <img src="https://github.com/BE14-NoB/Pick/blob/main/postman/member/%EC%A0%84%ED%99%94%EB%B2%88%ED%98%B8%20%EC%A4%91%EB%B3%B5%20%EC%B2%B4%ED%81%AC(%EC%84%B1%EA%B3%B5%2C%20%EC%82%AC%EC%9A%A9%20%EB%B6%88%EA%B0%80%EB%8A%A5).png" width = "600"/>
               </p>
          </details>
     </details>
     <details>
	     <summary>회원 상태 조회</summary>
	     <p alian="center">
	     <img src="https://github.com/BE14-NoB/Pick/blob/main/postman/member/%ED%9A%8C%EC%9B%90%20%EC%83%81%ED%83%9C%20%EC%A1%B0%ED%9A%8C(%EC%84%B1%EA%B3%B5).png" width = "600"/>
	     </p>
     </details>
          <details>
	     <summary>회원 권한 조회</summary>
	     <p alian="center">
	     <img src="https://github.com/BE14-NoB/Pick/blob/main/postman/member/%ED%9A%8C%EC%9B%90%20%EA%B6%8C%ED%95%9C%20%EC%A1%B0%ED%9A%8C(%EC%84%B1%EA%B3%B5).png" width = "600"/>
	     </p>
     </details>
</details>

<details>
     <summary><b>프로필</b></summary>
     <details>
          <summary>회원 프로필 조회</summary>
          <p align="center">
          <img src="https://github.com/BE14-NoB/Pick/blob/main/postman/member/%ED%9A%8C%EC%9B%90%20%ED%94%84%EB%A1%9C%ED%95%84%20%EC%A1%B0%ED%9A%8C(%EC%84%B1%EA%B3%B5).png" width = "600"/>
          </p>
     </details>
     <details>
          <summary>회원 프로필 정보 수정</summary>
          <p align="center">
          <img src="https://github.com/BE14-NoB/Pick/blob/main/postman/member/%ED%9A%8C%EC%9B%90%20%ED%94%84%EB%A1%9C%ED%95%84%20%EC%A0%95%EB%B3%B4%20%EC%88%98%EC%A0%95(%EC%84%B1%EA%B3%B5).png" width = "600"/>
          </p>
     </details>
</details>

<details>
     <summary><b>프로그래밍 언어</b></summary>
     <details>
          <summary>프로그래밍 언어 조회</summary>
          <p align="center">
          <img src="https://github.com/BE14-NoB/Pick/blob/main/postman/member/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D%20%EC%96%B8%EC%96%B4%20%EC%A1%B0%ED%9A%8C(%EC%84%B1%EA%B3%B5).png" width = "600"/>
          </p>
     </details>
     <details>
          <summary>프로그래밍 언어 추가</summary>
          <details>
               <summary>성공(권한 있음)</summary>
               <p align="center">
               <img src="https://github.com/BE14-NoB/Pick/blob/main/postman/member/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D%20%EC%96%B8%EC%96%B4%20%EC%B6%94%EA%B0%80(%EC%84%B1%EA%B3%B5%20%EA%B6%8C%ED%95%9C%EC%9E%88%EC%9D%8C).png" width = "600"/>
               </p>
          </details>
          <details>
               <summary>실패(권한 없음)</summary>
               <p align="center">
               <img src="https://github.com/BE14-NoB/Pick/blob/main/postman/member/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D%20%EC%96%B8%EC%96%B4%20%EC%B6%94%EA%B0%80(%EC%8B%A4%ED%8C%A8%2C%20%EA%B6%8C%ED%95%9C%EC%97%86%EC%9D%8C).png" width = "600"/>
               </p>
          </details>   
     </details>
     <details>
	     <summary>프로그래밍 언어 삭제</summary>
	     <p alian="center">
	     <img src="https://github.com/BE14-NoB/Pick/blob/main/postman/member/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D%20%EC%96%B8%EC%96%B4%20%EC%82%AD%EC%A0%9C(%EC%84%B1%EA%B3%B5%20%EA%B6%8C%ED%95%9C%EC%9E%88%EC%9D%8C).png" width = "600"/>
	     </p>
     </details>
     <details>
	     <summary>회원별 사용 언어 조회</summary>
	     <p alian="center">
	     <img src="" width = "600"/>
		     기능 개발 예정
	     </p>
     </details>
     <details>
	     <summary>회원별 사용언어 추가</summary>
	     <p alian="center">
	     <img src="" width = "600"/>
		     기능 개발 예정
	     </p>
     </details>
     <details>
	     <summary>회원별 사용언어 수정</summary>
	     <p alian="center">
	     <img src="" width = "600"/>
		     기능 개발 예정
	     </p>
     </details>
</details>

### 🔔 미션
<details>
	<summary><b>도전과제</b></summary>
	<details>
		<summary>도전과제 목록 전체 조회</summary>
		<p alian="center">
		<img src="https://github.com/BE14-NoB/Pick/blob/main/postman/achievement/%EB%8F%84%EC%A0%84%EA%B3%BC%EC%A0%9C%20%EB%AA%A9%EB%A1%9D%20%EC%A0%84%EC%B2%B4%20%EC%A1%B0%ED%9A%8C.jpg" width="600" />
		</p>
	</details>
	<details>
		<summary>도전과제 추가</summary>
		<p alian="center">
		<img src="https://github.com/BE14-NoB/Pick/blob/main/postman/achievement/%EB%8F%84%EC%A0%84%EA%B3%BC%EC%A0%9C%20%EC%B6%94%EA%B0%80.jpg" width="600" />
		</p>
	</details>
	<details>
		<summary>도전과제 수정</summary>
		<p alian="center">
		<img src="https://github.com/BE14-NoB/Pick/blob/main/postman/achievement/%EB%8F%84%EC%A0%84%EA%B3%BC%EC%A0%9C%20%EC%88%98%EC%A0%95.jpg" width="600" />
		</p>
	</details>
	<details>
		<summary>도전과제 삭제</summary>
		<p alian="center">
		<img src="https://github.com/BE14-NoB/Pick/blob/main/postman/achievement/%EB%8F%84%EC%A0%84%EA%B3%BC%EC%A0%9C%20%EC%82%AD%EC%A0%9C.jpg" width="600" />
		</p>
	</details>
	<details>
		<summary>도전과제 진행도 증가</summary>
		<p alian="center">
		<img src="https://github.com/BE14-NoB/Pick/blob/main/postman/achievement/%EB%8F%84%EC%A0%84%EA%B3%BC%EC%A0%9C%20%EC%A7%84%ED%96%89%EB%8F%84%20%EC%A6%9D%EA%B0%80.jpg" width="600" />
		</p>
	</details>
	<details>
		<summary>회원별 도전과제 목록 조회</summary>
		<p alian="center">
		<img src="https://github.com/BE14-NoB/Pick/blob/main/postman/achievement/%ED%9A%8C%EC%9B%90%EB%B3%84%20%EB%8F%84%EC%A0%84%EA%B3%BC%EC%A0%9C%20%EB%AA%A9%EB%A1%9D%20%EC%A1%B0%ED%9A%8C.jpg" width="600" />
		</p>
	</details>
	<details>
		<summary>회원이 달성한 도전과제 조회</summary>
		<p alian="center">
		<img src="https://github.com/BE14-NoB/Pick/blob/main/postman/achievement/%ED%9A%8C%EC%9B%90%EC%9D%B4%20%EB%8B%AC%EC%84%B1%ED%95%9C%20%EB%8F%84%EC%A0%84%EA%B3%BC%EC%A0%9C%20%EC%A1%B0%ED%9A%8C.jpg" width="600" />
		</p>
	</details>			
	<details>
		<summary>회원이 달성하지 못한 도전과제 조회</summary>
		<p alian="center">
		<img src="https://github.com/BE14-NoB/Pick/blob/main/postman/achievement/%ED%9A%8C%EC%9B%90%EC%9D%B4%20%EB%8B%AC%EC%84%B1%ED%95%98%EC%A7%80%20%EB%AA%BB%ED%95%9C%20%EB%8F%84%EC%A0%84%EA%B3%BC%EC%A0%9C%20%EC%A1%B0%ED%9A%8C.jpg" width="600" />
		</p>
	</details>
</details>

<!-- 뱃지 -->
<details>
	<summary><b>뱃지</b></summary>
	<details>
		<summary>뱃지 목록 전체 조회</summary>
		<p alian="center">
		<img src="https://github.com/BE14-NoB/Pick/blob/main/postman/badge/%EB%B1%83%EC%A7%80%20%EB%AA%A9%EB%A1%9D%20%EC%A0%84%EC%B2%B4%20%EC%A1%B0%ED%9A%8C.jpg" width="600" />
		</p>
	</details>
	<details>
		<summary>뱃지 추가</summary>
		<p alian="center">
		<img src="https://github.com/BE14-NoB/Pick/blob/main/postman/badge/%EB%B1%83%EC%A7%80%20%EC%B6%94%EA%B0%80.jpg" width="600" />
		</p>
	</details>
	<details>
		<summary>뱃지 수정</summary>
		<p alian="center">
		<img src="https://github.com/BE14-NoB/Pick/blob/main/postman/badge/%EB%B1%83%EC%A7%80%20%EC%88%98%EC%A0%95.jpg" width="600" />
		</p>
	</details>
	<details>
		<summary>뱃지 삭제</summary>
		<p alian="center">
		<img src="https://github.com/BE14-NoB/Pick/blob/main/postman/badge/%EB%B1%83%EC%A7%80%20%EC%82%AD%EC%A0%9C.jpg" width="600" />
		</p>
	</details>			
	<details>
		<summary>뱃지 부여 및 레벨 증가</summary>
		<p alian="center">
		<img src="https://github.com/BE14-NoB/Pick/blob/main/postman/badge/%EB%B1%83%EC%A7%80%EB%B6%80%EC%97%AC%20%EB%B0%8F%20%EB%A0%88%EB%B2%A8%20%EC%A6%9D%EA%B0%80.jpg" width="600" />
		</p>
	</details>
	<details>
		<summary>챌린지별 뱃지 조회</summary>
		<p alian="center">
		<img src="https://github.com/BE14-NoB/Pick/blob/main/postman/badge/%EC%B1%8C%EB%A6%B0%EC%A7%80%EB%B3%84%20%EB%B1%83%EC%A7%80%20%EC%A1%B0%ED%9A%8C.jpg" width="600" />
		</p>
	</details>	
	<details>
		<summary>회원이 획득한 뱃지 조회</summary>
		<p alian="center">
		<img src="https://github.com/BE14-NoB/Pick/blob/main/postman/badge/%ED%9A%8C%EC%9B%90%EC%9D%B4%20%EB%B3%B4%EC%9C%A0%ED%95%98%EA%B3%A0%EC%9E%88%EB%8A%94%20%EB%B1%83%EC%A7%80%20%EC%A1%B0%ED%9A%8C.jpg" width="600" />
		</p>
	</details>	
</details>

<!-- 일일미션 -->
<details>
	<summary><b>일일미션</b></summary>
	<details>
		<summary>일일미션 목록 전체 조회</summary>
		<p alian="center">
		<img src="https://github.com/BE14-NoB/Pick/blob/main/postman/dailymission/%EC%9D%BC%EC%9D%BC%EB%AF%B8%EC%85%98%20%EB%AA%A9%EB%A1%9D%20%EC%A0%84%EC%B2%B4%20%EC%A1%B0%ED%9A%8C.jpg" width="600" />
		</p>
	</details>	
	<details>
		<summary>일일미션 추가</summary>
		<p alian="center">
		<img src="https://github.com/BE14-NoB/Pick/blob/main/postman/dailymission/%EC%9D%BC%EC%9D%BC%EB%AF%B8%EC%85%98%20%EC%B6%94%EA%B0%80.jpg" width="600" />
		</p>
	</details>	
	<details>
		<summary>일일미션 수정</summary>
		<p alian="center">
		<img src="https://github.com/BE14-NoB/Pick/blob/main/postman/dailymission/%EC%9D%BC%EC%9D%BC%EB%AF%B8%EC%85%98%20%EC%88%98%EC%A0%95.jpg" width="600" />
		</p>
	</details>		
	<details>
		<summary>일일미션 삭제</summary>
		<p alian="center">
		<img src="https://github.com/BE14-NoB/Pick/blob/main/postman/dailymission/%EC%9D%BC%EC%9D%BC%EB%AF%B8%EC%85%98%20%EC%82%AD%EC%A0%9C.jpg" width="600" />
		</p>
	</details>		
	<details>
		<summary>회원에게 일일미션 부여</summary>
		<p alian="center">
		<img src="https://github.com/BE14-NoB/Pick/blob/main/postman/dailymission/%ED%9A%8C%EC%9B%90%EC%97%90%EA%B2%8C%20%EC%9D%BC%EC%9D%BC%EB%AF%B8%EC%85%98%20%EB%B6%80%EC%97%AC.jpg" width="600" />
		</p>
	</details>		
	<details>
		<summary>회원별 일일미션 목록 조회</summary>
		<p alian="center">
		<img src="https://github.com/BE14-NoB/Pick/blob/main/postman/dailymission/%ED%9A%8C%EC%9B%90%EB%B3%84%20%EC%9D%BC%EC%9D%BC%EB%AF%B8%EC%85%98%20%EB%AA%A9%EB%A1%9D%20%EC%A1%B0%ED%9A%8C.jpg" width="600" />
		</p>
	</details>		
	<details>
		<summary>회원이 수행한 일일미션 조회</summary>
		<p alian="center">
		<img src="https://github.com/BE14-NoB/Pick/blob/main/postman/dailymission/%ED%9A%8C%EC%9B%90%EC%9D%B4%20%EC%88%98%ED%96%89%ED%95%9C%20%EC%9D%BC%EC%9D%BC%EB%AF%B8%EC%85%98%20%EC%A1%B0%ED%9A%8C.jpg" width="600" />
		</p>
	</details>		
	<details>
		<summary>회원이 수행하지 못한 일일미션 조회</summary>
		<p alian="center">
		<img src="https://github.com/BE14-NoB/Pick/blob/main/postman/dailymission/%ED%9A%8C%EC%9B%90%EC%9D%B4%20%EC%88%98%ED%96%89%ED%95%98%EC%A7%80%20%EB%AA%BB%ED%95%9C%20%EC%9D%BC%EC%9D%BC%EB%AF%B8%EC%85%98%20%EC%A1%B0%ED%9A%8C.jpg" width="600" />
		</p>
	</details>
</details>

### 📜 게시글
<!-- 게시글 -->
<details>
	<summary><b>게시판</b></summary>
	<details>
		<summary>게시글 조회</summary>
		<p alian="center">
		<img src="https://github.com/BE14-NoB/Pick/blob/main/postman/post/success/post-01-%EC%82%AD%EC%A0%9C%2C%20%EA%B7%9C%EC%A0%9C%EB%90%98%EC%A7%80%20%EC%95%8A%EC%9D%80%20%EA%B8%80%20%EC%A1%B0%ED%9A%8C.png"  width="600"/>
		</p>
	</details>
	<details>
		<summary>단일 글, 댓글 사진 조회</summary>
		<p alian="center">
		<img src="https://github.com/BE14-NoB/Pick/blob/main/postman/post/success/post-02-%EB%8B%A8%EC%9D%BC%20%EA%B8%80%20%EB%B0%8F%20%ED%95%B4%EB%8B%B9%20%EB%8C%93%EA%B8%80%2C%20%EC%82%AC%EC%A7%84%20%EC%A1%B0%ED%9A%8C-1-1%EB%B2%88%20%EA%B2%8C%EC%8B%9C%EA%B8%80%20%EC%A1%B0%ED%9A%8C.png"  width="600"/>
		</p>
	</details>
	<details>
		<summary>제목으로 검색</summary>
		<p alian="center">
		<img src="https://github.com/BE14-NoB/Pick/blob/main/postman/post/success/post-03-%EA%B2%8C%EC%8B%9C%EA%B8%80%20%EC%A0%9C%EB%AA%A9%EC%9C%BC%EB%A1%9C%20%EC%A1%B0%ED%9A%8C-1-1%EB%B2%88%EC%9C%BC%EB%A1%9C%20%EA%B2%80%EC%83%89.png"  width="600"/>
		</p>
	</details>
	<details>
		<summary>카테고리 별 조회</summary>
		<p alian="center">
		<img src="https://github.com/BE14-NoB/Pick/blob/main/postman/post/success/post-04-%EA%B2%8C%EC%8B%9C%EA%B8%80%20%EB%AA%A9%EB%A1%9D%EC%97%90%EC%84%9C%20%EC%B9%B4%ED%85%8C%EA%B3%A0%EB%A6%AC%20%EB%B3%84%EB%A1%9C%20%EC%A1%B0%ED%9A%8C.png"  width="600"/>
		</p>
	</details>
	<details>
		<summary>게시글 등록</summary>
		<p alian="center">
		<img src="https://github.com/BE14-NoB/Pick/blob/main/postman/post/success/post-05-%EA%B2%8C%EC%8B%9C%EA%B8%80%20%EB%93%B1%EB%A1%9D.png"  width="600"/>
		</p>
	</details>
	<details>
		<summary>게시글 삭제</summary>
		<details>
			<summary>규제에 의한 삭제</summary>
			<p alian="center">
			<img src="https://github.com/BE14-NoB/Pick/blob/main/postman/post/success/post-06-%EA%B2%8C%EC%8B%9C%EA%B8%80%20%EC%82%AD%EC%A0%9C(%EA%B7%9C%EC%A0%9C%EB%90%9C%20%EA%B8%80).png"  width="600"/>
			</p>
		</details>
		<details>
			<summary>삭제 성공</summary>
			<p alian="center">
			<img src="https://github.com/BE14-NoB/Pick/blob/main/postman/post/success/post-06-%EA%B2%8C%EC%8B%9C%EA%B8%80%20%EC%82%AD%EC%A0%9C(%EC%82%AD%EC%A0%9C%20%EC%84%B1%EA%B3%B5).png"  width="600"/>
			</p>
		</details>
		<details>
			<summary>없는 게시글 삭제 시도</summary>
			<p alian="center">
			<img src="https://github.com/BE14-NoB/Pick/blob/main/postman/post/success/post-06-%EA%B2%8C%EC%8B%9C%EA%B8%80%20%EC%82%AD%EC%A0%9C(%EC%97%86%EB%8A%94%20%EA%B8%80).png"  width="600"/>
			</p>
		</details>
		<details>
			<summary>이미 삭제된 게시글 삭제 시도</summary>
			<p alian="center">
			<img src="https://github.com/BE14-NoB/Pick/blob/main/postman/post/success/post-06-%EA%B2%8C%EC%8B%9C%EA%B8%80%20%EC%82%AD%EC%A0%9C(%EC%9D%B4%EB%AF%B8%20%EC%82%AD%EC%A0%9C%EB%90%9C%20%EA%B8%80).png"  width="600"/>
			</p>
		</details>
	</details>
</details>

### 🤼 매칭
<details>
<summary><b>매칭</b></summary>
     
<details>
     <summary>전체 매칭방 목록 조회</summary>
     <p align="center">
          <img src="https://github.com/BE14-NoB/Pick/blob/main/postman/matching/%EB%A7%A4%EC%B9%AD%EB%B0%A9%20%EC%A0%84%EC%B2%B4%20%EC%A1%B0%ED%9A%8C.png"  width="600"/>
     </p>
</details>

<details>
     <summary>매칭방 id로 매칭방 조회</summary>
     <p align="center">
       <img src="https://github.com/BE14-NoB/Pick/blob/main/postman/matching/%EB%A7%A4%EC%B9%AD%EB%B0%A9%20id%EB%A1%9C%20%EC%A1%B0%ED%9A%8C.png"  width="600"/>
     </p>
</details>

<details>
     <summary>기술 카테고리 id로 매칭방 조회</summary>
     <p align="center">
       <img src="https://github.com/BE14-NoB/Pick/blob/main/postman/matching/%EC%B9%B4%ED%85%8C%EA%B3%A0%EB%A6%AC%20id%EB%A1%9C%20%EB%A7%A4%EC%B9%AD%EB%B0%A9%20%EC%A1%B0%ED%9A%8C.png"  width="600"/>
     </p>
</details>

<details>
     <summary>매칭방 등록</summary>
     <p align="center">
       <img src="https://github.com/BE14-NoB/Pick/blob/main/postman/matching/%EB%A7%A4%EC%B9%AD%EB%B0%A9%20%EB%93%B1%EB%A1%9D.png"  width="600"/>
     </p>
</details>

<details>
     <summary>매칭방 수정</summary>
     <p align="center">
       <img src="https://github.com/BE14-NoB/Pick/blob/main/postman/matching/%EB%A7%A4%EC%B9%AD%EB%B0%A9%20%EC%88%98%EC%A0%95.png"  width="600"/>
     </p>
</details>

<details>
     <summary>매칭방 삭제</summary>
     <p align="center">
       <img src="https://github.com/BE14-NoB/Pick/blob/main/postman/matching/%EB%A7%A4%EC%B9%AD%EB%B0%A9%20%EC%82%AD%EC%A0%9C.png"  width="600"/>
     </p>
</details>

<details>
     <summary>조건에 맞은 매칭방 조회</summary>
     <p align="center">
       <img src="https://github.com/BE14-NoB/Pick/blob/main/postman/matching/%EB%A7%A4%EC%B9%AD%20%EC%A1%B0%ED%9A%8C.png"  width="600"/>
     </p>
</details>

<details>
     <summary>매칭방 신청</summary>
     <p align="center">
       <img src="https://github.com/BE14-NoB/Pick/blob/main/postman/matching/%EB%A7%A4%EC%B9%AD%EB%B0%A9%20%EC%8B%A0%EC%B2%AD.png"  width="600"/>
     </p>
</details>

<details>
     <summary>매칭방 신청 취소</summary>
     <p align="center">
       <img src="https://github.com/BE14-NoB/Pick/blob/main/postman/matching/%EB%A7%A4%EC%B9%AD%EB%B0%A9%20%EC%8B%A0%EC%B2%AD%20%EC%B7%A8%EC%86%8C.png"  width="600"/>
     </p>
</details>

<details>
     <summary>신청자 수락</summary>
     <p align="center">
       <img src="https://github.com/BE14-NoB/Pick/blob/main/postman/matching/%EC%8B%A0%EC%B2%AD%EC%9E%90%20%EC%88%98%EB%9D%BD.png"  width="600"/>
     </p>
</details>

<details>
     <summary>수락한 신청자만 조회</summary>
     <p align="center">
       <img src="https://github.com/BE14-NoB/Pick/blob/main/postman/matching/%EC%88%98%EB%9D%BD%ED%95%9C%20%EC%8B%A0%EC%B2%AD%EC%9E%90%EB%A7%8C%20%EC%A1%B0%ED%9A%8C.png"  width="600"/>
     </p>
</details>
</details>

<details>
     <summary><b>기술 카테고리</b></summary>
     
<details>
          <summary>기술 카테고리 전체 조회</summary>
          <p align="center">
            <img src="https://github.com/BE14-NoB/Pick/blob/main/postman/matching/%EA%B8%B0%EC%88%A0%20%EC%B9%B4%ED%85%8C%EA%B3%A0%EB%A6%AC%20%EC%A0%84%EC%B2%B4%20%EC%A1%B0%ED%9A%8C.png"  width="600"/>
          </p>
</details>

<details>
          <summary>기술 카테고리 id로 조회</summary>
          <p align="center">
            <img src="https://github.com/BE14-NoB/Pick/blob/main/postman/matching/%EA%B8%B0%EC%88%A0%20%EC%B9%B4%ED%85%8C%EA%B3%A0%EB%A6%AC%20id%EB%A1%9C%20%EC%A1%B0%ED%9A%8C.png"  width="600"/>
          </p>
</details>

<details>
          <summary>상위 카테고리만 조회</summary>
          <p align="center">
            <img src="https://github.com/BE14-NoB/Pick/blob/main/postman/matching/%EC%83%81%EC%9C%84%20%EA%B8%B0%EC%88%A0%20%EC%B9%B4%ED%85%8C%EA%B3%A0%EB%A6%AC%EB%A7%8C%20%EC%A1%B0%ED%9A%8C.png"  width="600"/>
          </p>
</details>

<details>
          <summary>기술 카테고리 id로 하위 카테고리 조회</summary>
          <p align="center">
            <img src="https://github.com/BE14-NoB/Pick/blob/main/postman/matching/%EA%B8%B0%EC%88%A0%20%EC%B9%B4%ED%85%8C%EA%B3%A0%EB%A6%AC%20id%EB%A1%9C%20%ED%95%98%EC%9C%84%20%EC%B9%B4%ED%85%8C%EA%B3%A0%EB%A6%AC%20%EC%A1%B0%ED%9A%8C.png"  width="600"/>
          </p>
</details>

<details>
          <summary>기술 카테고리 등록</summary>
          <p align="center">
            <img src="https://github.com/BE14-NoB/Pick/blob/main/postman/matching/%EA%B8%B0%EC%88%A0%20%EC%B9%B4%ED%85%8C%EA%B3%A0%EB%A6%AC%20%EB%93%B1%EB%A1%9D.png"  width="600"/>
          </p>
</details>

<details>
          <summary>기술 카테고리 수정</summary>
          <p align="center">
            <img src="https://github.com/BE14-NoB/Pick/blob/main/postman/matching/%EA%B8%B0%EC%88%A0%20%EC%B9%B4%ED%85%8C%EA%B3%A0%EB%A6%AC%20%EC%88%98%EC%A0%95.png"  width="600"/>
          </p>
</details>

<details>
          <summary>기술 카테고리 삭제</summary>
          <p align="center">
            <img src="https://github.com/BE14-NoB/Pick/blob/main/postman/matching/%EA%B8%B0%EC%88%A0%20%EC%B9%B4%ED%85%8C%EA%B3%A0%EB%A6%AC%20%EC%82%AD%EC%A0%9C.png"  width="600"/>
          </p>
</details>
</details>

### 🗂️ 프로젝트
<details>
     <summary><b>프로젝트</b></summary>
     <details>
          <summary>전체 프로젝트 목록 조회</summary>
          <p align="center">
            <img src="https://github.com/user-attachments/assets/30361c92-7b0f-4dcd-8b99-886aa7ae77c0" width="600"/>
          </p>
     </details>
     <details>
          <summary>진행중인 프로젝트 목록 조회</summary>
          <p align="center">
            <img src="https://github.com/user-attachments/assets/079a582e-d35c-4518-b4c1-9574da2b1d9d" width="600"/>
          </p>
     </details>
     <details>
          <summary>매칭 중인 프로젝트 목록 조회</summary>
          <p align="center">
            <img src="https://github.com/user-attachments/assets/8dc7ed2f-eb68-450c-99d4-08ea3eb90bbb" width="600"/>
          </p>
     </details>
     <details>
          <summary>프로젝트 이름 키워드로 검색</summary>
          <p align="center">
            <img src="https://github.com/user-attachments/assets/c54cb64b-5243-4ee1-8e01-a20c2d43a09a" width="600"/>
          </p>
     </details>
     <details>
          <summary>프로젝트 기술 분류 키워드로 검색</summary>
          <p align="center">
            <img src="https://github.com/user-attachments/assets/f8574841-5a73-40b5-a9e0-8975b21a1603" width="600"/>
          </p>
     </details>
     <details>
          <summary>프로젝트 이름 & 기술 분류키워드로 검색</summary>
          <p align="center">
            <img src="https://github.com/user-attachments/assets/52914e21-927f-4db6-b239-d9e13c68ac38" width="600"/>
          </p>
     </details>
     <details>
          <summary>프로젝트 상세 조회</summary>
          <p align="center">
            <img src="https://github.com/user-attachments/assets/c04d5e8f-5752-40ac-82cd-e92dce2d713b" width="600"/>
          </p>
     </details>
     <details>
          <summary>참여 중인 프로젝트 정보 조회 (프로젝트 방 입장)</summary>
          <p align="center">
            <img src="https://github.com/user-attachments/assets/98353274-29ae-4c7d-8d09-a4863c9cfb75" width="600"/>
          </p>
     </details>
     <details>
          <summary>프로젝트 방 생성</summary>
          <p align="center">
            <img src="https://github.com/user-attachments/assets/44f02a46-47af-4f16-8465-e69d8aba50b7" width="600"/>
          </p>
     </details>
</details>


<details>
     <summary><b>회의록</b></summary>
     <details>
          <summary>프로젝트별 회의록 목록 조회</summary>
          <p align="center">
            <img src="https://github.com/user-attachments/assets/a6bbbd54-5e7e-4727-8996-eac6687279e1" width="600"/>
          </p>
     </details>
     <details>
          <summary>팀원이 아닐 경우</summary>
          <p align="center">
            <img src="https://github.com/user-attachments/assets/35df6adf-07d6-4b1c-8f85-4729561b3362" width="600"/>
          </p>
     </details>
     <details>
          <summary>회의록 작성</summary>
          <p align="center">
            <img src="https://github.com/user-attachments/assets/3194f8aa-27ed-42f0-b3ab-48c621a27498" width="600"/>
          </p>
     </details>
</details>

### 🚨 신고
<details>
	
<summary><b>신고</b></summary>
	<details>
		<summary>모든 신고 목록 조회</summary>
		<img src="https://github.com/user-attachments/assets/3194f8aa-27ed-42f0-b3ab-48c621a27498" width="600"/>
	</details>
	<details>
		<summary>특정 회원 신고 목록 조회</summary>
		<img src="https://github.com/user-attachments/assets/ca8583f0-c459-4429-844a-342ee4a211f2" width="600" />
	</details>
 	<details>
		<summary>상태별 신고 목록 조회</summary>
		<img src="https://github.com/user-attachments/assets/743b97d0-39fb-42d6-a2cd-f63da876f075" width="600" />
	</details>
 	<details>
		<summary>삭제 여부에 따른 신고 목록 조회</summary>
		<img src="https://github.com/user-attachments/assets/a1128775-c423-4ba4-9d0b-6b8781802b89" width="600" />
	</details>
 	<details>
		<summary>신고 사유 등록</summary>
		<img src="https://github.com/user-attachments/assets/c4e075e7-0bf7-4b23-b3c7-fdf35293a987" width="600" />
	</details>
 	<details>
		<summary>신고 등록</summary>
		<img src="https://github.com/user-attachments/assets/1439e196-4802-483e-b93b-8c4498e380ef" width="600" />
	</details>
 	<details>
		<summary>신고 내역 삭제(soft delete)</summary>
		<img src="https://github.com/user-attachments/assets/50af85cd-ecde-471f-ab04-b01eadbe42b7" width="600" />
	</details>
 	<details>
		<summary>신고 처리 상태 수정</summary>
		<img src="https://github.com/user-attachments/assets/ae99323c-c831-4c8c-8802-ef29ff8f97c1" width="600" />
	</details>
</details>

<details>
<summary><b>규제</b></summary>
	<details>
		<summary>모든 규제 목록 조회</summary>
		<img src="https://github.com/user-attachments/assets/c1dcb2b7-3675-485d-89f2-a38d95f7c9cf" width="600" />
	</details>
 	<details>
		<summary>특정 회원 규제 목록 조회</summary>
		<img src="https://github.com/user-attachments/assets/564226b4-528f-4af9-b6ee-485733d65c18" width="600" />
	</details>
 	<details>
		<summary>삭제 여부에 따른 규제 목록 조회</summary>
		<img src="https://github.com/user-attachments/assets/81fcb3b7-3c36-4c12-95fd-5e0a37929cc6" width="600" />
	</details>
  	<details>
		<summary>규제 등록</summary>
		<img src="https://github.com/user-attachments/assets/4dea693b-34d9-4837-a1a5-2fdb3435ac34" width="600" />
	</details>
  	<details>
		<summary>규제 삭제(soft delete)</summary>
		<img src="https://github.com/user-attachments/assets/3d6794fc-b06c-466e-bcea-12bc484d712d" width="600" />
	</details>
</details>

## 📑 API 명세서
<details>

<summary>API 명세서</summary>
<img src = "https://github.com/user-attachments/assets/894ba513-9c64-4f30-be24-fb84c7c1e54a"/>
</details>

## 🔜 향후 확장 계획
`#Github API + Webhook` `#회의록 템플릿` `#챗봇` `#협업 툴 제공` `#스프링 스케줄러`

<br>

# 🍪 동료 평가
### 🐙 고성연
<table>
  <tr>
    <td>평가자</td>
    <td align="center"> 내용 </td>
  </tr>
  <tr>
    <td>김석희</td>
    <td> 회원 기능을 담당하게 되셔서 정말 많은 기능을 구현하게 되셨는데, 싫은 소리 하나 없이 묵묵하게 맡은 일을 수행해주셨다. 어려운 문제로 끙끙대고 있으면 해결책을 같이 찾아주시려고 노력하셨다. 또, 단순히 기능 구현만으로 끝나지 않고 리팩토링이나 컨벤션 같은 사항들도 꼼꼼히 챙겨주셔서 협업다운 협업을 해볼 수 있게 이끌어주셨다.
</td>
  </tr>
  <tr>
    <td>이청민</td>
    <td> 저번 프로젝트에 이어 이번 프로젝트도 함께 하게 되었는데, 이번에도 어려운 파트를 맡아 훌륭한 성과를 보여주셨다. 내가 생각하지 못한 부분까지 세세하게 개발해주셔서 짧은 기간임에도 퀄리티 높은 결과물이 나온 것 같다. </td>
  </tr>
  <tr>
    <td>장시원</td>
    <td> 어려운 파트를 맡아 밤새 코드와 싸움을 하여 결국에는 승리하는 집념을 보여주셨다. 맡은 부분이 완성되지 않으면 서비스가 시작되지 않아 부담스러웠을텐데도 기간 내에 성공적으로 마무리해주셨다. 구현 그 자체에만 초점을 두지 않고 항상 이후에 어떻게 만들어 나갈 지까지 고민하는 모습이 좋았다. 서로 의견을 나누는 경험을 통해 더 좋은 방향으로 나아갈 수 있었다. </td>
  </tr>
  <tr>
    <td>정민선</td>
    <td> 핵심 기능 중 가장 까다로운 부분을 맡아주셨는데 기간 안에 성공적으로 마무리해주셔서 서비스다운 서비스를 만들어낼 수 있었다. 1차적인 부분에서 그치지 않고 항상 고도화 가능성을 고려하셔서 기능을 구현할 때 발전시킬 수 있는 부분을 고려하는 방법을 배웠다. 도움이 필요한 부분을 먼저 나서서 맡아주셔서 짧은 기간 안에 계획했던 부분까지 마무리할 수 있었던 것 같다.  </td>
  </tr>
  <tr>
    <td>최혜민</td>
    <td> 이번 프로젝트에서 많은 기여를 해주셨다. 제일 중요하고 쉽지 않은 회원 기능을 성연님이 맡으셨는데 성연님이라 걱정이 되지는 않았다. 역시나 성연님은 어려운 기능들도 턱턱 해내셨고, 본인 파트를 빨리 끝내시고 다른 일정들도 하나씩 처리해주셨다. 막히는 부분이 생기면 성연님한테 질문을 많이 했는데 그럴 때마다 이해하기 쉽게 대답을 잘 해주셨고, 어떻게든 해결해주셔서 너무 감사했다. 정말 똑똑한 사람인 것 같다.  나도 도움을 드리고 싶지만 도움을 드릴 수 있는 부분이 없어 아쉬웠다. </td>
  </tr>
</table>


### 🪨 김석희
<table>
  <tr>
    <td>평가자</td>
    <td align="center">내용</td>
  </tr>
  <tr>
    <td>고성연</td>
    <td> 이번 프로젝트 때 석희님이 없었으면 많이 휘청거리지 않았을까 싶을 정도로 많은 전반적인 부분에서 방향을 잡아주고, 특히 문서화를 통해 각각의 목표와 해야 할일 방향 일정 등을 관리하면서 팀원들이 개발에만 온전히 집중할 수 있게 해주었다. 그리고 맡은 일에 대해서 집중하여 빠르게 끝내고, 어려운 파트에 대해서도 직접 공부하여 개발을 끝내고 다른 사람들이 쉽게 적용 시킬 수  있게 친절한 가이드까지 제공해주신다. 어떻게 보면 혼자 다 맡기에는 너무 많은 양인 것 같음에도 불구하고 힘든 기색 없이 프로젝트를 맡아주셨다. </td>
  </tr>
  <tr>
    <td>이청민</td>
    <td> 정리의 신. 쏟아지는 공지사항과 정보들을 즉각 문서화하여 언제든지 보기 쉽게 해주셨고, 일일 회의록 작성 등 팀의 서기를 맡아주셨다. 또, 중간중간 산으로 가는 진행 상황을 바로잡아 주셔서, 프로젝트가 원활하게 진행되는데 큰 역할을 하셨다. </td>
  </tr>
  <tr>
    <td>장시원</td>
    <td> 쏟아지는 의견에 산으로 가지 않도록 방향을 잘 잡아주고 가지를 쳐주시며, 의견을 잘 조율하고 이끌어 나가주셨다. 특히 문서화를 통해 각각의 개발 현황을 점검하고 일정을 조율하며 온전히 개발에만 집중할 수 있었다. 맡은 일을 빠르게 끝내고, 각각 맡은 부분에 대해 막혀있는 동안 어려운 부분을 추가로 맡아 개발하고 다른 환경에서도 적용할 수 있도록 세팅을 해주셨다. 에러가 나는 부분도 확인하고 수정해주어  개발이 늦은 입장에서 편하게 사용할 수 있어 좋았다.  </td>
  </tr>
  <tr>
    <td>정민선</td>
    <td> 이번 프로젝트의 틀을 잡아주셨다. 회의를 리드해주시면서 동시에 각종 문서화 작업을 완벽하게 관리해주셔서 개발에 온전히 집중할 수 있었다. 맡은 부분을 빠르게 끝내시고 도움이 필요한 부분을 해결해주셔서 계획했던 핵심 기능을 기한 안에 마무리할 수 있었다. 항상 밝은 에너지로 아이디어를 이끌어내 주셔서 많은 점을 배웠다.  </td>
  </tr>
  <tr>
    <td>최혜민</td>
    <td> 우리 팀에서 없어서는 안될 존재.. 어렵고 복잡한 기능도 먼저 나서서 해결해주셨다. 많은 기능을 맡게 되어 부담이 컸을 텐데 싫은 소리 없이 묵묵히 해주셨다. 저번 프로젝트에 이어서 이번 프로젝트도 함께 하게 되었는데 이번에도 의지를 많이 하고 있다. 오류가 날 때마다 석희님부터 찾게 되는데 항상 해결책을 찾아주신다. 문서 정리도 깔끔하게 해주시고 컨벤션도 미리 다 설정을 해주셔서 팀 프로젝트가 처음부터 수월하게 진행될 수 있었다. </td>
  </tr>
</table>

### 🐊 이청민
<table>
  <tr>
    <td>평가자</td>
    <td align="center">내용</td>
  </tr>
  <tr>
    <td>고성연</td>
    <td> 이번에 발표까지 맡아주시면서 어려운 일임에도 훌룡하게 잘 해주셨다. 또한 본인이 맡은 도메인에 대해서 빠르게 구조를 만들고 맡은 부분에 대해서 오류 없이 만들어주셔서 항상 믿음직스럽다.  벌써 두 번째  같은 팀으로서 프로젝트를 진행 중인데 의견이 갈리는 경우에 대해 본인이 알고 있는 지식과 견해를 통해 방향을 잘 잡아주신다.  하고 싶은 건 많아서 일을 벌려 놓는 스타일인데 해야 할 것과 하지 못하는 경계선을 잡아주어 일을 전반적으로 기간 안에 가능하게 해 주었다. </td>
  </tr>
  <tr>
    <td>김석희</td>
    <td> 항상 PR에 대한 리뷰를 꼼꼼하게 해주셔서 놓친 기능들이나 잘못 기입된 코드들을 다시 한번 확인할 수 있었다. 내가 잘못 알고 있는 개념들을 항상 친절하고 정확하게 설명해주셔서 많은 것을 배우고 있다. 회의 때는 묵묵히 들어주시다가도 중요한 순간에 좋은 아이디어를 주셔서 프로젝트가 더 좋은 방향으로 진행될 수 있었다.
</td>
  </tr>
  <tr>
    <td>장시원</td>
    <td> 촉박한 일정에서 발표까지 맡아주시며 긴장이 되었을 텐데도 잘 해주셨다. 항상 코드 리뷰를 세세하게 봐주셔서 놓쳤던 부분들을 잘 찾아주신다. 항상 차분하게 의견을 제시하고 설명을 해주셔서 의견 교환하는 과정에서도 무안하지 않게 넘어갈 수 있었다. 조용하지만 맡은 부분을 곧바로 막힘없이 만들고 물어보는 내용에 대해 잘 설명해주시고 도와주셔서 감사했다. </td>
  </tr>
  <tr>
    <td>정민선</td>
    <td> PR 과정에서 놓친 부분을 예리하게 찾아 주시고 생각하지 못했던 부분을 조언해주셨다.  아이디어를 공유할 때도 구체적인 부분을 고려해서 설계해주셔서 다음 과정을 이해하거나 구상할 때 많은 도움이 되었다. 개발과 발표를 동시에 준비하셔야 해서 부담이 많으셨을 텐데  차분하게 잘 마무리해주셔서 감사했다.  </td>
  </tr>
  <tr>
    <td>최혜민</td>
    <td> 이번에 PPT를 만들게 되어서 발표 담당인 청민님에게 발표 자료를 빨리 넘겨드려야 했는데 발표 직전까지도 수정을 하게 되어 너무 죄송했다. 하지만 청민님이 발표를 성공적으로 마무리해주셔서 감사했다. 이번에 같은 팀이 되면서 처음 대화를 하게 되었는데 많이 친해진 것 같다! 평소에는 묵묵히 계시지만 의견이 필요할 때나 모르는 부분이 생겨 질문을 하게 되면 대답을 되게 잘해주시고 모르는 부분이 없으시다. 항상 많이 배우고 있다.</td>
  </tr>
</table>

### 🦝 장시원
<table>
  <tr>
    <td>평가자</td>
    <td align="center">내용</td>
  </tr>
  <tr>
    <td>고성연</td>
    <td> 석희님과 더불어 프로젝트 진행 기간 내 가장 많이 커밋을 날려주시고, 서비스의 방향에 대해 많은 의견을 제시해주고 잘못 생각하는 부분에 있어 정정을 잘 해주셨다. 또한 맡은 영역의 기능 개발과 더불어 다른 도메인과 상호작용하는 부분까지 체크하여 어떤 기능이 필요한 지에 대해 다른 사람들과 공유하여 추후에 만들어야 하는 기능에 대해 미리 체크할 수 있어서 매우 좋았다.  어려운 부분을 맡았음에도 기간 안에 오류 없이 만들어 주시고 믿음이 갔다.  서로의 의견 교환을 통해 좀 더 좋은 방향으로 가는 경험을 할 수 있었던 것 같다. </td>
  </tr>
  <tr>
    <td>김석희</td>
    <td> 프로젝트에 적극적으로 임하는 자세가 정말 멋있는 분이다. 다른 도메인과 엮여있는 기능이 많아서 어려운 상황이 많으셨을텐데 힘든 내색 하나 없이 맡은 바를 완벽하게 수행해주셨다. 프로젝트 완성에만 초점을 두지 않고 기술적 발전이나 확장 가능성도 같이 생각해주셔서 개발에 많은 도움을 주셨다. 또한, Context map을 완성해주셔서 기능을 좀 더 수월하게 구현할 수 있었다.
</td>
  </tr>
<tr>
    <td>이청민</td>
    <td> 다른 조원들이 물리 모델링을 하는 사이 혼자 컨텍스트 맵을 퀄리티 높게 완성해주셔서 물리 모델링을 진행하는 데에 큰 도움이 되었다. 그리고 어려운 매칭 도메인을 맡았음에도 성공적으로 마무리하셨다. 더 나아가, 다른 도메인에 필요한 기능도 제시해주셔서 개발을 진행하는 데에 큰 기여를 하셨다. </td>
  </tr>
  <tr>
    <td>정민선</td>
    <td> 아이디어를 공유할 때 다양한 경우의 수를 고려해주셔서 놓쳤던 부분을 대비하고 구체화할 수 있었다. Context Map 을 맡아서 정리해주셨는데, 도메인 간 상호작용을 하는 부분을 잘 설명해주셔서 서비스 간의 관계를 쉽게 이해하고 기능을 구현할 수 있었다. 충분한 근거를 기반으로 적극적으로 의견을 제시하는 모습을 보며 많이 배웠다.   </td>
  </tr>
  <tr>
    <td>최혜민</td>
    <td> 회의를 할 때면 적극적으로 아이디어가 많이 내주셔서 여러 경우를 고려해볼 수 있었다. 개발 일정이 시작되었을 때 단순하게 입력된 기능만 딱 구현하는 게 아니라 더 나아가 생각을 하셔서 구현을 하시는 것 같다. 나는 정해진 것만 딱 하고 마는데 시원님을 보면서 많이 배웠다.  본인 파트뿐만이 아니라 다른 파트에서도 필요한 기능을 생각하고 전달해주셔서 감사했다. </td>
  </tr>
</table>

### 🦭 정민선
<table>
  <tr>
    <td>평가자</td>
    <td align="center">내용</td>
  </tr>
  <tr>
    <td>고성연</td>
    <td> 청민님과 비슷한 분위기의 차분하신 느낌이었는데,  본인이 관심이 있는 부분에 대해서는 남들이 생각하지 못하는 부분까지도 잘 알고 계시고, 조용히 본인이 맡은 파트에 대해서 빠르게 완료하고 다른 분들의 일까지 도와주며 상당히 많은 부분의 개발을 담당하셨다.  그리고 담당 도메인의 기능에 대해 물어볼 일들이 많았는데, 항상 정확하게 모르는 부분을 알려주셨고, 이슈 관리와 pr을 꾸준히 해주셔서 지금 어디까지 진행되었는지, 현재 개발하고 있는 기능이 무엇인지 한번에 확인이 가능했다. </td>
<tr>
    <td>김석희</td>
    <td> 회의나 개발을 진행하다가 놓쳤던 부분들을 항상 꼼꼼하게 정리해주시고 문서화해주셨다. 맡은 도메인의 양이 굉장히 많으셨어서 어려움도 많았을텐데 마감 기한을 한번도 넘긴 적 없이 완벽하게 완성해주셨다. 또한, 민선님 코드에는 항상 주석이 상세하게 작성되어 있어서 리뷰하기가 굉장히 편했다. 평소엔 묵묵히 회의에 집중하시다가도 중요할 땐 적극적으로 의견을 제시해주셔서 더 나은 프로젝트로 완성될 수 있었다.
</td>
  </tr>
<tr>
   <td>이청민</td>
    <td> 남들이 놓치기 쉬운 부분을 고려하여 프로젝트의 완성도를 높이는데 큰 기여를 했다. 조용히 엄청난 양의 작업을 소화해주셔서 감사했다. 특히, 혜민님과 함께 발표에 사용할 ppt를 만들어 주셔서 발표 준비하는데 큰 도움이 됐다. </td>
  </tr>
  <tr>
    <td>장시원</td>
    <td> 저번 프로젝트 때도 느꼈지만 항상 꼼꼼하게 보면서 남들이 놓치기 쉬운 경우까지 고려하여 주어 프로젝트의 완성도를 높일 수 있었다. 담당 도메인 부분과 요청이 필요한 일이 있었는데, 내 파트에서 넘어올 데이터의 구조까지 고려하여 개발을 해주셔서 민선님이 개발한 도메인의 기능을 쉽게 사용할 수 있었다. 혜민님과 함께 개발 뿐 아니라 ppt나 WBS 등 문서화에서도 엄청난 퀄리티를 보여주며 엄청나게 빠르게 심지어 실시간으로 피드백 반영을 해주신다. 주석도 꼼꼼하게 적어주고 구조들을 보기 쉽게 만들어주어 코드를 이해하기 편했다.  언제나 묵묵하게 맡은 부분 이상의 결과물을 가져오셔서 믿음직스럽다. </td>
  </tr>
  <tr>
    <td>최혜민</td>
    <td> 옆자리에서 내 질문 폭탄을 받아주시느라 고생 중이시다. 정작 나는 민선님 질문에 대답해드리지 못해서 죄송한 마음이다. 프로젝트를 진행하면서 안되는 부분이 많았는데 그럴 때마다 민선님한테 투정을 많이 부렸다. 내 문제를 같이 고민해주시고 해결까지 해주셔서 너무 감사했다. 이번에 프로젝트를 하면서 느낀 건데 민선님의 일처리가 꼼꼼하고 빠르다. 꼼꼼하면서 빠르기가 쉽지않은데.. 해야하는 일이 생겨서 이거 이제 해야 돼요! 하면 이미 옆에서 하고 계신다. 옆에서 보면서 많이 배우는 중이다. </td>
  </tr>
</table>

### 🐧 최혜민
<table>
  <tr>
    <td>평가자</td>
    <td align="center">내용</td>
  </tr>
  <tr>
    <td>고성연</td>
    <td> 본인 주장으로는 잘 모른다고 하시지만 항상 본인에게 할당된 일은 잠을 덜 자면서 까지 일정보다 빠르게 완성해주신다.  항상 팀의 분위기가 좋은 이유 중에 가장 큰 기여를 하신다고 생각한다. 그리고 모델링이나 ppt등 개발 뿐만 아니라 문서화 등에서도 엄청난 퀄리티를 제공해주신다. 마찬가지로 의견이 애매하게 대립될때 서로 양측이 납득할만한 얘기를 통해 프로젝트를 진행함에 있어서 싸우지 않을 수 있었던 것 같다.  마지막으로 혜민님의 코드 리뷰를 할 때마다 한눈에 알아보기 좋은 코드로 이해하기 쉽게 해주셨다. </td>
  </tr>
  <tr>
    <td>김석희</td>
    <td> 항상 맡은 일을 빠르고 완벽하게 수행해주신다. 프로젝트 막바지가 되면 해야할 일이 정말 많이 쏟아져서 정신이 하나도 없는데, 혜민님이 있으면 일처리가 빠르게 진행돼서 걱정이 별로 없다. 저번 프로젝트부터 벌써 두번째 협업인데, 매번 꼼꼼하고 확실하게 맡은 바를 끝내주실뿐만 아니라 신경쓰기 힘든 일도 도맡아해주셔서 항상 감사하다. 팀 분위기도 좋게 만들어주시는 정말 없어서 안되는 분이다. </td>
  </tr>
  <tr>	
    <td>이청민</td>
    <td> 별로 자신 없어 하시는 듯 하면서도 맡은 일을 최선을 다해 해주셨고, 좋은 결과를 남기셨다. 또, 민선님과 함께 발표에 쓰일 ppt를 만들어주셨고, 발표 준비하며 긴장한 나를 격려해주셔서 발표를 잘 끝마칠 수 있었다.  </td>
  </tr>
  <tr>
    <td>장시원</td>
    <td> 팀에 즐거운 에너지가 넘치게 해주는 원동력이며 분위기 메이커를 맡고 계신다. 자신없어 하다가도 다음날 보면 맡은 부분을 완벽하게 수행한 PR이 올라와 있다.  개발 뿐만 아니라 넘치는 미적 감각으로 ppt의 퀄리티를 한 층 더 끌어 올려주시며 요청 사항 반영을 잘해주신다. 개발 난이도와 별개로 많은 테이블을 담당하셨는데 꼼꼼히 다양한 케이스를 구현해주어 코드 리뷰 할 때 이해하기 좋았다. </td>
  </tr>
  <tr>
    <td>정민선</td>
    <td> 짧은 기간 안에 맡은 부분을 완벽하게 마무리해주셨다. 의견을 나눌 때 적극적으로 임하시고 놓쳤던 부분에 대해 생각해주셔서 많은 부분을 참고할 수 있었다. 피드백을 빠르게 반영해주시고 각종 문서화 작업을 깔끔하게 완성해주신다. 에러나 각종 이슈가 생겼을 때 신속하게 의견을 공유하고 함께 해결해주셔서 감사했다. </td>
  </tr>
</table>
