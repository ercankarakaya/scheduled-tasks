package com.ercan.service;

import com.ercan.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final Logger logger = LoggerFactory.getLogger(UserService.class);

    private List<User> userList;

    // initial block for user data
    {
        if (CollectionUtils.isEmpty(userList)){
            userList=new ArrayList<>();
            userList.add(new User(1, "John"));
            userList.add(new User(2, "Ricardo"));
            userList.add(new User(3, "Daniel"));
            userList.add(new User(4, "Micheal"));
            userList.add(new User(5, "Leonardo"));
            userList.add(new User(6, "Scott"));
            logger.info("All users are saved in the list.");
        }
    }


    public List<User> getAllUser() {
        return userList;
    }

}
