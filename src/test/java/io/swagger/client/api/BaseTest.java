package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.helpers.Helper;

public class BaseTest {
    String token = System.getProperty("token");
    String host = System.getProperty("host");
    protected ApiClient client;
    protected Helper helper;
    public BaseTest() {
         client = new ApiClient();
        client.setBasePath(host);
        client.addDefaultHeader("Authorization", token);
        System.out.println(client);
        helper = new Helper(client);
    }
}
