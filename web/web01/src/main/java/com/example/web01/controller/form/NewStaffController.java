package com.example.web01.controller.form;

import com.example.web01.dto.form.NewStaffDto;
import com.example.web01.service.form.NewStaffService;
import com.example.web01.util.CommonResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@RequestMapping("/newStaff")
public class NewStaffController {
    @Resource
    private NewStaffService newStaffService;
    @RequestMapping("/findByParam")
    public CommonResult findByParam(@RequestBody NewStaffDto dto){
        return newStaffService.findByParam(dto);
    }
    @RequestMapping("/add")
    public CommonResult doAdd(@RequestBody NewStaffDto dto){
        return newStaffService.doAdd(dto);
    }
}
