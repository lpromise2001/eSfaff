package com.example.web01.service.form;

import com.example.web01.dto.form.NewStaffDto;
import com.example.web01.mapper.form.NewStaffMapper;
import com.example.web01.po.form.NewStaff;
import com.example.web01.util.CommonResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class NewStaffService {
    @Resource
    private NewStaffMapper newStaffMapper;
    public CommonResult findByParam(NewStaffDto dto){
        CommonResult rst = new CommonResult();
        List<NewStaff> newStaffs = newStaffMapper.findByParam(dto);
        rst.setResult(newStaffs);
        return rst;
    }
}

