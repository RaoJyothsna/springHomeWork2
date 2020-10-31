package com.example.spring.dao;


import com.example.spring.entities.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusDao extends JpaRepository<Status, Integer> {
    public Status findByStatusName(String statusName);
}
