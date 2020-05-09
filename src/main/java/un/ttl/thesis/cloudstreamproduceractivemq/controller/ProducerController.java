package un.ttl.thesis.cloudstreamproduceractivemq.controller;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import un.ttl.thesis.cloudstreamproduceractivemq.binding.HelloBinding;

@RestController
public class ProducerController {

    private MessageChannel greet;

    private MessageChannel estonianGreet;

    public ProducerController(HelloBinding binding) {
        greet = binding.greeting();
        estonianGreet = binding.estonianGreet();
    }

    @GetMapping("en/greet/{name}")
    public void publish(@PathVariable String name) {
        String greeting = "Hello, " + name + "!";
        Message<String> msg = MessageBuilder.withPayload(greeting)
                .build();
        this.greet.send(msg);
    }

    @GetMapping("es/greet/{name}")
    public void publish2(@PathVariable String name) {
        String greeting2 = "Tere, " + name + "!";
        Message<String> msg = MessageBuilder.withPayload(greeting2)
                .build();
        this.estonianGreet.send(msg);
    }

}
