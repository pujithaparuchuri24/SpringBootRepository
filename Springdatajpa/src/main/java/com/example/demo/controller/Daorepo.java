package com.example.demo.controller;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Employee;


public interface Daorepo extends CrudRepository<Employee, Integer>{
   
}
