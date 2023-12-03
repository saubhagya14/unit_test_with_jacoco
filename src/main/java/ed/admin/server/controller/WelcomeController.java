package ed.admin.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ed.admin.server.service.WelcomeService;

@RestController
public class WelcomeController {

	@Autowired
	WelcomeService service;

	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeMessage() {
		String message = service.getMessage();
		return new ResponseEntity<String>(message, HttpStatus.OK);
	}
}
