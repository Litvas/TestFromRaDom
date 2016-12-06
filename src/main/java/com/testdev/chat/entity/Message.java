package com.testdev.chat.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "message")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_message")
    private int idMessage;

    @Column(name = "date_of_sending")
    private Date dateOfSending;

    @Column(name = "content_of_message")
    private String contentOfMessage;

    @Column(name = "author_of_message")
    @JoinColumn(name = "id_chater")
    private int authorOfMessage;

    public Message() {
    }

    public int getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(int idMessage) {
        this.idMessage = idMessage;
    }

    public Date getDateOfSending() {
        return dateOfSending;
    }

    public void setDateOfSending(Date dateOfSending) {
        this.dateOfSending = dateOfSending;
    }

    public String getContentOfMessage() {
        return contentOfMessage;
    }

    public void setContentOfMessage(String contentOfMessage) {
        this.contentOfMessage = contentOfMessage;
    }

    public int getAuthorOfMessage() {
        return authorOfMessage;
    }

    public void setAuthorOfMessage(int authorOfMessage) {
        this.authorOfMessage = authorOfMessage;
    }

    @Override
    public String toString() {
        return "Message{" +
                "idMessage=" + idMessage +
                ", dateOfSending=" + dateOfSending +
                ", contentOfMessage='" + contentOfMessage + '\'' +
                ", authorOfMessage=" + authorOfMessage +
                '}';
    }
}
