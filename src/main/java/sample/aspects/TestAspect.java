package sample.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class TestAspect {
    @Around("execution(@sample.aspects.AroundTest * *(..))")
    public void around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("start1");

        point.proceed();

        System.out.println("end");
    }
}
