package cydeo.service;

import cydeo.dto.ProjectDTO;
import cydeo.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProjectService {


    ProjectDTO getByProjectCode(String code);
    List<ProjectDTO> listAllProjects();
    void save(ProjectDTO dto);
    void update(ProjectDTO dto);
    void delete(String code);
    void complete(String projectCode);
    List<ProjectDTO> listAllProjectDetails();

    List<ProjectDTO> listAllNonCompletedByAssignedManager(UserDTO assignedManager);

}