package com.example.web01.controller.staff_induction;

import com.example.web01.dto.staff_induction.staff_inductionDto;
import com.example.web01.service.staff_induction.staff_inductionService;
import com.example.web01.util.CommonResult;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
//表示允许跨域
@CrossOrigin
@RestController
@RequestMapping("/user")

public class staff_inductionController {
    @Resource
    private staff_inductionService Staff_inductionService;
    @RequestMapping("/reg")
    public CommonResult reg(@RequestBody staff_inductionDto dto){
        return Staff_inductionService.doSave(dto);
    }
    @RequestMapping("/search1")
    public CommonResult search1(@RequestBody staff_inductionDto dto){
        return Staff_inductionService.search1(dto);
    }
    @RequestMapping("/search2")
    public CommonResult search2(@RequestBody staff_inductionDto dto){
        return Staff_inductionService.search2(dto);
    }
}
