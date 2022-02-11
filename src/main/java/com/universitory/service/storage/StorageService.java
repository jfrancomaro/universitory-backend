package com.universitory.service.storage;

import org.springframework.web.multipart.MultipartFile;

/**
 * StorageService
 */
public interface StorageService {

    public String uploadFile(MultipartFile file,String url);

}