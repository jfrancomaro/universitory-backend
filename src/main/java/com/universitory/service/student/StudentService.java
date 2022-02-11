package com.universitory.service.student;

import com.universitory.service.GenericService;
import com.universitory.request.StudentDTO;

public interface StudentService extends GenericService<StudentDTO,Integer> {

    StudentDTO register(StudentDTO studentDTO);

    StudentDTO getStudent(Integer id);

    StudentDTO updatedStudent(StudentDTO studentDTO);
}
