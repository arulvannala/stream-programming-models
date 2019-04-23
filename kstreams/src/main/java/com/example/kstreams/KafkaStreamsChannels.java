package com.example.kstreams;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;

public interface KafkaStreamsChannels {

	String TEST_INPUT = "testInput";
	String TEST_OUPUT = "testOutput";

	@Input(TEST_INPUT)
	KStream<String, String> testInput();

	@Output(TEST_OUPUT)
	KStream<String, String> testOutput();
}
