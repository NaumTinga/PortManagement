/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import IContrato.IArmazem;
import IContrato.ICarga;
import IContrato.IDescarga;
import IContrato.IOperacao;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author NAUM
 */
public class Descarga implements IDescarga {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "descargaId")
    private int descargaId;

    @Column(name = "totalMercadoriaBoa")
    private int totalMercadoriaBoa;

    @Column(name = "totalMercadoriaMa")
    private int totalMercadoriaMa;

    @Column(name = "dataChegadaCarga")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataChegadaCarga;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private ICarga carga;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private IArmazem armazem;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private IOperacao operacao;

    public Descarga(int descargaId, int totalMercadoriaBoa, int totalMercadoriaMa, Date dataChegadaCarga, ICarga carga, IArmazem armazem, IOperacao operacao) {
        this.descargaId = descargaId;
        this.totalMercadoriaBoa = totalMercadoriaBoa;
        this.totalMercadoriaMa = totalMercadoriaMa;
        this.dataChegadaCarga = dataChegadaCarga;
        this.carga = carga;
        this.armazem = armazem;
        this.operacao = operacao;
    }

    public Descarga() {
    }

    @Override
    public int getDescargaId() {
        return descargaId;
    }

    @Override
    public void setDescargaId(int descargaId) {
        this.descargaId = descargaId;
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
    public Date getDataChegadaCarga() {
        return dataChegadaCarga;
    }

    @Override
    public void setDataChegadaCarga(Date dataChegadaCarga) {
        this.dataChegadaCarga = dataChegadaCarga;
    }

    @Override
    public ICarga getCarga() {
        return carga;
    }

    @Override
    public void setCarga(ICarga carga) {
        this.carga = carga;
    }

    @Override
    public IArmazem getArmazem() {
        return armazem;
    }

    @Override
    public void setArmazem(IArmazem armazem) {
        this.armazem = armazem;
    }

    @Override
    public IOperacao getOperacao() {
        return operacao;
    }

    @Override
    public void setOperacao(IOperacao operacao) {
        this.operacao = operacao;
    }

}
