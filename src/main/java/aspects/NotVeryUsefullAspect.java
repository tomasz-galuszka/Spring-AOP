package aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by tomasz on 30.10.14.
 */
@Aspect
public class NotVeryUsefullAspect {

    @Before("execution(* beans.Party.start(..))")
    public void doBefore(JoinPoint joinPoint) {
        System.out.println("-- Drinking time :) " + joinPoint.getSignature().getName());
    }

    @After("execution(* beans.Party.start(..))")
    public void doAfter(JoinPoint joinPoint) {
        System.out.println("-- Sleeping time :) " + joinPoint.getSignature().getName());
    }
}
