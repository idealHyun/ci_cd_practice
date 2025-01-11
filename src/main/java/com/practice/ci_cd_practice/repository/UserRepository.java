package com.practice.ci_cd_practice.repository;

import com.practice.ci_cd_practice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
