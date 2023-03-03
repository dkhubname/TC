package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Build;
import io.swagger.client.model.BuildType;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BuildQueueApiTest extends BaseTest {
    BuildQueueApi buildQueueApi = new BuildQueueApi(client);
    BuildApi buildApi = new BuildApi(client);

    @Test
    public void addBuildToQueueTest() throws ApiException {
        buildQueueApi.deleteAllQueuedBuilds(null,null);

        BuildType buildType = helper.getBuildType();

        Build body = new Build();
        body.buildTypeId(buildType.getId());
        Build response = buildQueueApi.addBuildToQueue(body, true);

        assertThat(response.getBuildTypeId()).as("BuildTypeId from response is not equal to " + buildType.getId()).isEqualTo(buildType.getId());
        assertThat(response.getState()).as(buildType.getId() + " state is not queued").isEqualTo(Build.StateEnum.QUEUED);
    }
}
