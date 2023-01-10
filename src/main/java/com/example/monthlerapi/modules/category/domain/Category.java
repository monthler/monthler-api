package com.example.monthlerapi.modules.category.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
// 추후 코드관리 테이블로 변환?
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;

    private String subject;
}
