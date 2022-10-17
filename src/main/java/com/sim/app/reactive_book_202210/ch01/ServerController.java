package com.sim.app.reactive_book_202210.ch01;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;


@RestController
public class ServerController {

    private final KitchenService kitchen;

    public ServerController(KitchenService kitchen) {
        this.kitchen = kitchen;
    }

    @GetMapping(value = "/server", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Dish> serveDishes(){
        return this.kitchen.getDishes();
    }

    @GetMapping(value = "/server2", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Object> serveString(){

        Flux<Object> flux = Flux.generate(sink ->
            sink.next(getList()))
                .delayElements(Duration.ofSeconds(1));

        return flux;
    }

    private List<String> getList(){
        List<String> list = Arrays.asList("A","B","C","D","E");
        return list;
    }
}
