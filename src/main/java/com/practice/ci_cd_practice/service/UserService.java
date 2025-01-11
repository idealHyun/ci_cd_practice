package com.practice.ci_cd_practice.service;

import com.practice.ci_cd_practice.entity.User;
import com.practice.ci_cd_practice.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    public void save(User user) {
        userRepository.save(user);
    }

    public boolean deleteUser(Long id) {
        Optional<User> existingUser = userRepository.findById(id);

        if (existingUser.isPresent()) {
            userRepository.delete(existingUser.get());
            return true; // 삭제 성공
        } else {
            return false; // 삭제할 사용자 없음
        }
    }
}
