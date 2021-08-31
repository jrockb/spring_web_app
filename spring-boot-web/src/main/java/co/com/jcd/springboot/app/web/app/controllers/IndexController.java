package co.com.jcd.springboot.app.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.com.jcd.springboot.app.web.app.models.Usuario;

@Controller // clase controlador para manejar las peticiones del usuario desde el front
@RequestMapping("/app") // ruta padre o de primer nivel, p.e. http://localhost:8080/app/index 
public class IndexController {	
	
	@GetMapping({"/index","/","/home"}) 
	public String index(Model model) { 
		model.addAttribute("titulo","hola Spring Framework");
		return "index";
	}
	
	// ejemplo para enviar dato (modelo) desde el controlador a la vista
	@RequestMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("nombre");
		usuario.setApellido("apellido");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo","perfil del usuario: ".concat(usuario.getNombre()));
		return "perfil";		
	}
	

}
