package com.home.timofeev.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Outcome {

    @Id
    @GeneratedValue
    private Long id;

    private LocalDate date;

    private String description;

    private BigDecimal amount;

    private OutcomeCategory category;
}
