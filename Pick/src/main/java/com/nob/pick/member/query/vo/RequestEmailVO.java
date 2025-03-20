package com.nob.pick.member.query.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString
public class RequestEmailVO {
	private String email;

	public RequestEmailVO(String email) {
		this.email = email;
	}
}