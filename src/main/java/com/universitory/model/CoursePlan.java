package com.universitory.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "course_plan")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CoursePlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, name = "credit")
    private Integer credit;

    @Column(nullable = false, name = "cycle")
    private String cycle;

    @ManyToOne
    @JoinColumn(name = "id_course", nullable = false, foreignKey = @ForeignKey(name = "FK_courseplan_course"))
    private Course course;

    @ManyToOne
    @JoinColumn(name = "id_study_plan", nullable = false, foreignKey = @ForeignKey(name = "FK_courseplan_studyplan"))
    private StudyPlan studyPlan;
}
