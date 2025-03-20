package com.nob.pick.member.query.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(force = true)
@AllArgsConstructor
@Getter
@ToString
public class RequestFindPasswordVO {
	private final String name;
	private final String phoneNumber;
	private final String email;
}
