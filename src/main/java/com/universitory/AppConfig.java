package com.universitory;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

//@Configuration
public class AppConfig extends WebMvcConfigurationSupport {

    /**
     * Bean PasswordEncoder: BCrypt,
     * Generate password for testing: https://bcrypt-generator.com/
     */
    //@Bean
    /*public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }*/
}
