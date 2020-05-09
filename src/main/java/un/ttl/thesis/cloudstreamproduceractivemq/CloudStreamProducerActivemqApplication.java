package un.ttl.thesis.cloudstreamproduceractivemq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import un.ttl.thesis.cloudstreamproduceractivemq.binding.HelloBinding;

@EnableBinding(HelloBinding.class)
@SpringBootApplication
public class CloudStreamProducerActivemqApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudStreamProducerActivemqApplication.class, args);
	}

}
