package kr.doo.toy03dockercompose;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Toy03DockercomposeApplication {

    public static void main(String[] args) {
        SpringApplication.run(Toy03DockercomposeApplication.class, args);
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
