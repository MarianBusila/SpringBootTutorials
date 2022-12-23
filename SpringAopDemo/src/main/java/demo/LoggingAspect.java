package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* demo.ShoppingCart.checkout(..))")
    public void beforeLogger(JoinPoint jp) {
        System.out.println("Signature: " + jp.getSignature());
        System.out.println("First Argument:" + jp.getArgs()[0].toString());
        System.out.println("Before loggers");
    }
    @After("execution(* *.*.checkout(..))")
    public void afterLogger() {
        System.out.println("After loggers");
    }

    @Pointcut("execution(* demo.ShoppingCart.quantity(..))")
    public void afterReturningPointCut() {
    }

    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "retValue")
    public void afterReturning(int retValue){
        System.out.println("After returning:" + retValue);
    }
}
