package co.com.jcd.springboot.app.web.app.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // clase controlador para manejar las peticiones del usuario desde el front
public class IndexController {
	
	@GetMapping({"/index","/","/home"})
	public String index(Map<String, Object> map) { // usando un mapa de Java, que es equivalente
		map.put("titulo", "Hola SpringFramework con un Map!!");
		return "index"; 
	}
	
	
	/**
	 * @GetMapping({"/index","/","/home"}) // el metodo está mapeado a estas tres rutas
	public String index(ModelMap model) { // ModelMap es equivalente a Model
		model.addAttribute("titulo","hola Spring Framework"); // titulo es el atributo
		return "index"; // retorna el nombre de la vista
	}
	
	 */
	
	

}
