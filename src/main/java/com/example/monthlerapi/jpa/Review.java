package com.example.monthlerapi.jpa;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Review {

    @Id
    // 키값 자동 생성
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewId;

    @ManyToOne
    @JoinColumn(name = "memberId")
    private Member member;

    @Lob
    @Column(nullable = false)
    private String content;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;
}
