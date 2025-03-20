package com.nob.pick.member.query.infrastructure.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.nob.pick.member.query.vo.Status;
import com.nob.pick.member.query.vo.RequestMemberVO;

@Mapper
public interface MemberRepository {
	// 왜 @Param 받는 형식 String, Object? 안에 들어가는 필드값들이 전부 String 타입 인데
	String findEmailByNameAndPhone(Map<String, Object> params);

	String findPasswordByNamePhoneAndEmail(Map<String, Object> params);

	List<RequestMemberVO> findAllMembers();

	RequestMemberVO findMemberById(@Param("id") int id);

	Status findMemberStatusById(@Param("id") int id); // byte → Status로 변경

	boolean existsByEmail(@Param("email") String email);

	boolean existsByPhoneNumber(@Param("phoneNumber") String phoneNumber);

}
