package com.nob.pick.member.query.dto;

public enum Status {
	ACTIVE(0),
	SUSPENDED(1),
	WITHDRAWN(2);

	private final int value;

	Status(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}