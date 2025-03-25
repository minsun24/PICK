package com.nob.pick.achievement.command.domain.aggregate;

import com.nob.pick.challenge.command.domain.aggregate.Challenge;
import com.nob.pick.common.config.BooleanToYNConverter;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ACHIEVEMENT")
@Getter
@NoArgsConstructor
public class Achievement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false)
	private int requirement;

	@Column(nullable = false)
	private int exp;

	@Convert(converter = BooleanToYNConverter.class)
	@Column(nullable = false)
	private boolean isDeleted = false;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "challenge_id", nullable = false)
	private Challenge challenge;

	public Achievement(int requirement, int exp, Challenge challenge) {
		this.requirement = requirement;
		this.exp = exp;
		this.challenge = challenge;
	}

	public void update(int requirement, int exp) {
		this.requirement = requirement;
		this.exp = exp;
	}

	public void softDelete() {
		this.isDeleted = true;
	}
}
