package com.example.subjectjpa.match;

import java.time.LocalDate;
import java.time.LocalTime;

public class MatchRegistRequestDTO {

    private int myClubId;
    private String myClubName;
    private int EnemyClubId;
    private String EnemyClubName;
    private String matchPhoto;
    private String matchDescription;
    private LocalDate matchDate;
    private LocalTime matchStartTime;
    private LocalTime matchEndTime;
    private int matchPlayerQuantity;
    private int quarterQuantity;
    private String fieldLocation;
    private int matchCost;
    private String nativePlayer;
    private int clubLevel;
    private String matchGender;
    private String matchStatus;

    public MatchRegistRequestDTO() {
    }

    public MatchRegistRequestDTO(int myClubId, String myClubName, int enemyClubId, String enemyClubName, String matchPhoto,
                                 String matchDescription, LocalDate matchDate, LocalTime matchStartTime, LocalTime matchEndTime, int matchPlayerQuantity,
                                 int quarterQuantity, String fieldLocation, int matchCost, String nativePlayer, int clubLevel, String matchGender,
                                 String matchStatus) {

        this.myClubId = myClubId;
        this.myClubName = myClubName;
        this.EnemyClubId = enemyClubId;
        this.EnemyClubName = enemyClubName;
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


    public int getMyClubId() {
        return myClubId;
    }

    public void setMyClubId(int myClubId) {
        this.myClubId = myClubId;
    }

    public String getMyClubName() {
        return myClubName;
    }

    public void setMyClubName(String myClubName) {
        this.myClubName = myClubName;
    }

    public int getEnemyClubId() {
        return EnemyClubId;
    }

    public void setEnemyClubId(int enemyClubId) {
        EnemyClubId = enemyClubId;
    }

    public String getEnemyClubName() {
        return EnemyClubName;
    }

    public void setEnemyClubName(String enemyClubName) {
        EnemyClubName = enemyClubName;
    }

    public String getMatchPhoto() {
        return matchPhoto;
    }

    public void setMatchPhoto(String matchPhoto) {
        this.matchPhoto = matchPhoto;
    }

    public String getMatchDescription() {
        return matchDescription;
    }

    public void setMatchDescription(String matchDescription) {
        this.matchDescription = matchDescription;
    }

    public LocalDate getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(LocalDate matchDate) {
        this.matchDate = matchDate;
    }

    public LocalTime getMatchStartTime() {
        return matchStartTime;
    }

    public void setMatchStartTime(LocalTime matchStartTime) {
        this.matchStartTime = matchStartTime;
    }

    public LocalTime getMatchEndTime() {
        return matchEndTime;
    }

    public void setMatchEndTime(LocalTime matchEndTime) {
        this.matchEndTime = matchEndTime;
    }

    public int getMatchPlayerQuantity() {
        return matchPlayerQuantity;
    }

    public void setMatchPlayerQuantity(int matchPlayerQuantity) {
        this.matchPlayerQuantity = matchPlayerQuantity;
    }

    public int getQuarterQuantity() {
        return quarterQuantity;
    }

    public void setQuarterQuantity(int quarterQuantity) {
        this.quarterQuantity = quarterQuantity;
    }

    public String getFieldLocation() {
        return fieldLocation;
    }

    public void setFieldLocation(String fieldLocation) {
        this.fieldLocation = fieldLocation;
    }

    public int getMatchCost() {
        return matchCost;
    }

    public void setMatchCost(int matchCost) {
        this.matchCost = matchCost;
    }

    public String getNativePlayer() {
        return nativePlayer;
    }

    public void setNativePlayer(String nativePlayer) {
        this.nativePlayer = nativePlayer;
    }

    public int getClubLevel() {
        return clubLevel;
    }

    public void setClubLevel(int clubLevel) {
        this.clubLevel = clubLevel;
    }

    public String getMatchGender() {
        return matchGender;
    }

    public void setMatchGender(String matchGender) {
        this.matchGender = matchGender;
    }

    public String getMatchStatus() {
        return matchStatus;
    }

    public void setMatchStatus(String matchStatus) {
        this.matchStatus = matchStatus;
    }

    @Override
    public String toString() {
        return "MatchRegistRequestDTO{" +
                ", myClubId='" + myClubId + '\'' +
                ", myClubName='" + myClubName + '\'' +
                ", EnemyClubId='" + EnemyClubId + '\'' +
                ", EnemyClubName='" + EnemyClubName + '\'' +
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
                ", matchGender='" + matchGender + '\'' +
                ", matchStatus='" + matchStatus + '\'' +
                '}';
    }
}
