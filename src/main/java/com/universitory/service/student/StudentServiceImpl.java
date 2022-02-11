package com.universitory.service.student;

//import com.fisirepository.application.student.service.StudentMapper;
//import com.universitory.service.GenericServiceImpl;
//import com.universitory.service.GenericMapper;
//import com.universitory.model.Student;
//import com.universitory.repository.GenericRepository;
//import com.universitory.repository.student.IStudentRepository;
//import com.fisirepository.util.Constants;
//import com.fisirepository.web.exception.NoSuchElementFoundException;
//import com.universitory.request.StudentDTO;
//import com.universitory.request.TypeUserDTO;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl {//extends GenericServiceImpl<Student,StudentDTO,Integer> implements StudentService {

    /*@Autowired
    private IStudentRepository repository;

    @Autowired
    private StudentMapper service;

    @Override
    protected GenericRepository<Student, Integer> getRepo() {
        return repository;
    }

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    protected GenericMapper<Student, StudentDTO> getMapper() {
        return service;
    }

    @Override
    public StudentDTO register(StudentDTO studentDTO) {
        TypeUserDTO typeUserDTO = new TypeUserDTO();
        typeUserDTO.setId(Constants.ID_USERTYPE_USUARIO);

        studentDTO.getUser().setTypeUser(typeUserDTO);
        studentDTO.getUser().setPass(passwordEncoder.encode(studentDTO.getUser().getPass()));
        return service.mapOut(repository.save(service.mapIn(studentDTO)));
    }

    @Override
    public StudentDTO getStudent(Integer id) {
       StudentDTO studentDTO = this.findById(id);
       studentDTO.getUser().setPass(null);
       return studentDTO;
    }

    @Override
    public StudentDTO updatedStudent(StudentDTO studentDTO) {
        Student student = this.repository.findById(studentDTO.getId())
                .orElseThrow(()-> new NoSuchElementFoundException("Estudiante no encontrado"));
        service.mapInUpdatedProfileStudent(studentDTO,student);
        return service.mapOut(this.repository.save(student));
    }*/
}
