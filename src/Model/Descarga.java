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

/**
 *
 * @author NAUM
 */
public class Descarga implements IDescarga {

    private int descargaId;
    private int totalMercadoriaBoa;
    private int totalMercadoriaMa;
    private Date dataChegadaCarga;
    private ICarga carga;
    private IArmazem armazem;
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
