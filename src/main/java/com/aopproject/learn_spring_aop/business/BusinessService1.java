package com.aopproject.learn_spring_aop.business;

import java.util.Arrays;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aopproject.learn_spring_aop.annotations.TrackTime;
import com.aopproject.learn_spring_aop.data.DataService1;

@Service
public class BusinessService1 {
	
	//Business Logic
	@Autowired
	private DataService1 dataService1;
	
	@TrackTime
	public int calculateMax()
	{
		int[] data = dataService1.retriveData();
		//throw new RuntimeException("something went wrong");
		return Arrays.stream(data).max().orElse(0);
	}

}
