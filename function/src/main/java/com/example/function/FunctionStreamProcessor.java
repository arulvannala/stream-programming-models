package com.example.function;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@EnableBinding(Processor.class)
public class FunctionStreamProcessor {

	@Bean
	public Function<String, String> message() {
		return data -> "Hello: " + data + "!";
	}
}
