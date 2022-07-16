package com.example.web01.service.department;

import com.example.web01.dto.department.DepartmentDto;
import com.example.web01.mapper.department.DepartmentMapper;
import com.example.web01.po.department.Department;
import com.example.web01.util.CommonResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DepartmentService {

    @Resource
    private DepartmentMapper departmentMapper;
    public CommonResult findByParam(DepartmentDto dto) {
        CommonResult result=new CommonResult();
        List<Department> departments = departmentMapper.findByParam(dto);
        result.setResult(departments);
        return result;
    }
}
