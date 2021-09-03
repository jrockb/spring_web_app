package co.com.jcd.springboot.app.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// esta clase tiene un método que redirige al método index (IndexController)
// si se escribe en el navegador localhost:8080 automaticamente redirige a la ruta especificada como home
@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "redirect:/app/index"; // redirect: + ruta 
	}
	
	/** otra forma usando un forward:
	 * @GetMapping("/")
		public String home() {
			return "forward:/app/index"; forward no cambia la url, es adecuado para páginas de inicio
		} // forward ejecuta un requestdispartcher del api servlet, solo permite dirigir a páginas
		propias del proyecto, redirect si permite dirigir a páginas externas

	 */

}
