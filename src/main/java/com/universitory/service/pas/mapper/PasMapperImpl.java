package com.universitory.service.pas.mapper;

import com.universitory.model.Pas;
import com.universitory.request.PasDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class PasMapperImpl implements PasMapper{

    @Override
    public Pas mapIn(final PasDTO pasDTO) {
        if(pasDTO == null){
            return null;
        }
        Pas pas = new Pas();
        pas.setId(pasDTO.getId());
        pas.setName(pasDTO.getName());
        pas.setCode(pasDTO.getCode());
        pas.setDescription(pasDTO.getDescription());
        return pas;
    }

    @Override
    public List<Pas> mapInList(final List<PasDTO> pasDTOList) {
        return pasDTOList.stream().filter(Objects::nonNull)
                .map(this::mapIn).collect(Collectors.toList());
    }

    @Override
    public PasDTO mapOut(final Pas pas) {
        PasDTO pasDTO = new PasDTO();
        pasDTO.setName(pas.getName());
        pasDTO.setId(pas.getId());
        pasDTO.setCode(pas.getCode());
        pasDTO.setDescription(pas.getDescription());
        return pasDTO;
    }

    @Override
    public List<PasDTO> mapOutList(final List<Pas> pasList) {
        return pasList.stream().filter(Objects::nonNull)
                .map(this::mapOut).collect(Collectors.toList());
    }
}
