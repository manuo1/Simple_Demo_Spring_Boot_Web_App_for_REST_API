package com.manuo1.web_app.users.customproperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data //lombok
@Configuration //indicates that this class is a bean used for the app configuration
@ConfigurationProperties(prefix="com.manuo1.webapp1")
public class UserApiCustomProperties {
	
	private String userApiUrl;

}
