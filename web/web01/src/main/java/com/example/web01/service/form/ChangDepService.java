package com.example.web01.service.form;

import com.example.web01.dto.form.ChangDepDto;
import com.example.web01.mapper.form.ChangDepMapper;
import com.example.web01.po.form.ChangDep;
import com.example.web01.util.CommonResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ChangDepService {
    @Resource
    private ChangDepMapper changDepMapper;
    public CommonResult findByParam(ChangDepDto dto){
        CommonResult rst = new CommonResult();
        List<ChangDep> changDeps = changDepMapper.findByParam(dto);
        rst.setResult(changDeps);
        return rst;
    }
    public CommonResult doAdd(ChangDepDto dto){
        CommonResult rst = new CommonResult();
        int row = changDepMapper.Add(dto);
        if (row==0) {
            rst.setCode(100);
            rst.setMsg("添加失败");
        }
        return rst;
    }
}
