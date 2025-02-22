package udemy.javaspring.udemyJavaNA22.resources;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import udemy.javaspring.udemyJavaNA22.entities.User;
import udemy.javaspring.udemyJavaNA22.services.UserService;

													/*	
													 * Em uma API REST um Resource representa uma entidade exposta pela API para ser manipulada através de uma URL especifica.
													 * O resource UserResource vai possibilitar acesso as operações relacionadas a classe User. Em uma API REST um CONTROLLER tambem é um Resource
													*/

@RestController // 									@RestController - Sinaliza ao spring que essa classe é um controller. Uma classe controller é responsavel por receber, processar e responder requisiçoes HTTP
@RequestMapping("/usuarios") //						@RequestMapping - Sinaliza ao spring que essa classe controller responde baseada na URL "/usuario"
public class UserResource {
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping //									Mapeia o metodo findAll como um endpoint GET. Um endpoint está associado a um metodo e a uma operaçao (nesse caso o GET).
	public ResponseEntity<List<User>> findAll() {
		
		List<User> list = userService.findAll();	
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		
		User user = userService.findById(id);
		return ResponseEntity.ok().body(user);
	}
}

																	/*
																	* A classe ResponseEntity representa uma resposta HTTP completa de um endpoint REST com os dados no formato JSON.
																	*  
																	* ResponseEntity.ok() - retorna uma resposta 200 OK 
																	* ResponseEntity.body(u) - retorna uma resposta com corpo contendo o parametro fornecido */





