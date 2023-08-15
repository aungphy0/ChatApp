package com.udacity.auth.chatApp.model;

public class ChatForm {

    private String username;
    private String messagetext;

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getMessages(){
        return messagetext;
    }

    public void setMessages(String messages){
        this.messagetext = messages;
    }

}
