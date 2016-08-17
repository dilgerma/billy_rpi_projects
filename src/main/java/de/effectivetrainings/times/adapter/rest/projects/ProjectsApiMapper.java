package de.effectivetrainings.times.adapter.rest.projects;

import de.effectivetrainings.times.api.HourRate;
import de.effectivetrainings.times.api.Project;
import de.effectivetrainings.times.adapter.db.customer.CustomerData;
import de.effectivetrainings.times.adapter.db.project.ProjectData;

public class ProjectsApiMapper {

    public Project from(ProjectData projectData) {
        return Project.builder().name(projectData.getName()).customerName(projectData.getCustomer().getName()).hourRate(HourRate.of(projectData.getHourRate())).start(projectData.getStart()).end(projectData.getEnd()).build();
    }

    public ProjectData to(Project project, CustomerData customerData) {
        return new ProjectData(project.getName(), project.getStart(), project.getEnd(), customerData, project
                .getHourRate()
                .getRate());
    }
}
