package com.nob.pick.member.query.infrastructure.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.nob.pick.member.query.domain.Member;

@Mapper
public interface MemberRepository {
	// 왜 @Param 받는 형식 String, Object? 안에 들어가는 필드값들이 전부 String 타입 인데
	String findEmailByNameAndPhone(Map<String, Object> params);

	String findPasswordByNamePhoneAndEmail(Map<String, Object> params);

	List<Member> findAllMembers();

	Member findMemberById(@Param("id") int id);

	byte findMemberStatusById(@Param("id") int id);

}
