package com.example.web01.controller.StaffInformation;

import com.example.web01.dto.StaffInformation.CareerInformationDto;
import com.example.web01.service.StaffInformation.CareerInformationService;
import com.example.web01.util.CommonResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@RequestMapping("CareerInfo")
public class CareerInformationController {
    @Resource
    private CareerInformationService service;

    @RequestMapping("/findByParam")
    public CommonResult findByParam(@RequestBody CareerInformationDto dto) {
        return service.findByParam(dto);
    }

    @RequestMapping("/infoAdd")
    public CommonResult infoAdd(@RequestBody CareerInformationDto dto) {
        return service.infoAdd(dto);
    }
}
