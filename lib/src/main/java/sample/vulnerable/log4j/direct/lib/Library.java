package sample.vulnerable.log4j.direct.lib;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Library {
	private static final Logger logger = LogManager.getLogger("Library");
	
    public boolean log(String[] args) {
		logger.error("Args: {}", args);
		return true;
    }
}
