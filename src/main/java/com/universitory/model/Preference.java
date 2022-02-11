package com.universitory.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "preference")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Preference {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 255, nullable = false, name = "name")
	private String name;
	
	@Column(length = 255, nullable = false, name = "value")
	private String value;

	@ManyToOne
	@JoinColumn(name = "id_student", nullable = false, foreignKey = @ForeignKey(name = "FK_preference_student"))
	private com.universitory.model.Student student;
}
