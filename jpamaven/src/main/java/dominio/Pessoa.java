package dominio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity indica que a classe � uma entidade de dominio
//corresponde a uma tabela
@Entity
public class Pessoa implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id //indica que � a chave primaria da tabela
	@GeneratedValue(strategy=GenerationType.IDENTITY) //indica que a chave ser� gerada automaticamente
	private Integer id;
	private String nome;
	private String email;

	public Pessoa() {
	}

	public Pessoa(Integer id, String nome, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", email=" + email + "]";
	}
	
	

}
