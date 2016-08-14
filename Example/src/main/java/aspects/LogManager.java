package aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;



@Aspect
@Component
public class LogManager {

       @Pointcut("execution(* services..*(..))")
       public void auditLog() {}

       @Pointcut("execution(* services..*(..))")
       public void performanceLog(){}

}