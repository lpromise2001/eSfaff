package com.example.web01.mapper.StaffInformation;

import com.example.web01.dto.StaffInformation.ForeignLanInfoDto;
import com.example.web01.po.StaffInformation.ForeignLanInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ForeignLanInfoMapper {
    List<ForeignLanInfo> findByStaffNo(ForeignLanInfoDto dto);
    int infoAdd(ForeignLanInfoDto dto);
    int infoDel(ForeignLanInfoDto dto);
    int infoUpdate(ForeignLanInfoDto dto);
}
