package com.bumsoap.webhook.request;

public class WebhookRequest {
    private String event;
    private String data;

    public WebhookRequest(String event, String data) {
        this.event = event;
        this.data = data;
    }

    public String getEvent() {
        return event;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return "WebhookRequest{" +
                "event='" + event + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
