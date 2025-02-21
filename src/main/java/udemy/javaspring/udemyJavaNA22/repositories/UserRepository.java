package udemy.javaspring.udemyJavaNA22.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import udemy.javaspring.udemyJavaNA22.entities.User;



// A Camada REPOSITORY faz parte da camada MODEL no modelo MVC. Sua função especifica é a de GERENCIAR O ACESSO A DADOS.



// --> ORM é uma técnica que permite converter objetos do paradigma Orientado a objetos (POO) em um registro de tabelas
	// de um banco de dados relacional e vice-versa.
	// O ORM faz uma MAPEAMENTO ENTRE CLASSES JAVA e TABELAS DO BANCO DE DADOS. Isso permite manipular dados do banco através
	// de METODOS DA LINGUAGEM DE PROGRAMAÇÃO.

// --> O JPA é uma especificação em Java que estabelece um contrato para se realizar o ORM (Mapeamento Objeto-Relacional). 

// --> O Hibernate é uma implementação do JPA que efetivamente realiza a persistencia dos dados utilizando o ORM de acordo com as
	//regras estabelecidas pelo JPA.

// --> O Spring Data JPA é um módulo do escossistema Spring para persistencia de dados que funciona como uma camada simplificadora sobre o Hibernate/JPA.
	//Ele oferece a interface JpaRepository, que pode ser extendida por um repositório, e contém os métodos basicos para manipulação e persistencia de dados.


public interface UserRepository extends JpaRepository<User, Long> {
	
	//  --> Toda interface que extender JpaRepository contara com os metodos da mesma, e NÃO É NECESSARIO implementar explicitamente os metodos de JpaRepository,
			// pois o spring fica responsável por isso em tempo de execução. 
			// Para extender JpaRepository é necessario fornecer o tipo da classe do repositório e o tipo do ID (chave primária da entidade/tabela).
	
}
