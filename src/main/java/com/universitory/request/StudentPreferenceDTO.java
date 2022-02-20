package com.universitory.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentPreferenceDTO {

    private Integer idStudentPreference;

    private String cycle;

    private PasDTO pas;

    private StudyPlanDTO studyPlan;

    private StudentDTO student;
}
