package com.nob.pick.member.query.vo;

public enum Status {
	ACTIVE(0),
	SUSPENDED(1),
	WITHDRAWN(2);

	private final int value;

	//final byte 초기화 생성자 (우린 사용 못해요)
	Status(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}
