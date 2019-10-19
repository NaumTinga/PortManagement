/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import IContrato.IArmazem;
import IContrato.ICarga;
import IContrato.IContentor;
import IContrato.IEndereco;
import IContrato.IMercadoria;
import IContrato.IOperacao;
import IContrato.ITransporte;
import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapKeyTemporal;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author NAUM
 */

@Entity
@Table(name = "Carga")
public class Carga implements ICarga, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cargaId")
    private int cargaId;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     @Column(name = "operacao")
    private IOperacao operacao;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     @Column(name = "contentor")
    private IContentor contentor;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     @Column(name = "mercadoria")
    private IMercadoria mercadoria;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     @Column(name = "transporte")
    private ITransporte transporte;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     @Column(name = "endereco")
    private IEndereco endereco;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     @Column(name = "amrmazem")
    private IArmazem armazem;
    
    @Column(name = "totalMercadoriaBoa")
    private int totalMercadoriaBoa;
    
    @Column(name = "totalMercadoriaMa")
    private int totalMercadoriaMa;
    
    @Column(name = "dataInicioCarga")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataInicioCarga;
    
    @Column(name = "totalMercadoria")
    //@Temporal(javax.persistence.TemporalType.TIME)
    @MapKeyTemporal(value=TemporalType.TIME)
    private Time horaInicioCarga;
    
    @Column(name = "nota")
    private String nota;

    public Carga(IOperacao operacao, IContentor contentor, IMercadoria mercadoria, ITransporte transporte, IEndereco endereco, IArmazem armazem, int totalMercadoriaBoa, int totalMercadoriaMa, Date dataInicioCarga, Time horaInicioCarga, String nota) {
        this.operacao = operacao;
        this.contentor = contentor;
        this.mercadoria = mercadoria;
        this.transporte = transporte;
        this.endereco = endereco;
        this.armazem = armazem;
        this.totalMercadoriaBoa = totalMercadoriaBoa;
        this.totalMercadoriaMa = totalMercadoriaMa;
        this.dataInicioCarga = dataInicioCarga;
        this.horaInicioCarga = horaInicioCarga;
        this.nota = nota;
    }

    public Carga(int cargaId) {
        this.cargaId = cargaId;
    }

    @Override
    public int getCargaId() {
        return cargaId;
    }

    @Override
    public void setCargaId(int cargaId) {
        this.cargaId = cargaId;
    }

    public Carga() {
    }

    @Override
    public IOperacao getOperacao() {
        return operacao;
    }

    @Override
    public void setOperacao(IOperacao operacao) {
        this.operacao = operacao;
    }

    @Override

    public IContentor getContentor() {
        return contentor;
    }

    @Override
    public void setContentor(IContentor contentor) {
        this.contentor = contentor;
    }

    @Override
    public IMercadoria getMercadoria() {
        return mercadoria;
    }

    @Override
    public void setMercadoria(IMercadoria mercadoria) {
        this.mercadoria = mercadoria;
    }

    @Override
    public ITransporte getTransporte() {
        return transporte;
    }

    @Override
    public void setTransporte(ITransporte transporte) {
        this.transporte = transporte;
    }

    @Override
    public IEndereco getEndereco() {
        return endereco;
    }

    @Override
    public void setEndereco(IEndereco endereco) {
        this.endereco = endereco;
    }

    public IArmazem getArmazem() {
        return armazem;
    }

    @Override
    public void setArmazem(IArmazem armazem) {
        this.armazem = armazem;
    }

    @Override
    public int getTotalMercadoriaBoa() {
        return totalMercadoriaBoa;
    }

    @Override
    public void setTotalMercadoriaBoa(int totalMercadoriaBoa) {
        this.totalMercadoriaBoa = totalMercadoriaBoa;
    }

    @Override
    public int getTotalMercadoriaMa() {
        return totalMercadoriaMa;
    }

    @Override
    public void setTotalMercadoriaMa(int totalMercadoriaMa) {
        this.totalMercadoriaMa = totalMercadoriaMa;
    }

    @Override
    public Date getDataInicioCarga() {
        return dataInicioCarga;
    }

    @Override
    public void setDataInicioCarga(Date dataInicioCarga) {
        this.dataInicioCarga = dataInicioCarga;
    }

    @Override
    public Time getHoraInicioCarga() {
        return horaInicioCarga;
    }

    @Override
    public void setHoraInicioCarga(Time horaInicioCarga) {
        this.horaInicioCarga = horaInicioCarga;
    }

    @Override
    public String getNota() {
        return nota;
    }

    @Override
    public void setNota(String nota) {
        this.nota = nota;
    }

}
