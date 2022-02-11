package com.universitory.service.file;

import com.universitory.request.FileDTO;
import com.universitory.service.GenericService;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface FileService extends GenericService<FileDTO, Integer> {

   FileDTO uploadFile(MultipartFile file,FileDTO fileDTO);

   Resource loadFileAsResource(Integer idFile);
}
