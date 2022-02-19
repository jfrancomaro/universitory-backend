//package com.universitory.service.studyplan;
//
//import com.universitory.service.GenericServiceImpl;
//import com.universitory.service.GenericMapper;
//import com.universitory.model.StudyPlan;
//import com.universitory.repository.GenericRepository;
//import com.universitory.repository.StudyPlanRepositoryImpl;
//import com.universitory.request.StudyPlanDTO;
//import com.universitory.service.studyplan.mapper.StudyPlanMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class StudyPlanServiceImpl extends GenericServiceImpl<StudyPlan, StudyPlanDTO, Integer> implements StudyPlanService {
//
//    @Autowired
//    private StudyPlanRepositoryImpl repo;
//    @Autowired
//    private StudyPlanMapper service;
//
//	@Override
//	protected GenericRepository<StudyPlan, Integer> getRepo() {
//		return repo;
//	}
//
//	@Override
//	protected GenericMapper<StudyPlan, StudyPlanDTO> getMapper() {
//		return service;
//	}
//
//    @Override
//	public List<StudyPlanDTO> findAllByIdPas(Integer idPas) {
//		return service.mapOutList(repo.findAllByIdPas(idPas));
//	}
//}
