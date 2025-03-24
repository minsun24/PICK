package com.nob.pick.challenge.command.domain.aggregate;

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
@Table(name="CHALLENGE")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Challenge {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	@Column(name = "name", nullable = false)
	private String name;

	public Challenge(String name) {
		this.name = name;
	}
}
