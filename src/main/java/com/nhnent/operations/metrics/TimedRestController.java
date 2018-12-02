package com.nhnent.operations.metrics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.GaugeService;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimedRestController {

    private final GaugeService gaugeService;

    @Autowired
    public TimedRestController(GaugeService gaugeService) {
        this.gaugeService = gaugeService;
    }

    @GetMapping("/timer/hello")
    public ResponseEntity<?> hello() throws Exception {
        ///////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////
    }

}
