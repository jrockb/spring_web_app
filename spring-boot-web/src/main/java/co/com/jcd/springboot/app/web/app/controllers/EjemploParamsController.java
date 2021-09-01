package co.com.jcd.springboot.app.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class EjemploParamsController {
	
	@GetMapping("/")
	public String index() {
		return "params/index";
	}
	
	// el parametro se envia en la url ejp: localhost:8080/params/string?texto=Hola que tal
	@GetMapping("/string")
	public String param(@RequestParam(name="texto", required=false, defaultValue="algun valor...") 
		String texto, Model model) { // texto sera el parametro del request
		model.addAttribute("resultado", "El texto enviado es:" + texto);
		return "params/ver"; 
	}

}
