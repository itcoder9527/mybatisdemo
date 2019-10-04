package com.example.bootdemo.mybatisdemo.job;

import com.example.bootdemo.mybatisdemo.entity.User;
import com.example.bootdemo.mybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author ：LM
 * @date ：Created in 2019-10-02 20:53
 * @description：定时任务类
 * @modified By：
 * @version: 1.0.0
 */
@Component
@Configurable
@EnableScheduling
public class ScheduledJobs {

    @Autowired
    private UserService userService;

    @Scheduled(cron = "0/10 * * * * *")
    public void run(){
        User user = userService.Sel(2);
        System.out.println(user.toString());
    }
}
