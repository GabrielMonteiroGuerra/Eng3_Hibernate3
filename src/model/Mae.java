package model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "mae")

public class Mae {
	
	@Column(name = "nome_mae", length = 20)
	@NotNull
	private String nome;
	
	@Column(name = "logradouro_mae")
	@NotNull
	private String logradouro;
	
	@Column(name = "endereco_mae")
	@NotNull
	private int numEndereco;
	
	@Column(name = "cep_mae")
	@NotNull
	private String cep;
	
	@Column(name = "complemento_endereco_mae")
	@NotNull
	private String complementoEndereco;
	
	@Column(name = "telefone_mae")
	@NotNull
	private String telefone;
	
	@Column(name = "data_nasc_mae")
	@NotNull
	private LocalDate dataNasc;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public int getNumEndereco() {
		return numEndereco;
	}
	public void setNumEndereco(int numEndereco) {
		this.numEndereco = numEndereco;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getComplementoEndereco() {
		return complementoEndereco;
	}
	public void setComplementoEndereco(String complementoEndereco) {
		this.complementoEndereco = complementoEndereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public LocalDate getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	@Override
	public String toString() {
		return "Mae [nome=" + nome + ", logradouro=" + logradouro + ", numEndereco=" + numEndereco + ", cep=" + cep
				+ ", complementoEndereco=" + complementoEndereco + ", telefone=" + telefone + ", dataNasc=" + dataNasc
				+ "]";
	}
	
	
}
