/*
package com.example.demo.models;


import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User author;


    @Override
    public String toString() {
        return "Authority{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


    public Authority() {
    }


    public Authority(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public Authority(String name, User author) {
        this.name = name;
        this.author = author;
    }



}
*/
