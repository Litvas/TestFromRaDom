package com.testdev.chat.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "chater")
public class Chater {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_chater")
    private int idChater;

    @Column(name = "login")
    private String login;

    public Chater() {
    }

    public int getIdChater() {
        return idChater;
    }

    public void setIdChater(int idChater) {
        this.idChater = idChater;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
