package io.spring.dataflow.sample;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@EnableBinding(Processor.class)
public class FunctionStreamSampleProcessor {

	@Bean
	public Function<String, String> messenger() {
		return data -> "Hello: " + data + "!";
	}
}
