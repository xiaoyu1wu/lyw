package com.lyw.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lyw.domain.TbAdmin;
import com.lyw.domain.TbAdminExample;

public interface TbAdminMapper {
    int countByExample(TbAdminExample example);

    int deleteByExample(TbAdminExample example);

    int deleteByPrimaryKey(Integer adminId);

    int insert(TbAdmin record);

    int insertSelective(TbAdmin record);

    List<TbAdmin> selectByExample(TbAdminExample example);

    TbAdmin selectByPrimaryKey(Integer adminId);

    int updateByExampleSelective(@Param("record") TbAdmin record, @Param("example") TbAdminExample example);

    int updateByExample(@Param("record") TbAdmin record, @Param("example") TbAdminExample example);

    int updateByPrimaryKeySelective(TbAdmin record);

    int updateByPrimaryKey(TbAdmin record);
}