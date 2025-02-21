package udemy.javaspring.udemyJavaNA22.resources;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import udemy.javaspring.udemyJavaNA22.entities.User;

// Em uma API REST um Resource representa uma entidade exposta pela API para ser manipulada através de uma URL especifica.
// O resource UserResource vai possibilitar acesso as operações relacionadas a classe User. Em uma API REST um CONTROLLER tambem é um Resource

@RestController // sinaliza ao spring que essa classe é um controller. Uma classe controller é responsavel por receber, processar e responder requisiçoes HTTP
@RequestMapping("/usuario") //sinaliza ao spring que essa classe controller responde baseada na URL "/usuario"
public class UserResource {
	
	@GetMapping //mapeia o metodo findAll como um endpoint GET. Um endpoint está associado a um metodo e a uma operaçao (nesse caso o GET).
	public ResponseEntity<User> findAll() {
		 User u = new User(1L, "Maria", "maria@gmail", "9999999", "12345");
		 return ResponseEntity.ok().body(u);
		 //A classe ResponseEntity representa uma resposta HTTP completa de um endpoint REST.
		 //ResponseEntity.ok() retorna uma resposta 200 OK
		 //ResponseEntity.body(u) retorna uma resposta com corpo contendo o usuário u 
	}
}