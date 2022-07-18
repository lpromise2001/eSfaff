package com.example.web01.controller.form;

import com.example.web01.dto.form.ChangDepDto;
import com.example.web01.service.form.ChangDepService;
import com.example.web01.util.CommonResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@RequestMapping("/changDep")
public class ChangDepController {
    @Resource
    private ChangDepService changDepService;
    @RequestMapping("/findByParam")
    public CommonResult findByParam(@RequestBody ChangDepDto dto){
        return changDepService.findByParam(dto);
    }
}
