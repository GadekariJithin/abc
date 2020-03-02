package com.cts.allysoportal;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	
	@Autowired
	LoginDAO loginDAO;
	
	public void save(LoginPojo loginPojo) {
		loginDAO.save(loginPojo);
	}

	public Optional<LoginPojo> findById(Integer id) {
		return loginDAO.findById(id);
	}

}
