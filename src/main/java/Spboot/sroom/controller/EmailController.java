package Spboot.sroom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Spboot.sroom.service.IEmailService;

@RestController
public class EmailController {
	
	@Autowired
	IEmailService es;
	
	@PostMapping(value="/emailAuthSuccess")
	public void emailAuthSuccess(@RequestParam(value = "id") String id) {
		es.memberConfirm(id);
		
	}
	
	@PostMapping(value="/email")
	public String[] emailSend(@RequestParam(value = "userEmail") String email) {
		System.out.println(email);
		String[] result=es.mailSend(email);
		return result;
	}

}
