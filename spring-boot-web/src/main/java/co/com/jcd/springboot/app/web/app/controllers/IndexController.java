package co.com.jcd.springboot.app.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // clase controlador para manejar las peticiones del usuario desde el front
public class IndexController {
	
	// metodos de accion o handlers que manejan peticiones http
	
	@GetMapping({"/index","/","/home"}) // el metodo está mapeado a estas tres rutas
	public String index() {
		return "index"; // retorna el nombre de la vista
	}
	
	/** otras formas equivalentes:
	 * @RequestMapping(value="/index") // http://localhost:8080/index -> por defecto es GET
		public String index() {
			return "index"; // retorna el nombre de la vista
		}
		
		@RequestMapping(value="/index", method=RequestMethod.GET )
		public String index() {
			return "index"; 
		}

	 */

}
