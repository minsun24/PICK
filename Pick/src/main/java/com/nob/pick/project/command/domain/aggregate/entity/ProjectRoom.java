package com.nob.pick.project.command.domain.aggregate.entity;

import java.time.LocalDate;

import com.nob.pick.common.config.convertor.BooleanToYNConverter;
import com.nob.pick.matching.query.aggregate.TechnologyCategory;
import com.nob.pick.matching.query.dto.TechnologyCategoryDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
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
@Table(name = "project_room")
public class ProjectRoom {

	@Id
	@Column(name="id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name="name", nullable = false)
	private String name;

	@Column(name="content", nullable = false, columnDefinition = "TEXT")
	private String content;

	@Builder.Default
	@Column(name="is_finished", nullable = false, length = 4)
	@Convert(converter = BooleanToYNConverter.class)
	private boolean isFinished = false;

	@Builder.Default
	@Column(name="is_deleted", nullable = false, length = 4)
	@Convert(converter = BooleanToYNConverter.class)
	private boolean isDeleted = false;

	@Column(name="duration_time", nullable = false)
	private String durationTime;

	@Column(name="maximum_participant", nullable = false)
	private int maximumParticipant;

	@Column(name="session_code", unique = true)
	private Integer sessionCode;

	@Column(name="start_date", nullable = false)
	private LocalDate startDate;

	@Column(name="end_date", nullable = false)
	private LocalDate endDate;

	@Column(name="technology_category_id")
	private int technologyCategoryId;

	@Column(name="thumbnail_image", unique = true)
	private String thumbnailImage;

	@Column(name="introduction", columnDefinition = "TEXT")
	private String introduction;

	@Column(name="project_url", unique = true)
	private String projectUrl;

}
