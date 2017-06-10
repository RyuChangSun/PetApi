package com.rest.api.log;

import javax.annotation.Resource;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
//import org.springframework.beans.factory.annotation.Autowired;

import com.rest.api.dao.LogDAO;
import com.rest.api.model.Log;

@Aspect
public class AspectLogger {
	
	@Resource(name="logDao")
	private LogDAO logDAO;
		
	@Before("execution(* com.rest.api..*Service.*(..))")
    public void logBefore(JoinPoint joinPoint) {
		
    	Log log = new Log();
    	log.setMethod(joinPoint.getSignature().getName().toString());
    	log.setContents("error");
    	log.setReg_id("system");
		
		logDAO.writeLog(log);
		
        System.out.println("*** logBefore() is running!");
        System.out.println("*** hijacked : " + joinPoint.getSignature().getName());
    }
	
	@After("execution(* com.rest.api..*Service.*(..))")
	public void logAfter(JoinPoint joinPoint) {
        System.out.println("*** logAfter() is running!");
        System.out.println("*** hijacked : " + joinPoint.getSignature().getName());
	}
	
}
