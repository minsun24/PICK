package com.nob.pick.dailymission.command.domain.aggregate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="DAILY_MISSION")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class DailyMission {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	@Column(name = "content", nullable = false)
	private String content;

	@Column(name = "exp_point", nullable = false)
	private int expPoint;

	@Column(name = "is_deleted", nullable = false)
	private boolean isDeleted;

	@Column(name = "challenge_id", nullable = false)
	private int challengeId;
}
