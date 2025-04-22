package com.aopproject.learn_spring_aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class PerformanceTrackingAspect {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	//@Around("execution(* com.aopproject.learn_spring_aop.*.*.*(..))")
	//@Around("com.aopproject.learn_spring_aop.annotations.TrackTime")
	@Around("com.aopproject.learn_spring_aop.aspects.CommonPointCutConfig.businessAndDataPackageConfig()")
	//@Around("com.aopproject.learn_spring_aop.annotations.TrackTime")
	public Object findExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable
	{
		//start a timer
		long startTimeMillis = System.currentTimeMillis();
		
		//execute the method
		Object returnValue = proceedingJoinPoint.proceed();
		
		//stop the timer
		long stopTimeMillis = System.currentTimeMillis();
		
		long executionDuration = stopTimeMillis - startTimeMillis;
		
		logger.info("@Around Aspect - {} method executed in {}", proceedingJoinPoint,executionDuration);
		
		return returnValue;

	}
	
	
}
