package com.lyw.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.lyw.domain.TbUserCollectionExample;
import com.lyw.domain.TbUserCollectionKey;

public interface TbUserCollectionMapper {
    int countByExample(TbUserCollectionExample example);

    int deleteByExample(TbUserCollectionExample example);

    int deleteByPrimaryKey(TbUserCollectionKey key);

    int insert(TbUserCollectionKey record);

    int insertSelective(TbUserCollectionKey record);

    List<TbUserCollectionKey> selectByExample(TbUserCollectionExample example);

    int updateByExampleSelective(@Param("record") TbUserCollectionKey record, @Param("example") TbUserCollectionExample example);

    int updateByExample(@Param("record") TbUserCollectionKey record, @Param("example") TbUserCollectionExample example);
}