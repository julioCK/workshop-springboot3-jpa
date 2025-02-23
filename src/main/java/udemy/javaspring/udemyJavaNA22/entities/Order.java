package udemy.javaspring.udemyJavaNA22.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_order")
public class Order implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private Instant moment;
	//private OrderStatus orderStatus;
	
	@ManyToOne											/* Sinaliza ao Spring que a relação de Order com User no DB será de Muitos(Orders) -> Um(User) ou seja (N,1) */
	@JoinColumn(name = "client_id")						/* Em relações (1,N) a chave primária da tabela de cardinalidade UM(1) vai como chave estrangeira para a tabela MUITOS(N) */
	private User client;								/* @JoinColumn(name = "") cria uma coluna que vai conter a CHAVE ESTRANGEIRA do relacionamento, o nome da coluna vai no parametro "name" */	
	
	public Order() {
		
	}

	public Order(Long id, Instant moment, User client) {
		super();
		Id = id;
		this.moment = moment;
		this.client = client;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public User getClient() {
		return client;
	}

	public void setClient(User client) {
		this.client = client;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(Id, other.Id);
	}
}
