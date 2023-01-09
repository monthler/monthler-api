package com.example.monthlerapi.jpa;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Applicant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long applicantId;

//    @ManyToOne
//    @JoinColumn(name = "noticeId")
//    private Notice notice;

//    @ManyToOne
//    @JoinColumn(name = "memberId")
//    private Member member;

    @Temporal(TemporalType.TIMESTAMP)
    private Date applyDate;

}
