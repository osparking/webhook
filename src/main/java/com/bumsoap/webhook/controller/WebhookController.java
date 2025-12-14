package com.bumsoap.webhook.controller;

import com.bumsoap.webhook.request.WebhookRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
// Allow requests from your React app
public class WebhookController {

    private static final Logger logger = LoggerFactory.getLogger(WebhookController.class);

    @PostMapping("/api/webhook-listener")
    public String handleWebhook(@RequestBody WebhookRequest payload) {
        // Process the incoming data (e.g., save to DB, trigger an event)
        logger.info("웹훅 통지 정보: {}", payload);
        // In a real application, you might use WebSockets or Server-Sent Events (SSE)
        // to push this update to connected React clients in real-time
        return "웹훅 정보 수신 성공!";
    }
}
