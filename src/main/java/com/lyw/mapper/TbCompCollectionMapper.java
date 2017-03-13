package com.lyw.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.lyw.domain.TbCompCollectionExample;
import com.lyw.domain.TbCompCollectionKey;

public interface TbCompCollectionMapper {
    int countByExample(TbCompCollectionExample example);

    int deleteByExample(TbCompCollectionExample example);

    int deleteByPrimaryKey(TbCompCollectionKey key);

    int insert(TbCompCollectionKey record);

    int insertSelective(TbCompCollectionKey record);

    List<TbCompCollectionKey> selectByExample(TbCompCollectionExample example);

    int updateByExampleSelective(@Param("record") TbCompCollectionKey record, @Param("example") TbCompCollectionExample example);

    int updateByExample(@Param("record") TbCompCollectionKey record, @Param("example") TbCompCollectionExample example);
}