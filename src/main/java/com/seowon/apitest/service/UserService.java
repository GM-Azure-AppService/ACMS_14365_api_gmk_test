package com.seowon.apitest.service;

import com.seowon.apitest.mapper.UserMapper;
import com.seowon.apitest.model.UserDto;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserMapper userMapper;

    public List<UserDto> getAllUsers() {
        return userMapper.selectAllUsers();
    }

    public UserDto getUserById(String userId) {
        return userMapper.selectUserById(userId);
    }

    public void createUser(UserDto userDTO) {
        userMapper.insertUser(userDTO);
    }

    public void updateUser(UserDto userDTO) {
        userMapper.updateUser(userDTO);
    }

    public void deleteUser(String userId) {
        userMapper.deleteUser(userId);
    }

    public UserDto login(String id, String password) {
        return new UserDto(id, password);
    }

    public void logout(Long userId) {
    }
}
