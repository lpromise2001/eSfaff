package com.example.web01.mapper.form;

import com.example.web01.dto.form.ChangPosDto;
import com.example.web01.po.form.ChangPos;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ChangPosMapper {

    List<ChangPos> findByParam(ChangPosDto dto);

    int Add(ChangPosDto dto);

}
