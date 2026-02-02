package com.ironlady.ai.controller.service;

import com.ironlady.program.model.Program;
import com.ironlady.program.service.ProgramService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AiChatService {

    private final ProgramService programService;
    private String userName;

    public AiChatService(ProgramService programService) {
        this.programService = programService;
    }

    public String reply(String message) {

        String msg = message.toLowerCase();

        if (msg.contains("my name is")) {
            userName = message.substring(msg.indexOf("my name is") + 10).trim();
            return "Nice to meet you, " + capitalize(userName) + " 👋 How can I help you today?";
        }

        if (msg.contains("hi") || msg.contains("hello")) {
            return userName != null
                    ? "Hello " + capitalize(userName) + "! How can I assist you with Iron Lady programs today?"
                    : "Hello! Welcome to Iron Lady 🌸 How can I help you?";
        }

        if (msg.contains("program")) {
            return getProgramsReply();
        }

        if (msg.contains("price")) {
            return "Our program prices vary by duration and mode. Would you like to see available programs?";
        }

        return "I’m here to help you with Iron Lady programs and enrollment 😊";
    }

    private String getProgramsReply() {
        List<Program> programs = programService.getAllPrograms();

        if (programs.isEmpty()) {
            return "Currently, no programs are available. Please check back soon!";
        }

        StringBuilder reply = new StringBuilder("✨ Our latest Iron Lady programs:\n\n");

        for (Program p : programs) {
            reply.append("🔹 ").append(p.getTitle()).append("\n")
                    .append("⏳ ").append(p.getDuration()).append("\n")
                    .append("📍 ").append(p.getMode()).append("\n")
                    .append("💰 ₹").append(p.getPrice()).append("\n\n");
        }

        return reply + "Let me know if you want help choosing one 😊";
    }

    private String capitalize(String text) {
        return text == null || text.isEmpty()
                ? text
                : text.substring(0, 1).toUpperCase() + text.substring(1);
    }
}
