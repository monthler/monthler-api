package com.example.monthlerapi.modules.govnotice.service;

import com.example.monthlerapi.modules.category.repository.CategoryRepository;
import com.example.monthlerapi.modules.govnotice.dto.GovNoticeRequestDto;
import com.example.monthlerapi.modules.govnotice.domain.GovNotice;
import com.example.monthlerapi.modules.govnotice.dto.GovNoticeResponseDto;
import com.example.monthlerapi.modules.govnotice.repository.GovNoticeRepository;
import com.example.monthlerapi.modules.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class GovNoticeService {

    private final GovNoticeRepository govNoticeRepository;
    private final CategoryRepository categoryRepository;
    private final ModelMapper modelMapper;

    @Transactional
    public GovNoticeResponseDto getGovNotice(Long govNoticeId){
        GovNotice govNotice = govNoticeRepository.findById(govNoticeId).get();
        GovNoticeResponseDto govNoticeResponseDto = modelMapper.map(govNotice, GovNoticeResponseDto.class);
        govNoticeResponseDto.settingThemeList(govNotice);
        return govNoticeResponseDto;
    }

    @Transactional
    public List<GovNoticeResponseDto> getGovNoticeList() {
        List<GovNoticeResponseDto> govNoticeResponseDtoList = new ArrayList<>();
        govNoticeRepository.findAll().forEach(govNotice -> {
            GovNoticeResponseDto govNoticeResponseDto = modelMapper.map(govNotice, GovNoticeResponseDto.class);
            govNoticeResponseDto.settingThemeList(govNotice);
            govNoticeResponseDtoList.add(govNoticeResponseDto);
        });

        return govNoticeResponseDtoList;
    }

    @Transactional
    public void deleteByGovNoticeId(Long govNoticeId) {

    }
}