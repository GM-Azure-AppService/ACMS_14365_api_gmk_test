package com.seowon.apitest.controller;

import com.seowon.apitest.model.UserDto;
import com.seowon.apitest.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 쇼핑몰 회원 관리 컨트롤러
 * 회원 CRUD 및 인증 관련 API 제공하되, mapper / model / service 의 메서드를 보고 설계해줘
 */
@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
@Tag(name = "User", description = "회원 관리 API")
public class UserController {

    private final UserService userService;

    @GetMapping
    @Operation(summary = "전체 회원 조회", description = "모든 회원 정보를 조회합니다.")
    public List<UserDto> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{userId}")
    @Operation(summary = "회원 조회", description = "특정 회원 정보를 조회합니다.")
    public UserDto getUser(
            @Parameter(description = "회원 ID") @PathVariable String userId) {
        return userService.getUserById(userId);
    }

    @PostMapping
    @Operation(summary = "회원 등록", description = "새로운 회원을 등록합니다.")
    public void createUser(
            @Parameter(description = "회원 정보") @RequestBody UserDto userDTO) {
        userService.createUser(userDTO);
    }

    @PutMapping
    @Operation(summary = "회원 수정", description = "회원 정보를 수정합니다.")
    public void updateUser(
            @Parameter(description = "수정할 회원 정보") @RequestBody UserDto userDTO) {
        userService.updateUser(userDTO);
    }

    @DeleteMapping("/{userId}")
    @Operation(summary = "회원 삭제", description = "회원을 삭제합니다.")
    public void deleteUser(
            @Parameter(description = "회원 ID") @PathVariable String userId) {
        userService.deleteUser(userId);
    }
}
