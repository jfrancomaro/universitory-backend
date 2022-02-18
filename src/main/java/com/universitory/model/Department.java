package com.universitory.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "department")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(length = 20, nullable = false, name = "name")
	private String code;

	@Column(length = 75, nullable = false, name = "name")
	private String name;

	@Column(length = 150, nullable = false, name = "description")
	private String description;

	@ManyToOne
	@JoinColumn(name = "id_plan", nullable = false, foreignKey = @ForeignKey(name = "FK_department_studentpreference"))
	private CoursePlan id_plan;
}
