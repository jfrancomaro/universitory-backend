package com.universitory.service.student;

import com.universitory.repository.StudentRepository;
import com.universitory.service.GenericServiceImpl;
import com.universitory.service.GenericMapper;
import com.universitory.model.Student;
import com.universitory.repository.GenericRepository;
import com.universitory.request.StudentDTO;
import com.universitory.service.student.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends GenericServiceImpl<Student,StudentDTO,Integer> implements StudentService {

    @Autowired
    private StudentRepository repository;

    @Autowired
    private StudentMapper service;

    @Override
    protected GenericRepository<Student, Integer> getRepo() {
        return repository;
    }

    @Override
    protected GenericMapper<Student, StudentDTO> getMapper() {
        return service;
    }
}
