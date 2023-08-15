package com.udacity.auth.chatApp.service;

import com.udacity.auth.chatApp.mapper.MessageMapper;
import com.udacity.auth.chatApp.model.ChatForm;
import com.udacity.auth.chatApp.model.ChatMessage;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

//import java.util.ArrayList;
import java.util.List;

@Service
public class MessageService {

    private MessageMapper messageMapper;

    public MessageService(MessageMapper messageMapper) {
        this.messageMapper = messageMapper;
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Creating MessageService Bean");
    }

    public void addMessage(ChatForm chatForm) {
        ChatMessage newMessage = new ChatMessage();
        newMessage.setUsername(chatForm.getUsername());
        newMessage.setMessages(chatForm.getMessages());
        messageMapper.addMessage(newMessage);
    }

    public List<ChatMessage> getChatMessages(){
        return messageMapper.getAllMessages();
    }
}
