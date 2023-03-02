package io.swagger.client.helpers;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.JSON;
import io.swagger.client.api.BuildTypeApi;
import io.swagger.client.api.ProjectApi;
import io.swagger.client.model.*;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.format.DateTimeFormatter;

public class Helper {
    ApiClient client;
    BuildTypeApi buildTypeApi;
    ProjectApi projectApi;
    public Helper(ApiClient client)
    {
        this.client = client;
        this.buildTypeApi = new BuildTypeApi(client);
        this.projectApi = new ProjectApi(client);
    }


    public BuildType getBuildType() throws ApiException {

        BuildTypes allBuildTypes = buildTypeApi.getAllBuildTypes(null,null);
        int currentSeconds = Integer.parseInt(DateTimeFormatter.ofPattern("SSS").format(LocalDateTime.now()));
        if (allBuildTypes.getCount() == 0)
        {
            String builtTypeName = "testBuildConfig_" + currentSeconds;// randon.getstring
            Project project = getProject();
            BuildType buildType = new BuildType();
            buildType.id(builtTypeName);
            buildType.name(builtTypeName);
            buildType.projectId(project.getId());
            buildType.projectName(project.getName());

            buildTypeApi.createBuildType(buildType,null);

            return buildType;
        }
        else
        {
            return allBuildTypes.getBuildType().get(0);
        }


    }

    public Project getProject() throws ApiException {
     Projects projects =  projectApi.getAllProjects(null,null);
        if (projects.getCount() == 1)
        {
            String projectName = "testProject_" + LocalDateTime.now(); // random.getstring

            NewProjectDescription body = new NewProjectDescription();
            body.setName(projectName);
            Project project = projectApi.addProject(body);

            return project;
        }
        return  projects.getProject().get(1);

    }

}
