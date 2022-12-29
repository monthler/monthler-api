package com.example.monthlerapi.jpa;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;

    private String subject;

    @OneToMany(mappedBy = "category")
    List<Theme> themeList = new ArrayList<>();
}
