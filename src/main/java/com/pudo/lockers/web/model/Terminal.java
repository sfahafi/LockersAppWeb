package com.pudo.lockers.web.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="terminales")
public class Terminal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
    private String nombrePc;
    private String tipo;
    private String configuracion;
    private Integer nBoxes;
	private String nombreLocacion;
    private String direccion;
    private String localidad;
    private String cp;
    private String horario;
    private String contactoLocal;
    private String contactoSup;
    private Date fechaInstalacion;
    private String estatus;
    private String red;
    
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombrePc() {
		return nombrePc;
	}
	public void setNombrePc(String nombrePc) {
		this.nombrePc = nombrePc;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getConfiguracion() {
		return configuracion;
	}
	public void setConfiguracion(String configuracion) {
		this.configuracion = configuracion;
	}
	public Integer getnBoxes() {
		return nBoxes;
	}
	public void setnBoxes(Integer nBoxes) {
		this.nBoxes = nBoxes;
	}
	public String getNombreLocacion() {
		return nombreLocacion;
	}
	public void setNombreLocacion(String nombreLocacion) {
		this.nombreLocacion = nombreLocacion;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getContactoLocal() {
		return contactoLocal;
	}
	public void setContactoLocal(String contactoLocal) {
		this.contactoLocal = contactoLocal;
	}
	public String getContactoSup() {
		return contactoSup;
	}
	public void setContactoSup(String contactoSup) {
		this.contactoSup = contactoSup;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	public String getRed() {
		return red;
	}
	public void setRed(String red) {
		this.red = red;
	}
	public Date getFechaInstalacion() {
		return fechaInstalacion;
	}
	public void setFechaInstalacion(Date fechaInstalacion) {
		this.fechaInstalacion = fechaInstalacion;
	}
	
	@Override
	public String toString() {
		return "Terminal [id=" + id + ", nombrePc=" + nombrePc + ", tipo=" + tipo + ", configuracion=" + configuracion
				+ ", nBoxes=" + nBoxes + ", nombreLocacion=" + nombreLocacion + ", direccion=" + direccion
				+ ", localidad=" + localidad + ", cp=" + cp + ", horario=" + horario + ", contactoLocal="
				+ contactoLocal + ", contactoSup=" + contactoSup + ", estatus=" + estatus + ", red=" + red + "]";
	}
    
    
	
}
