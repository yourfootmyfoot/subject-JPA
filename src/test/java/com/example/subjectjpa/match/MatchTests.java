package com.example.subjectjpa.match;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.stream.Stream;

@SpringBootTest
@Transactional
public class MatchTests {

    @Autowired
    private MatchRegistService matchRegistService;

    private static Stream<Arguments> createMatch() {
        return Stream.of(
                Arguments.of(
                        1, // myClubId
                        "갓핸드", // myClubName
                        1, // enemyClubId
                        "메타버스", // enemyClubName
                        "멋진 우리팀  단체사진", // match
                        "열심히 합시다.",
                        LocalDate.now(),
                        LocalTime.now(),
                        LocalTime.now(),
                        11,
                        10000,
                        "안양 운동장",
                        10000,
                        "박지성",
                        5,
                        "남성",
                        "Y"

                )
        );
    }

    @DisplayName("매치 테이블 만들기 테스트")
    @ParameterizedTest
    @MethodSource("createMatch")
    void testCreateMatch(int myClubId, String myClubName, int enemyClubId, String enemyClubName, String matchPhoto,
                         String matchDescription, LocalDate matchDate, LocalTime matchStartTime, LocalTime matchEndTime, int matchPlayerQuantity,
                         int quarterQuantity, String fieldLocation, int matchCost, String nativePlayer, int clubLevel, String matchGender,
                         String matchStatus) {

        MatchRegistRequestDTO matchInfo = new MatchRegistRequestDTO(
                myClubId,
                myClubName,
                enemyClubId,
                enemyClubName,
                matchPhoto,
                matchDescription,
                matchDate,
                matchStartTime,
                matchEndTime,
                matchPlayerQuantity,
                quarterQuantity,
                fieldLocation,
                matchCost,
                nativePlayer,
                clubLevel,
                matchGender,
                matchStatus
        );
        Assertions.assertDoesNotThrow( // exception 이 발생하지 않으면 true
                () -> matchRegistService.registMatch(matchInfo));
    }
}
