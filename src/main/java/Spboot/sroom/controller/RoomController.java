package Spboot.sroom.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Spboot.sroom.service.IRoomService;

@Controller
public class RoomController {
	
	@Autowired
	IRoomService rs;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Locale locale, Model model) {

		return "index";		
	}
}
