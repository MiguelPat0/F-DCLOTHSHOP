package com.example.demo.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String goHome(Model model) {
		model.addAttribute("titulo", "Bienvenido a D'ClothShop");
		return "inicio";
	}

}
