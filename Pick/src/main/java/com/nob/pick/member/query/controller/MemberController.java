package com.nob.pick.member.query.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nob.pick.member.query.application.MemberService;
import com.nob.pick.member.query.vo.Status;
import com.nob.pick.member.query.vo.RequestEmailVO;
import com.nob.pick.member.query.vo.RequestFindEmailVO;
import com.nob.pick.member.query.vo.RequestFindPasswordVO;
import com.nob.pick.member.query.vo.RequestIdVO;
import com.nob.pick.member.query.vo.RequestMemberVO;
import com.nob.pick.member.query.vo.RequestPhoneNumberVO;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/members")
@Slf4j
public class MemberController {

	private final MemberService memberService;

	@Autowired
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}

	@PostMapping("/email")  // GET -> POST로 변경
	public String getEmail(@RequestBody RequestFindEmailVO requestFindEmailVO) {  // @RequestParam -> @RequestBody
		return memberService.findEmail(requestFindEmailVO.getName(), requestFindEmailVO.getPhoneNumber());
	}

	@PostMapping("/password")
	public String getPassword(@RequestBody RequestFindPasswordVO requestFindPasswordVO) {
		// log.info("getPassword called with: {}", requestFindPasswordVO);
		// log.debug("Debug: getPassword called with: {}", requestFindPasswordVO);
		// log.info("Info: getPassword called with: {}", requestFindPasswordVO);
		// log.warn("Warn: getPassword called with: {}", requestFindPasswordVO);
		return memberService.findPassword(requestFindPasswordVO.getName(),
			requestFindPasswordVO.getPhoneNumber(), requestFindPasswordVO.getEmail());
	}

	@PostMapping("/membersInfo")
	public List<RequestMemberVO> getMembers() {
		return memberService.findMemberInfo();
	}

	@PostMapping("/memberInfo")
	public RequestMemberVO getMemberInfo(@RequestBody RequestMemberVO requestMemberVO) {
		return memberService.findMemberInfoById(requestMemberVO.getId());
	}

	// 이메일 중복 확인
	@PostMapping("/check-email")
	public boolean checkEmail(@RequestBody RequestEmailVO requestEmailVO) {
		return memberService.existsEmail(requestEmailVO.getEmail());
	}

	// 전화번호 중복 확인
	@PostMapping("/check-phone")
	public boolean checkPhoneNumber(@RequestBody RequestPhoneNumberVO requestPhoneNumberVO) {
		return memberService.existsPhoneNumber(requestPhoneNumberVO.getPhoneNumber());
	}

	// 회원 상태 조회
	@PostMapping("/status")
	public Status getMemberStatus(@RequestBody RequestIdVO requestIdVO) {
		return memberService.findMemberStatus(requestIdVO.getId());
	}
}



