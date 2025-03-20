package com.nob.pick.member.query.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(force = true)
@AllArgsConstructor
@Getter
public class RequestFindEmailVO {
	private final String name;
	private final String phoneNumber;
}
