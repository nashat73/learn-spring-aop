package com.aopproject.learn_spring_aop.business;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aopproject.learn_spring_aop.data.DataService2;

@Service
public class BusinessService2 {
	
	//Business Logic
	@Autowired
	private DataService2 dataService2;
	public int calculateMin()
	{
		int[] data = dataService2.retriveData();
		//throw new RuntimeException("something went wrong");
		return Arrays.stream(data).min().orElse(0);
	}

}
