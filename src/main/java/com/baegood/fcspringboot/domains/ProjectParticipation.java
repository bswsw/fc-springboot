package com.baegood.fcspringboot.domains;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
public class ProjectParticipation {

    @EmbeddedId
    private ProjectParticipationId projectParticipationId;

    private String endDate;

    @ManyToOne
    private Role role;
}
