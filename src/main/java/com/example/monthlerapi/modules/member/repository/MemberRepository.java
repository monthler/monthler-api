package com.example.monthlerapi.modules.member.repository;

import com.example.monthlerapi.modules.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
