package hn.com.jf.services;

import java.util.List;
import java.util.Optional;

import hn.com.jf.models.domains.User;

public interface UserService {
	Optional<User> findById(Long id);
	List<User> findAll();
}
