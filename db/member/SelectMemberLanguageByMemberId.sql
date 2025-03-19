# SELECT id,
#        programming_language_id,
#        member_profile_page_id
# FROM member_programming_language
# WHERE member_profile_page_id = ?

SELECT mpl.id,
       mpl.programming_language_id,
       mpl.member_profile_page_id,
       pl.language
FROM MEMBER_PROGRAMMING_LANGUAGE mpl
         INNER JOIN PROGRAMMING_LANGUAGE pl
                    ON mpl.programming_language_id = pl.id
         INNER JOIN MEMBER_PROFILE_PAGE mpp
                    ON mpl.member_profile_page_id = mpp.id
WHERE mpl.member_profile_page_id = ?
  AND pl.is_deleted = 'N'