package com.aopproject.learn_spring_aop.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//method
@Target(ElementType.METHOD)
//runtime
@Retention(RetentionPolicy.RUNTIME)
public @interface TrackTime {

	
}
