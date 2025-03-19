SELECT id,
       language,
       is_deleted
FROM programming_language
WHERE is_deleted = ?
#         삭제되지 않은 'N' 인 것들만 조회