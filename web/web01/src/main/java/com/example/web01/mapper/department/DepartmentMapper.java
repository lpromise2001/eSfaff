package com.example.web01.mapper.department;

import com.example.web01.dto.department.DepartmentDto;
import com.example.web01.po.department.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface DepartmentMapper {

    List<Department> findByParam(DepartmentDto dto);

    int addDepartment(DepartmentDto dto);
}
