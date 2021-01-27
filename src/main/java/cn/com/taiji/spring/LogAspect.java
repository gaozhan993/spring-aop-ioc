package cn.com.taiji.spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
@Aspect
public class LogAspect {

    @Pointcut("@annotation(cn.com.taiji.spring.Transaction)")
//    @Pointcut("execution(* cn.com.taiji.spring..*(..))")
    public void pointCut(){

    }

//    @Around("@annotation(cn.com.taiji.spring.Transaction)")
    @Around("pointCut()")
    public void  around(ProceedingJoinPoint joinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        Transaction transaction = method.getAnnotation(Transaction.class);
        System.out.println(transaction);
        if (transaction!=null){
            System.out.println(transaction.propagate());
        }


        System.out.println("aspectj before");
        System.out.println(joinPoint.getClass());
        joinPoint.proceed(joinPoint.getArgs());
        System.out.println("aspectj after");

    }
}
