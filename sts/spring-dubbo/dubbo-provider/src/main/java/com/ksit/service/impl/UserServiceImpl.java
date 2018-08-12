package com.ksit.service.impl;

import com.ksit.service.UserService;

public class UserServiceImpl implements UserService {

	public String findById(Integer id) {

		String name = null;

		switch (id) {
		case 1:
			name = "name1";
			break;
		case 2:
			name = "name2";
			break;
		case 3:
			name = "name3";
			break;
		case 4:
			name = "name4";
			break;
		default:
			name = "default";
			break;
		}
		
		return name;
	}

}
