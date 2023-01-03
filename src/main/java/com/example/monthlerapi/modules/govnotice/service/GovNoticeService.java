package com.example.monthlerapi.modules.govnotice.service;

import com.example.monthlerapi.modules.govnotice.dto.GovNoticeRequestDto;
import com.example.monthlerapi.modules.govnotice.domain.GovNotice;
import com.example.monthlerapi.modules.govnotice.repository.GovNoticeRepository;
import com.example.monthlerapi.modules.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class GovNoticeService {

    private final GovNoticeRepository govNoticeRepository;
    private final MemberRepository memberRepository;

    @Transactional
    public void createGovNotice(GovNoticeRequestDto dto) {
        GovNotice govNotice = GovNotice.of(dto, memberRepository.findById(dto.getMemberId()).get());
        govNoticeRepository.save(govNotice);
    }
}