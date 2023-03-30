package com.nicoesteban.booksapi.user;

import lombok.Value;

import javax.validation.constraints.NotBlank;

@Value
public class UserDTO {

    @NotBlank
    private String email;
    @NotBlank
    private String password;

}
