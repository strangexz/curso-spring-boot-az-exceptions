package hn.com.jf.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import hn.com.jf.models.domains.User;

@Service
public class UserServiceImpl implements UserService {

	private List<User> users;

	public UserServiceImpl() {
		this.users = new ArrayList<>();
		User user1 = new User(1L, "Aby", "Figueroa");
		User user2 = new User(2L, "Clara", "Aguilar");
		User user3 = new User(3L, "JD", "Figueroa");
		User user4 = new User(4L, "Juan", "Figueroa");
		User user5 = new User(5L, "Karla", "Figueroa");

		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
	}

	@Override
	public Optional<User> findById(Long id) {
		// TODO Auto-generated method stub
		User user = null;
		for (User u : users) {
			if (u.getId().equals(id)) {
				user = u;
				break;
			}
		}
		
		return Optional.ofNullable(user);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return users;
	}

}
