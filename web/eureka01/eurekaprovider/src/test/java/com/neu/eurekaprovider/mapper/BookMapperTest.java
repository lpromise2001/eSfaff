package com.neu.eurekaprovider.mapper;

import com.neu.eurekacommon.po.Book;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//可以启动springboot的配置信息，创建需要的内容，必须添加
@SpringBootTest
class BookMapperTest {
    //添加被测试类的依赖
    @Resource
    BookMapper bookMapper;
    @Test
    void findAll() {
        List<Book> books = bookMapper.findAll();
        System.out.println(books);
    }
}