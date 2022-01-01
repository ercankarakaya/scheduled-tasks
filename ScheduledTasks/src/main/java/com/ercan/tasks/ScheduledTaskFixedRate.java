package com.ercan.tasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduledTaskFixedRate {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    /**
     * Fixed Rate Schuled Task.
     */
    @Scheduled(fixedRate = 5000)
    public void scheduledTaskFixedRate() throws InterruptedException {
        log.info("scheduledTaskFixedRate() method worked! This is the time now :: {}", dateFormat.format(new Date()));
    }

    @Scheduled(fixedRate = 5000)
    public void scheduledTaskFixedRate_2() throws InterruptedException {
        log.info("scheduledTaskFixedRate_2() method worked! This is the time now :: {}", dateFormat.format(new Date()));
        Thread.sleep(2000);
    }

}
