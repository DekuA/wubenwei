package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudenttabMapper;
import com.example.demo.domain.Studenttab;
import com.example.demo.domain.StudenttabExample;

@Service
public class StuServiceImpol implements StuService {
	@Autowired
	private StudenttabMapper stumap;

	public Studenttab selectByPrimaryKey(Integer sid) {
		return stumap.selectByPrimaryKey(sid);
	}

	public List<Studenttab> selectByExample(StudenttabExample example) {
		List<Studenttab> list = stumap.selectByExample(example);
		return list;
	}

	public int deleteByPrimaryKey(Integer sid) {
		int i = stumap.deleteByPrimaryKey(sid);
		return i;
	}

}
