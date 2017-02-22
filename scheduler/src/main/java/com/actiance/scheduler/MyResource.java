package com.actiance.scheduler;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.actiance.scheduler.producerservice.KafkaService;


@Path("myresource")
public class MyResource {
	KafkaService kafkaService=new KafkaService();
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMessage() throws Exception {
        return kafkaService.ServiceExecuter();
    }
}
