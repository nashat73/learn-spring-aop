package com.aopproject.learn_spring_aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aopproject.learn_spring_aop.business.BusinessService1;
import com.aopproject.learn_spring_aop.business.BusinessService2;



@SpringBootApplication
public class LearnSpringAopApplication implements CommandLineRunner{

	private Logger logger = LoggerFactory.getLogger(getClass());
	private BusinessService1 businessService1;
	private BusinessService2 businessService2;
	public static void main(String[] args) {
		SpringApplication.run(LearnSpringAopApplication.class, args);
	}
	public LearnSpringAopApplication(BusinessService1 businessService1, BusinessService2 businessService2)
	{
		this.businessService1 = businessService1;
		this.businessService2 = businessService2;
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("value returned is {}",businessService1.calculateMax());
		logger.info("value returned is {}",businessService2.calculateMin());
	}

}
