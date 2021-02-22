package nl.thinkbox.demo.service;

import nl.thinkbox.demo.model.Project;
import nl.thinkbox.demo.exception.DatabaseErrorException;
import nl.thinkbox.demo.exception.RecordNotFoundException;
import nl.thinkbox.demo.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;


    @Override
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }


    @Override
    public long saveProject(Project project) {
        Project newProject = projectRepository.save(project);
        return newProject.getId();
    }



    @Override
    public Project getProjectById(long id) {
        if (projectRepository.existsById(id)) {
            return projectRepository.findById(id).orElse(null);
        }
        else {
            throw new RecordNotFoundException();
        }
    }

    @Override
    public void deleteProject(long id) {
        if (projectRepository.existsById(id)) {
            projectRepository.deleteById(id);
        }
        else {
            throw new RecordNotFoundException();
        }
    }


    @Override
    public void updateProject(long id, Project project) {
        if (projectRepository.existsById(id)) {
            try {
                Project existingProject = projectRepository.findById(id).orElse(null);
                existingProject.setTitle(project.getTitle());
                existingProject.setPrivateView(project.getPrivateView());
                projectRepository.save(existingProject);
            }
            catch (Exception ex) {
                throw new DatabaseErrorException();
            }
        }
        else {
            throw new RecordNotFoundException();
        }
    }
}
