package com.universitory.service;

import java.util.List;

public interface GenericService<D, I> {

	D save(D d);
	D update(D d);
	List<D> findAll();
	D findById(I id);
	void delete(I id);
}
