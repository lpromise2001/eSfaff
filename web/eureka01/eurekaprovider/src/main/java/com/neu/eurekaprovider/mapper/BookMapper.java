package com.neu.eurekaprovider.mapper;

import com.neu.eurekacommon.dto.BookDto;
import com.neu.eurekacommon.po.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {
    List<Book> findAll();
    int save(BookDto dto);
}
