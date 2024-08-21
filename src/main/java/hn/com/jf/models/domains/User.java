package hn.com.jf.models.domains;

import lombok.Data;

@Data
public class User {
	private Long id;
	private String name;
	private String lastname;
	
	private Role role;

	public User() {
	}

	public User(Long id, String name, String lastname) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
//		this.role = role;
	}
	
//	public String getRoleName() {
//		return role.getName();
//	}

}
