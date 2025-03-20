package com.nob.pick.member.query.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


// 읽기전용으로 값이 더이상 바뀌지 않기 위해 NoArgsConstructor 매핑시 기본생성자를 써야하는데 그때 기본값으로 초기화하기 위해 force 걸음
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Getter
@ToString
// 회원 정보 조회 전용
public class RequestMemberVO {
	private final int id;
	private final String name;
	private final int age;
	private final String ihidnum;
	private final String phoneNumber;
	private final String email;
	private final String password;
	private final String nickname;
	private final int status; // tinyint -> byte enum될듯?
	private final int reportedCount;
	private final int userGrant;

}