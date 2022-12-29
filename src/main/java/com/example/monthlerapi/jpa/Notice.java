package com.example.monthlerapi.jpa;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Notice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 키값 자동생성
    private Long noticeId;

    @ManyToOne
    @JoinColumn(name = "adminId")
    private Admin admin;

    @OneToMany(mappedBy = "applicantId")
    private List<Applicant> applicants = new ArrayList<>();

    @OneToMany(mappedBy = "themeId")
    private List<Theme> themeList = new ArrayList<>();

    private String title;
    private String region;
    private String city;

    @Temporal(TemporalType.TIMESTAMP)
    private Date period;

    private Integer recruitmentTeam;
    private Integer supportFund;
    private Integer minPeople;
    private Integer maxPeople;

    @Temporal(TemporalType.TIMESTAMP)
    private Date recruitmentStartPeriod;

    @Temporal(TemporalType.TIMESTAMP)
    private Date recruitmentEndPeriod;

    @Temporal(TemporalType.TIMESTAMP)
    private Date announementDay;

    private String accompanyChildYN;
    private String email;
    private Integer phoneNumber;
}
