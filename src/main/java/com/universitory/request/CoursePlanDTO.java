package com.universitory.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CoursePlanDTO {

    private Integer id;
    private StudyPlanDTO studyPlan;
    @NotBlank(message = "Creditos es obligatorio")
    private Integer credit;
    private String cycle;
    private CourseDTO course;
}
