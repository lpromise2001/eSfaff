package com.example.web01.controller.StaffInformation;

import com.example.web01.dto.StaffInformation.CareerInformationDto;
import com.example.web01.dto.StaffInformation.ForeignLanInfoDto;
import com.example.web01.service.StaffInformation.ForeignLanInfoService;
import com.example.web01.util.CommonResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@RequestMapping("/foreignLanInfo")
public class ForeignLanInfoController {
    @Resource
    private ForeignLanInfoService service;

    @RequestMapping("/findInfo")
    public CommonResult findInfo(@RequestBody ForeignLanInfoDto dto) {
        return service.findInfo(dto);
    }

    @RequestMapping("/infoAdd")
    public CommonResult infoAdd(@RequestBody ForeignLanInfoDto dto) {
        return service.infoAdd(dto);
    }

    @RequestMapping("/infoDel")
    public CommonResult infoDel(@RequestBody ForeignLanInfoDto[] dtos) {
        return service.infoDel(dtos);
    }

    @RequestMapping("/infoUpdate")
    public CommonResult infoUpdate(@RequestBody ForeignLanInfoDto dto) {
        return service.infoUpdate(dto);
    }
}
