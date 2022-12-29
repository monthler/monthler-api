package com.example.monthlerapi.jpa;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Member {

    @Id
    private String memberId;

    @OneToMany(mappedBy = "member")
    List<Review> reviews = new ArrayList<>();

    @Column(nullable = false)
    private Integer passwd;

    private String name;
}
