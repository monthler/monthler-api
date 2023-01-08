package com.example.monthlerapi.modules.govnotice.service;

import com.example.monthlerapi.modules.category.repository.CategoryRepository;
import com.example.monthlerapi.modules.govnotice.dto.GovNoticeRequestDto;
import com.example.monthlerapi.modules.govnotice.domain.GovNotice;
import com.example.monthlerapi.modules.govnotice.repository.GovNoticeRepository;
import com.example.monthlerapi.modules.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GovNoticeService {

    private final GovNoticeRepository govNoticeRepository;
    private final CategoryRepository categoryRepository;
    private final ModelMapper modelMapper;

    @Transactional
    public Optional<GovNotice> getGovNotice(Long govNoticeId){
        GovNotice test = govNoticeRepository.findById(govNoticeId).get();
        System.out.println(test.getCity());
        return govNoticeRepository.findById(govNoticeId);
    }

    @Transactional
    public List<GovNotice> getGovNoticeList() {
        return govNoticeRepository.findAll();
    }

    @Transactional
    public void deleteByGovNoticeId(Long govNoticeId) {

    }
}