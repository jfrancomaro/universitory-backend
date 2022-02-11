package com.universitory.repository;

import com.universitory.model.File;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends GenericRepository<File,Integer> {
}
