package com.universitory.repository;

import com.universitory.model.Course;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends GenericRepository<Course, Integer>{
}
