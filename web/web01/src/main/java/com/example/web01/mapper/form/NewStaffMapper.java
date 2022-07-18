package com.example.web01.mapper.form;

import com.example.web01.dto.form.NewStaffDto;
import com.example.web01.po.form.NewStaff;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NewStaffMapper {

    List<NewStaff> findByParam(NewStaffDto dto);

}
