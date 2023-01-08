package com.example.monthlerapi.modules.govnotice.controller;

import com.example.monthlerapi.modules.govnotice.domain.GovNotice;
import com.example.monthlerapi.modules.govnotice.dto.GovNoticeRequestDto;
import com.example.monthlerapi.modules.govnotice.service.GovNoticeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequiredArgsConstructor
public class GovNoticeController {
    private final GovNoticeService govNoticeService;

    @GetMapping("/gov-notice/{govNoticeId}")
    public GovNotice govNoticeDetail(@PathVariable Long govNoticeId){
        // model.addAttribute("govNotice", govNoticeService.getGovNotice(govNoticeId).get());
        return govNoticeService.getGovNotice(govNoticeId).get();
    }

}
