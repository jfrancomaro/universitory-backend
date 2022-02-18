package com.universitory.service.studyplan.mapper;

import com.universitory.model.Department;
import com.universitory.model.StudyPlan;
import com.universitory.request.PasDTO;
import com.universitory.request.StudyPlanDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class StudyPlanMapperImpl implements StudyPlanMapper{

    @Override
    public StudyPlan mapIn(final StudyPlanDTO studyPlanDTO) {
        if(studyPlanDTO == null){
            return null;
        }
        StudyPlan studyPlan = new StudyPlan();
        studyPlan.setPas(mapInPas(studyPlanDTO.getPas()));
        studyPlan.setId(studyPlanDTO.getId());
        studyPlan.setPlanName(studyPlanDTO.getPlanName());
        return studyPlan;
    }

    private Department mapInPas(final PasDTO pas) {
        if(pas == null){
            return null;
        }
        Department department1 = new Department();
        department1.setName(pas.getName());
        department1.setId(pas.getId());
        return department1;
    }

    @Override
    public List<StudyPlan> mapInList(final List<StudyPlanDTO> studyPlanDTOList) {
        return studyPlanDTOList.stream().filter(Objects::nonNull)
                .map(this::mapIn).collect(Collectors.toList());
    }

    @Override
    public StudyPlanDTO mapOut(final StudyPlan studyPlan) {
        if(studyPlan == null){
            return null;
        }
        StudyPlanDTO studyPlanDTO = new StudyPlanDTO();
        studyPlanDTO.setPlanName(studyPlan.getPlanName());
        studyPlanDTO.setId(studyPlan.getId());
        studyPlanDTO.setPas(mapOutPas(studyPlan.getPas()));
        return studyPlanDTO;
    }

    private PasDTO mapOutPas(final Department department) {
        if(department == null){
            return null;
        }
        PasDTO pasDTO = new PasDTO();
        pasDTO.setId(department.getId());
        pasDTO.setName(department.getName());
        return pasDTO;
    }

    @Override
    public List<StudyPlanDTO> mapOutList(final List<StudyPlan> studyPlanList) {
        return studyPlanList.stream().filter(Objects::nonNull)
                .map(this::mapOut).collect(Collectors.toList());
    }
}
