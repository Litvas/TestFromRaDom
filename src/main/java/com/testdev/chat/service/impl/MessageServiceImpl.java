package com.testdev.chat.service.impl;

import com.testdev.chat.dao.MessageDAO;
import com.testdev.chat.entity.Message;
import com.testdev.chat.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageDAO messageDAO;


    @Override
    public List<Message> readAll() {
        return messageDAO.findAll();
    }

//    @Override
//    public List<Message> readSomeMessage(int offset) {
//        return messageDAO.findSomeMessage(offset);
//    }


    public List<Message> readSomeMessage() {

        return messageDAO.findAll();
    }

    @Override
    public Message save(Message message) {
        return messageDAO.save(message);
    }


}
