package udemy.javaspring.udemyJavaNA22.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import udemy.javaspring.udemyJavaNA22.entities.User;
import udemy.javaspring.udemyJavaNA22.repositories.UserRepository;

													/*
													 * SERVICES é uma subcamada da camada MODEL.
													 * Services contém as regras e logicas de negocio da aplicação.  
													 * A camada controller chama a camada services e esta, por sua vez, interage com a camada Repositories. 
													 */

@Service									
public class UserService {
													/*	UserService vai conter services para atender o resource User.
	
	@Autowired										/*	@Autowired - Sinaliza para o container do Spring injetar automaticamente a dependencia.*/
	private UserRepository userRepository;
	
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	public User findById(long id) {
		Optional<User> user = userRepository.findById(id);
		return user.get();
	}
}
