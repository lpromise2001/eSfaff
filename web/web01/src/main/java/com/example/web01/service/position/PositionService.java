package com.example.web01.service.position;

import com.example.web01.dto.position.PositionDto;
import com.example.web01.mapper.position.PositionMapper;
import com.example.web01.po.department.Department;
import com.example.web01.po.position.Position;
import com.example.web01.util.CommonResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PositionService {
    @Resource
    private PositionMapper positionMapper;
    public CommonResult findByPos(PositionDto dto){
        CommonResult result=new CommonResult();
        List<Position> positions = positionMapper.findByPos(dto);
        result.setResult(positions);
        return result;
    }
}
