package com.universitory.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CoursePlanDTO {

    private StudyPlanDTO studyPlanDTO;
    @NotBlank(message = "Creditos es obligatorio")
    private String creditos;
    private Integer ciclo;
    private CourseDTO courseDTO;
}
