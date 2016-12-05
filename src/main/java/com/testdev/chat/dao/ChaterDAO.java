package com.testdev.chat.dao;

import com.testdev.chat.entity.Chater;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChaterDAO extends JpaRepository<Chater, Long> {}
