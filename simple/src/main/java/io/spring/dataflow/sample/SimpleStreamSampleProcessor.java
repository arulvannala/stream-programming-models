package io.spring.dataflow.sample;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.handler.annotation.SendTo;

@EnableBinding(Processor.class)
public class SimpleStreamSampleProcessor {

	@StreamListener(Processor.INPUT)
	@SendTo(Processor.OUTPUT)
	public String messenger(String data) {
		return "Hello: " + data + "!";
	}
}
