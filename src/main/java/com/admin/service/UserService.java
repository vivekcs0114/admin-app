package com.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.repository.UserRepository;

@Service
public class UserService {

  @Autowired
  UserRepository repository;
  
  public String get() {
    return repository.get();
  }
}
