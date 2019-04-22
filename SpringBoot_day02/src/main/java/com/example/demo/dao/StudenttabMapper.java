package com.example.demo.dao;

import com.example.demo.domain.Studenttab;
import com.example.demo.domain.StudenttabExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StudenttabMapper {
    int countByExample(StudenttabExample example);

    int deleteByExample(StudenttabExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(Studenttab record);

    int insertSelective(Studenttab record);

    List<Studenttab> selectByExample(StudenttabExample example);

    Studenttab selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") Studenttab record, @Param("example") StudenttabExample example);

    int updateByExample(@Param("record") Studenttab record, @Param("example") StudenttabExample example);

    int updateByPrimaryKeySelective(Studenttab record);

    int updateByPrimaryKey(Studenttab record);
}