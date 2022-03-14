package com.universitory.service.studyplan;

import com.universitory.repository.StudyPlanRepository;
import com.universitory.response.GenericResponse;
import com.universitory.service.GenericServiceImpl;
import com.universitory.service.GenericMapper;
import com.universitory.model.StudyPlan;
import com.universitory.repository.GenericRepository;
import com.universitory.request.StudyPlanDTO;
import com.universitory.service.studyplan.mapper.StudyPlanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudyPlanServiceImpl extends GenericServiceImpl<StudyPlan, StudyPlanDTO, Integer> implements StudyPlanService {

    @Autowired
    private StudyPlanRepository repo;
    @Autowired
    private StudyPlanMapper service;

	@Override
	protected GenericRepository<StudyPlan, Integer> getRepo() {
		return repo;
	}

	@Override
	protected GenericMapper<StudyPlan, StudyPlanDTO> getMapper() {
		return service;
	}


	public GenericResponse findAllByIdPas(Integer idPas) {

		GenericResponse response = new GenericResponse();
		response.setData(service.mapOutList(repo.findAllByIdPas(idPas)));
		return response;
	}
}
