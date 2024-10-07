package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.People;

public interface UserDAO extends CrudRepository<People, Integer> {

}
