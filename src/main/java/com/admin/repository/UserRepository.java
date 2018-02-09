package com.admin.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

  public String get() {
    return "Hello User!!!";
  }
}
