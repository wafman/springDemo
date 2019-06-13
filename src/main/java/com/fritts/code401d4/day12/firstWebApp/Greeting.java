package com.fritts.code401d4.day12.firstWebApp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Greeting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String language;
    String text;

    public Greeting(){}

    public Greeting(String language, String text){
        this.language = language;
        this.text = text;
    }
}
