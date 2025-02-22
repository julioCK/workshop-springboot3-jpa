package udemy.javaspring.udemyJavaNA22;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




										/*
										 * 	Os Beans são classes java que são instanciadas, configuradas e gerenciadas pelo Container IoC do Spring.
										 *	
										 * 	O container de Inversao de Controle do Spring usa os Beans para INJEÇÃO DE DEPENDENCIAS e
										 * 	também controla seu ciclo de vida, desde a instanciação até sua destruição quando necessário.
										 * 
										 * 	O meio mais comum de sinalizar uma classe java como Beans para o Spring é usando anotaçoes, como @Component, que
										 * 	marca a classe como um "Bean genérico".
										 * 
										 * 	Existem outras notações mais específicas que identificam o contexto onde o beans está inserido, como:
										 * 
										 * 	@Service: Bean para a camada de serviços
										 * 	@Repository: Bean para acesso a dados
										 * 	@Controller: Beans para controladores de aplicações web
										 * 
										 * */

@SpringBootApplication
public class UdemyJavaNa22Application {

	public static void main(String[] args) {
		SpringApplication.run(UdemyJavaNa22Application.class, args);
	}

}
