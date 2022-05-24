package model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "medico")

public class Medico {
	
	@Column(name = "nome_medico")
	@NotNull
	private String nome;
	
	@Column(name = "telefone_medico")
	@NotNull
	private String telefone;
	
	@Column(name = "especialidade_medico")
	@NotNull
	private String especialidade;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	
	@Override
	public String toString() {
		return "Medico [nome=" + nome + ", telefone=" + telefone + ", especialidade=" + especialidade + "]";
	}
	
	

}
