package com.example.monthlerapi.modules.govnotice.dto;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class GovNoticeRequestDto {
    private Long memberId;
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
    private String detailDesc; // 상세 설명
}
