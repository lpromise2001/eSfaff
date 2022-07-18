package com.example.web01.mapper.form;

import com.example.web01.dto.form.LeaveStaffDto;
import com.example.web01.po.form.LeaveStaff;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LeaveStaffMapper {

    List<LeaveStaff> findByParam(LeaveStaffDto dto);

}
