package undertow;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class HelloService {

    @Autowired
    private HelloRepository helloRepository;

    public List<Hello> hello() {
        log.info("{} started.", "hello");

        List<Hello> helloList = helloRepository.findAll();

        log.info("{} ended.", "hello");
        return helloList;
    }
}
