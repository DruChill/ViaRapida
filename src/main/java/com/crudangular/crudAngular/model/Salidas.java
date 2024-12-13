/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crudangular.crudAngular.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;

/**
 *
 * @author macbookair
 */
@Entity
public class Salidas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Card_model;
    private Date departure_time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCard_model() {
        return Card_model;
    }

    public void setCard_model(String Card_model) {
        this.Card_model = Card_model;
    }

    public Date getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(Date departure_time) {
        this.departure_time = departure_time;
    }

    
    
}
