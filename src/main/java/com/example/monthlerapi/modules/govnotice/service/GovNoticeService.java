package com.example.monthlerapi.modules.govnotice.service;

import com.example.monthlerapi.modules.govnotice.dto.GovNoticeCreateRequestDto;
import com.example.monthlerapi.modules.govnotice.domain.GovNotice;
import com.example.monthlerapi.modules.govnotice.repository.GovNoticeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class GovNoticeService {

    private final GovNoticeRepository govNoticeRepository;

    @Transactional
    public void createGovNotice(GovNoticeCreateRequestDto dto) {
        govNoticeRepository.save(GovNotice.of(dto));
    }
}
