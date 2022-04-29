package com.pudo.lockers.web.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="puertasBloqueadas")
public class PuertaBloqueada {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@ManyToOne
	@JoinColumn(name="idTerminal", referencedColumnName = "id")
	private Terminal terminal;
    
    private Integer puerta;
    private Date fecha;
    private String descripcion;
    private String descripcionTecnica;
    private Date fechaTecnica;
    private String estatus;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Terminal getTerminal() {
		return terminal;
	}
	public void setTerminal(Terminal terminal) {
		this.terminal = terminal;
	}
	public Integer getPuerta() {
		return puerta;
	}
	public void setPuerta(Integer puerta) {
		this.puerta = puerta;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getDescripcionTecnica() {
		return descripcionTecnica;
	}
	public void setDescripcionTecnica(String descripcionTecnica) {
		this.descripcionTecnica = descripcionTecnica;
	}
	public Date getFechaTecnica() {
		return fechaTecnica;
	}
	public void setFechaTecnica(Date fechaTecnica) {
		this.fechaTecnica = fechaTecnica;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	
	
	@Override
	public String toString() {
		return "PuertaBloqueada [id=" + id + ", terminal=" + terminal + ", puerta=" + puerta + ", fecha=" + fecha
				+ ", descripcion=" + descripcion + ", descripcionTecnica=" + descripcionTecnica + ", fechaTecnica="
				+ fechaTecnica + ", estatus=" + estatus + "]";
	}
	
    
    
    
}
