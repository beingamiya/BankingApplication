package com.banking.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.banking.model.Banking;

@Repository
public interface bankingrepo extends CrudRepository<Banking, Long> {

}
