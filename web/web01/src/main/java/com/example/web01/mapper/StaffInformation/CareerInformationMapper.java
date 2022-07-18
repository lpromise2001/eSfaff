package com.example.web01.mapper.StaffInformation;

import com.example.web01.dto.StaffInformation.CareerInformationDto;
import com.example.web01.po.StaffInformation.CareerInformation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CareerInformationMapper {
    List<CareerInformation> findByParam(CareerInformationDto dto);
    int infoAdd(CareerInformationDto dto);
    int infoDel(CareerInformationDto dto);
}
