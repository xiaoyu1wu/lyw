package com.lyw.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.lyw.domain.TbMessage;
import com.lyw.domain.TbMessageExample;

public interface TbMessageMapper {
    int countByExample(TbMessageExample example);

    int deleteByExample(TbMessageExample example);

    int deleteByPrimaryKey(Integer messId);

    int insert(TbMessage record);

    int insertSelective(TbMessage record);

    List<TbMessage> selectByExample(TbMessageExample example);

    TbMessage selectByPrimaryKey(Integer messId);

    int updateByExampleSelective(@Param("record") TbMessage record, @Param("example") TbMessageExample example);

    int updateByExample(@Param("record") TbMessage record, @Param("example") TbMessageExample example);

    int updateByPrimaryKeySelective(TbMessage record);

    int updateByPrimaryKey(TbMessage record);
}