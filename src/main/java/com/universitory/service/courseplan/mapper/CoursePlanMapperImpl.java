package com.universitory.service.courseplan.mapper;

import com.universitory.model.Course;
import com.universitory.model.CoursePlan;
import com.universitory.model.StudyPlan;
import com.universitory.request.CourseDTO;
import com.universitory.request.CoursePlanDTO;
import com.universitory.request.StudyPlanDTO;
import com.universitory.service.course.mapper.CourseMapper;
import com.universitory.service.studyplan.mapper.StudyPlanMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class CoursePlanMapperImpl implements CoursePlanMapper {

    @Autowired
    private CourseMapper courseMapper;

    @Autowired
    private StudyPlanMapper studyPlanMapper;

    @Override
    public CoursePlan mapIn(CoursePlanDTO coursePlanDTO) {
        CoursePlan coursePlan = new CoursePlan();
        BeanUtils.copyProperties(coursePlanDTO, coursePlan);
        coursePlan.setCourse(mapInCourse(coursePlanDTO.getCourseDTO()));
        coursePlan.setStudyPlan(mapInStudyPlan(coursePlanDTO.getStudyPlanDTO()));
        return coursePlan;
    }

    private StudyPlan mapInStudyPlan(StudyPlanDTO studyPlanDTO) {
        StudyPlan studyPlan = new StudyPlan();
        studyPlan.setIdStudyPlan(studyPlanDTO.getId());
        return studyPlan;
    }

    private Course mapInCourse(CourseDTO courseDTO) {
        Course course = new Course();
        course.setId(courseDTO.getId());
        return course;
    }

    @Override
    public List<CoursePlan> mapInList(List<CoursePlanDTO> coursePlanDTOS) {
        return coursePlanDTOS.stream().filter(Objects::nonNull)
                .map(this::mapIn).collect(Collectors.toList());
    }

    @Override
    public CoursePlanDTO mapOut(CoursePlan coursePlan) {
        CoursePlanDTO coursePlanDTO = new CoursePlanDTO();
        BeanUtils.copyProperties(coursePlan, coursePlanDTO);
        coursePlanDTO.setCourseDTO(courseMapper.mapOut(coursePlan.getCourse()));
        coursePlanDTO.setStudyPlanDTO(studyPlanMapper.mapOut(coursePlan.getStudyPlan()));
        return coursePlanDTO;
    }

    @Override
    public List<CoursePlanDTO> mapOutList(List<CoursePlan> coursePlanList) {
        return coursePlanList.stream().filter(Objects::nonNull)
                .map(this::mapOut).collect(Collectors.toList());
    }
}
