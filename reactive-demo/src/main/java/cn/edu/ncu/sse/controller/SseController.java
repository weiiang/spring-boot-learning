package cn.edu.ncu.sse.controller;

import java.time.Duration;

import org.springframework.http.codec.ServerSentEvent;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/sse")
public class SseController {
	
	public Flux<ServerSentEvent<Integer>> randomNumbers(){
		 return Flux.interval(Duration.ofSeconds(1))
	                .map(seq -> Tuples.of(seq, ThreadLocalRandom.current().nextInt()))
	                .map(data -> ServerSentEvent.<Integer>builder()
	                        .event("random")
	                        .id(Long.toString(data.getT1()))
	                        .data(data.getT2())
	                        .build());
	}

}
