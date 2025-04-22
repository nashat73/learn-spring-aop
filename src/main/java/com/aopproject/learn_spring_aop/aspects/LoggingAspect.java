package com.aopproject.learn_spring_aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;



//configuration class which contains aop logic
@Configuration
@Aspect
public class LoggingAspect {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	//Pointcut - when?
	//execution(* PACKAGE.*.*(..))
	//@Before("execution(* com.aopproject.learn_spring_aop.business.*.*(..))")
	@Before("com.aopproject.learn_spring_aop.aspects.CommonPointCutConfig.dataPackageConfigUsingBean()")//when
	public void logMethodCallBeforeExecution(JoinPoint joinpoint)
	{
		//LoGIC - WHAT?
		//Before aspect this method is called
		logger.info("Before Aspect - Method IS Called - {}", joinpoint);//what => what+when=Aspect
		
	}
	@After("com.aopproject.learn_spring_aop.aspects.CommonPointCutConfig.businessPackageConfig()")
	public void logMethodCallAfterExecution(JoinPoint joinpoint)
	{
		//LoGIC - WHAT?
		//Before aspect this method is called
		logger.info("After Aspect - Method is executed - {}", joinpoint);//what => what+when=Aspect
		
	}
	
	@AfterThrowing(
			pointcut = "com.aopproject.learn_spring_aop.aspects.CommonPointCutConfig.businessAndDataPackageConfig()",
			throwing = "exception"
			)
	public void logMethodCallAfterThrowingExecution(JoinPoint joinpoint, Exception exception)
	{
		//LoGIC - WHAT?
		//Before aspect this method is called
		logger.info("AfterThrowing Aspect - Method is executed - {} has thrown an exception - {}", joinpoint,exception);//what => what+when=Aspect
		
	}
	
	@AfterReturning(
			pointcut = "com.aopproject.learn_spring_aop.aspects.CommonPointCutConfig.dataPackageConfig()",
			returning  = "resultvalue")
	public void logMethodCallAfterReturningSusscefulExecution(JoinPoint joinpoint, Object resultvalue)
	{
		//LoGIC - WHAT?
		//Before aspect this method is called
		logger.info("AfterReturning Aspect - Method is executed - {} has returned resultvalue - {}", joinpoint,resultvalue);//what => what+when=Aspect
		
	}
	
}
