package com.universitory.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "student_course")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentCourse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idStudentCourse;

    @Column(nullable = false, name = "fecha_registro")
    private Date fechaRegistro;

    @ManyToOne
    @JoinColumn(name = "id_course_plan", nullable = false, foreignKey = @ForeignKey(name = "FK_studentcourse_courseplan"))
    private CoursePlan coursePlan;

    @ManyToOne
    @JoinColumn(name = "id_student", nullable = false, foreignKey = @ForeignKey(name = "FK_studentcourse_student"))
    private Student student;

    @ManyToOne
    @JoinColumn(name = "id_semester", nullable = false, foreignKey = @ForeignKey(name = "FK_studentcourse_semester"))
    private Semester semester;


}
