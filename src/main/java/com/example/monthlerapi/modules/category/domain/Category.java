package com.example.monthlerapi.modules.category.domain;

import com.example.monthlerapi.modules.theme.domain.Theme;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
// 추후 코드관리 테이블로 변환?
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;

    private String subject;
}
