package com.lyw.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.lyw.domain.TbHunt;
import com.lyw.domain.TbHuntExample;

public interface TbHuntMapper {
    int countByExample(TbHuntExample example);

    int deleteByExample(TbHuntExample example);

    int deleteByPrimaryKey(Integer huntId);

    int insert(TbHunt record);

    int insertSelective(TbHunt record);

    List<TbHunt> selectByExample(TbHuntExample example);

    TbHunt selectByPrimaryKey(Integer huntId);

    int updateByExampleSelective(@Param("record") TbHunt record, @Param("example") TbHuntExample example);

    int updateByExample(@Param("record") TbHunt record, @Param("example") TbHuntExample example);

    int updateByPrimaryKeySelective(TbHunt record);

    int updateByPrimaryKey(TbHunt record);
}