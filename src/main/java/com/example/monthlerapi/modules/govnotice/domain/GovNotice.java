package com.example.monthlerapi.modules.govnotice.domain;

import com.example.monthlerapi.common.entity.BaseTimeEntity;
import com.example.monthlerapi.modules.govnotice.dto.GovNoticeCreateRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@ToString
@NoArgsConstructor
public class GovNotice extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 키값 자동생성
    private Long govNoticeId;

//    @ManyToOne
//    @JoinColumn(name = "adminId")
//    private Admin admin;

    private Long memberId;

//    @OneToMany(mappedBy = "applicantId")
//    private List<Applicant> applicants = new ArrayList<>();
//
//    @OneToMany(mappedBy = "themeId")
//    private List<Theme> themeList = new ArrayList<>();

    private String title;
    private String region;
    private String city;

    private LocalDate stayStDt; // 체류 시작일
    private LocalDate stayEdDt; // 체류 종료일

    private Integer minNight; // 미션 최소 박수
    private Integer maxNight; // 미션 최대 박수

    private Integer recruitmentTeam; // 모집인원(몇 팀)
    private Integer minPeople; // 최소 인원
    private Integer maxPeople; // 최대 인원

    private Integer supportFund; // 지원금


    private LocalDate recruitmentStDt; // 모집 기간 시작일
    private LocalDate recruitmentEdDt; // 모집 기간 종료일

    private LocalDateTime releaseDt; // 선정 발표일

    private String withChildYn; // 아이 동반 여부 (Y/N)
    private String email;
    private Integer phoneNumber;
    private String noticeLink; // 모집공고 링크
    private String refFile; // 관련 파일 id

    private String mainDesc; // 메인 설명

    @Column(columnDefinition = "TEXT")
    private String detailDesc; // 상세 설명


    public GovNotice(Long memberId, String title, String region, String city, LocalDate stayStDt, LocalDate stayEdDt, Integer minNight, Integer maxNight, Integer recruitmentTeam, Integer minPeople, Integer maxPeople, Integer supportFund, LocalDate recruitmentStDt, LocalDate recruitmentEdDt, LocalDateTime releaseDt, String withChildYn, String email, Integer phoneNumber, String noticeLink, String refFile, String mainDesc, String detailDesc) {
        this.memberId = memberId;
        this.title = title;
        this.region = region;
        this.city = city;
        this.stayStDt = stayStDt;
        this.stayEdDt = stayEdDt;
        this.minNight = minNight;
        this.maxNight = maxNight;
        this.recruitmentTeam = recruitmentTeam;
        this.minPeople = minPeople;
        this.maxPeople = maxPeople;
        this.supportFund = supportFund;
        this.recruitmentStDt = recruitmentStDt;
        this.recruitmentEdDt = recruitmentEdDt;
        this.releaseDt = releaseDt;
        this.withChildYn = withChildYn;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.noticeLink = noticeLink;
        this.refFile = refFile;
        this.mainDesc = mainDesc;
        this.detailDesc = detailDesc;
    }

    public static GovNotice of(GovNoticeCreateRequestDto dto) {
        return new GovNotice(dto.getMemberId(), dto.getTitle(), dto.getRegion(), dto.getCity(), dto.getStayStDt(), dto.getStayEdDt(), dto.getMinNight(), dto.getMaxNight(), dto.getRecruitmentTeam(), dto.getMinPeople(), dto.getMaxPeople(), dto.getSupportFund(), dto.getRecruitmentEdDt(), dto.getRecruitmentStDt(), dto.getReleaseDt(), dto.getWithChildYn(), dto.getEmail(), dto.getPhoneNumber(), dto.getNoticeLink(), dto.getRefFile(), dto.getMainDesc(), dto.getDetailDesc());
    }
}
