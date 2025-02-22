package udemy.javaspring.udemyJavaNA22.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import udemy.javaspring.udemyJavaNA22.entities.User;
import udemy.javaspring.udemyJavaNA22.repositories.UserRepository;


									/*	
									 * Essa classe será uma CLASSE DE CONFIGURAÇÃO. Isso pode ser sinalizado com a notação @Configuration.
									 * Esse tipo de classe é util para definir comportamentos específicos e habilitar/desalibitar funcionalidades de diversas partes da aplicacão.
									 * Primeiramente nesse projeto essa classe será util para fazer o DATABASE SEEDING, ou seja, popular o banco de dados do perfil de teste.
									 * 									
									 * */
@Configuration
@Profile("test") // essa notação sinaliza que essa classe de configuração está atrelada ao PERFIL DE TESTE parametrizado no pelo arquivo application-test.properties.
public class TestConfig implements CommandLineRunner {

	
	@Autowired
	private UserRepository userRepository; //essa dependencia será injetada automaticamente pelo Spring pois está sinalizada com a notacao @Autowired

	@Override
	public void run(String... args) throws Exception {
		// o metodo run vem da interface CommandLineRunner. Ele executa o codigo que estiver implementado aqui ao iniciar a execução do programa.
		
		//Instanciar 2 usuários para povoar o banco de dados de teste
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
}
