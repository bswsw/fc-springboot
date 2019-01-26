package com.baegood.fcspringboot.domains;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class BonusId implements Serializable {

    @Column(length = 10)
    private String ename;

    @Column(length = 9)
    private String job;
}
