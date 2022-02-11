package com.universitory.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "student")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 50, nullable = false, name = "names")
	private String names;
	
	@Column(length = 50, nullable = false, name = "last_name")
	private String lastName;
	
	@Column(length = 50, nullable = false, name = "second_last_name")
	private String secondLastName;
	
	@Column(length = 100, nullable = false, name = "email")
	private String email;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_user", nullable = false, foreignKey = @ForeignKey(name = "FK_student_user"))
	private User user;
}
