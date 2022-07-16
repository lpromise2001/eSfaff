package com.example.web01.service.staff_induction;

import com.example.web01.po.staff_induction.staff_induction;
import com.example.web01.dto.staff_induction.staff_inductionDto;
import com.example.web01.mapper.staff_induction.staff_inductionMapper;
import com.example.web01.util.CommonResult;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class staff_inductionService {
    @Resource
    private staff_inductionMapper Staff_inductionMapper;

    public CommonResult doSave(staff_inductionDto dto){
        CommonResult rst=new CommonResult();
        int row=Staff_inductionMapper.save(dto);
        if(row==0){
            rst.setCode(100);
            rst.setMsg("失败");
        }
        return rst;
    }

}
