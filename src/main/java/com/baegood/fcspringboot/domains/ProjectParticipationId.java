package com.baegood.fcspringboot.domains;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class ProjectParticipationId implements Serializable {

    @Column(name = "projectno")
    private Long projectNo;

    @Column(name = "empno")
    private Long empNo;

    @Column(length = 12)
    private String startDate;
}
