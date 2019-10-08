/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author NAUM
 */
public class Carga {
    
    private int codigoOperacao;
    private int codigoContentor;
    private int codigoMercadoria;
    private int codigoTransporte;
    private int codigoEndereco;
    private int codigoArmazem;
    private int totalMercadoriaBoa;
    private int totalMercadoriaMa;
    private Date dataInicioCarga;
    private Time horaInicioCarga;
    private String nota;

    public Carga(int codigoOperacao, int codigoContentor, int codigoMercadoria, int codigoTransporte, int codigoEndereco, int codigoArmazem, int totalMercadoriaBoa, int totalMercadoriaMa, Date dataInicioCarga, Time horaInicioCarga, String nota) {
        this.codigoOperacao = codigoOperacao;
        this.codigoContentor = codigoContentor;
        this.codigoMercadoria = codigoMercadoria;
        this.codigoTransporte = codigoTransporte;
        this.codigoEndereco = codigoEndereco;
        this.codigoArmazem = codigoArmazem;
        this.totalMercadoriaBoa = totalMercadoriaBoa;
        this.totalMercadoriaMa = totalMercadoriaMa;
        this.dataInicioCarga = dataInicioCarga;
        this.horaInicioCarga = horaInicioCarga;
        this.nota = nota;
    }

    public Carga() {
    }

    public int getCodigoOperacao() {
        return codigoOperacao;
    }

    public void setCodigoOperacao(int codigoOperacao) {
        this.codigoOperacao = codigoOperacao;
    }

    public int getCodigoContentor() {
        return codigoContentor;
    }

    public void setCodigoContentor(int codigoContentor) {
        this.codigoContentor = codigoContentor;
    }

    public int getCodigoMercadoria() {
        return codigoMercadoria;
    }

    public void setCodigoMercadoria(int codigoMercadoria) {
        this.codigoMercadoria = codigoMercadoria;
    }

    public int getCodigoTransporte() {
        return codigoTransporte;
    }

    public void setCodigoTransporte(int codigoTransporte) {
        this.codigoTransporte = codigoTransporte;
    }

    public int getCodigoEndereco() {
        return codigoEndereco;
    }

    public void setCodigoEndereco(int codigoEndereco) {
        this.codigoEndereco = codigoEndereco;
    }

    public int getCodigoArmazem() {
        return codigoArmazem;
    }

    public void setCodigoArmazem(int codigoArmazem) {
        this.codigoArmazem = codigoArmazem;
    }

    public int getTotalMercadoriaBoa() {
        return totalMercadoriaBoa;
    }

    public void setTotalMercadoriaBoa(int totalMercadoriaBoa) {
        this.totalMercadoriaBoa = totalMercadoriaBoa;
    }

    public int getTotalMercadoriaMa() {
        return totalMercadoriaMa;
    }

    public void setTotalMercadoriaMa(int totalMercadoriaMa) {
        this.totalMercadoriaMa = totalMercadoriaMa;
    }

    public Date getDataInicioCarga() {
        return dataInicioCarga;
    }

    public void setDataInicioCarga(Date dataInicioCarga) {
        this.dataInicioCarga = dataInicioCarga;
    }

    public Time getHoraInicioCarga() {
        return horaInicioCarga;
    }

    public void setHoraInicioCarga(Time horaInicioCarga) {
        this.horaInicioCarga = horaInicioCarga;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
    
    
}
