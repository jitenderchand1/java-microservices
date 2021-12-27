package com.learning.rest.webservices.restfulwebservices.helloworld;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello-world")
	public String HelloWorld() {
        return "Hello Worddld";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean HelloWorldBean() {
        return new HelloWorldBean("my first bean");
    }

    @GetMapping("/hello-world/path-variable/{name}")
    public HelloWorldBean HelloWorldPathVariable(@PathVariable(value = "name") String pathName) {
        return new HelloWorldBean(String.format("my path variable name is %s",pathName));
    }
}
