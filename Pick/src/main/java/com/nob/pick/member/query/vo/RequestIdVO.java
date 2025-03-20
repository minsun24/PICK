package com.nob.pick.member.query.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString
public class RequestIdVO {
	private int id;

	public RequestIdVO(int id) {
		this.id = id;
	}
}