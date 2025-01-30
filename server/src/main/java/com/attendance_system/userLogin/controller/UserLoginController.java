package com.attendance_system.userLogin.controller;

import com.attendance_system.userLogin.dto.UserLoginDto;
import com.attendance_system.userLogin.util.JwtUtil;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("user/")
@RequiredArgsConstructor
@Slf4j
public class UserLoginController {

    private static final String CREDENTIALS_FILE_PATH = "src/main/resources/userCredentials.json";
    private final JwtUtil jwtUtil;

    @PostMapping("login")
    public String userLogin(
            @Valid @RequestBody UserLoginDto userLoginDto
    ){
        if (isValidUser(userLoginDto.getUsername().toLowerCase(), userLoginDto.getPassword())) {
            return jwtUtil.generateToken(userLoginDto.getUsername());
        } else {
            return "Invalid username or password";
        }
    }

    private boolean isValidUser(String username, String password) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootNode = objectMapper.readTree(new File(CREDENTIALS_FILE_PATH));
            JsonNode users = rootNode.get("users");

            for (JsonNode user : users) {
                if (user.get("username").asText().equals(username) &&
                        user.get("password").asText().equals(password)) {
                    return true;
                }
            }
        } catch (IOException e) {
            log.error(e.getMessage());
            e.printStackTrace();
        }
        return false;
    }
}

