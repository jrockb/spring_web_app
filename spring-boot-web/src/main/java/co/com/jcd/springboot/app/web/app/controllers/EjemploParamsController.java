package co.com.jcd.springboot.app.web.app.controllers;

import javax.servlet.http.HttpServletRequest;

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
	
	// enviar más de un parametro en la url
	@GetMapping("/mix-params")
	public String param(@RequestParam String saludo, @RequestParam Integer numero, Model model) { 
		model.addAttribute("resultado", "El Saludo enviado es: '" + saludo 
				+ "' y el número es: '"+numero+"' ");
		return "params/ver"; 
	}
	
	// otra forma enviando directamente el objeto HttpServletRequest
		@GetMapping("/mix-params-request")
		public String param(HttpServletRequest request, Model model) { 
			String saludo  = request.getParameter("saludo"); // se indica el nombre del parametro enviado
			Integer numero = null;
			try {
				numero = Integer.parseInt(request.getParameter("numero")); // porque getParameter devuelve un String
			} catch(NumberFormatException e) {
				numero = 0; // ejemplo
			}				
			model.addAttribute("resultado", "El Saludo enviado es: '" + saludo 
					+ "' y el número es: '"+numero+"' ");
			return "params/ver"; 
		}

}
