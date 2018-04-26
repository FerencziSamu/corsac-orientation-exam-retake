package com.greenfox.complains.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

  @Id
  private String name;

  public User() {

  }

  public User(String name) {
    this.name = name;
  }

}
