package com.lyw.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.lyw.domain.TbHuntCompany;
import com.lyw.domain.TbHuntCompanyExample;

public interface TbHuntCompanyMapper {
    int countByExample(TbHuntCompanyExample example);

    int deleteByExample(TbHuntCompanyExample example);

    int deleteByPrimaryKey(Integer wantId);

    int insert(TbHuntCompany record);

    int insertSelective(TbHuntCompany record);

    List<TbHuntCompany> selectByExample(TbHuntCompanyExample example);

    TbHuntCompany selectByPrimaryKey(Integer wantId);

    int updateByExampleSelective(@Param("record") TbHuntCompany record, @Param("example") TbHuntCompanyExample example);

    int updateByExample(@Param("record") TbHuntCompany record, @Param("example") TbHuntCompanyExample example);

    int updateByPrimaryKeySelective(TbHuntCompany record);

    int updateByPrimaryKey(TbHuntCompany record);
}