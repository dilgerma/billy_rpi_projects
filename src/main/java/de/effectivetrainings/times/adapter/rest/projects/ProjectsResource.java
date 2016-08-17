package de.effectivetrainings.times.adapter.rest.projects;

import de.effectivetrainings.times.api.Project;
import de.effectivetrainings.times.adapter.db.project.ProjectRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class ProjectsResource {

    public static final String PROJECTS_URI = "/projects";
    public static final String PROJECTS_BY_NAME_URI = "/projects/{name}";

    private ProjectRepository projectRepository;
    private ProjectsApiMapper projectsApiMapper = new ProjectsApiMapper();

    public ProjectsResource(ProjectRepository projectRepository) {
        this.projectRepository = Objects.requireNonNull(
                projectRepository);
    }

    @RequestMapping(PROJECTS_URI)
    public List<Project> projects() {
        return projectRepository
                .findAll()
                .stream()
                .map(projectsApiMapper::from)
                .collect(Collectors.toList());
    }

    @RequestMapping(PROJECTS_BY_NAME_URI)
    public Optional<Project> projects(@PathVariable("name") String name) {
        return projectRepository
                .findByName(name)
                .map(projectsApiMapper::from);
    }
}