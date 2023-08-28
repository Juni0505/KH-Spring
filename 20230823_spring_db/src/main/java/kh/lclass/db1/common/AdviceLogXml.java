package kh.lclass.db1.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AdviceLogXml {
	private static final Logger logger = LoggerFactory.getLogger(AdviceLogXml.class);
	
	@Around("daoPointCut()")
	public void aroundDaoLog(ProceedingJoinPoint pjp) {
		
	}
	@Around("controllerPointCut()")
	public void aroundControllerLog() {
		
	}
}
