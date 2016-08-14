package aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect	
@Component
public class LoggingAspect {

	private final static org.slf4j.Logger logger = LoggerFactory.getLogger(LoggingAspect.class);
   
	@Before("execution(* controllers..*(..)) ")
	public void logBefore(JoinPoint joinPoint) {

		logger.debug("logBefore() is running!");
		logger.debug("hijacked : " + joinPoint.getSignature().getName());
		logger.debug("******");
	}
	
}
