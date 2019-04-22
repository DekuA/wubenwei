package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.MyBank;

//该类是jpa通过CrudRepository该类生成对Mybank类的默认的增删改查的方法
public interface MyBankRepository extends CrudRepository<MyBank, Integer> {

}
