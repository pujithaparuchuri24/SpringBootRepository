package com.SpringJdbc.entity;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class StudentClass {
  private Integer s_id;
  private String s_name;
  private String s_class;
  
}
