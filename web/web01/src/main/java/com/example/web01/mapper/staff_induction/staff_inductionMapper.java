package com.example.web01.mapper.staff_induction;

import  com.example.web01.dto.staff_induction.staff_inductionDto;
import  com.example.web01.po.staff_induction.staff_induction;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface staff_inductionMapper {
    int save(staff_inductionDto dto);
    int search3(staff_inductionDto dto);
    int change(staff_inductionDto dto);
    List<staff_induction> search1(staff_inductionDto dto);
    List<staff_induction> search2(staff_inductionDto dto);
    List<staff_induction> find(staff_inductionDto dto);

}
