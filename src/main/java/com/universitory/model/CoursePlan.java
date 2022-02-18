package com.universitory.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "courseplan")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CoursePlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_course_plan;

    @Column(nullable = false, name = "credit")
    private Integer credit;

    @Column(nullable = false, name = "cycle")
    private String cycle;
}
