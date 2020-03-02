package com.example.stocksbackend.models;

import javax.persistence.*;

@Entity
@Table(name = "USERS")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "CASH")
    private int cash;

    public User() { }

    public User(Long id, String userName, int cash) {
        this.id = id;
        this.userName = userName;
        this.cash = cash;
    }

    public User(String userName, int cash) {
        this.userName = userName;
        this.cash = cash;
    }

    public int getCash() {
        return cash;
    }

    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
