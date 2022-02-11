package com.universitory.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "teacher")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 50, nullable = false, name = "names")
	private String names;
	
	@Column(length = 50, nullable = false, name = "last_name")
	private String lastName;
	
	@Column(length = 50, nullable = false, name = "second_last_name")
	private String secondLastName;
}
