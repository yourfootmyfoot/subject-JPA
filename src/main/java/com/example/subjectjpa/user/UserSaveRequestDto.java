package com.example.subjectjpa.user;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class UserSaveRequestDto {

    private String userName;
    private LocalDateTime enrollDate;
    private UserRole userRole;
}
