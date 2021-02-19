package ro.uvt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.uvt.difexample.ClientComponent;

@RestController
public class HelloController {
    private final ClientComponent client;

    @RequestMapping("/home")
    public String sayHello() {
        return "Hello from " + client;
    }

    @Autowired

    public HelloController(ClientComponent client) {
        this.client = client;

    }
}
