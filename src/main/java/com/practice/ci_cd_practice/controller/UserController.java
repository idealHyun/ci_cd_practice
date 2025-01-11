package com.practice.ci_cd_practice.controller;

import com.practice.ci_cd_practice.entity.User;
import com.practice.ci_cd_practice.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        Optional<User> user = userService.findById(id);

        // Optional의 값이 존재하면 반환, 그렇지 않으면 404 상태 반환
        return user.map(ResponseEntity::ok) // Optional 값이 존재하면 HTTP 200 반환
                .orElseGet(() -> ResponseEntity.notFound().build()); // 값이 없으면 HTTP 404 반환
    }

    @PostMapping
    public ResponseEntity<Void> createUser(@RequestBody User user) {
        userService.save(user);

        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        // ID를 통해 사용자 확인 및 삭제
        boolean isDeleted = userService.deleteUser(id);

        if (isDeleted) {
            return ResponseEntity.noContent().build(); // 삭제 성공 -> 204 No Content
        } else {
            return ResponseEntity.notFound().build(); // 삭제할 사용자 없음 -> 404 Not Found
        }
    }
}
