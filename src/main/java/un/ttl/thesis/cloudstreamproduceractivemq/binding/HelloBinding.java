package un.ttl.thesis.cloudstreamproduceractivemq.binding;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface HelloBinding {

    @Output("greetingChannel")
    MessageChannel greeting();

    @Output("estonianGreetingChannel")
    MessageChannel estonianGreet();
}
