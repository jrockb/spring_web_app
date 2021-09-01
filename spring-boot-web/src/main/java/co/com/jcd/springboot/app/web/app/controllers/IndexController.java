package co.com.jcd.springboot.app.web.app.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
		usuario.setNombre("Fulanito");
		usuario.setApellido("De tal");
		usuario.setEmail("fulanito@correo.com");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo","perfil del usuario: ".concat(usuario.getNombre()));
		return "perfil";		
	}
	
	// ejemplo con una lista de perfiles
	@RequestMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("titulo","Listado de usuarios");
		return "listar";		
	}
	
	// pasar data a la vista con ModelAttribute
	@ModelAttribute("usuarios") // el atributo queda general para todos los metodos y p.t. las vistas
	public List<Usuario> poblarUsuarios(){
		List<Usuario> usuarios = Arrays.asList(
				new Usuario("Juanito","Alimaña","juanito@alimana.com"),
				new Usuario("Pedro","Navaja","pedro@navaja.com"),
				new Usuario("Paquita","La del barrio","ratainmunda@paquita.com")
				);		
		return usuarios;		
	}
	

}
