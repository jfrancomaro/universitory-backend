package com.universitory.repository;

import com.universitory.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryImpl extends GenericRepository<User, Integer> {

}
