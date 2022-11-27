package cydeo.converter;


import cydeo.dto.ProjectDTO;
import cydeo.service.ProjectService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
//@ConfigurationPropertiesBinding
public class ProjectDtoConverter implements Converter<String, ProjectDTO> {


    ProjectService projectService;

    public ProjectDtoConverter(ProjectService projectService) {
        this.projectService = projectService;
    }



   public ProjectDTO convert(String source){

        if (source == null || source.equals("")) {
            return null;
        }

        return projectService.getByProjectCode(source);

    }

}
