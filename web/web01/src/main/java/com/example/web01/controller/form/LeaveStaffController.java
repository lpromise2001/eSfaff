package com.example.web01.controller.form;

import com.example.web01.dto.form.LeaveStaffDto;
import com.example.web01.service.form.LeaveStaffService;
import com.example.web01.util.CommonResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@RequestMapping("/leaveStaff")
public class LeaveStaffController {
    @Resource
    private LeaveStaffService leaveStaffService;
    @RequestMapping("/findByParam")
    public CommonResult findByParam(@RequestBody LeaveStaffDto dto) {
        return leaveStaffService.findByParam(dto);
    }
}
