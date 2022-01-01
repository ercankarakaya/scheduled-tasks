package com.ercan.tasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduledTaskFixedRateDelayInitialDelay {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");


    /**
     * Schedule a Task With Initial Delay.
     */
    @Scheduled(fixedRate = 2000,initialDelay = 5000)
    public void fixedRateDelayWithInitialDelayTask() throws InterruptedException {
        log.info("fixedRateDelayWithInitialDelayTask() method worked! This is the time now :: {}", dateFormat.format(new Date()));
    }

    /**
     * Schedule a Task With Initial Delay _2.
     */
    @Scheduled(fixedRate = 2000,initialDelay = 5000)
    public void fixedRateDelayWithInitialDelayTask_2() throws InterruptedException {
        log.info("fixedRateDelayWithInitialDelayTask_2() method worked! This is the time now :: {}", dateFormat.format(new Date()));
        Thread.sleep(2000);
    }

    /**
     * Schedule a Task With Initial Delay.
     */
    @Scheduled(fixedDelay = 2000,initialDelay = 5000)
    public void fixedDelayWithInitialDelayTask() throws InterruptedException {
        log.info("fixedDelayWithInitialDelayTask() method worked! This is the time now :: {}", dateFormat.format(new Date()));

    }

    /**
     * Schedule a Task With Initial Delay _2.
     */
    @Scheduled(fixedDelay = 2000,initialDelay = 5000)
    public void fixedDelayWithInitialDelayTask_2() throws InterruptedException {
        log.info("fixedDelayWithInitialDelayTask_2() method worked! This is the time now :: {}", dateFormat.format(new Date()));
        Thread.sleep(2000);
    }

}
