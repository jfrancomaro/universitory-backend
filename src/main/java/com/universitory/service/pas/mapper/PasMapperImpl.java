package com.universitory.service.pas.mapper;

import com.universitory.model.Department;
import com.universitory.request.PasDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class PasMapperImpl implements PasMapper{

    @Override
    public Department mapIn(final PasDTO pasDTO) {
        if(pasDTO == null){
            return null;
        }
        Department department = new Department();
        department.setId(pasDTO.getId());
        department.setName(pasDTO.getName());
        return department;
    }

    @Override
    public List<Department> mapInList(final List<PasDTO> pasDTOList) {
        return pasDTOList.stream().filter(Objects::nonNull)
                .map(this::mapIn).collect(Collectors.toList());
    }

    @Override
    public PasDTO mapOut(final Department department) {
        PasDTO pasDTO = new PasDTO();
        pasDTO.setName(department.getName());
        pasDTO.setId(department.getId());
        return pasDTO;
    }

    @Override
    public List<PasDTO> mapOutList(final List<Department> pasList) {
        return pasList.stream().filter(Objects::nonNull)
                .map(this::mapOut).collect(Collectors.toList());
    }
}
