package com.example.monthlerapi.modules.category.repository;

import com.example.monthlerapi.modules.category.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
