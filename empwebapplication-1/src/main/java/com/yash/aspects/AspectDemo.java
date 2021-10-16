package com.yash.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.yash.exception.InvalidDataException;

@Aspect
@Component
public class AspectDemo {
	
	Logger logger=LoggerFactory.getLogger(AspectDemo.class);
	@Before(value = "execution(* com.yash.serviceimpl.EmployeeService.*(..))")
	public void beforeSaveEmp(JoinPoint jp) {
		logger.trace("@before executed"+jp.getClass());
	}

	@After(value = "execution(* com.yash.serviceimpl.EmployeeService.*(..))")
	public void AfterSaveEmp(JoinPoint jp) {
		logger.trace("@after executed"+jp.getClass());
	}
	
	@AfterReturning(value = "execution(* com.yash.serviceimpl.EmployeeService.*(..))",returning = "b")
	public void afterReturnSaveEmp(JoinPoint jp,Boolean b) {
		logger.trace("@afterreturning executed"+jp.getClass()+b);
	}
	
	@Around(value = "execution(* com.yash.serviceimpl.EmployeeService.*(..))")
	public void aroundSaveEmp(ProceedingJoinPoint pjp) throws Throwable {
		logger.trace("@around advice before");
		Boolean b=(boolean) pjp.proceed();
		logger.trace("@around advice method executed "+b);
		logger.trace("@around advice after");
		
	}
	
	@AfterThrowing(value = "execution(* com.yash.serviceimpl.EmployeeService.*(..))",throwing = "exception")
	public void afterThrowingSaveEmp(JoinPoint jPoint,Throwable exception) {
		logger.trace("@afterthrowing advice throws exception"+exception);
		
	}
	
}
