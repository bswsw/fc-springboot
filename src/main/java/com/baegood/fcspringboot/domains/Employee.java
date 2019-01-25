package com.baegood.fcspringboot.domains;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "empno")
    private Long empNo;

    private String name;

    private String job;

    @ManyToOne
    @JoinColumn(name = "boss")
    private Employee boss;

    @Column(name = "hiredate")
    private String hireDate;

    private Long salary;

    private Long comm;

    @ManyToOne
    @JoinColumn(name = "dept_no")
    private Department department;
}
