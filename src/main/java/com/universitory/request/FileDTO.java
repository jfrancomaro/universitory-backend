package com.universitory.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
public class FileDTO {

    private Integer id;

    private String title;

    private String description;

    private String name;

    private String semesterName;

    private String type;

    private String url;

    private CoursePlanDTO coursePlan;

    private StudentDTO student;
    
    private Long size;

    private String extension;

}
