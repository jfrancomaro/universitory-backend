package com.universitory.service.user;

import com.universitory.service.GenericService;
import com.universitory.request.UserDTO;

public interface UserService extends GenericService<UserDTO, Integer>{

    UserDTO findUserByUserName(String userName);
    UserDTO sigIn(String userName, String password);
}
