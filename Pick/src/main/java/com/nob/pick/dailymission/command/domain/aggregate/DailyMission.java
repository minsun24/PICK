package com.nob.pick.dailymission.command.domain.aggregate;

import com.nob.pick.challenge.command.domain.aggregate.Challenge;
import com.nob.pick.common.config.BooleanToYNConverter;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="DAILY_MISSION")
@Getter
@Setter
public class DailyMission {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false)
	private String content;

	@Column(nullable = false)
	private Integer expPoint;

	@Convert(converter = BooleanToYNConverter.class) // 'Y'/'N' 변환
	@Column(nullable = false)
	private Boolean isDeleted = false;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "challenge_id", nullable = false)
	private Challenge challenge;

	public DailyMission() {}

	public DailyMission(String content, Integer expPoint, Challenge challenge) {
		this.content = content;
		this.expPoint = expPoint;
		this.challenge = challenge;
		this.isDeleted = false;
	}

	public void update(String content, Integer expPoint) {
		this.content = content;
		this.expPoint = expPoint;
	}

	public void softDelete() {
		this.isDeleted = true;
	}
}
