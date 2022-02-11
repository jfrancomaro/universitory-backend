package com.universitory.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "file")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class File {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(length = 100, nullable = false, name = "title")
	private String title;

	@Column(nullable = false, name = "description")
	private String description;

	@Column(length = 100, nullable = false, name = "name")
	private String name;
	
	@Column(length = 45, nullable = false, name = "semester_name")
	private String semesterName;
	
	@Column(length = 50, nullable = false, name = "type")
	private String type;
	
	@Column(nullable = false, name = "url")
	private String url;
	
	@ManyToOne
	@JoinColumn(name = "id_course", nullable = false, foreignKey = @ForeignKey(name = "FK_file_course"))
	private Course course;
	
	@ManyToOne
	@JoinColumn(name = "id_student", nullable = false, foreignKey = @ForeignKey(name = "FK_file_student"))
	private Student student;
	
	@Column(nullable = false, name = "size")
	private Long size;
}
