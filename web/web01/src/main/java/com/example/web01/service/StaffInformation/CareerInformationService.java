package com.example.web01.service.StaffInformation;

import com.example.web01.dto.StaffInfomation.CareerInformationDto;
import com.example.web01.mapper.StaffInformation.CareerInformationMapper;
import com.example.web01.po.StaffInformation.CareerInformation;
import com.example.web01.util.CommonResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CareerInformationService {
    @Resource
    private CareerInformationMapper mapper;

    public CommonResult findByParam(CareerInformationDto dto) {
        CommonResult result = new CommonResult();
        List<CareerInformation> careerInformations = mapper.findByParam(dto);
        result.setResult(careerInformations);
        return result;
    }
}
