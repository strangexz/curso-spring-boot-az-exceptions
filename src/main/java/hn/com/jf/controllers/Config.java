package hn.com.jf.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import hn.com.jf.models.domains.User;

@Configuration
@PropertySources({ @PropertySource("classpath:data.properties") })
public class Config {
	
	@Primary
	@Bean
	List<User> users() {
		User user1 = new User(1L, "Aby", "Figueroa");
		User user2 = new User(2L, "Clara", "Aguilar");
		User user3 = new User(3L, "JD", "Figueroa");
		User user4 = new User(4L, "Juan", "Figueroa");
		User user5 = new User(5L, "Karla", "Figueroa");

		return Arrays.asList(user1, user2, user3, user4, user5);
	}
}
