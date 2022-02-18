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
	private Integer id_plan;

	@Column(length = 75, nullable = false, name = "name")
	private String name;

	@Column(length = 150, nullable = false, name = "description")
	private String description;

	@ManyToOne
	@JoinColumn(name = "id_course_plan", nullable = false, foreignKey = @ForeignKey(name = "FK_course_courseplan"))
	private CoursePlan coursePlan;
}
