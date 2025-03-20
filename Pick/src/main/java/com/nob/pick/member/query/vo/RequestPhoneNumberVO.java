package com.nob.pick.member.query.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString
public class RequestPhoneNumberVO {
	private String phoneNumber;

	public RequestPhoneNumberVO(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}