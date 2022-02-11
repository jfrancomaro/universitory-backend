package com.universitory.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseDTO {

    private Integer id;

    @NotBlank(message = "Nombre es requerido")
    private String name;

    @NotBlank(message = "Cantidad de creditos es requerido")
    private Integer credit;

    private StudyPlanDTO studyPlan;

    private CycleDTO cycle;

}
