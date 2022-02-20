package com.universitory.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FileDTO {

    private Integer id;

    private String title;

    private String description;

    private String name;

    private String semesterName;

    private String type;

    private String url;

    private CourseDTO course;

    private StudentDTO student;
    
    private Long size;
}
