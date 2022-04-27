package com.pudo.lockers.web.model;

import javax.persistence.*;

@Entity
@Table(name = "modulos")
public class Modulo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
    private String modelo;
    private String nSerie;
    private String tipo;
    private Integer nBoxes;
    private String apertura;
    
    @ManyToOne
	@JoinColumn(name="idTerminal", referencedColumnName = "id")
	private Terminal terminal;

    
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getnSerie() {
		return nSerie;
	}

	public void setnSerie(String nSerie) {
		this.nSerie = nSerie;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getnBoxes() {
		return nBoxes;
	}

	public void setnBoxes(Integer nBoxes) {
		this.nBoxes = nBoxes;
	}

	public String getApertura() {
		return apertura;
	}

	public void setApertura(String apertura) {
		this.apertura = apertura;
	}

	public Terminal getTerminal() {
		return terminal;
	}

	public void setTerminal(Terminal terminal) {
		this.terminal = terminal;
	}

	
	
	@Override
	public String toString() {
		return "Modulo [id=" + id + ", modelo=" + modelo + ", nSerie=" + nSerie + ", tipo=" + tipo + ", nBoxes="
				+ nBoxes + ", apertura=" + apertura + ", terminal=" + terminal + "]";
	}
    
    
    
}
