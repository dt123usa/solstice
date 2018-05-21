package com.training.trainingProject.service;

import com.training.trainingProject.configurations.MyConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

//  @Value("${msg}")
//  private String msg;
  @Autowired
  private MyConfigProperties myConfigProperties;

  public String getString() {
//    System.out.println("my message: " + msg);
    return myConfigProperties.toString();
  }
}
