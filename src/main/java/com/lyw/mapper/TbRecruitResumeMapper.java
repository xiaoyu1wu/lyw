package com.lyw.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.lyw.domain.TbRecruitResume;
import com.lyw.domain.TbRecruitResumeExample;

public interface TbRecruitResumeMapper {
    int countByExample(TbRecruitResumeExample example);

    int deleteByExample(TbRecruitResumeExample example);

    int deleteByPrimaryKey(Integer deliverId);

    int insert(TbRecruitResume record);

    int insertSelective(TbRecruitResume record);

    List<TbRecruitResume> selectByExample(TbRecruitResumeExample example);

    TbRecruitResume selectByPrimaryKey(Integer deliverId);

    int updateByExampleSelective(@Param("record") TbRecruitResume record, @Param("example") TbRecruitResumeExample example);

    int updateByExample(@Param("record") TbRecruitResume record, @Param("example") TbRecruitResumeExample example);

    int updateByPrimaryKeySelective(TbRecruitResume record);

    int updateByPrimaryKey(TbRecruitResume record);
}