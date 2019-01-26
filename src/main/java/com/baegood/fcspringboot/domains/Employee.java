package com.baegood.fcspringboot.domains;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "empno")
    private Long empNo;

    @Column(length = 10)
    private String name;

    @Column(length = 9)
    private String job;

    @ManyToOne
    @JoinColumn(name = "boss")
    private Employee boss;

    @Column(name = "hiredate", length = 12)
    private String hireDate;

    private Long salary;

    private Long comm;

    @ManyToOne
    @JoinColumn(name = "deptno")
    private Department department;
}
