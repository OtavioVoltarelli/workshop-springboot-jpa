package org.example.repositories;

import org.example.entities.Category;
import org.example.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
