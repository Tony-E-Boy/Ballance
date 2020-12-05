package com.abs.testartifact.models;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

    private static Long USER_NUMBER;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "name")
    private  String name;

    @Column(name = "email")
    private  String email;

    @Column(name = "hex")
    private  String hex;

    public User(Long id, String name, String email, String hex) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.hex = hex;
    }

    public User(){}

    public void save(User user){
        user.setId(++USER_NUMBER);
        user.setEmail(email);
        user.setName(name);
        user.setHex(hex);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", hex='" + hex + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }
}
