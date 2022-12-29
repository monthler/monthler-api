package com.example.monthlerapi.jpa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin {
    @Id
    private String adminId;
    @Column(nullable = false)
    private Integer passwd;
    private String name;

    @OneToMany(mappedBy = "admin")
    List<Notice> notices = new ArrayList<>();
}
