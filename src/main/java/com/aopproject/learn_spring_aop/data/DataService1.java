package com.aopproject.learn_spring_aop.data;

import org.springframework.stereotype.Repository;


@Repository
public class DataService1 {
	
	//@TrackTime
	public int[] retriveData()
	{
		return new int[] {11,22,33,44,55};
	}

}
