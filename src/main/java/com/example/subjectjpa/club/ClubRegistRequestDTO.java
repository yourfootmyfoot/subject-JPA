package com.example.subjectjpa.club;

import com.example.subjectjpa.user.User;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

public class ClubRegistRequestDTO {

    private Long clubId;
    private User clubOwner;
    private String clubName;
    private String clubIntroduction;
    private String clubCode;
    private LocalDateTime erollDate;
    private PeakHours peakHours;
    private List<PeakDays> peakDays;

    public ClubRegistRequestDTO() {
    }

    public ClubRegistRequestDTO(Long clubId, User clubOwner,
                                String clubName, String clubIntroduction,
                                String clubCode, LocalDateTime erollDate,
                                PeakHours peakHours, List<PeakDays> peakDays) {
        this.clubId = clubId;
        this.clubOwner = clubOwner;
        this.clubName = clubName;
        this.clubIntroduction = clubIntroduction;
        this.clubCode = clubCode;
        this.erollDate = erollDate;
        this.peakHours = peakHours;
        this.peakDays = peakDays;
    }

    public Long getClubId() {
        return clubId;
    }

    public void setClubId(Long clubId) {
        this.clubId = clubId;
    }

    public User getClubOwner() {
        return clubOwner;
    }

    public void setClubOwner(User clubOwner) {
        this.clubOwner = clubOwner;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getClubIntroduction() {
        return clubIntroduction;
    }

    public void setClubIntroduction(String clubIntroduction) {
        this.clubIntroduction = clubIntroduction;
    }

    public String getClubCode() {
        return clubCode;
    }

    public void setClubCode(String clubCode) {
        this.clubCode = clubCode;
    }

    public LocalDateTime getErollDate() {
        return erollDate;
    }

    public void setErollDate(LocalDateTime erollDate) {
        this.erollDate = erollDate;
    }

    public PeakHours getPeakHours() {
        return peakHours;
    }

    public void setPeakHours(PeakHours peakHours) {
        this.peakHours = peakHours;
    }

    public List<PeakDays> getPeakDays() {
        return peakDays;
    }

    public void setPeakDays(List<PeakDays> peakDays) {
        this.peakDays = peakDays;
    }

    @Override
    public String toString() {
        return "ClubRegistRequestDTO{" +
                "clubId=" + clubId +
                ", clubOwner=" + clubOwner +
                ", clubName='" + clubName + '\'' +
                ", clubIntroduction='" + clubIntroduction + '\'' +
                ", clubCode='" + clubCode + '\'' +
                ", erollDate=" + erollDate +
                ", peakHours=" + peakHours +
                ", peakDays=" + peakDays +
                '}';
    }
}
