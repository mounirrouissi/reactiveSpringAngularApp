package com.example.demo.controllers;

import com.example.demo.models.Author;
import com.example.demo.repos.AuthorRepo;
import com.example.demo.repos.BookRepo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;


@RestController
@CrossOrigin("*")
public class Controller {

    private AuthorRepo authorRepo;

    private BookRepo bookRepo;

    public Controller(AuthorRepo authorRepo, BookRepo bookRepo ) {
        this.authorRepo = authorRepo;
        this.bookRepo = bookRepo;

    }



@GetMapping("/authors")
    public Page<Author> getAuthor(@PathParam("page")int page,@PathParam("size")int size){

        return authorRepo.findAll(PageRequest.of(page,size, Sort.by(Sort.Direction.ASC,"name")));
}


}

