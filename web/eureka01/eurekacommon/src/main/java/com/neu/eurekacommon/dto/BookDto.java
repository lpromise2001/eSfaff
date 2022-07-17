package com.neu.eurekacommon.dto;


import com.neu.eurekacommon.po.Book;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookDto extends Book {
    private Double minPrice;
    private Double maxPrice;
}
