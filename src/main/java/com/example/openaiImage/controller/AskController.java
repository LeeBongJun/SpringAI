package com.example.openaiImage.controller;

import com.example.openaiImage.service.ChatService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AskController {

    private final ChatService chatService;

    public AskController(ChatService chatService) {
        this.chatService = chatService;
    }

    @GetMapping("/ask")
    public String getResponse(String message) {
        return chatService.getResponse(message);
    }

}
