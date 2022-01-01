package com.ercan.scheduleTasks;

import com.ercan.model.User;
import com.ercan.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;


@Component
public class UserDeleteTask {

    private final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    UserService userService;

    @Scheduled(fixedRate = 2000, initialDelay = 5000)
    public void deleteUser() {
        List<User> userList=userService.getAllUser();
        if (!CollectionUtils.isEmpty(userList)) {
            User user = userList.get(0);
            userList.remove(0);
            logger.info(user.getName() + " has been deleted...");
            logger.info("user list : {}",userList);
        }
        logger.info("User delete task worked.");
    }

}
