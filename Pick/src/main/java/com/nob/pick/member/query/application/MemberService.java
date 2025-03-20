package com.nob.pick.member.query.application;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nob.pick.member.query.infrastructure.repository.MemberRepository;
import com.nob.pick.member.query.vo.Status;
import com.nob.pick.member.query.vo.RequestMemberVO;

@Service
public class MemberService {
	private final MemberRepository memberRepository;

	@Autowired
	public MemberService(MemberRepository memberRepository) {
		this.memberRepository = memberRepository;
	}

	public String findEmail(String name, String phoneNumber) {

		Map<String, Object> params = new HashMap<>();
		params.put("name", name);
		params.put("phoneNumber", phoneNumber);

		return Optional.ofNullable(memberRepository.findEmailByNameAndPhone(params))
			.orElseThrow(() -> new IllegalArgumentException("이름과 전화번호로 회원을 찾을 수 없습니다."));
	}

	public String findPassword(String name, String phoneNumber, String email) {

		Map<String, Object> params = new HashMap<>();
		params.put("name", name);
		params.put("phoneNumber", phoneNumber);
		params.put("email", email);

		return Optional.ofNullable(memberRepository.findPasswordByNamePhoneAndEmail(params))
			.orElseThrow(() -> new IllegalArgumentException("이름과 전화번호, 이메일로 회원을 찾을 수 없습니다."));
	}

	public List<RequestMemberVO> findMemberInfo() {
		return memberRepository.findAllMembers();
	}

	public RequestMemberVO findMemberInfoById(int id) {

		return memberRepository.findMemberById(id);
	}

	public boolean existsEmail(String email) {
		return memberRepository.existsByEmail(email);
	}

	public boolean existsPhoneNumber(String phoneNumber) {
		return memberRepository.existsByPhoneNumber(phoneNumber);
	}

	public Status findMemberStatus(int id) {
		return memberRepository.findMemberStatusById(id);
	}
}

