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
import java.sql.Time;
import java.util.Date;

/**
 *
 * @author NAUM
 */
public class Carga implements ICarga {

    private int cargaId;
    private IOperacao operacao;
    private IContentor contentor;
    private IMercadoria mercadoria;
    private ITransporte transporte;
    private IEndereco endereco;
    private IArmazem armazem;
    private int totalMercadoriaBoa;
    private int totalMercadoriaMa;
    private Date dataInicioCarga;
    private Time horaInicioCarga;
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
