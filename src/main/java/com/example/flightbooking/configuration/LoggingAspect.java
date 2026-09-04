package com.example.flightbooking.configuration;

import org.aspectj.lang.JoinPoint;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
/*
 * This is an aspect for logging.
 */
@Aspect
@Component
public class LoggingAspect {

	private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

	/*
	 * First Initialize pointcut
	 */
	@Pointcut("execution(* com.example.flightbooking.controller..*(..)) || execution(* com.example.flightbooking.service..*(..))")
	public void appPointcut() {
	}

	/*
	 * Before Advice
	 */
	@Before("appPointcut()")
	public void beforeAdvice(JoinPoint joinPoint) {
		logger.info("Start Before  {} args={}", joinPoint.getSignature().toShortString(), joinPoint.getArgs());
	}

	/*
	 * After Advice
	 */
	@After("appPointcut()")
	public void afterAdvice(JoinPoint joinPoint) {
		logger.info("End After   {}", joinPoint.getSignature().toShortString());
	}

	/*
	 * After Returning Advice
	 */
	@AfterReturning(pointcut = "appPointcut()", returning = "result")
	public void afterReturningAdvice(JoinPoint joinPoint, Object result) {
		logger.info("After RETURN {} -> {}", joinPoint.getSignature().toShortString(),
				(result == null ? "void" : result.getClass().getSimpleName()));
	}

	/*
	 * Around Advice
	 */
	@Around("appPointcut()")
	public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		long start = System.nanoTime();
		Object result = pjp.proceed();
		long duration = (System.nanoTime() - start) / 1_000_000;

		logger.info("TIME: {} executed in {} ms", pjp.getSignature().toShortString(), duration);

		return result;
	}
}
