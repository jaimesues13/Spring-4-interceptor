package com.fragua.springboot.interceptor.springbootinterceptor.controlllers;

import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/app")
public class FooController {

    @GetMapping("/foo")
    public Map<String, String> foo(){
        return Collections.singletonMap("message", "Handeler foo del controlador");
    }

    @GetMapping("/var")
    public Map<String, String> var(){
        return Collections.singletonMap("message", "Handeler var del controlador");
    }

    @GetMapping("/baz")
    public Map<String, String> baz(){
        return Collections.singletonMap("message", "Handeler baz del controlador");
    }

}
