package com.universitory.service.studyplan;

import com.universitory.service.GenericService;
import com.universitory.request.StudyPlanDTO;

import java.util.List;

public interface StudyPlanService extends GenericService<StudyPlanDTO, Integer>{

	List<StudyPlanDTO> findAllByIdPas(Integer idPas);
}
