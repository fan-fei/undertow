package undertow;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class HelloService {

    public String hello() {
        log.info("{} my message", "param");
        return "hello";
    }
}
