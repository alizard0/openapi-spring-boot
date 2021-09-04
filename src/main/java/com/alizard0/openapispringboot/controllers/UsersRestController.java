package com.alizard0.openapispringboot.controllers;

import org.openapitools.api.UsersApi;
import org.openapitools.model.CreateUserDto;
import org.openapitools.model.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Collections;
import java.util.List;

@RestController
public class UsersRestController implements UsersApi {

  @Override
  public ResponseEntity<List<UserDto>> getUsers() {
    // call your service layer and return it
    return ResponseEntity.ok(Collections.singletonList(new UserDto()));
  }

  @Override
  public ResponseEntity<UserDto> getUsersById(String userId) {
    // call your service layer and return it
    return ResponseEntity.ok(new UserDto());
  }

  @Override
  public ResponseEntity<Void> postUsers(@Valid CreateUserDto user) {
    return ResponseEntity.status(HttpStatus.CREATED).build();
  }
}
