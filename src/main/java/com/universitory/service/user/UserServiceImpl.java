package com.universitory.service.user;

//import com.fisirepository.application.user.service.UserMapper;
//import com.universitory.service.GenericServiceImpl;
//import com.universitory.service.GenericMapper;
//import com.universitory.model.User;
//import com.universitory.repository.GenericRepository;
//import com.universitory.repository.user.UserRepositoryImpl;
//import com.fisirepository.web.exception.UserNameOrPasswordWrongException;
//import com.universitory.request.UserDTO;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

//@Slf4j
@Service
public class UserServiceImpl {//extends GenericServiceImpl<User, UserDTO, Integer> implements UserService {

//	@Autowired
//	private UserRepositoryImpl repo;
//	@Autowired
//	private UserMapper service;
//
//	@Autowired
//	private PasswordEncoder passwordEncoder;
//
//	@Override
//	protected GenericRepository<User, Integer> getRepo() {
//		return repo;
//	}
//
//	@Override
//	protected GenericMapper<User, UserDTO> getMapper() {
//		return service;
//	}
//
//	@Override
//	public UserDTO findUserByUserName(String userName) {
//		return null;
//	}
//
//	@Override
//	public UserDTO sigIn(String userName, String password) {
//		UserDTO auth = findUserByUserName(userName);
//		if (auth != null) {
//			log.info("User request sigIn -> " + auth.getUsername());
//			boolean isPasswordMatches = this.passwordEncoder.matches(password, auth.getPass());
//			System.out.println(isPasswordMatches);
//			if (isPasswordMatches) {
//				auth.setPass("*****");
//				return auth;
//			}
//		}
//		throw new UserNameOrPasswordWrongException("Username or password are incorrect");
//	}
}
