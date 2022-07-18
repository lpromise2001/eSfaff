package com.example.web01.mapper.position;

import com.example.web01.dto.position.PositionDto;
import com.example.web01.po.position.Position;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PositionMapper {
    List<Position> findByPos(PositionDto dto);
}
