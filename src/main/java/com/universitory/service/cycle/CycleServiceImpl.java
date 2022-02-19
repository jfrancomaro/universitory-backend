//package com.universitory.service.cycle;
//
//import com.universitory.repository.CycleRepositoryImpl;
//import com.universitory.service.GenericServiceImpl;
//import com.universitory.service.GenericMapper;
//import com.universitory.model.Cycle;
//import com.universitory.repository.GenericRepository;
//import com.universitory.request.CycleDTO;
//import com.universitory.service.cycle.mapper.CycleMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class CycleServiceImpl extends GenericServiceImpl<Cycle, CycleDTO, Integer> implements CycleService{
//
//	@Autowired
//	private CycleRepositoryImpl repo;
//	@Autowired
//	private CycleMapper service;
//
//	@Override
//	protected GenericMapper<Cycle, CycleDTO> getMapper() {
//		return service;
//	}
//
//	@Override
//	protected GenericRepository<Cycle, Integer> getRepo() {
//		return repo;
//	}
//}
