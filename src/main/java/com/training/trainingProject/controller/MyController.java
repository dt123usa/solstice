package com.training.trainingProject.controller;

import com.training.trainingProject.service.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  private final MyService myService;

  public MyController(final MyService myService){
    this.myService = myService;
  }

  @GetMapping("/")
  public String getString(){
    return myService.getString();
  }

}
