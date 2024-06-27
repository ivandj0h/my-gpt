package com.ivandjoh.Controller;

import org.slf4j.LoggerFactory;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.slf4j.Logger;

@Controller
@CrossOrigin
public class GptController {

    private static final Logger log = LoggerFactory.getLogger(GptController.class);
    private ChatClient chatClient;

    public GptController(ChatClient.Builder chatClientBuilder) {
        this.chatClient = chatClientBuilder.build();
    }

    @GetMapping("")
    public String HomeController() {
        return "index";
    }
}
