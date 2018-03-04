package com.jeromefromcn.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author jeromejiang
 */
@Controller
@EnableAutoConfiguration
public class HelloWorld {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloWorld.class, args);
    }

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
}
