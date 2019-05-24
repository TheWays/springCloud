package com.cun.provider.controller;

import com.cun.provider.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    MessageService messageService;

    @Value(value = "${server.port}")
    String port;
    
    @Value(value = "${spring.cloud.client.ipAddress}")
    String ip;
    @GetMapping("/get")
    public String getMessage(){
        return "provider提供者："+ ip+ port+ "提供信息："+messageService.getMessage();
    }

}
