package com.example.demo.repos;

import com.example.demo.models.Book;
import com.example.demo.models.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;


@Repository

public interface BookRepo extends JpaRepository<Book,Long> {



}
