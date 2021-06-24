package com.example.demo.controllers;

import com.example.demo.models.Book;
import com.example.demo.models.Category;
import com.example.demo.repos.BookRepo;
import com.example.demo.repos.ProductCategoryRepo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Set;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CategoryController {
    private ProductCategoryRepo categoryRepo;
    private BookRepo bookRepo;
    public CategoryController(ProductCategoryRepo categoryRepo, BookRepo bookRepo) {
        this.categoryRepo = categoryRepo;
        this.bookRepo = bookRepo;
    }


// comment here
    @GetMapping("/categories")
    public List<Category> getCat() {
        return categoryRepo.findAll();
    }

    @GetMapping("/categories/{id}")
    public Set<Book> getBooksByCategory(@PathVariable int id, @PathParam(value="page") int page , @PathParam(value = "size") int size) {
        System.out.println(" pagination called here");
        System.out.println(page);
        System.out.println(size);
        var byId = categoryRepo.findById((long) id).get();
return         byId.getBooks();



    }


}
