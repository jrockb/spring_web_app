package co.com.jcd.springboot.app.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller // clase controlador para manejar las peticiones del usuario desde el front
public class IndexController {
	
	@GetMapping({"/index","/","/home"})
	public ModelAndView index(ModelAndView mv) { // usando ModelAndView
		mv.addObject("titulo", "Hola SpringFramework con ModelAndView!!");
		mv.setViewName("index");
		return mv; 
	}
	
	
	/**
	 * @GetMapping({"/index","/","/home"}) // el metodo está mapeado a estas tres rutas
	public String index(ModelMap model) { // ModelMap es equivalente a Model
		model.addAttribute("titulo","hola Spring Framework"); // titulo es el atributo
		return "index"; // retorna el nombre de la vista
	}
	
	 */
	
	

}
