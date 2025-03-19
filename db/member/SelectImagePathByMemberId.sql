SELECT
    mp.image_path
    FROM member_profile_page mp
             INNER JOIN member m ON mp.member_id = m.id
    WHERE mp.member_id = ?