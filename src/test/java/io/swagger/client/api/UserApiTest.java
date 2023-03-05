package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.model.User;
import net.bytebuddy.utility.RandomString;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UserApiTest extends BaseTest {
    UserApi userApi = new UserApi(client);

    @Test()
    public void addUserPositive() throws ApiException {
        String userName = RandomString.make(12).toLowerCase();
        System.out.println(userName);

        User newUser = new User();
        newUser.setUsername(userName);
        newUser.setPassword(userName);
        
        User createdUser = userApi.addUser(newUser,null);

        assertThat(createdUser.getUsername()).as("Username from response is not equal to " + newUser.getUsername()).isEqualTo(newUser.getUsername());

        User getUser  = userApi.getUser("username:" + userName,null);

        assertThat(getUser.getUsername()).as("No such user " + createdUser.getUsername()).isEqualTo(createdUser.getUsername());
    }

    @Test()
    public void addUserWOPassword() throws ApiException {
        String userName = RandomString.make(12).toLowerCase();
        System.out.println(userName);

        User newUser = new User();
        newUser.setUsername(userName);
        ApiResponse<User> addUserResponse = userApi.addUserWithHttpInfo(newUser,null);
        String createdUserData = String.valueOf(addUserResponse.getData());

        assertThat(addUserResponse.getStatusCode()).as("Unexpected status code").isEqualTo(400);
        assertThat(createdUserData).as("Unexpected response message").contains("Password must not be empty when creating user.");
    }
}
