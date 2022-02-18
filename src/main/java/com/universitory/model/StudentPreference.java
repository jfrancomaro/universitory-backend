package com.universitory.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "student_preference")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentPreference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idStudentPreference;

    @Column(nullable = false, name = "cycle")
    private String cycle;

    @ManyToOne
    @JoinColumn(name = "id_pas", nullable = false, foreignKey = @ForeignKey(name = "FK_studentpreference_pas"))
    private Pas idPas;

    @ManyToOne
    @JoinColumn(name = "id_study_plan", nullable = false, foreignKey = @ForeignKey(name = "FK_studentpreference_studyplan"))
    private StudyPlan idStudyPlan;

    @ManyToOne
    @JoinColumn(name = "id_student", nullable = false, foreignKey = @ForeignKey(name = "FK_studentpreference_student"))
    private Student idStudent;
}
