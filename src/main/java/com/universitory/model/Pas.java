package com.universitory.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "pas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(length = 20, nullable = false, name = "code")
	private String code;

	@Column(length = 100, nullable = false, name = "name")
	private String name;

	@Column(length = 150, nullable = false, name = "description")
	private String description;
}
