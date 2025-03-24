package com.nob.pick.project.command.domain.aggregate.entity;

import java.time.LocalDateTime;

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
@Table(name="project_meeting")
public class ProjectMeeting {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;

	@Column(name="title", nullable=false)
	private String title;

	@Column(name="content" , columnDefinition = "TEXT")
	private String content;

	@Column(name="upload_time", nullable=false)
	private LocalDateTime uploadTime;

	@Column(name="update_time")
	private LocalDateTime updateTime;

	@Column(name="author_id", nullable = false)
	private int authorId;

	@Column(name="project_room_id", nullable = false)
	private int projectRoomId;

}
