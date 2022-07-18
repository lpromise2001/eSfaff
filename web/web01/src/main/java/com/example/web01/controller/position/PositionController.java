package com.example.web01.controller.position;

import com.example.web01.dto.position.PositionDto;
import com.example.web01.service.position.PositionService;
import com.example.web01.util.CommonResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@RequestMapping("/position")
public class PositionController {
    @Resource
    private PositionService positionService;

    @RequestMapping("findByPos")
    public CommonResult findByPos(@RequestBody PositionDto dto){
        return positionService.findByPos(dto);
    }
}
