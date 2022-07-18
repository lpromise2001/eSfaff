package com.example.web01.mapper.form;

import com.example.web01.dto.form.ChangDepDto;
import com.example.web01.po.form.ChangDep;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ChangDepMapper {

    List<ChangDep> findByParam(ChangDepDto dto);

    int Add(ChangDepDto dto);
}
