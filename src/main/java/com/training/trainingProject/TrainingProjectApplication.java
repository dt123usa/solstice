package com.training.trainingProject;

import com.training.trainingProject.configurations.MyConfigProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties
public class TrainingProjectApplication {

	public static void main(final String[] args) {
		final ApplicationContext ctx = SpringApplication.run(TrainingProjectApplication.class, args);

		final MyConfigProperties config = (MyConfigProperties) ctx.getBean("myConfigProperties");
		System.out.println(config.toString());
		config.setMsg("set from app");
	}
}
