package com.Bus.Start.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Bus {
    @Id @GeneratedValue
    @Column(name = "BUS_ID")
    private int id;

    @Column(name = "NUMBER")
    private int number; // Bus number. ex) 2013, 2230, 271,,,etc
}
