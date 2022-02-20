package com.universitory.repository;

import com.universitory.model.StudyPlan;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudyPlanRepository extends GenericRepository<StudyPlan, Integer> {

	@Query("SELECT sp FROM StudyPlan sp WHERE sp.pas.id = ?1")
	List<StudyPlan> findAllByIdPas(Integer idPas);
}
