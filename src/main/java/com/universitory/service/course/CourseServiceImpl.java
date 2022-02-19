//package com.universitory.service.course;
//
//import com.universitory.repository.CourseRepositoryImpl;
//import com.universitory.service.GenericServiceImpl;
//import com.universitory.service.GenericMapper;
//import com.universitory.model.Course;
//import com.universitory.repository.GenericRepository;
//import com.universitory.request.CourseDTO;
//import com.universitory.service.course.mapper.CourseMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class CourseServiceImpl extends GenericServiceImpl<Course, CourseDTO, Integer> implements CourseService{
//
//	@Autowired
//	private CourseRepositoryImpl repo;
//	@Autowired
//	private CourseMapper service;
//
//	@Override
//	public List<CourseDTO> findByIdCycleAndIdStudyPlan(Integer idCycle, Integer idStudyPlan) {
//		return service.mapOutList(repo.findByIdCycleAndIdStudyPlan(idCycle, idStudyPlan));
//	}
//
//	@Override
//	protected GenericRepository<Course, Integer> getRepo() {
//		return repo;
//	}
//
//	@Override
//	protected GenericMapper<Course, CourseDTO> getMapper() {
//		return service;
//	}
//}
