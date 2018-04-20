package cn.edu.ncu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class BasicController {

	@GetMapping("/hello-world")
	public Mono<String> sayHello(){
		return Mono.just("Hello World!");
	}
}
