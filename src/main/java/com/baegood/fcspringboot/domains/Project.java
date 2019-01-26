package com.baegood.fcspringboot.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "projectno")
    private Long projectNo;

    @Column(length = 100)
    private String description;

    @Column(length = 12)
    private String startDate;

    @Column(length = 12)
    private String endDate;
}
