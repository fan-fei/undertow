package undertow;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    final static Logger logger = LoggerFactory.getLogger(HelloService.class);

    public String hello() {
        logger.info("test message...........");
        return "hello";
    }
}
