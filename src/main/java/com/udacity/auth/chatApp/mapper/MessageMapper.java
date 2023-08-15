package com.udacity.auth.chatApp.mapper;

import com.udacity.auth.chatApp.model.ChatMessage;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MessageMapper {

    @Select("SELECT * FROM MESSAGES")
    List<ChatMessage> getAllMessages();

    @Insert("INSERT INTO MESSAGES (username, messagetext) VALUES(#{username}, #{messagetext})")
    @Options(useGeneratedKeys = true, keyProperty = "messageId")
    int addMessage(ChatMessage chatMessage);

}
