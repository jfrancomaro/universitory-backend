package com.universitory.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudyPlanDTO {

	private Integer id;
	private Integer planName;
	private com.universitory.request.PasDTO pas;

}
