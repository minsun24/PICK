package com.nob.pick.member.query.domain;

public enum MemberStatus {
	ACTIVE((byte) 0),
	SUSPENDED((byte) 1),
	WITHDRAWN((byte) 2);

	private final byte value;

	//final byte 초기화 생성자 (우린 사용 못해요)
	MemberStatustatus(byte value) {
		this.value = (byte) value;
	}

	public byte getValue() {
		return value;
	}

	// byte to Enum
	public static MemberStatus fromValue(byte value) {
		for (MemberStatus memberStatus : MemberStatus.values()) {
			if (memberStatus.value == value) {
				return memberStatus;
			}
		}
		throw new IllegalArgumentException("유효하지 않은 Status 값: " + value);
	}
}
