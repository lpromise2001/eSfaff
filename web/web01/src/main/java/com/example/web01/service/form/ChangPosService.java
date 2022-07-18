package com.example.web01.service.form;

import com.example.web01.dto.form.ChangPosDto;
import com.example.web01.mapper.form.ChangPosMapper;
import com.example.web01.po.form.ChangPos;
import com.example.web01.util.CommonResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ChangPosService {
    @Resource
    private ChangPosMapper changPosMapper;

    public CommonResult findByParam(ChangPosDto dto){
        CommonResult rst = new CommonResult();
        List<ChangPos> changPos = changPosMapper.findByParam(dto);
        rst.setResult(changPos);
        return rst;
    }
}
