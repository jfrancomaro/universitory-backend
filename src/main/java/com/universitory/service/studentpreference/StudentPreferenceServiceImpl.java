package com.universitory.service.studentpreference;

import com.universitory.model.StudentPreference;
import com.universitory.repository.GenericRepository;
import com.universitory.repository.StudentPreferenceRepository;
import com.universitory.request.StudentPreferenceDTO;
import com.universitory.service.GenericMapper;
import com.universitory.service.GenericServiceImpl;
import com.universitory.service.studentpreference.mapper.StudentPreferenceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentPreferenceServiceImpl extends GenericServiceImpl<StudentPreference,StudentPreferenceDTO, Integer> implements StudentPreferenceService {

    @Autowired
    private StudentPreferenceRepository repository;

    @Autowired
    private StudentPreferenceMapper mapper;

    @Override
    protected GenericRepository<StudentPreference, Integer> getRepo() {
        return repository;
    }

    @Override
    protected GenericMapper<StudentPreference, StudentPreferenceDTO> getMapper() {
        return mapper;
    }
}
