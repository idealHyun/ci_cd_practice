package com.practice.ci_cd_practice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Long id;

    @Column(nullable=false)
    private String username;

    @Column(unique=true, nullable=false)
    private String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }
}
