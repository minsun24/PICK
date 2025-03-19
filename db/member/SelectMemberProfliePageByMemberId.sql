SELECT mp.id,
       mp.exp,
       mp.level,
       mp.introduce,
       mp.preferred_area,
       mp.git_address,
       mp.score,
       mp.image_path,
       mp.member_id
FROM member_profile_page mp
         INNER JOIN member m ON mp.member_id = m.id
WHERE mp.member_id = ?