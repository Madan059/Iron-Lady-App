package com.ironlady.ai.controller;

import com.ironlady.ai.controller.dto.ChatRequest;
import com.ironlady.ai.controller.dto.ChatResponse;
import com.ironlady.ai.controller.service.AiChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chat")
@CrossOrigin(origins = "*")
public class ChatController {

    @Autowired
    private AiChatService aiChatService;

    @PostMapping
    public ChatResponse chat(@RequestBody ChatRequest request) {
        String reply = aiChatService.reply(request.getMessage());
        return new ChatResponse(reply);
    }
}
