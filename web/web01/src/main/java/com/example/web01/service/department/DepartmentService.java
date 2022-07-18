package com.example.web01.service.department;

import com.example.web01.dto.department.DepartmentDto;
import com.example.web01.mapper.department.DepartmentMapper;
import com.example.web01.po.department.Department;
import com.example.web01.util.CommonResult;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

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

    public CommonResult addDepartment(DepartmentDto dto) {
        CommonResult result=new CommonResult();
        int row = departmentMapper.addDepartment(dto);
        if(row == 0)
            result.setCode(100);
            result.setMsg("添加部门失败");
        return result;
    }
}
