package com.training.trainingProject.configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "myconfig")
public class MyConfigProperties {

  private String msg;
  private String anotherVariable;

  public String getMsg() {
    return msg;
  }

  public void setMsg(final String msg) {
    this.msg = msg;
  }

  public String getAnotherVariable() {
    return anotherVariable;
  }

  public void setAnotherVariable(final String anotherVariable) {
    this.anotherVariable = anotherVariable;
  }

  @Override
  public String toString() {
    return "MyConfigProperties{" +
        "msg='" + msg + '\'' +
        ", anotherVariable='" + anotherVariable + '\'' +
        '}';
  }
}
