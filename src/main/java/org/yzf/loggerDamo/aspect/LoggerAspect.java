package org.yzf.loggerDamo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

@Aspect
public class LoggerAspect {
	
	private Logger logger = LoggerFactory.getLogger(Logger.class);
	
	@Pointcut("execution(* org.yzf..*.*(..))")  
	public void logger() {}
	
	@AfterThrowing(pointcut = "logger()",throwing = "error")
	public void afterThrowing(JoinPoint jp,Throwable error) {
		logger.error("",error);
	}
}
