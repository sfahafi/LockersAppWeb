package com.pudo.lockers.web.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="historicos")
public class Historico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
    private String tipo;
    
    @Temporal(TemporalType.DATE)
    private Date fechaReporte;
    private String reporte;
    private String solucion;
    
    @Temporal(TemporalType.DATE)
    private Date fechaSolucion;
    private String estatus;
    
    @ManyToOne
	@JoinColumn(name="idTerminal", referencedColumnName = "id")
	private Terminal terminal;
    

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Date getFechaReporte() {
		return fechaReporte;
	}

	public void setFechaReporte(Date fechaReporte) {
		this.fechaReporte = fechaReporte;
	}

	public String getReporte() {
		return reporte;
	}

	public void setReporte(String reporte) {
		this.reporte = reporte;
	}

	public String getSolucion() {
		return solucion;
	}

	public void setSolucion(String solucuion) {
		this.solucion = solucuion;
	}

	public Date getFechaSolucion() {
		return fechaSolucion;
	}

	public void setFechaSolucion(Date fechaSolucion) {
		this.fechaSolucion = fechaSolucion;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public Terminal getTerminal() {
		return terminal;
	}

	public void setTerminal(Terminal terminal) {
		this.terminal = terminal;
	}
	

	@Override
	public String toString() {
		return "Historico [id=" + id + ", tipo=" + tipo + ", fechaReporte=" + fechaReporte + ", reporte=" + reporte
				+ ", solucion=" + solucion + ", fechaSolucion=" + fechaSolucion + ", estatus=" + estatus
				+ ", terminal=" + terminal + "]";
	}
    
    
    
	
}
