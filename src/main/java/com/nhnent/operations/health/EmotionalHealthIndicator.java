package com.nhnent.operations.health;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Optional;

@Component
class EmotionalHealthIndicator extends AbstractHealthIndicator {

    private EmotionalEvent event;
    private Date when;

    @EventListener
    public void onHealthEvent(EmotionalEvent event) {
        this.event = event;
        this.when = new Date();
    }

    @Override
    protected void doHealthCheck(Health.Builder builder) {
        //////////////////////////////////////////////////
        //////////////////////////////////////////////////
    }

}
