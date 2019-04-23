package com.example.reactive;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.handler.annotation.SendTo;
import reactor.core.publisher.Flux;

@EnableBinding(Processor.class)
public class ReactiveStreamProcessor {

	@StreamListener(Processor.INPUT)
	@SendTo(Processor.OUTPUT)
	public Flux<String> messageHandler(Flux<String> data) {
		return data.map(incoming -> "Hello: " + incoming + "!");
	}
}
