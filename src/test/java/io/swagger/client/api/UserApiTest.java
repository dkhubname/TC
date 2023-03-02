package io.swagger.client.api;
import io.swagger.client.ApiException;
import io.swagger.client.model.Token;
import io.swagger.client.model.User;
import io.swagger.client.model.UserLocator;
import io.swagger.client.model.Users;
import net.bytebuddy.utility.RandomString;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

public class UserApiTest extends BaseTest {
    UserApi userApi = new UserApi(client);

    @Test()
    public void authTokenTest() throws ApiException {
        Users users = userApi.getAllUsers(null,null);
        User firstUser = users.getUser().get(0);
        System.out.println(firstUser);
    }

    @Test()
    public void addUserPositive() throws ApiException {
        String userName = RandomString.make(12).toLowerCase();
        System.out.println(userName);

        User newUser = new User();
        newUser.setUsername(userName);
        newUser.setPassword(userName);
        User createdUser = userApi.addUser(newUser,null);

        assertThat(createdUser.getUsername()).isEqualTo(newUser.getUsername());
        User getUser = userApi.getUser("username:" + userName,null);

        assertThat(getUser.getUsername()).isEqualTo(createdUser.getUsername());

    }

    @Test()
    public void addUserWOPassword() throws ApiException {
        String userName = RandomString.make(12).toLowerCase();
        System.out.println(userName);

        User newUser = new User();
        newUser.setUsername(userName);
        User createdUser = userApi.addUser(newUser,null);





    }


}
