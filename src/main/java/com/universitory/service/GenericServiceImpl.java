package com.universitory.service;

import com.universitory.exception.NoSuchElementFoundException;
import com.universitory.repository.GenericRepository;

import java.util.List;

public abstract class GenericServiceImpl<E,D, I> implements GenericService<D,I> {

	protected abstract GenericRepository<E, I> getRepo();
	protected abstract GenericMapper<E,D> getMapper();

	@Override
	public D save(D obj) {
		return getMapper().mapOut(getRepo().save(getMapper().mapIn(obj)));
	}

	@Override
	public D update(D obj) {
		return this.save(obj);
	}

	@Override
	public List<D> findAll() {
		return getMapper().mapOutList(getRepo().findAll());
	}

	@Override
	public D findById(I id) {
		return getMapper().mapOut(getRepo().findById(id).orElseThrow(
				()-> new NoSuchElementFoundException("Recurso no encontrado")));
	}

	@Override
	public void delete(I id) {
		getRepo().deleteById(id);
	}
}
