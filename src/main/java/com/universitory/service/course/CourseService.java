package com.universitory.service.course;

import com.universitory.service.GenericService;
import com.universitory.request.CourseDTO;

import java.util.List;

public interface CourseService extends GenericService<CourseDTO, Integer>{

	List<CourseDTO> findByIdCycleAndIdStudyPlan(Integer idCycle, Integer idStudyPlan);
}
