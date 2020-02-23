package com.hcl.ing.adodenhaag.logging;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LoggingAspect {

    Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Pointcut("(within(@org.springframework.stereotype.Component *) || " +
            "within(@org.springframework.stereotype.Service *) || " +
            "within(@org.springframework.web.bind.annotation.RestController *)) && " +
            "within(com.hcl.ing.adodenhaag..*)")

    public void beanAnnotatedWithServiceAnnotation() {
        // just needs this method to be invoked no implementation required
    }

    @Around("beanAnnotatedWithServiceAnnotation()")
    public Object applicationLogger(ProceedingJoinPoint joinPoint) throws Throwable {
        Signature signature = joinPoint.getSignature();
        String declaringTypeName = signature.getDeclaringTypeName();
        String methodName = signature.getName();
        Object[] objects = joinPoint.getArgs();
        String arguments = Arrays.toString(objects);

        logger.info("Enter: {}.{}() with argument[s] = {}", declaringTypeName,
                methodName, arguments);

        Object result = joinPoint.proceed();
        logger.info("Exit: {}.{}() with result = {}", declaringTypeName,
                methodName, result);
        return result;

    }
}