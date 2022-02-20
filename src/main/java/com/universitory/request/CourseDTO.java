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

    @NotBlank(message = "Descripcion es requerido")
    private String description;

    @NotBlank(message = "Codigo es requerido")
    private String code;

}
