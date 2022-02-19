/*
package com.universitory.service.course.mapper;

import com.universitory.model.*;
import com.universitory.request.*;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class CourseMapperImpl implements CourseMapper{

    @Override
    public Course mapIn(final CourseDTO courseDTO) {
        if(courseDTO == null){
            return null;
        }
        Course course = new Course();
        BeanUtils.copyProperties(courseDTO,course);
        course.setCycle(mapInCycle(courseDTO.getCycle()));
        course.setStudyPlan(mapInStudyPlan(courseDTO.getStudyPlan()));
        return course;
    }

    private StudyPlan mapInStudyPlan(final StudyPlanDTO studyPlan) {
        if(studyPlan == null){
            return null;
        }
        StudyPlan studyPlan1 = new StudyPlan();
        BeanUtils.copyProperties(studyPlan,studyPlan1);
        studyPlan1.setPas(mapInPas(studyPlan.getPas()));
        return studyPlan1;
    }

    private Pas mapInPas(final PasDTO pas) {
        if(pas == null){
            return null;
        }
        Pas pas1 = new Pas();
        BeanUtils.copyProperties(pas, pas1);
        return pas1;
    }

    private Cycle mapInCycle(final CycleDTO cycle) {
        if(cycle == null){
            return null;
        }
        Cycle cycle1 = new Cycle();
        BeanUtils.copyProperties(cycle,cycle1);
        return cycle1;
    }

    @Override
    public List<Course> mapInList(final List<CourseDTO> courseDTOList) {
        return courseDTOList.stream().filter(Objects::nonNull)
                .map(this::mapIn).collect(Collectors.toList());
    }

    @Override
    public CourseDTO mapOut(final Course course) {
        if(course == null){
            return null;
        }
        CourseDTO courseDTO = new CourseDTO();
        BeanUtils.copyProperties(course,courseDTO);
        courseDTO.setCycle(mapOutCycle(course.getCycle()));
        courseDTO.setStudyPlan(mapOutStudyPlan(course.getStudyPlan()));
        return courseDTO;
    }

    private StudyPlanDTO mapOutStudyPlan(final StudyPlan studyPlan) {
        if(studyPlan == null){
            return null;
        }
        StudyPlanDTO studyPlanDTO = new StudyPlanDTO();
        BeanUtils.copyProperties(studyPlan,studyPlanDTO);
        studyPlanDTO.setPas(mapOutPas(studyPlan.getPas()));
        return studyPlanDTO;
    }

    private PasDTO mapOutPas(final Pas pas) {
        if(pas == null){
            return null;
        }
        PasDTO pasDTO = new PasDTO();
        BeanUtils.copyProperties(pas,pasDTO);
        return pasDTO;
    }

    private CycleDTO mapOutCycle(final Cycle cycle) {
        if(cycle == null){
            return null;
        }
        CycleDTO cycleDTO = new CycleDTO();
        BeanUtils.copyProperties(cycle,cycleDTO);
        return cycleDTO;
    }

    @Override
    public List<CourseDTO> mapOutList(final List<Course> courseList) {
        return courseList.stream().filter(Objects::nonNull)
                .map(this::mapOut).collect(Collectors.toList());
    }
}
*/
