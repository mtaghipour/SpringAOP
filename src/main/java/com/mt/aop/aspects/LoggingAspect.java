package com.mt.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    /**
     * run this code before - target object method: "public void addUserAccount()"
     * <p>
     * Pointcut expression : execution(public void beforeAddAccount())
     * execution(modifiers-pattern? return-type-pattern declaring-type-pattern? method-name-pattern(param-pattern)
     * throws-pattern?)
     * <p>
     * modifier-pattern? : Spring AOP only supports public or *
     * return-type-pattern : void,boolean,String,List,...
     * declaring-type-pattern? : the class name
     * method-name-pattern : Method name to match
     * throws-pattern? : Exception types to match
     * <p>
     * Patterns with ? are optional
     * For the patterns we can use wildcards : *
     * <p>
     * Before("execution(public void add*())") : This will apply to all methods start with add
     * Before("execution(* add*())"
     **/
    @Before("execution(public void addUserAccount())")
    public void beforeAddUserAccount() {
        System.out.println("@Before advice : beforeAddUserAccount()");
    }

    @Before("execution(public void addAdminAccount())")
    public void beforeAddAdminAccount() {
        System.out.println("@Before advice : beforeAddAdminAccount()");
    }

    @Before("execution(* add*())")
    public void beforeAllAddAccounts() {
        System.out.println("@Before advice : beforeAllAdds()");
    }
}
