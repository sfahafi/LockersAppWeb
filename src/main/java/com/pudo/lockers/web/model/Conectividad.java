package com.pudo.lockers.web.model;

import javax.persistence.*;

@Entity
@Table(name="conectividades")
public class Conectividad {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
    @OneToOne
	@JoinColumn(name="idTerminal", referencedColumnName = "id")
	private Terminal terminal;
    
    private String internet;
    private String Fuente;
    private String macModem;
    private String snModem;
    private String chipCompani;
    private String chipNumero;
    private String idTeamviewer;
    private String serialRouter;
    private String serialDvr;
    private String codigoDvr;
    
    
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
	public String getInternet() {
		return internet;
	}
	public void setInternet(String internet) {
		this.internet = internet;
	}
	public String getFuente() {
		return Fuente;
	}
	public void setFuente(String fuente) {
		Fuente = fuente;
	}
	public String getChipCompani() {
		return chipCompani;
	}
	public void setChipCompani(String chipCompani) {
		this.chipCompani = chipCompani;
	}
	public String getChipNumero() {
		return chipNumero;
	}
	public void setChipNumero(String chipNumero) {
		this.chipNumero = chipNumero;
	}
	public String getIdTeamviewer() {
		return idTeamviewer;
	}
	public void setIdTeamviewer(String idTeamviewer) {
		this.idTeamviewer = idTeamviewer;
	}
	public String getSerialRouter() {
		return serialRouter;
	}
	public void setSerialRouter(String serialRouter) {
		this.serialRouter = serialRouter;
	}
	public String getSerialDvr() {
		return serialDvr;
	}
	public void setSerialDvr(String serialDvr) {
		this.serialDvr = serialDvr;
	}
	public String getCodigoDvr() {
		return codigoDvr;
	}
	public void setCodigoDvr(String codigoDvr) {
		this.codigoDvr = codigoDvr;
	}
	
	public String getMacModem() {
		return macModem;
	}
	public void setMacModem(String macModem) {
		this.macModem = macModem;
	}
	public String getSnModem() {
		return snModem;
	}
	public void setSnModem(String snModem) {
		this.snModem = snModem;
	}
	
	
	@Override
	public String toString() {
		return "Conectividad [id=" + id + ", terminal=" + terminal.getNombrePc() + ", internet=" + internet + ", Fuente=" + Fuente
				+ ", chipCompani=" + chipCompani + ", chipNumero=" + chipNumero + ", idTeamviewer=" + idTeamviewer
				+ ", serialRouter=" + serialRouter + ", serialDvr=" + serialDvr + ", codigoDvr=" + codigoDvr + "]";
	}
	
	
    
    
}
