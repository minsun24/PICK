SELECT
    mp.exp,
    mp.level
FROM member_profile_page mp
         INNER JOIN member m ON mp.member_id = m.id
WHERE mp.member_id = ?