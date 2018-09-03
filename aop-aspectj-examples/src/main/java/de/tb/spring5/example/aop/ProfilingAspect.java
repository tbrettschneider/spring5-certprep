package de.tb.spring5.example.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
@Aspect
public class ProfilingAspect {

    @Pointcut("execution(* *(..))")
    public void anyMethod() {}

    @Around("anyMethod()")
    public Object profile(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Object retValue = proceedingJoinPoint.proceed();
        stopWatch.stop();
        System.out.printf("%dms\t%s%n", stopWatch.getTotalTimeMillis(), proceedingJoinPoint.getSignature().toLongString());
        return retValue;
    }
}
