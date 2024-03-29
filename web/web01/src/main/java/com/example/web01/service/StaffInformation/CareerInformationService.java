package com.example.web01.service.StaffInformation;

import com.example.web01.dto.StaffInformation.CareerInformationDto;
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
        System.out.println(dto.getStaff_no() + dto.getCompany_name() + dto.getP_name());
        CommonResult result = new CommonResult();
        List<CareerInformation> careerInformations = mapper.findByParam(dto);
        result.setResult(careerInformations);
        return result;
    }

    public CommonResult infoAdd(CareerInformationDto dto) {
        CommonResult result = new CommonResult();
        int row = mapper.infoAdd(dto);
        if (row == 0) {
            result.setCode(100);
            result.setMsg("失败");
        }
        return result;
    }

    public CommonResult infoDel(CareerInformationDto[] dtos) {
        CommonResult result = new CommonResult();
        int row = 0;
        for (CareerInformationDto dto : dtos) {
            row += mapper.infoDel(dto);
        }
        if (row < dtos.length) {
            result.setCode(100);
            result.setMsg("应删除" + dtos.length + "条数据\n" + "共删除" + row + "条数据");
        } else if (row == dtos.length) {
            result.setMsg("成功删除" + row + "条数据");
        } else {
            result.setCode(300);
            result.setMsg("删除了" + row + "条数据");
        }
        return result;
    }

    public CommonResult infoUpdate(CareerInformationDto dto) {
        CommonResult result = new CommonResult();
        int row = mapper.infoUpdate(dto);
        if (row == 0) {
            result.setCode(100);
            result.setMsg("失败");
        }
        return result;
    }
}
