package com.mt.aop;

import com.mt.aop.configuration.ProjectConfiguration;
import com.mt.aop.dao.AccountDAO;
import com.mt.aop.dao.MembershipDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Aspect : Module of code for a cross-cutting concerns(logging,security,...)
 * <p>
 * Advice : What action is taken and when it should be applied
 * Advice Type :
 * 1. Before : run before the method
 * 2. After finally : run after the method (finally)
 * 3. After returning :  run after the method (success execution)
 * 4. After throwing : run after the method (if exception thrown)
 * 5. Around advice : run before and after method
 * <p>
 * Joint Point : When apply code during program execution
 * <p>
 * Pointcut : A predicate expression for where advice should be applied
 * <p>
 * Weaving : Connecting aspects to target objects to create an advised object
 * Different types of weaving : Compile-time , load-time or run time
 * Regarding performance : run time weaving is the slowest
 * <p>
 * Spring AOP uses run time weaving and just method level join points
 */
public class AopApp {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
        accountDAO.addUserAccount();

        MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
        membershipDAO.addUserAccount();

        ((AnnotationConfigApplicationContext) context).close();
    }
}
