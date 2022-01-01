package com.ercan.tasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@Component
public class ScheduledTaskFixedDelay {


    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    /**
     * Fixed Delay Schuled Task.
     */
    @Scheduled(fixedDelay = 2000)
    public void scheduledTaskFixedDelay() {
        log.info("scheduledTaskFixedDelay() method worked! This is the time now :: {}", dateFormat.format(new Date()));
        try {
            TimeUnit.SECONDS.sleep(4);
            //Thread.sleep(4000); // 4 second
        } catch (InterruptedException e) {
            log.error("error: {}" + e);
            throw new IllegalStateException(e);
        }
    }

}
