package com.nob.pick.project.command.domain.aggregate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
@Table(name="member_review")
public class MemberReview {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	@Column(name="rate" , nullable = false)
	private int rate;

	@Column(name="content", columnDefinition = "TEXT")
	private String content;

	@Column(name="reviewer_id" , nullable = false)
	private int reviewerId;

	@Column(name="reviewee_id", nullable = false)
	private int revieweeId;

	@Column(name="project_room_id", nullable = false)
	private int projectRoomId;


}
