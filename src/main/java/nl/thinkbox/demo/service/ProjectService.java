package nl.thinkbox.demo.service;
import nl.thinkbox.demo.model.Project;

import java.security.Principal;
import java.util.List;

public interface ProjectService {

    List<Project> getAllProjects();
    Project getProjectById(long id);
    void deleteProject(long id);
    long saveProject(Project project);
    void updateProject(long id, Project project);
}
