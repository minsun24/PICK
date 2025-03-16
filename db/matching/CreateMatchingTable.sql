DROP TABLE IF EXISTS MATCING CASCADE
DROP TABLE IF EXISTS MATCING_ENTRY CASCADE
DROP TABLE IF EXISTS TECHNOLOGY_CATEGORY CASCADE

CREATE TABLE IF NOE EXISTS MATCHING
(
  id                     INTEGER      NOT NULL AUTO_INCREMENT PRIMARY KEY
, created_date           VARCHAR(255) NOT NULL
, is_completed           VARCHAR(4)   NOT NULL DEFAULT 'N'
, level_range            INTEGER      NOT NULL DEFAULT 5
, member_id              INTEGER      NOT NULL
, technology_category_id INTEGER      NOT NULL
);

CREATE TABLE IF NOE EXISTS MATCING_ENTRY 
(
  id           INTEGER      NOT NULL AUTO_INCREMENT PRIMARY KEY
, applied_date VARCHAR(255) NOT NULL
, is_cancled   VARCHAR(4)   NOT NULL DEFAULT 'N'
, member_id    INTEGER      NOT NULL
, matching_id  INTEGER      NOT NULL
);

CREATE TABLE IF NOE EXISTS TECHNOLOGY_CATEGORY 
(
  id                         INTEGER      NOT NULL AUTO_INCREMENT PRIMARY KEY
, name                       VARCHAR(255) NOT NULL UNIQUE
, ref_technology_category_id INTEGER      NULL
);

ALTER TABLE MATCHING
  ADD CONSTRAINT fk_matching_member_id
      FOREIGN KEY (member_id) REFERENCES MEMBER(id)
, ADD CONSTRAINT fk_matching_technology_category_id
      FOREIGN KEY (technology_category_id) REFERENCES TECHNOLOGY_CATEGORY(id);
      
ALTER TABLE MATCHING_ENTRY
  ADD CONSTRAINT fk_matching_entry_member_id
      FOREIGN KEY (member_id) REFERENCES MEMBER(id)
, ADD CONSTRAINT fk_matching_entry_matching_id
      FOREIGN KEY (matching_id) REFERENCES MATCHING(id);

ALTER TABLE TECHNOLOGY_CATEGORY
  ADD CONSTRAINT fk_technology_category_id
      FOREIGN KEY (ref_technology_category_id) REFERENCES TECHNOLOGY_CATEGORY(id);
