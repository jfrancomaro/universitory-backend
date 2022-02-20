package com.universitory.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PasDTO {

    private Integer id;
    private String code;
    private String description;
    private String name;
}
