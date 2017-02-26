package testLog4j1;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class TestLog4j1 {

	private static final Logger logger = LogManager.getLogger(TestLog4j1.class.getName());
	public static void main(String[] args) {
		if(logger.isDebugEnabled()){
			System.out.println("debug test"); // Will not be display if the logger isn't in debug priority because of the if statement.
			logger.debug("msg de debogage");
		}
		if(logger.isInfoEnabled()){
			logger.info("msg d'information");
		}
		if(logger.isWarnEnabled()){
			logger.warn("msg d'avertissement");
		}
		if(logger.isErrorEnabled()){
			logger.error("msg d'erreur");
		}
		if(logger.isFatalEnabled()){
			logger.fatal("msg d'erreur fatale");
		}
	}
}
