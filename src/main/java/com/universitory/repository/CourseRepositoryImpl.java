//package com.universitory.repository;
//
//import com.universitory.model.Course;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public interface CourseRepositoryImpl extends GenericRepository<Course, Integer>{
//
//	@Query("SELECT c FROM Course c WHERE c.cycle.id = ?1 AND c.studyPlan.id = ?2")
//	List<Course> findByIdCycleAndIdStudyPlan(Integer idCycle, Integer idStudyPlan);
//}
