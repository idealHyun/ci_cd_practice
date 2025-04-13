package com.practice.ci_cd_practice;

import com.practice.ci_cd_practice.entity.User;
import com.practice.ci_cd_practice.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CiCdPracticeApplicationTests {
//
//    @Autowired
//    private UserRepository userRepository;
//    private User pepper;
//
//    @BeforeEach
//    void setUp() {
//        pepper = userRepository.save(new User("pepper", "pepper@naver.com"));
//    }
//
//    @Test
//    void find(){
//        Optional<User> findUser = userRepository.findById(pepper.getId());
//
//        assertThat(findUser).hasValue(pepper);
//    }
//
//    @Test
//    void delete(){
//        userRepository.deleteById(pepper.getId());
//
//        assertThat(userRepository.findById(pepper.getId())).isEmpty();
//    }
}
