package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.helpers.Helper;

public class BaseTest {
    String token = System.getProperty("token");
    protected ApiClient client;
    protected Helper helper;
    public BaseTest()
    {
        client = new ApiClient();
        client.setBasePath("http://localhost:8090");
        client.addDefaultHeader("Authorization", token);
      //  client.addDefaultHeader("Authorization", "Bearer eyJ0eXAiOiAiVENWMiJ9.d3Jsb0dpN0VVYlpURVVQanVkSl9qdEdrWHd3.NzczZTQ1OWYtMjc1OS00NjY4LWIzOTMtOGVmYWFkNGRlYjZm");
        System.out.println(client);
        helper = new Helper(client);
    }
}
