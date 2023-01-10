package com.example.monthlerapi.modules.govnotice.domain;

import com.example.monthlerapi.modules.category.domain.Category;
import com.example.monthlerapi.modules.govnotice.domain.GovNotice;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.FetchType.EAGER;
import static javax.persistence.FetchType.LAZY;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Theme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long themeId;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "govNoticeId")
    @JsonIgnore
    private GovNotice notice;

    @ManyToOne(fetch = EAGER)
    @JoinColumn(name = "categoryId")
    private Category category;

    public void addCategory(Category category){
        this.category = category;
    }
}
