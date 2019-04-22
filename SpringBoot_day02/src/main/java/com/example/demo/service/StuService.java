package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.Studenttab;
import com.example.demo.domain.StudenttabExample;

public interface StuService {
	List<Studenttab> selectByExample(StudenttabExample example);
	int deleteByPrimaryKey(Integer sid);
	Studenttab selectByPrimaryKey(Integer sid);
}
