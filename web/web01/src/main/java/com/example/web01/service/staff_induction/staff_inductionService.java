package com.example.web01.service.staff_induction;

import com.example.web01.dto.StaffInformation.CareerInformationDto;
import com.example.web01.po.StaffInformation.CareerInformation;
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
    public CommonResult search3(staff_inductionDto dto){
        CommonResult rst=new CommonResult();
        int row=Staff_inductionMapper.search3(dto);
        if(row==0){
            rst.setCode(100);
            rst.setMsg("失败");
        }
        return rst;
    }
    public CommonResult change(staff_inductionDto dto){
        CommonResult rst=new CommonResult();
        int row=Staff_inductionMapper.change(dto);
        if(row==0){
            rst.setCode(100);
            rst.setMsg("失败");
        }
        return rst;
    }
    public CommonResult search1(staff_inductionDto dto) {


        CommonResult rst=new CommonResult();
        List<staff_induction> staff_inductions=Staff_inductionMapper.search1(dto);
        staff_inductions.clear();
        System.out.println(staff_inductions.isEmpty());
        staff_inductions=Staff_inductionMapper.search1(dto);
        System.out.println(rst.toString());
        rst.setResult(staff_inductions);
        System.out.println(staff_inductions.isEmpty());
        System.out.println(rst.toString());
        return rst;
    }
    public CommonResult find(staff_inductionDto dto) {


        CommonResult rst=new CommonResult();
        List<staff_induction> staff_inductions=Staff_inductionMapper.find(dto);
        staff_inductions.clear();
        System.out.println(staff_inductions.isEmpty());
        staff_inductions=Staff_inductionMapper.find(dto);
        System.out.println(rst.toString());
        rst.setResult(staff_inductions);
        System.out.println(staff_inductions.isEmpty());
        System.out.println(rst.toString());
        return rst;
    }
    public CommonResult search2(staff_inductionDto dto) {


        CommonResult rst=new CommonResult();
        List<staff_induction> staff_inductions=Staff_inductionMapper.search1(dto);
        staff_inductions.clear();
        System.out.println(staff_inductions.isEmpty());
        staff_inductions=Staff_inductionMapper.search1(dto);
        System.out.println(rst.toString());
        rst.setResult(staff_inductions);
        System.out.println(staff_inductions.isEmpty());
        System.out.println(rst.toString());
        return rst;
    }


}
