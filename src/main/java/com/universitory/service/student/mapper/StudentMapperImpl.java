package com.universitory.service.student.mapper;

import com.universitory.model.Student;
import com.universitory.model.TypeUser;
import com.universitory.model.User;
import com.universitory.request.StudentDTO;
import com.universitory.request.TypeUserDTO;
import com.universitory.request.UserDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class StudentMapperImpl implements StudentMapper {

    @Override
    public Student mapIn(final StudentDTO studentDTO) {
        if(studentDTO == null){
            return null;
        }
        Student student = new Student();
        BeanUtils.copyProperties(studentDTO,student);
        //student.setUser(mapInUser(studentDTO.getUser()));
        return student;
    }

    @Override
    public List<Student> mapInList(final List<StudentDTO> studentDTOList) {
        return studentDTOList.stream().filter(Objects::nonNull)
                .map(this::mapIn).collect(Collectors.toList());
    }

    private User mapInUser(final UserDTO user) {
        if(user == null){
            return null;
        }
        User user1 = new User();
        BeanUtils.copyProperties(user,user1);
        return user1;
    }

    @Override
    public StudentDTO mapOut(final Student student) {
        if(student == null){
            return null;
        }
        StudentDTO studentDTO = new StudentDTO();
        BeanUtils.copyProperties(student,studentDTO);
        //studentDTO.setUser(mapOutUserDTO(student.getUser()));
        return studentDTO;
    }

    @Override
    public List<StudentDTO> mapOutList(final List<Student> studentDTOList) {
        return studentDTOList.stream().filter(Objects::nonNull)
                .map(this::mapOut).collect(Collectors.toList());
    }

    private UserDTO mapOutUserDTO(final User user) {
        if(user == null){
            return null;
        }
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(user,userDTO);
        //userDTO.setTypeUser(mapInTypeUser(user.getTypeUser()));
        return userDTO;
    }

    private TypeUserDTO mapInTypeUser(final TypeUser typeUser) {
        if(typeUser == null){
            return null;
        }
        TypeUserDTO typeUserDTO = new TypeUserDTO();
        BeanUtils.copyProperties(typeUser,typeUserDTO);
        return typeUserDTO;
    }
}
