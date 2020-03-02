package com.cts.allysoportal;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@PostMapping("/save")
	public void saveForm(@RequestBody LoginPojo loginPojo){
		loginService.save(loginPojo);
	}
	
	@GetMapping("/fetch/{id}")
	public Optional<LoginPojo> fetch(@PathVariable Integer id){
		return loginService.findById(id);
	}
}
