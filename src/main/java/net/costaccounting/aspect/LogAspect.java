//package net.costaccounting.aspect;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.context.annotation.Configuration;
//
//
//
//public class LogAspect {
//    private Logger logger = LoggerFactory.getLogger(LogAspect.class);
//
//    public void serviceMethods() {};
//
//    public void logMethodCall(JoinPoint jp) {
//        String methodName = jp.getSignature().getName();
//        logger.info("Before " + methodName);
//    }
//}
