package com.universitory.service;

import com.universitory.response.GenericResponse;

public interface GenericService<D, I> {

	GenericResponse save(D d);
	GenericResponse update(I id, D d);
	GenericResponse findAll();
	GenericResponse findById(I id);
	GenericResponse delete(I id);
}
