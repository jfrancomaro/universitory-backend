package com.universitory.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "study_plan")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudyPlan {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idStudyPlan;

	@Column(length = 75, nullable = false, name = "name")
	private String name;

	@Column(length = 150, nullable = false, name = "description")
	private String description;

	@ManyToOne
	@JoinColumn(name = "id_pas", nullable = false, foreignKey = @ForeignKey(name = "FK_studyplan_pas"))
	private Pas idPas;
}
