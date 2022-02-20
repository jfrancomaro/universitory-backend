package com.universitory.service.studentpreference.mapper;

import com.universitory.model.Pas;
import com.universitory.model.Student;
import com.universitory.model.StudentPreference;
import com.universitory.model.StudyPlan;
import com.universitory.request.PasDTO;
import com.universitory.request.StudentPreferenceDTO;
import com.universitory.request.StudentDTO;
import com.universitory.request.StudyPlanDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class StudentPreferenceMapperImpl implements StudentPreferenceMapper{

    @Override
    public StudentPreference mapIn(StudentPreferenceDTO studentPreferenceDTO) {
        StudentPreference studentPreference = new StudentPreference();
        studentPreference.setIdStudentPreference(studentPreferenceDTO.getIdStudentPreference());
        studentPreference.setStudent(mapInStudent(studentPreferenceDTO.getStudent()));
        studentPreference.setPas(mapInPas(studentPreferenceDTO.getPas()));
        studentPreference.setStudyPlan(mapInStudyPlan(studentPreferenceDTO.getStudyPlan()));
        studentPreference.setCycle(studentPreferenceDTO.getCycle());
        return studentPreference;
    }

    private Pas mapInPas(PasDTO pas) {
        if(pas == null)
            return null;
        Pas pas1 = new Pas();
        pas1.setId(pas.getId());
        return pas1;
    }

    private StudyPlan mapInStudyPlan(StudyPlanDTO studyPlan) {
        if(studyPlan == null)
            return null;
        StudyPlan studyPlan1 = new StudyPlan();
        studyPlan1.setIdStudyPlan(studyPlan.getId());
        return studyPlan1;
    }

    private Student mapInStudent(StudentDTO student) {
        if(student == null)
            return null;
        Student student1 = new Student();
        student1.setId(student.getId());
        return student1;
    }

    @Override
    public List<StudentPreference> mapInList(List<StudentPreferenceDTO> studentPreferenceDTOS) {
        return studentPreferenceDTOS.stream().filter(Objects::nonNull)
                .map(this::mapIn).collect(Collectors.toList());
    }

    @Override
    public StudentPreferenceDTO mapOut(StudentPreference studentPreference) {
        StudentPreferenceDTO studentPreferenceDTO = new StudentPreferenceDTO();
        studentPreferenceDTO.setIdStudentPreference(studentPreference.getIdStudentPreference());
        studentPreferenceDTO.setStudent(mapOutStudent(studentPreference.getStudent()));
        studentPreferenceDTO.setCycle(studentPreference.getCycle());
        studentPreferenceDTO.setPas(mapOutPas(studentPreference.getPas()));
        studentPreferenceDTO.setStudyPlan(mapOutStudyPlan(studentPreference.getStudyPlan()));
        return studentPreferenceDTO;
    }

    private StudyPlanDTO mapOutStudyPlan(StudyPlan studyPlan) {
        StudyPlanDTO studyPlanDTO = new StudyPlanDTO();
        studyPlanDTO.setId(studyPlan.getIdStudyPlan());
        return studyPlanDTO;
    }

    private PasDTO mapOutPas(Pas pas) {
        PasDTO pasDTO = new PasDTO();
        pasDTO.setId(pas.getId());
        return pasDTO;
    }

    private StudentDTO mapOutStudent(Student student) {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(student.getId());
        return studentDTO;
    }

    @Override
    public List<StudentPreferenceDTO> mapOutList(List<StudentPreference> preferences) {
        return preferences.stream().filter(Objects::nonNull)
                .map(this::mapOut).collect(Collectors.toList());
    }
}
