package com.example.demo;


import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Article {
    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Long id;

    @Column
    private String title;

    @Column
    private String content;
}
