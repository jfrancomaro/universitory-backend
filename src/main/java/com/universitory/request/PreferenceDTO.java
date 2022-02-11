package com.universitory.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PreferenceDTO {

    private Integer id;

    private String name;

    private String value;

    private StudentDTO student;
}
