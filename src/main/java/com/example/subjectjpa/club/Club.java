package com.example.subjectjpa.club;

import jakarta.persistence.*;
import org.springframework.context.annotation.ComponentScan;

@Entity
@Table(name = "tbl_club")
@IdClass(CompositeKey.class)
public class Club {


    @Id
    @Column(name = "CLUB_ID")
    private Long clubId;

    @Column
    private String clubOwner;

    @Column
    private String clubName;

    @Column
    private String clubIntroduction;

    @Column
    private String clubCode;

    @Column
    private String peakHours;

}
