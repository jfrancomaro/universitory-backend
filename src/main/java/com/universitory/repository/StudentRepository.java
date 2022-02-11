package com.universitory.repository;

import com.universitory.model.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends GenericRepository<Student,Integer> {
}
