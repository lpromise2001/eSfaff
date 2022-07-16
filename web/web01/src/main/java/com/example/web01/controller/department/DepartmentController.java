package com.example.web01.controller.department;

import com.example.web01.dto.department.DepartmentDto;
import com.example.web01.service.department.DepartmentService;
import com.example.web01.util.CommonResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Resource
    private DepartmentService departmentService;

    @RequestMapping("/findByParam")
    public CommonResult findByParam(@RequestBody DepartmentDto dto){
        return departmentService.findByParam(dto);
    }

}
