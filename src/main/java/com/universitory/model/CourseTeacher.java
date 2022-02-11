package com.universitory.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "course_teacher")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseTeacher {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "id_course", nullable = false, foreignKey = @ForeignKey(name = "FK_course_teacher_course"))
	private Course course;

	@ManyToOne
	@JoinColumn(name = "id_teacher", nullable = false, foreignKey = @ForeignKey(name = "FK_course_teacher_teacher"))
	private Teacher teacher;
}
