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

	@Column(length = 150, nullable = false, name = "description")
	private String description;

	@Column(length = 75, nullable = false, name = "code")
	private String code;
}
