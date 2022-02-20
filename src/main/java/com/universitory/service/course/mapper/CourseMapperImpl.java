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
        return course;
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
        return courseDTO;
    }

    @Override
    public List<CourseDTO> mapOutList(final List<Course> courseList) {
        return courseList.stream().filter(Objects::nonNull)
                .map(this::mapOut).collect(Collectors.toList());
    }
}
