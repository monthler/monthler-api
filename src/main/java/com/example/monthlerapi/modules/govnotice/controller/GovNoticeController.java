package com.example.monthlerapi.modules.govnotice.controller;

import com.example.monthlerapi.modules.govnotice.dto.GovNoticeRequestDto;
import com.example.monthlerapi.modules.govnotice.service.GovNoticeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequiredArgsConstructor
public class GovNoticeController {

    private final GovNoticeService govNoticeService;

    @PostMapping(value = "/api/gov-notice")
    public ResponseEntity<?> createGovNotice(@RequestBody GovNoticeRequestDto dto) {
        // TODO: Member Spring Security 로 붙여야 함
        govNoticeService.createGovNotice(dto);

        // result
        // TODO: 응답 처리 구조 생성 필요
        HashMap<String,Object> result = new HashMap<>();
        result.put("message", "정부공고 등록 완료.");
        result.put("code", "00"); // success

        return ResponseEntity.ok(result);
    }

}
