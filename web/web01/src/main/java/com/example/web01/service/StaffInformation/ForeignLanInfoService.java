package com.example.web01.service.StaffInformation;

import com.example.web01.dto.StaffInformation.ForeignLanInfoDto;
import com.example.web01.mapper.StaffInformation.ForeignLanInfoMapper;
import com.example.web01.po.StaffInformation.ForeignLanInfo;
import com.example.web01.util.CommonResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ForeignLanInfoService {
    @Resource
    private ForeignLanInfoMapper mapper;

    public CommonResult findInfo(ForeignLanInfoDto dto) {
        CommonResult result = new CommonResult();
        List<ForeignLanInfo> infos = mapper.findByStaffNo(dto);
        result.setResult(infos);
        return result;
    }
}
