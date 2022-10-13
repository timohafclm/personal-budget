package com.home.timofeev.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OutcomeCategory {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String description;
}
