package com.attendance_system.userLogin.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UserLoginDto {

    @NotNull(message = "username should not be null")
    @NotBlank(message = "username should not be Empty or Blank")
    private String username;

    @NotNull(message = "password should not be null")
    @NotBlank(message = "password should not be Empty or Blank")
    private String password;

}
