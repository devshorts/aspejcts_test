package sample.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public final class TestAspect {
    @Around(
            // @checkstyle StringLiteralsConcatenation (2 lines)
            "(execution(* *(..)) || initialization(*.new(..)))"
            + " && @annotation(sample.aspects.AroundTest)"
    )
    public Object around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("start1");

        point.proceed();

        System.out.println("end");

        return null;
    }
}
