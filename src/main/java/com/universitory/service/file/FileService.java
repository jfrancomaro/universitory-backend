package com.universitory.service.file;

import com.universitory.request.FileDTO;
import com.universitory.response.GenericResponse;
import com.universitory.service.GenericService;

public interface FileService extends GenericService<FileDTO, Integer> {

    GenericResponse findAllByIdStudent(Integer idStudent);
}