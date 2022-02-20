package com.universitory.service.pas;

import com.universitory.repository.PasRepositoryImpl;
import com.universitory.service.GenericServiceImpl;
import com.universitory.service.GenericMapper;
import com.universitory.model.Pas;
import com.universitory.repository.GenericRepository;
import com.universitory.request.PasDTO;
import com.universitory.service.pas.mapper.PasMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PasServiceImpl extends GenericServiceImpl<Pas, PasDTO, Integer> implements PasService{

	@Autowired
	private PasRepositoryImpl repo;
	@Autowired
	private PasMapper pasMapper;

	@Override
	protected GenericRepository<Pas, Integer> getRepo() {
		return repo;
	}

	@Override
	protected GenericMapper<Pas, PasDTO> getMapper() {
		return pasMapper;
	}
}
