package com.example.web01.util;

import com.example.web01.po.staff_induction.staff_induction;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class CommonResult {
    private int code = 200;
    private String msg = "成功";
    //存放查询的数据
    private Object result;


}
