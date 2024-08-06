package com.example.subjectjpa.user;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class User {

    @Id
    @GeneratedValue
    @Column(name = "user_id", unique = true, nullable = false)
    private Long userId;

    @Column(name = "user_name", nullable = false)
    private String userName;

    @Column(name = "enroll_date", nullable = false)
    private LocalDateTime enrollDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "user_role", nullable = false)
    private UserRole userRole;

    protected User() {}

    public User(String userName, LocalDateTime enrollDate, UserRole userRole) {
        this.userName = userName;
        this.enrollDate = enrollDate;
        this.userRole = userRole;
    }
}
