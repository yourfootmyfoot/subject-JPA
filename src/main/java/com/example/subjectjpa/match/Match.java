package com.example.subjectjpa.match;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * JPA 를 이용해서 테이블 만들기
 *
 * @Entity : 해당 클래스를 엔티티로 설정하기 위한 어노테이션
 * 프로젝트 내 다른 패키지에도 동일한 엔티티가 존재하는 경우 엔티티를 식별하기 위한 엔티티
 * 종복되지 않는 이름을 지정해 주어야한다.
 * @Table : 엔티티와 매핑할 테이블을 지정
 */

@Entity(name = "tbl_match")
@Table
public class Match {

    @Id // 기본키 == PK
    @Column(name = "MATCH_ID") // DB 테이블의 컬럼명
    // IDENTITY 전략 : 데이터베이스가 각 행을 삽입할 때 기본 키 값을 자동으로 생성하고, 이 값을 JPA 엔티티에 할당한다.
    // 주로 MySQL, PostgreSQL, SQL Server 등 여러 데이터베이스 시스템에서 지원된다.
    // 데이터베이스의 'AUTO_INCREMENT'기능과 유사하게 동작한다.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT 와 같은 역할 기본키를 자동으로 증가시켜준다.
    private int matchId;

    // 재협님의 club 클래스 필요
    /*
        @Embedded
        private Club MyClub;

        @Embedded
        private Club EnemyClub;
     */

    // 내 구단 아이디
    @Column(name = "MY_CLUB_ID", unique = true, nullable = false)
    private int myClubId;

    // 내 구단 이름
    @Column(name = "MY_CLUB_NAME", unique = true, nullable = false)
    private String myClubName;


    // 상대 구단 아이디 - 다른 시간, 다른 장소에서 같은 팀과 매치 가능
    @Column(name = "ENEMY_CLUB_ID")
    private int enemyClubId;

    // 상대 구단 이름
    @Column(name = "ENEMY_CLUB_NAME")
    private String enemyClubName;

    // 매치 대표사진/로고
    @Column(name = "MATCH_PHOTO")
    private String matchPhoto;

    // 매치 설명
    @Column(name = "MATCH_DESCRIPTION", length = 500)
    private String matchDescription;

    // 경기날짜
    @Column(name = "MATCH_DATE", nullable = false)
    private LocalDate matchDate;

    // 경기 시작 시간
    @Column(name = "MATCH_START_TIME", nullable = false)
    private LocalTime matchStartTime;

    // 경기 종료 시간 - 경기 시작 시간을 설정하면 +2시간을 해주고 뒤에 수정 가능
    @Column(name = "MATCH_END_TIME", nullable = false)
    private LocalTime matchEndTime;

    // 매치 인원 - 11명? 22명?
    @Column(name = "MATCH_PLAYER_QUANTITY", nullable = false)
    private int matchPlayerQuantity;

    // 쿼터 수 - 기본 4쿼터, 경기시간 설정 시 30분으로 나눠서 쿼터 수 자동으로 선택해줌, 수정 가능
    @Column(name = "QUARTER_QUANTITY", nullable = false)
    private int quarterQuantity;

    // 구장 위치
    @Column(name = "FIELD_LOCATION", nullable = false)
    private String fieldLocation;

    // 매치 비용
    @Column(name = "MATCH_COST")
    private int matchCost;

    // 팀원 중 선출 여부
    @Column(name = "NATIVE_PLAYER", nullable = false)
    private String nativePlayer;

    // 실력수치
    @Column(name = "CLUB_LEVEL", nullable = false)
    private int clubLevel;

    // 성별
    @Column(name = "MATCH_GENDER", nullable = false)
    private String matchGender;

    // 경기 상태 - 매칭 전 'N', 진행 중 'Y', 종료 'E'
    @Column(name = "MATCH_STATUS", nullable = false, columnDefinition ="char(1) default 'Y'")
    private String matchStatus;

    public Match() {
    }

    public Match(int clubId, String clubName, int enemyClubId, String enemyClubName,
                 String matchPhoto, String matchDescription, LocalDate matchDate, LocalTime matchStartTime,
                 LocalTime matchEndTime, int matchPlayerQuantity, int quarterQuantity, String fieldLocation,
                 int matchCost, String nativePlayer, int clubLevel, String matchGender, String matchStatus) {

        this.myClubId = clubId;
        this.myClubName = clubName;
        this.enemyClubId = enemyClubId;
        this.enemyClubName = enemyClubName;
        this.matchPhoto = matchPhoto;
        this.matchDescription = matchDescription;
        this.matchDate = matchDate;
        this.matchStartTime = matchStartTime;
        this.matchEndTime = matchEndTime;
        this.matchPlayerQuantity = matchPlayerQuantity;
        this.quarterQuantity = quarterQuantity;
        this.fieldLocation = fieldLocation;
        this.matchCost = matchCost;
        this.nativePlayer = nativePlayer;
        this.clubLevel = clubLevel;
        this.matchGender = matchGender;
        this.matchStatus = matchStatus;
    }

    @Override
    public String toString() {
        return "Match{" +
                ", myClubId='" + myClubId + '\'' +
                ", myClubName='" + myClubName + '\'' +
                ", enemyClubId='" + enemyClubId + '\'' +
                ", enemyClubName='" + enemyClubName + '\'' +
                ", matchPhoto='" + matchPhoto + '\'' +
                ", matchDescription='" + matchDescription + '\'' +
                ", matchDate=" + matchDate +
                ", matchStartTime=" + matchStartTime +
                ", matchEndTime=" + matchEndTime +
                ", matchPlayerQuantity=" + matchPlayerQuantity +
                ", quarterQuantity=" + quarterQuantity +
                ", fieldLocation='" + fieldLocation + '\'' +
                ", matchCost=" + matchCost +
                ", nativePlayer='" + nativePlayer + '\'' +
                ", clubLevel=" + clubLevel +
                ", matchgender='" + matchGender + '\'' +
                ", matchStatus='" + matchStatus + '\'' +
                '}';
    }
}