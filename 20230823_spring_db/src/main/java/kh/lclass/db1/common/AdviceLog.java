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
public class AdviceLog {
	private static final Logger logger = LoggerFactory.getLogger(AdviceLog.class);
	
	@Pointcut("execution(타겟메소드)")
	// .. 매개변수 없거나 여러개 있거나..
	// * 1개 이상일때 씀.
	public void daoPointCute() {

	}
	
	@Pointcut("execution()")
	public void servicePointCut() {

	}
	@Pointcut("execution()")
	public void controllerPointCut() {

	}
	
//	@Before("daoPointCut()")
//	public void beforeDaoLog(JoinPoint jp) {
//		// 공통코드
//		logger.debug("");
//		// 타겟메소드로 전달되는 매개인자
//		Object[] args = jp.getArgs();
//		for(int i = 0; i<args.length; i++) {
//			logger.debug("");
//		}
//		
//	}
//	@After("daoPointCut()")
//	public void afterDaoLog(JoinPoint jp, Object returnObj) {
//		
//	}
	@Around("daoPointCut()")
	public void aroundDaoLog(ProceedingJoinPoint pjp) {
		
	}
	@Around("controllerPointCut()")
	public void aroundControllerLog() {
		
	}
}
