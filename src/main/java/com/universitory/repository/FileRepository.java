package com.universitory.repository;

import com.universitory.model.File;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FileRepository extends GenericRepository<File,Integer> {
    @Query("SELECT file FROM File file WHERE file.id = ?1")
    List<File> findAllByIdFile(Integer idFile);
}
