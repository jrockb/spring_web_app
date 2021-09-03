package co.com.jcd.springboot.app.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class EjemploVariablesRutaController {
	
	// ejp: http://localhost:8080/variables/string/cualquier texto
	
	@GetMapping("/string/{texto}") // texto será una variable
	public String variables(@PathVariable String texto, Model model) { // el parametro debe tener el mismo nombre
		model.addAttribute("titulo", "Recibir parámetros de la ruta (@PathVariable)");
		model.addAttribute("resultado","El texto enviado en la ruta es: "+ texto);
		return "variables/ver";
	}
	
	/** otra forma de declarar el parametro en la firma del metodo, cuando los nombres son diferentes:
	 * @GetMapping("/string/{texto}") // texto será una variable
		public String variables(@PathVariable(name="texto") String nombre, Model model) { 
			return "variables/ver";
		}
	 */

}
