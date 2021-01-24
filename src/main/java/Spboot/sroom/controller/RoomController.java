package Spboot.sroom.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import Spboot.sroom.service.IRoomService;


@Controller
public class RoomController {
	
	


	@Autowired
	IRoomService rs;
	
	@ResponseBody
	@GetMapping("/users")
	public String user() {

		return "제발제발제발나와줘";		
	}
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Locale locale, Model model) {

		return "index";		
	}
}
