package com.example.web01.service.form;

import com.example.web01.dto.form.LeaveStaffDto;
import com.example.web01.mapper.form.LeaveStaffMapper;
import com.example.web01.po.form.LeaveStaff;
import com.example.web01.util.CommonResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LeaveStaffService {

    @Resource
    private LeaveStaffMapper leaveStaffMapper;
    public CommonResult findByParam(LeaveStaffDto dto){
        CommonResult rst = new CommonResult();
        List<LeaveStaff> leaveStaffs = leaveStaffMapper.findByParam(dto);
        rst.setResult(leaveStaffs);
        return rst;
    }
}
