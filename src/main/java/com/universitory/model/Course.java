package com.universitory.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "course")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 75, nullable = false, name = "name")
	private String name;
	
	@Column(nullable = false, name = "credit")
	private Integer credit;
	
	@ManyToOne
	@JoinColumn(name = "id_study_plan", nullable = false, foreignKey = @ForeignKey(name = "FK_course_study_plan"))
	private StudyPlan studyPlan;
	
	@ManyToOne
	@JoinColumn(name = "id_cycle", nullable = false, foreignKey = @ForeignKey(name = "FK_course_cycle"))
	private Cycle cycle;
}
