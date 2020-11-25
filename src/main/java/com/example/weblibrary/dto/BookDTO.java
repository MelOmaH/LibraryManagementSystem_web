package com.example.weblibrary.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder

public class BookDTO {

    private Long id;

    private String name;

    private int pages;

    private int price;

    private String releaseDate;

    private String authorName;



}
