package com.example.demo.models;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;


@Entity
@NoArgsConstructor
public class Category   {

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(unique = true)
    private String name;
    @ManyToMany(mappedBy = "categories")
    private Set<Book> books;


    public Set<Book> getBooks() {
        return books;
    }

    public Category(String name) {

        this.name = name;
    }
}
