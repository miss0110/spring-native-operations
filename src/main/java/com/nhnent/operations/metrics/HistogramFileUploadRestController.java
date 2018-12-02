package com.nhnent.operations.metrics;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.GaugeService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Slf4j
@RestController
@RequestMapping("/histogram/uploads")
public class HistogramFileUploadRestController {

    private final GaugeService gaugeService;

    @Autowired
    public HistogramFileUploadRestController(GaugeService gaugeService) {
        this.gaugeService = gaugeService;
    }

    @PostMapping
    void upload(@RequestParam MultipartFile file) {
        long size = file.getSize();
        log.info(String.format("received %s with file size %s", file.getOriginalFilename(), size));
        ///////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////
    }
}
