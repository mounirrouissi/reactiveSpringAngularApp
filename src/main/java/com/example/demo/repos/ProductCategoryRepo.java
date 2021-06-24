package com.example.demo.repos;

import com.example.demo.models.Book;
import com.example.demo.models.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductCategoryRepo extends JpaRepository<Category,Long> {

}
