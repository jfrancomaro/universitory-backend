package com.universitory.service.preference;

import com.universitory.repository.PreferenceRepositoryImpl;
import com.universitory.service.GenericServiceImpl;
import com.universitory.service.GenericMapper;
import com.universitory.model.Preference;
import com.universitory.repository.GenericRepository;
import com.universitory.request.PreferenceDTO;
import com.universitory.service.preference.mapper.PreferenceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PreferenceServiceImpl extends GenericServiceImpl<Preference, PreferenceDTO, Integer> implements PreferenceService {

    @Autowired
    private PreferenceRepositoryImpl repo;
    @Autowired
    private PreferenceMapper service;

    @Override
    protected GenericRepository<Preference, Integer> getRepo() {
        return repo;
    }

    @Override
    protected GenericMapper<Preference, PreferenceDTO> getMapper() {
        return service;
    }
}
