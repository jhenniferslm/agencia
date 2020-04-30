package br.com.qintess.apirest.agencia.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Agencia implements Serializable {

	private static final long SerialVersiounUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;

	@Column(name = "NOME", nullable = false)
	private String nome;

	@Column(name = "DESTINO", nullable = false)
	private String destino;

	@Column(name = "DATA", nullable = false)
	private String data;

	@Column(name = "ValorPassagem", nullable = false)
	private double valorPassagem;

	
	  @OneToMany 
	  private List<Passagem> passagens;
	 

	public Agencia() {
	}

	public void setValorPassagem(double valorPassagem) {
		if (getDestino().equals("BaixadaSantista")) {
			this.valorPassagem = valorPassagem-(0.2 * valorPassagem);
		} else {
			this.valorPassagem = valorPassagem;
		}

	}
}