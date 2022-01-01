package com.ercan.tasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


@Component
public class ScheduledTasks {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    /**
     * Fixed Rate Schuled Task.
     */
    @Scheduled(fixedRate = 5000)
    public void scheduledTaskFixedRate() throws InterruptedException {
        log.info("scheduledTaskFixedRate() method worked! This is the time now :: {}", dateFormat.format(new Date()));
    }


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


    /**
     * Schedule a Task With Initial Delay.
     */
    @Scheduled(fixedRate = 2000, initialDelay = 5000)
    public void fixedRateDelayWithInitialDelayTask() throws InterruptedException {
        log.info("fixedRateDelayWithInitialDelayTask() method worked! This is the time now :: {}", dateFormat.format(new Date()));
    }

    /**
     * Schedule a Task With Initial Delay.
     */
    @Scheduled(fixedRate = 2000, initialDelay = 5000)
    public void fixedRateDelayWithInitialDelayTask_2() throws InterruptedException {
        log.info("fixedRateDelayWithInitialDelayTask() method worked! This is the time now :: {}", dateFormat.format(new Date()));
        Thread.sleep(2000);
    }

    /**
     * Schedule a Task With Initial Delay.
     */
    @Scheduled(fixedDelay = 2000, initialDelay = 5000)
    public void fixedDelayWithInitialDelayTask() throws InterruptedException {
        log.info("fixedDelayWithInitialDelayTask() method worked! This is the time now :: {}", dateFormat.format(new Date()));

    }

    /**
     * Cron Expressions Schedule Task.
     * This is "0 * * * * ?" ensures that the relevant task runs every minute.
     */
    @Scheduled(cron = "0 * * * * ?")
    public void scheduledTaskCronExpression() {
        log.info("scheduledTaskCronExpressions() method worked! This is the time now :: {}", dateFormat.format(new Date()));

    }

}
