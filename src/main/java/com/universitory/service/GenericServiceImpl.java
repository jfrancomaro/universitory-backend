package com.universitory.service;

import com.universitory.exception.NoSuchElementFoundException;
import com.universitory.repository.GenericRepository;
import com.universitory.response.GenericResponse;

public abstract class GenericServiceImpl<E,D, I> implements GenericService<D,I> {

	protected abstract GenericRepository<E, I> getRepo();
	protected abstract GenericMapper<E,D> getMapper();

	@Override
	public GenericResponse save(D obj) {
		GenericResponse response = new GenericResponse();
		response.setData(getMapper().mapOut(getRepo().save(getMapper().mapIn(obj))));
		return response;
	}

	@Override
	public GenericResponse update(I id, D obj) {
		GenericResponse obj2 = this.findById(id);
		if (obj2 != null) {
			GenericResponse response = new GenericResponse();
			response.setData(this.save(obj));
			return response;
		}
		return null;
	}

	@Override
	public GenericResponse findAll() {
		GenericResponse response = new GenericResponse();
		response.setData(getMapper().mapOutList(getRepo().findAll()));
		return response;
	}

	@Override
	public GenericResponse findById(I id) {
		GenericResponse response = new GenericResponse();
		response.setData(getMapper().mapOut(getRepo().findById(id).orElseThrow(
				()-> new NoSuchElementFoundException("Recurso no encontrado"))));
		return response;
	}

	@Override
	public GenericResponse delete(I id) {
		GenericResponse response = new GenericResponse();
		getRepo().deleteById(id);
		return response;
	}
}
