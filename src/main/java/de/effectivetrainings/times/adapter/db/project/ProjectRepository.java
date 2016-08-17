package de.effectivetrainings.times.adapter.db.project;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProjectRepository extends JpaRepository<ProjectData, Long> {

    Optional<ProjectData> findByName(String name);
}
