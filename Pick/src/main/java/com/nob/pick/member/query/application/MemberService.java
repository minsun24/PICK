package com.nob.pick.member.query.application;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nob.pick.member.query.infrastructure.repository.MemberRepository;

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
}

