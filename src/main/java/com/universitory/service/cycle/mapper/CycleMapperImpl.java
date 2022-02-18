//package com.universitory.service.cycle.mapper;
//
//import com.universitory.model.Cycle;
//import com.universitory.request.CycleDTO;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//import java.util.Objects;
//import java.util.stream.Collectors;
//
//@Component
//public class CycleMapperImpl  implements CycleMapper {
//
//    @Override
//    public Cycle mapIn(final CycleDTO cycleDTO) {
//        if(cycleDTO == null){
//            return null;
//        }
//        Cycle cycle = new Cycle();
//        cycle.setName(cycleDTO.getName());
//        cycle.setId(cycleDTO.getId());
//        return cycle;
//    }
//
//    @Override
//    public List<Cycle> mapInList(final List<CycleDTO> cycleDTOList) {
//        return cycleDTOList.stream().filter(Objects::nonNull)
//                .map(this::mapIn).collect(Collectors.toList());
//    }
//
//    @Override
//    public CycleDTO mapOut(final Cycle cycle) {
//        if(cycle == null){
//            return null;
//        }
//        CycleDTO cycleDTO = new CycleDTO();
//        cycleDTO.setId(cycle.getId());
//        cycleDTO.setName(cycle.getName());
//        return cycleDTO;
//    }
//
//    @Override
//    public List<CycleDTO> mapOutList(final List<Cycle> cycleList) {
//        return cycleList.stream().filter(Objects::nonNull)
//                .map(this::mapOut).collect(Collectors.toList());
//    }
//}
