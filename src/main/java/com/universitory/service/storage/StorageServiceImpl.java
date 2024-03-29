package com.universitory.service.storage;

//import com.amazonaws.services.s3.AmazonS3;
//impo/rt com.amazonaws.services.s3.model.PutObjectRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * StorageServiceImpl
 */
@Service
@Slf4j
public class StorageServiceImpl {//implements StorageService {

    @Value("${application.bucket.name}")
    private String bucketName;

   /* @Autowired
    private AmazonS3 s3Client;

    public String uploadFile(MultipartFile file,String url) {
        File fileObj = convertMultiPartFileToFile(file);
        String fileName = System.currentTimeMillis() + "_" + file.getOriginalFilename();
        s3Client.putObject(new PutObjectRequest(bucketName, url+fileName, fileObj));
        fileObj.delete();
        return fileName;
    }

    private File convertMultiPartFileToFile(MultipartFile file) {
        File convertedFile = new File(file.getOriginalFilename());
        try (FileOutputStream fos = new FileOutputStream(convertedFile)) {
            fos.write(file.getBytes());
        } catch (IOException e) {
            log.error("Error converting multipartFile to file", e);
        }
        return convertedFile;
    }*/

}