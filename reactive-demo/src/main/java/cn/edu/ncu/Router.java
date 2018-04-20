package cn.edu.ncu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;

import cn.edu.ncu.handlers.HelloHandler;

@Configuration
public class Router {
	
	@Autowired
	private HelloHandler helloHandler;
	
	@Bean
	public RouterFunction<?> routerFunction(){
		return RouterFunctions.route(RequestPredicates.GET("/hello"), helloHandler::helloWorld);
	}

}
