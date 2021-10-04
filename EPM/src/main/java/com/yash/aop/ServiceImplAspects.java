package com.yash.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceImplAspects {
	
	Logger logger=LoggerFactory.getLogger(ServiceImplAspects.class);
	
	@AfterThrowing(value = "execution(* com.yash.projectserviceimpl.ProjectService.*(..))",throwing = "BODataNotFoundException")
	public void forGetAllData(JoinPoint jp,Throwable BODataNotFoundException) {
		logger.trace("Ex"+BODataNotFoundException);
		
	}
}
