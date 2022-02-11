package com.universitory.controller;

//import com.fisirepository.application.user.UserService;
//import com.fisirepository.web.model.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@RequestMapping("api/v1/authentication")
public class AuthenticationController {

    /*private final UserService userService;

    public AuthenticationController(final UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserDTO> sigInWithUserNameAndPassword(
            @RequestBody UserDTO user) {
        user = userService.sigIn(user.getUsername(), user.getPass());
        return ResponseEntity.ok().body(user);
    }
*/
}
