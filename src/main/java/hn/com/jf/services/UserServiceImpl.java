package hn.com.jf.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.com.jf.models.domains.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private List<User> users;

	@Override
	public Optional<User> findById(Long id) {
		// TODO Auto-generated method stub		
		return users.stream().filter(usr -> usr.getId().equals(id)).findFirst();
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return users;
	}

}
