package cydeo.repository;

import cydeo.entity.Project;
import cydeo.entity.User;
import cydeo.enums.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository <Project, Long> {

    Project findByProjectCode(String code);
    List<Project>  findAllByAssignedManager(User manager);
    List<Project> findAllByProjectStatusIsNotAndAssignedManager(Status status, User assignedManager);

}
