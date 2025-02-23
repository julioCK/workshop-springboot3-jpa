package udemy.javaspring.udemyJavaNA22.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity 													/*	@Entity - 	indica que essa classe sera gerenciada pelo JPA e mapeada para uma tabela no DB */
@Table(name = "tb_user") 									/*	@Table 	- 	define o nome que o JPA vai dar para a tabela criada no DB baseada nessa classe	*/
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id														/* 	@Id - indica ao JPA que o campo id será usado como PRIMARY KEY */
	@GeneratedValue(strategy = GenerationType.IDENTITY)  	/*	@GeneratedValue - indica ao JPA a maneira como o auto incremento da PK sera feito */
	private Long id;
	
	private String name;
	private String email;
	private String phone;
	private String password;
	
	@OneToMany(mappedBy = "client") 												/* Sinaliza ao Spring que a entidade User tem um relacionamento UM PARA MUITOS Order: User(1,N)Order */
	private List<Order> orders = new ArrayList();									/* O parametro mappedBy = "client" indica que essa entidade esta mapeada como "client" na na outra entidade da relacao (Order) */
				
																					/* Ao instanciar a lista logo no campo, não haverá riscos de NullPointerException */
	
	public User() {}
	
	public User(Long id, String name, String email, String phone, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setID(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}
}
