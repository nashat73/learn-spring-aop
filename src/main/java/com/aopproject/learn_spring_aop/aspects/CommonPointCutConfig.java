package com.aopproject.learn_spring_aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointCutConfig {

	@Pointcut("execution(* com.aopproject.learn_spring_aop.*.*.*(..))")
	public void businessAndDataPackageConfig(){}
	
	@Pointcut("execution(* com.aopproject.learn_spring_aop.business.*.*(..))")
	public void businessPackageConfig(){}
	
	@Pointcut("execution(* com.aopproject.learn_spring_aop.data.*.*(..))")
	public void dataPackageConfig(){}
	
	@Pointcut("bean(*Service*)")//for all the services both business and data
	public void dataPackageConfigUsingBean() {}
	
	  @Pointcut(
	  "@annotation(com.aopproject.learn_spring_aop.annotations.TrackTime)") public
	  void trackTimeAnnotation() {}
	 
}
