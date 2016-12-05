package com.testdev.chat.dao;

import com.testdev.chat.entity.Message;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public interface MessageDAO extends JpaRepository<Message, Long> {

//    @Query("SELECT e FROM message limit 15 offset :offset")
//    public List<Message> findSomeMessage(int offset);
}
