package com.example.demo.dao;

import com.example.demo.domain.Classtab;
import com.example.demo.domain.ClasstabExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ClasstabMapper {
    int countByExample(ClasstabExample example);

    int deleteByExample(ClasstabExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(Classtab record);

    int insertSelective(Classtab record);

    List<Classtab> selectByExample(ClasstabExample example);

    Classtab selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") Classtab record, @Param("example") ClasstabExample example);

    int updateByExample(@Param("record") Classtab record, @Param("example") ClasstabExample example);

    int updateByPrimaryKeySelective(Classtab record);

    int updateByPrimaryKey(Classtab record);
}