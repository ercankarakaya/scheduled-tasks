package com.ercan.tasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduledTaskCronExpression {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    /**
     * Cron Expressions Schedule Task.
     * This is "0 * * * * ?" ensures that the relevant task runs every minute.
     */
    @Scheduled(cron = "0 * * * * ?")
    public void scheduledTaskCronExpression(){
        log.info("scheduledTaskCronExpressions() method worked! This is the time now :: {}", dateFormat.format(new Date()));

    }

    /**
     * Cron Expressions Schedule Task.
     * Note that in this task, we're scheduling a task to be executed at 12:30 AM on the 21th day of every month.
     */
    @Scheduled(cron = "0 30 12 21 * ?")
    public void scheduledTaskCronExpression_2(){
        log.info("scheduledTaskCronExpressions_2() method worked! This is the time now :: {}", dateFormat.format(new Date()));

    }

    /**
     * Cron Expressions Schedule Task.
     * A task every 3 seconds.
     */
    @Scheduled(cron = "*/3 * * * * *")
    public void scheduledTaskCronExpression_3(){
        log.info("scheduledTaskCronExpressions_3() method worked! This is the time now :: {}", dateFormat.format(new Date()));

    }

}
