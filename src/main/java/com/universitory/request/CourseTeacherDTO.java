package com.universitory.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseTeacherDTO {

    private Integer id;

    private CourseDTO course;

    private TeacherDTO teacher;
}
