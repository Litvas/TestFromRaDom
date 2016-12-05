package com.testdev.chat.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "chater")
public class Chater {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_chater")
    private Long idChater;

    @Column(name = "login")
    private String login;

    public Chater() {
    }

    public Long getIdChater() {
        return idChater;
    }

    public void setIdChater(Long idChater) {
        this.idChater = idChater;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
