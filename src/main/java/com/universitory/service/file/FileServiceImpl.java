package com.universitory.service.file;

import com.universitory.exception.FileStorageException;
import com.universitory.repository.FileRepository;
import com.universitory.response.GenericResponse;
import com.universitory.service.GenericServiceImpl;
import com.universitory.service.GenericMapper;
import com.universitory.model.File;
import com.universitory.repository.GenericRepository;
import com.universitory.request.CourseDTO;
import com.universitory.request.FileDTO;
import com.universitory.request.StudentDTO;
import com.universitory.service.course.CourseService;
import com.universitory.service.file.mapper.FileMapper;
import com.universitory.service.storage.StorageService;
import com.universitory.service.student.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.transaction.Transactional;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//@Slf4j
@Service
//@Transactional
public class FileServiceImpl extends GenericServiceImpl<File, FileDTO,Integer> implements FileService{

    @Autowired
    private FileRepository repository;
    @Autowired
    private FileMapper service;

   /*@Autowired
    private StorageService service;*/
//    @Autowired
//    private CourseService courseService;
//    @Autowired
//    private StudentService studentService;

    //private final Path fileStorageLocation;

    @Override
    protected GenericRepository<File, Integer> getRepo() {
        return repository;
    }

    @Override
    protected GenericMapper<File, FileDTO> getMapper() {
        return service;
    }

    public GenericResponse findAllByIdFile(Integer idFile) {

        GenericResponse response = new GenericResponse();

        response.setData(service.mapOutList(repository.findAllByIdFile(idFile)));
        return response;
    }

    @Override
    public GenericResponse findAllByIdStudent(Integer idStudent) {
        GenericResponse response = new GenericResponse();
        response.setData(service.mapOutList(repository.findAllByIdStudent(idStudent)));
        return response;
    }
    /* @Autowired
    public FileServiceImpl(FileStorageProperties fileStorageProperties) {
        this.fileStorageLocation = Paths.get(fileStorageProperties.getUploadDir())
                .toAbsolutePath().normalize();

        try {
            Files.createDirectories(this.fileStorageLocation);
        } catch (Exception ex) {
            throw new FileStorageException("Could not create the directory where the uploaded files will be stored.", ex);
        }
    }

    @Override
    public FileDTO uploadFile(MultipartFile file, FileDTO fileDTO) {
        if(file == null || fileDTO == null){
            throw new FileStorageException("Enviar un archivo correcto");
        }
        try {
            String url=generateUrl(fileDTO);
            String fileName=service.uploadFile(file,url);//upload S3
            fileDTO.setUrl(url+fileName);
            fileDTO.setName(fileName);
            fileDTO.setType(file.getContentType());
            fileDTO.setSize(file.getSize());
            return this.save(fileDTO);
        }catch (Exception e){
            throw new FileStorageException("No se puede crear el directorio del archivo");
        }
    }

    public Resource loadFileAsResource(Integer idFile) {
        try {
            FileDTO fileDTO =  this.findById(idFile);
            Path filePath = this.fileStorageLocation.resolve(fileDTO.getName()).normalize();
            Resource resource = new UrlResource(filePath.toUri());
            if(resource.exists()) {
                return resource;
            } else {
                throw new MyFileNotFoundException("Archivo no se encuentra " + fileDTO.getName());
            }
        } catch (MalformedURLException ex) {
            throw new MyFileNotFoundException("Archivo no se encuentra ", ex);
        }
    }

    //"ESCUELA/PLAN/CICLO/SEMESTRE/CURSO/CORREO/"
    private String generateUrl(FileDTO fileDTO){
        String url;
        CourseDTO courseDTO=courseService.findById(fileDTO.getCourse().getId());
        StudentDTO studentDTO= studentService.findById(fileDTO.getStudent().getId());
        url=courseDTO.getStudyPlan().getPas().getName()+"/"+courseDTO.getStudyPlan().getPlanName()+"/"+
                courseDTO.getCycle().getName()+"/"+fileDTO.getSemesterName()+"/"+courseDTO.getName()+"/"+
                studentDTO.getEmail()+"/";
        return url;
    }*/


}
