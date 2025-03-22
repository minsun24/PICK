package com.nob.pick.member.query.dto;

public enum UserGrant {
	ADMIN(0),
	MEMBER(1);

	private final int value;

	UserGrant(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}