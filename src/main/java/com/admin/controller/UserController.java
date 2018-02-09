package com.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.admin.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  UserService service;

  @RequestMapping(method = RequestMethod.GET)
  public String getUser() {
    return service.get();
  }
}
