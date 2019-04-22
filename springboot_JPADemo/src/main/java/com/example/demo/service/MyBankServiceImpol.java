package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.demo.dao.MyBankRepository;
import com.example.demo.entity.MyBank;

@Service
public class MyBankServiceImpol implements MyBankService {
	@Autowired
	private MyBankRepository jpa;
	
	@Cacheable(value="mybanks")
	public MyBank findMybank() {
		System.out.println("如果缓存成功,该方法就不会再执行");
		Optional<MyBank> findById = jpa.findById(1);
		return findById.get();
	}
}
