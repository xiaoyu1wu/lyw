package com.lyw.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.lyw.domain.TbCompany;
import com.lyw.domain.TbCompanyExample;

public interface TbCompanyMapper {
    int countByExample(TbCompanyExample example);

    int deleteByExample(TbCompanyExample example);

    int deleteByPrimaryKey(Integer compId);

    int insert(TbCompany record);

    int insertSelective(TbCompany record);

    List<TbCompany> selectByExample(TbCompanyExample example);

    TbCompany selectByPrimaryKey(Integer compId);

    int updateByExampleSelective(@Param("record") TbCompany record, @Param("example") TbCompanyExample example);

    int updateByExample(@Param("record") TbCompany record, @Param("example") TbCompanyExample example);

    int updateByPrimaryKeySelective(TbCompany record);

    int updateByPrimaryKey(TbCompany record);
}