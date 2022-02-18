//package com.universitory.service.user.mapper;
//
//import com.universitory.model.TypeUser;
//import com.universitory.model.User;
//import com.universitory.request.TypeUserDTO;
//import com.universitory.request.UserDTO;
//import com.universitory.service.user.mapper.UserMapper;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//import java.util.Objects;
//import java.util.stream.Collectors;
//
//@Component
//public class UserMapperImpl implements UserMapper {
//
//    @Override
//    public User mapIn(final UserDTO userDTO) {
//        if(userDTO == null){
//            return null;
//        }
//        User user = new User();
//        user.setId(user.getId());
//        user.setUsername(userDTO.getUsername());
//        user.setPass(userDTO.getPass());
//        user.setTypeUser(mapInTypeUser(userDTO.getTypeUser()));
//        return user;
//    }
//
//    private TypeUser mapInTypeUser(final TypeUserDTO typeUser) {
//        if(typeUser == null){
//            return null;
//        }
//        TypeUser typeUser1 = new TypeUser();
//        typeUser1.setName(typeUser.getName());
//        typeUser1.setId(typeUser.getId());
//        return typeUser1;
//    }
//
//    @Override
//    public List<User> mapInList(final List<UserDTO> userDTOList) {
//        return userDTOList.stream().filter(Objects::nonNull)
//                .map(this::mapIn).collect(Collectors.toList());
//    }
//
//    @Override
//    public UserDTO mapOut(final User user) {
//        if(user == null){
//            return null;
//        }
//        UserDTO userDTO = new UserDTO();
//        userDTO.setId(user.getId());
//        userDTO.setUsername(user.getUsername());
//        userDTO.setPass(user.getPass());
//        userDTO.setTypeUser(mapOutTypeUser(user.getTypeUser()));
//        return userDTO;
//    }
//
//    private TypeUserDTO mapOutTypeUser(final TypeUser typeUser) {
//        if(typeUser == null){
//            return null;
//        }
//        TypeUserDTO typeUserDTO = new TypeUserDTO();
//        typeUserDTO.setId(typeUser.getId());
//        typeUserDTO.setName(typeUser.getName());
//        return typeUserDTO;
//    }
//
//    @Override
//    public List<UserDTO> mapOutList(final List<User> userList) {
//        return userList.stream().filter(Objects::nonNull)
//                .map(this::mapOut).collect(Collectors.toList());
//    }
//}
