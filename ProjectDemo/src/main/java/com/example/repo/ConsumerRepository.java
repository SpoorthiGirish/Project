package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Consumer;


@Repository
public interface ConsumerRepository  extends JpaRepository<Consumer,Long> {

}
