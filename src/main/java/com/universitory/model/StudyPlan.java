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
	private Integer id;
	
	@Column(length = 4, nullable = false, name = "plan_name")
	private Integer planName;

	@ManyToOne
	@JoinColumn(name = "id_pas", nullable = false, foreignKey = @ForeignKey(name = "FK_study_plan_pas"))
	private com.universitory.model.Pas pas;
}
