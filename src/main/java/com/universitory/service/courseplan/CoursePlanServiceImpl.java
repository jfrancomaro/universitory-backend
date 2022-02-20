package com.universitory.service.courseplan;

import com.universitory.model.CoursePlan;
import com.universitory.repository.CoursePlanRepository;
import com.universitory.repository.GenericRepository;
import com.universitory.request.CoursePlanDTO;
import com.universitory.service.GenericMapper;
import com.universitory.service.GenericServiceImpl;
import com.universitory.service.courseplan.mapper.CoursePlanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoursePlanServiceImpl extends GenericServiceImpl<CoursePlan, CoursePlanDTO, Integer> implements CoursePlanService {

    @Autowired
    private CoursePlanRepository coursePlanRepository;

    @Autowired
    private CoursePlanMapper coursePlanMapper;


    @Override
    protected GenericRepository<CoursePlan, Integer> getRepo() {
        return coursePlanRepository;
    }

    @Override
    protected GenericMapper<CoursePlan, CoursePlanDTO> getMapper() {
        return coursePlanMapper;
    }
}
