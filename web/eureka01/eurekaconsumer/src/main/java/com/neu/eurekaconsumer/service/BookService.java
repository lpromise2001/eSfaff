package com.neu.eurekaconsumer.service;

import com.neu.eurekacommon.dto.BookDto;
import com.neu.eurekacommon.util.CommonResult;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
public class BookService {
    @Resource
    private RestTemplate template;

    public CommonResult findAll() {
        CommonResult rst = null;
        rst = template.postForObject("http://EUREKAPROVIDER:8001/book/findAll", null, CommonResult.class);
        return rst;
    }

    public CommonResult addBook(BookDto dto) {
        CommonResult rst = null;
        rst = template.postForObject("http://EUREKAPROVIDER:8001/book/addBook", dto, CommonResult.class);
        return rst;
    }
}