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

    @GetMapping("/api/gov-notice/{govNoticeId}")
    public ResponseEntity<?> govNoticeDetail(@PathVariable Long govNoticeId){
        HashMap<String,Object> result = new HashMap<>();
        result.put("data", govNoticeService.getGovNotice(govNoticeId));
        return ResponseEntity.ok(result);
    }

}
