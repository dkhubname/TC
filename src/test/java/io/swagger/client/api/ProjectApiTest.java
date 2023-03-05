package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.NewProjectDescription;
import io.swagger.client.model.Project;
import org.junit.jupiter.api.Test;
import org.threeten.bp.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

public class ProjectApiTest extends BaseTest {
    ProjectApi projectApi  = new ProjectApi(client);

    @Test
    public void CreateProjectTest() throws ApiException {
        String newProjectName = "CreateProjectTest_" + LocalDateTime.now();

        NewProjectDescription body = new NewProjectDescription();
        body.setName(newProjectName);
        Project project = projectApi.addProject(body);

        assertThat(project.getName()).as("Project name from response is not equal to " + newProjectName).isEqualTo(newProjectName);

        Project getProject  = projectApi.getProject("name:" + newProjectName,null);

        assertThat(getProject.getName()).as("No such project " + newProjectName).isEqualTo(newProjectName);
    }
}
