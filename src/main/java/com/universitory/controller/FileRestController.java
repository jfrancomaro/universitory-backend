package com.universitory.controller;

import com.fasterxml.jackson.core.JsonProcessingException;

import com.universitory.request.FileDTO;
import com.universitory.response.GenericResponse;
import com.universitory.service.file.FileService;
import com.universitory.util.ObjectMapperJSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/files")
public class FileRestController {

    private final FileService service;

    @Autowired
    public FileRestController(FileService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<GenericResponse> findAll() {

        GenericResponse response = service.findAll();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GenericResponse> getForId(@PathVariable("id") Integer id) {
        GenericResponse response = service.findById(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<GenericResponse> getFilesByStudent(@PathVariable("id") Integer id) {
        GenericResponse response = service.findAllByIdStudent(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

//    @PostMapping("/uploadFile")
//    public ResponseEntity<GenericResponse<FileDTO>> uploadFile(@RequestParam("file")MultipartFile file,
//                                                               @RequestParam("fileInfo") String fileInfo) throws JsonProcessingException{
//
//    	FileDTO fileDTO = ObjectMapperJSON.getInstance().readObjectByString(fileInfo,FileDTO.class);
//    	GenericResponse<FileDTO> response = new GenericResponse<>();
//    	response.setData(fileService.uploadFile(file, fileDTO));
//        return new ResponseEntity<>(response,HttpStatus.ACCEPTED);
//    }
//
//
//    @GetMapping("/downloadFile/{idFile}")
//    public ResponseEntity<Resource> downloadFile(@PathVariable("idFile") Integer idFile, HttpServletRequest request) {
//        Resource resource = fileService.loadFileAsResource(idFile);
//        String contentType = null;
//        try {
//            contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
//        } catch (IOException ex) {
//            //logger.info("Could not determine file type.");
//        }
//        if(contentType == null) {
//            contentType = "application/octet-stream";
//        }
//
//        return ResponseEntity.ok()
//                .contentType(MediaType.parseMediaType(contentType))
//                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
//                .body(resource);
//    }


}
