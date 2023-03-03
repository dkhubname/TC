package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.helpers.Helper;

public class BaseTest {
    String token = System.getProperty("token");
    protected ApiClient client;
    protected Helper helper;
    public BaseTest() {
        client = new ApiClient();
        client.setBasePath("http://localhost:8090");
        client.addDefaultHeader("Authorization", token);
        System.out.println(client);
        helper = new Helper(client);
    }
}
