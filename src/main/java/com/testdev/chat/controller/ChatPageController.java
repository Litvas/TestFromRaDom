package com.testdev.chat.controller;

import com.testdev.chat.entity.Message;
import com.testdev.chat.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RequestMapping
@Controller
public class ChatPageController {

    @Autowired
    private MessageService messageService;

    @RequestMapping("/")
    public String auth() {
        return "login";
    }

    @RequestMapping("/deny")
    public String accessDenided() {
        return "accessdenided";
    }

    @RequestMapping("/index")
    public String printWelcome() {
        return "index";
    }


    @RequestMapping(method = RequestMethod.POST)
    public Message saveMessage(@RequestBody Message message) {
        return messageService.save(message);
    }

    @MessageMapping("/chat")
    @SendTo("/topic/message")
    public Message sendMessage(Message message) {
        Message messageOut = new Message();
        messageOut.setDateOfSending(new Date());
        messageOut.setContentOfMessage(message.getContentOfMessage());
        return messageOut;
    }

}
