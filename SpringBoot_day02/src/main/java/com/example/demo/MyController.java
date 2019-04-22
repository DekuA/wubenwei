package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Studenttab;
import com.example.demo.domain.StudenttabExample;
import com.example.demo.service.StuService;

@RestController
public class MyController {
	@Autowired
	private StuService ser;

	@RequestMapping("getname")
	public String find() {
		return "皮老板";
	}
	
	@RequestMapping("getStu")
	public Student getstu() {
		return new Student(1,"皮老板",22);
	}
	
	@RequestMapping("selStu")
	public Studenttab selStu(int sid) {
		return ser.selectByPrimaryKey(sid);
	}
	
	@RequestMapping("findStu")
	public List<Studenttab> findstu(){
		List<Studenttab> list = ser.selectByExample(new StudenttabExample());
		return list;
	}
	
	@RequestMapping("delStu")
	public String delstu(int sid) {
		int i = ser.deleteByPrimaryKey(sid);
		return i+"";
	}
}
