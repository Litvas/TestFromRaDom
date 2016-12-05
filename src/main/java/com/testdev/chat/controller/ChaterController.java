package com.testdev.chat.controller;


import com.testdev.chat.entity.Chater;
import com.testdev.chat.entity.Message;
import com.testdev.chat.service.ChaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/chaterReg")
@RestController
public class ChaterController {

    @Autowired
    private ChaterService chaterService;

    @RequestMapping(method = RequestMethod.POST)
    public Chater saveChater(@RequestBody Chater chater) {
        return chaterService.save(chater);
    }
}
