package com.example.monthlerapi.modules.govnotice.repository;


import com.example.monthlerapi.modules.govnotice.domain.GovNotice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GovNoticeRepository extends JpaRepository<GovNotice, Long> {
}
