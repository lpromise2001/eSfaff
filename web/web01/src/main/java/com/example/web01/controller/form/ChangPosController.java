package com.example.web01.controller.form;

import com.example.web01.dto.form.ChangPosDto;
import com.example.web01.service.form.ChangPosService;
import com.example.web01.util.CommonResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@RequestMapping("/changPos")
public class ChangPosController {
    @Resource
    private ChangPosService changPosService;
    @RequestMapping("/findByParam")
    public CommonResult findByParam(@RequestBody ChangPosDto dto){
        return changPosService.findByParam(dto);
    }
}
