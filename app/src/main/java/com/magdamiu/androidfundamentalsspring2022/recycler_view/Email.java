package com.magdamiu.androidfundamentalsspring2022.recycler_view;

public class Email {
    private String subject;
    private String details;
    private String sender;

    public Email(String subject, String details, String sender) {
        this.subject = subject;
        this.details = details;
        this.sender = sender;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}
