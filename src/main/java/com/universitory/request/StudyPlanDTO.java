package com.universitory.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudyPlanDTO {

	private Integer id;
	private String name;
	private String description;
	private PasDTO pas;

}
