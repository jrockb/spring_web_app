package co.com.jcd.springboot.app.web.app;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

// clase creada para configurar los archivos properies
@Configuration
@PropertySources({
	@PropertySource("classpath:mensajes.properties") // resources se encuentra en el classpath
}) // si se tienen más archivos properties se agregan a este decorador separando por comas
public class TextPropertiesConfig {

}
