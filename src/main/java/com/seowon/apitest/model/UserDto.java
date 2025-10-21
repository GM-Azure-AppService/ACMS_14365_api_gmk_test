package com.seowon.apitest.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDto {
    private String id;
    private String password;
    private String name;
    private String email;

    public UserDto(String id, String password){
        this.id = id;
        this.password = password;
    }
}
