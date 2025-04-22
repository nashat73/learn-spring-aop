package com.aopproject.learn_spring_aop.data;

import org.springframework.stereotype.Repository;



@Repository
public class DataService2 {
	
	//@TrackTime
	public int[] retriveData()
	{
		return new int[] {111,222,333,444,555,666};
	}

}
