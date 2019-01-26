package com.baegood.fcspringboot.domains;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Bonus {

    @EmbeddedId
    private BonusId bonusId;

    private Double sal;

    private Double comm;
}
