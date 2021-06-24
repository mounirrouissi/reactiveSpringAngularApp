package com.example.demo.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "books")
    private Set<Author> authors = new HashSet<>();

    @ManyToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinTable(name = "book_category",
            joinColumns =@JoinColumn(name="book_id"),
            inverseJoinColumns =@JoinColumn(name = "category_id")
    )
    private Set<Category> categories=new HashSet<>();

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", categories=" + categories +
                '}';
    }

    public Book() {
    }
@JsonIgnore
    public Set<Category> getCategories() {
        return categories;
    }

    public Book(String name, Set<Category> categories) {
        this.name = name;
        this.categories = categories;
    }

    public Book(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }


    public String getName() {
        return name;
    }
}
