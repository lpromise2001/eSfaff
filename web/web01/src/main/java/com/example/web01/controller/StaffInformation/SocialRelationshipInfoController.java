package com.example.web01.controller.StaffInformation;

import com.example.web01.dto.StaffInformation.SocialRelationshipInfoDto;
import com.example.web01.service.StaffInformation.SocialRelationshipInfoService;
import com.example.web01.util.CommonResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@RequestMapping("/SocialRelationship")
public class SocialRelationshipInfoController {
    @Resource
    private SocialRelationshipInfoService service;

    @RequestMapping("/findInfo")
    public CommonResult findInfo(@RequestBody SocialRelationshipInfoDto dto) {
        return service.infoSelect(dto);
    }

    @RequestMapping("/infoAdd")
    public CommonResult infoAdd(@RequestBody SocialRelationshipInfoDto dto) {
        return service.infoAdd(dto);
    }

    @RequestMapping("/infoDel")
    public CommonResult infoDel(@RequestBody SocialRelationshipInfoDto[] dtos) {
        return service.infoDel(dtos);
    }

    @RequestMapping("/infoUpdate")
    public CommonResult infoUpdate(@RequestBody SocialRelationshipInfoDto dto) {
        return service.infoUpdate(dto);
    }
}
