package com.example.web01.util;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CommonResult {
    private int code = 200;
    private String msg = "成功";
    //存放查询的数据
    private Object result;
}
