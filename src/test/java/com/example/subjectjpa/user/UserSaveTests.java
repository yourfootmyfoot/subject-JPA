package com.example.subjectjpa.user;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.stream.Stream;

import static com.example.subjectjpa.user.UserRole.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
public class UserSaveTests {

    @Autowired
    private UserService userService;

    private static Stream<Arguments> getUserInfo() {
        return Stream.of(
                Arguments.of(
                        "테스트 유저 1",
                        LocalDateTime.now(),
                        ROLE_USER
                ),
                Arguments.of(
                        "테스트 어드민 1",
                        LocalDateTime.now(),
                        ROLE_ADMIN
                )
        );
    }

    @DisplayName("테이블, 유저 생성 테스트")
    @ParameterizedTest
    @MethodSource("getUserInfo")
    void userSaveTest(String userName, LocalDateTime enrollDate, UserRole userRole) {

        UserSaveRequestDto dto = new UserSaveRequestDto(userName, enrollDate, userRole);

        assertDoesNotThrow(
                () -> userService.save(dto)
        );
    }
}
