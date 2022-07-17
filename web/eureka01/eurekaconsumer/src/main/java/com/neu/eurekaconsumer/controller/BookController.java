package com.neu.eurekaconsumer.controller;

import com.neu.eurekacommon.dto.BookDto;
import com.neu.eurekacommon.util.CommonResult;
import com.neu.eurekaconsumer.service.BookService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@RequestMapping("/book")
public class BookController {
    @Resource
    private BookService bookService;

    @RequestMapping("/findAll")
    public CommonResult findAll() {
        return bookService.findAll();
    }

    @RequestMapping("/addBook")
    public CommonResult addBook(@RequestBody BookDto dto) {
        return bookService.addBook(dto);
    }
}
