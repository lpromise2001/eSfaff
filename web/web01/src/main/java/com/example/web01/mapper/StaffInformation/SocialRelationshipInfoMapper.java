package com.example.web01.mapper.StaffInformation;

import com.example.web01.dto.StaffInformation.SocialRelationshipInfoDto;
import com.example.web01.po.StaffInformation.SocialRelationshipInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SocialRelationshipInfoMapper {
    List<SocialRelationshipInfo> infoSelect(SocialRelationshipInfoDto dto);

    int infoAdd(SocialRelationshipInfoDto dto);

    int infoDel(SocialRelationshipInfoDto dto);

    int infoUpdate(SocialRelationshipInfoDto dto);
}
