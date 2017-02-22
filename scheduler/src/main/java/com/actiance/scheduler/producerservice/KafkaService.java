package com.actiance.scheduler.producerservice;

import com.actiance.scheduler.producer.KafkaProducer;

public class KafkaService {
	public String ServiceExecuter() throws Exception{
		 KafkaProducer kafkaProducer = new KafkaProducer();
		 kafkaProducer.initialize();
		 kafkaProducer.publishMesssage();
		 KafkaProducer.producer.close();
		 return ServiceExecuter();
		 
	}
}
