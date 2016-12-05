package com.testdev.chat.service;

import com.testdev.chat.entity.Message;
import java.util.List;

public interface MessageService extends  BasicChatServise<Message> {

    List<Message> readAll();

  //  List<Message> readSomeMessage(int offset);

}
