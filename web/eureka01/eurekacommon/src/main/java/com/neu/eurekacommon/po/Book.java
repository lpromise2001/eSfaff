package com.neu.eurekacommon.po;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    private Integer bookId;
    private String bookName;
    private String author;
    private Double price;
}