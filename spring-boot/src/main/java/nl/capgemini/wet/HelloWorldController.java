package nl.capgemini.wet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    private Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    public HelloWorldController() {
        logger.info("Starting HelloWorld controller on /hello and /hello/??????");
    }

    @GetMapping(value = {"/hello/{name}", "/hello"})
    public String helloWorld(final @PathVariable(name = "name", required = false) String name) {
        logger.info("Received {}", name);
        return "Hello "
                + (name == null ? "world" : name);
    }

}
