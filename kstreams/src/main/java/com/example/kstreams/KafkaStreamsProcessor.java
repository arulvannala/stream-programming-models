package com.example.kstreams;

import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;

@EnableBinding(KafkaStreamsChannels.class)
public class KafkaStreamsProcessor {

	@StreamListener(KafkaStreamsChannels.TEST_INPUT)
	@SendTo(KafkaStreamsChannels.TEST_OUPUT)
	public KStream<String, String> messageHandler(KStream<String, String> data) {
		return data.map((k, v) -> new KeyValue<>(null, "Hello: " + v + "!"));
	}
}
