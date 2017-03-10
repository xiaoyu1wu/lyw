package com.lyw.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.lyw.domain.TbRecruit;
import com.lyw.domain.TbRecruitExample;

public interface TbRecruitMapper {
    int countByExample(TbRecruitExample example);

    int deleteByExample(TbRecruitExample example);

    int deleteByPrimaryKey(Integer recrId);

    int insert(TbRecruit record);

    int insertSelective(TbRecruit record);

    List<TbRecruit> selectByExample(TbRecruitExample example);

    TbRecruit selectByPrimaryKey(Integer recrId);

    int updateByExampleSelective(@Param("record") TbRecruit record, @Param("example") TbRecruitExample example);

    int updateByExample(@Param("record") TbRecruit record, @Param("example") TbRecruitExample example);

    int updateByPrimaryKeySelective(TbRecruit record);

    int updateByPrimaryKey(TbRecruit record);

	List<TbRecruit> selectByRecruitDate();
}