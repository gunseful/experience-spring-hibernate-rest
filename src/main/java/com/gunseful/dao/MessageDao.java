package com.gunseful.dao;

import com.gunseful.entity.Message;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MessageDao {
    List<Message> allMessages();
    Optional<Message> getMessageById(int id);
    void add(Message message);
    void delete(Message message);
    void edit(Message message);
}
