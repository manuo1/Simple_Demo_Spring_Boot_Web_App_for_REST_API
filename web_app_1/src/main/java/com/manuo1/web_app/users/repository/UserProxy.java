package com.manuo1.web_app.users.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.manuo1.web_app.users.customproperties.UserApiCustomProperties;
import com.manuo1.web_app.users.model.User;

/*
 * Get user data from user management API
 */

@Component
public class UserProxy {

	
    @Autowired
    private UserApiCustomProperties customProperty;

       public Iterable<User> getAllUsers() {
    	// Define base URL to ask the user API
        String baseApiUrl = customProperty.getUserApiUrl();
        // Define endpoint path to get an iterable to all users
        String getAllUsersApiUrl = baseApiUrl + "/user/all";

        // RestTemplate allows to execute an HTTP request
        RestTemplate restTemplate = new RestTemplate();
        
        ResponseEntity<Iterable<User>> apiResponse = restTemplate.exchange(
        		getAllUsersApiUrl, // API URL
                HttpMethod.GET, // Request type (GET, POST, PUT, DELETE, etc...)
                null, // Null (instead of an HttpEntity object) = default
                new ParameterizedTypeReference<Iterable<User>>() {} // object type that will be returned
                );

        System.out.println("Get Employees call " + apiResponse.getStatusCode().toString());
        
        return apiResponse.getBody(); // response.getBody() = Iterable<User>
    }
}
