package com.example.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.MyBank;
import com.example.demo.service.MyBankService;

@RestController
public class MyBankController {
	@Autowired
	private MyBankService banser;
	
	@RequestMapping("getbank")
	public MyBank findmybank() {
		MyBank bank = banser.findMybank();
		return bank;
	}
}
