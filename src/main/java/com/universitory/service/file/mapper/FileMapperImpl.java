package com.universitory.service.file.mapper;

        import com.universitory.model.CoursePlan;
        import com.universitory.model.File;
        import com.universitory.model.Student;
        import com.universitory.request.CoursePlanDTO;
        import com.universitory.request.FileDTO;
        import com.universitory.request.StudentDTO;
        import org.springframework.beans.BeanUtils;
        import org.springframework.stereotype.Component;

        import java.util.List;
        import java.util.Objects;
        import java.util.stream.Collectors;

        @Component
        public class FileMapperImpl implements FileMapper{

        @Override
        public File mapIn(final FileDTO fileDTO) {
        if(fileDTO == null){
            return null;
        }
        File file = new File();
        BeanUtils.copyProperties(fileDTO,file);
        file.setStudent(mapInStudent(fileDTO.getStudent()));
        file.setCoursePlan(mapInCourse(fileDTO.getCoursePlan()));
        return file;
    }

    private CoursePlan mapInCourse(final CoursePlanDTO coursePlanDTO) {
        if(coursePlanDTO == null) {
            return null;
        }
        CoursePlan coursePlan = new CoursePlan();
        coursePlan.setId(coursePlan.getId());
        return coursePlan;
    }

    private Student mapInStudent(final StudentDTO student) {
        if(student == null){
            return null;
        }
        Student student1 = new Student();
        student1.setId(student.getId());
        return student1;
    }

    @Override
    public List<File> mapInList(final List<FileDTO> fileDTOList) {
        return fileDTOList.stream().filter(Objects::nonNull)
                .map(this::mapIn).collect(Collectors.toList());
    }

    @Override
    public FileDTO mapOut(final File file) {
        if(file == null){
            return null;
        }
        FileDTO fileDTO = new FileDTO();
        BeanUtils.copyProperties(file,fileDTO);
        //fileDTO.setStudent(mapOutStudent(file.getStudent()));
        //fileDTO.setCoursePlan(mapOutCourse(file.getCoursePlan()));
        return fileDTO;
    }

    private CoursePlanDTO mapOutCourse(final CoursePlan coursePlan) {
        if(coursePlan == null){
            return null;
        }
        CoursePlanDTO coursePlanDTO = new CoursePlanDTO();
        BeanUtils.copyProperties(coursePlan,coursePlanDTO);
        coursePlanDTO.setId(coursePlanDTO.getId());
        return coursePlanDTO;
    }

    private StudentDTO mapOutStudent(final Student student) {
        if(student == null){
            return null;
        }
        StudentDTO studentDTO = new StudentDTO();
        BeanUtils.copyProperties(student,studentDTO);
        studentDTO.setId(student.getId());
        return studentDTO;
    }

    @Override
    public List<FileDTO> mapOutList(final List<File> fileList) {
        return fileList.stream().filter(Objects::nonNull)
                .map(this::mapOut).collect(Collectors.toList());
    }
}
