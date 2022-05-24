package model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "medico")

public class BebeMedico extends Bebe {
	
	@Id
	@Column(name = "codigo_bebe", length = 20)
	@NotNull
	private int idBebe;
	
	@Id
	@Column(name = "codigo_medico", length = 20)
	@NotNull
	private int medicoCrm;
	
	public int getIdBebe() {
		return idBebe;
	}
	public void setIdBebe(int idBebe) {
		this.idBebe = idBebe;
	}
	public int getMedicoCrm() {
		return medicoCrm;
	}
	public void setMedicoCrm(int medicoCrm) {
		this.medicoCrm = medicoCrm;
	}
	
	@Override
	public String toString() {
		return "BebeMedico [idBebe=" + idBebe + ", medicoCrm=" + medicoCrm + "]";
	}
	
	

}
