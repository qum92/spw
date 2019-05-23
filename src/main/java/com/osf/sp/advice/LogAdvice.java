package com.osf.sp.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
public class LogAdvice {
	@Before("execution(* com.osf.sp.controller.*.*(..))")
	public void beforeLog(JoinPoint jp) {
		log.debug("메서드 실행전!");
	}
	@After("execution(* com.osf.sp.controller.*.*(..))")
	public void afterLog(JoinPoint jp) {
		log.debug("매서드 실행후!");
	}
	
}
