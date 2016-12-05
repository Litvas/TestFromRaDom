package com.testdev.chat.service.impl;

import com.testdev.chat.dao.ChaterDAO;
import com.testdev.chat.entity.Chater;
import com.testdev.chat.service.ChaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChaterServiceImpl implements ChaterService {

    @Autowired
    private ChaterDAO chaterDAO;

    @Override
    public Chater save(Chater chater) {
        return chaterDAO.save(chater);
    }
}
