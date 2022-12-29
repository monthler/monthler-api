package com.example.monthlerapi.jpa;

import javax.persistence.*;

@Entity
public class Theme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long themeId;

    @ManyToOne
    @JoinColumn(name = "noticeId")
    private Notice notice;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Category category;
}
