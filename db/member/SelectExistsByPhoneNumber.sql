SELECT EXISTS(SELECT 1
              FROM member
              WHERE phone_number = ?
              )