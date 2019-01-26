package com.baegood.fcspringboot.repositories;

import com.baegood.fcspringboot.domains.ProjectParticipation;
import com.baegood.fcspringboot.domains.ProjectParticipationId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectParticipationRepository extends JpaRepository<ProjectParticipation, ProjectParticipationId> {
}
