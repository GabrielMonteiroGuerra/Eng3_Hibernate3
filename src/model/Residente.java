package model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "residente")

public class Residente {
	
	@Column(name = "Instituicao_Ensino")
	@NotNull
	private String instituicaoEnsino;
	
	@Column(name = "Ano_Ingresso")
	@NotNull
	private LocalDate anoIngresso;
	
	public String getInstituicaoEnsino() {
		return instituicaoEnsino;
	}
	public void setInstituicaoEnsino(String instituicaoEnsino) {
		this.instituicaoEnsino = instituicaoEnsino;
	}
	public LocalDate getAnoIngresso() {
		return anoIngresso;
	}
	public void setAnoIngresso(LocalDate anoIngresso) {
		this.anoIngresso = anoIngresso;
	}
	
	@Override
	public String toString() {
		return "Residente [instituicaoEnsino=" + instituicaoEnsino + ", anoIngresso=" + anoIngresso + "]";
	}
	
	
	
}
