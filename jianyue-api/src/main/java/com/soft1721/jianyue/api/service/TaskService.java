package com.soft1721.jianyue.api.service;

import com.soft1721.jianyue.api.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
//@Async
public class TaskService {
    @Autowired
    private MailService mailService;
    @Scheduled(cron = "0 00 11 * * ?")
    public void proces(){
        mailService.sendMail("16422802@qq.com","学习总结(何杰）","");
        System.out.println("111");
    }

}