package com.neu.eurekaprovider.service;

import com.neu.eurekacommon.dto.BookDto;
import com.neu.eurekacommon.po.Book;
import com.neu.eurekacommon.util.CommonResult;
import com.neu.eurekaprovider.mapper.BookMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookService {
    @Resource
    private BookMapper bookMapper;

    public CommonResult findAll() {
        CommonResult rst = new CommonResult();
        List<Book> books = bookMapper.findAll();
        rst.setResult(books);
        return rst;
    }

    public CommonResult addBook(BookDto dto) {
        CommonResult rst = new CommonResult();
        int row = bookMapper.save(dto);
        if (row == 0) {
            rst.setCode(100);
            rst.setMsg("添加书籍失败");
        }
        return rst;
    }
}
