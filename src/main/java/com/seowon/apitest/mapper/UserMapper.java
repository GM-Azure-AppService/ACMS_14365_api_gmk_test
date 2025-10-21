package com.seowon.apitest.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.seowon.apitest.model.UserDto;

import java.util.List;

@Mapper
public interface UserMapper {
    void insertUser(UserDto userDto);

    void updateUser(UserDto userDto);

    void deleteUser(String userId);

    UserDto selectUserById(String userId);

    List<UserDto> selectAllUsers();
}
