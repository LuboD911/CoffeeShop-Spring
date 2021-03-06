package com.example.coffeeshop.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity(name = "users")
public class UserEntity extends BaseEntity{

    @Min(5)
    @Max(20)
    @Column(nullable = false)
    private String username;

    private String firstName;

    @Min(5)
    @Max(20)
    @Column(nullable = false)
    private String lastName;

    @Min(3)
    private String password;

    @Email
    private String email;


    public UserEntity() {
    }

    public String getUsername() {
        return username;
    }

    public UserEntity setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserEntity setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserEntity setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserEntity setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserEntity setEmail(String email) {
        this.email = email;
        return this;
    }
}
