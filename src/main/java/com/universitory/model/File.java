package com.universitory.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "file")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class File {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(length = 150, nullable = false, name = "name")
	private String name;

	@Column(nullable = false, name = "description")
	private String description;
	
	@Column(length = 50, nullable = false, name = "type")
	private String type;
	
	@Column(nullable = false, name = "url")
	private String url;

	@Column(nullable = false, name = "fecha_registro")
	private LocalDateTime fechaRegistro;

	@Column(nullable = false, name = "weight")
	private String weight;
	
	@ManyToOne
	@JoinColumn(name = "id_student_course", nullable = false, foreignKey = @ForeignKey(name = "FK_file_studentcourse"))
	private StudentCourse studentCourse;
	

}
