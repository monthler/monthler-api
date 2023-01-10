package com.example.monthlerapi.modules.govnotice.domain;

import com.example.monthlerapi.common.entity.BaseTimeEntity;
import com.example.monthlerapi.modules.member.domain.Member;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.FetchType.EAGER;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class GovNotice extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 키값 자동생성
    private Long govNoticeId;

//    @ManyToOne
//    @JoinColumn(name = "adminId")
//    private Admin admin;

    @ManyToOne(fetch = EAGER)
    @JoinColumn(name = "member_id")
    private Member member;

    //    @OneToMany(mappedBy = "applicantId")
//    private List<Applicant> applicants = new ArrayList<>();
//
    // OneToMany는 기본적으로 LAZY
    // GovNotice에서 thmeeList를 호출하는 시점에서는 LAZY여도 상관이 없으나
    // Theme 객체 안의 Category는 ManyToOne이라 강의에선 모두 LAZY로 셋팅할것을 얘기하였으나
    // dto를 사용하지 않을 경우 Theme 시점에 Category가 존재해야하기 떄문에 eager로 사용해야한다.
    @OneToMany(mappedBy = "notice", cascade = CascadeType.ALL)
    private List<Theme> themeList = new ArrayList<>();

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

    private LocalDate releaseDt; // 선정 발표일

    private String withChildYn; // 아이 동반 여부 (Y/N)
    private String email;
    private String phoneNumber;
    private String noticeLink; // 모집공고 링크
    private String refFile; // 관련 파일 id

    private String mainDesc; // 메인 설명

    @Column(columnDefinition = "TEXT")
    private String detailDesc; // 상세 설명

    public List<String> retrieveThemeStringList(GovNotice govNotice){
        List<Theme> themeList = govNotice.getThemeList();
        List<String> themeStringList = new ArrayList<>();
        for(int i=0; i<themeList.size(); i++){
            themeStringList.add(themeList.get(i).getCategory().getSubject());
        }
        return themeStringList;
    }

}