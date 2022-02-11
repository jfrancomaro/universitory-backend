package com.universitory.service.preference.mapper;

import com.universitory.model.Preference;
import com.universitory.model.Student;
import com.universitory.request.PreferenceDTO;
import com.universitory.request.StudentDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class PreferenceMapperImpl implements PreferenceMapper {

    @Override
    public Preference mapIn(PreferenceDTO preferenceDTO) {
        if (preferenceDTO == null) {
            return null;
        }
        Preference preference = new Preference();
        BeanUtils.copyProperties(preferenceDTO, preference);
        preference.setStudent(mapInStudent(preferenceDTO.getStudent()));
        return preference;
    }

    private Student mapInStudent(final StudentDTO studentDTO) {
        if (studentDTO == null) {
            return null;
        }
        Student student = new Student();
        BeanUtils.copyProperties(studentDTO, student);
        return student;
    }

    @Override
    public List<Preference> mapInList(List<PreferenceDTO> preferenceDTOList) {
        return preferenceDTOList.stream().filter(Objects::nonNull)
                .map(this::mapIn).collect(Collectors.toList());
    }

    @Override
    public PreferenceDTO mapOut(Preference preference) {
        if (preference == null) {
            return null;
        }
        PreferenceDTO preferenceDTO = new PreferenceDTO();
        BeanUtils.copyProperties(preference, preferenceDTO);
        preferenceDTO.setStudent(mapOutStudyPlan(preference.getStudent()));
        return preferenceDTO;
    }

    private StudentDTO mapOutStudyPlan(final Student student) {
        if (student == null) {
            return null;
        }
        StudentDTO studentDTO = new StudentDTO();
        BeanUtils.copyProperties(student, studentDTO);
        return studentDTO;
    }

    @Override
    public List<PreferenceDTO> mapOutList(List<Preference> preferenceList) {
        return preferenceList.stream().filter(Objects::nonNull)
                .map(this::mapOut).collect(Collectors.toList());
    }
}
