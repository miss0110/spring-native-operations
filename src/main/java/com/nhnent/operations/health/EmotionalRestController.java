package com.nhnent.operations.health;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/event")
class EmotionalRestController {

    private final ApplicationEventPublisher publisher;

    @Autowired
    public EmotionalRestController(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    @GetMapping("/happy")
    public void eventHappy() {
        this.publisher.publishEvent(new HappyEvent());
    }

    @GetMapping("/sad")
    public void eventSad() {
        this.publisher.publishEvent(new SadEvent());
    }
}
