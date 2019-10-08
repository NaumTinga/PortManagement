/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author NAUM
 */
public class Descarga {
    
    private int totalMercadoriaBoa;
    private int totalMercadoriaMa;
    private Date dataChegadaCarga;
    private int codigoCarga;
    private int codigoArmazem;
    private int codigoOperacao;

    public Descarga(int totalMercadoriaBoa, int totalMercadoriaMa, Date dataChegadaCarga, int codigoCarga, int codigoArmazem, int codigoOperacao) {
        this.totalMercadoriaBoa = totalMercadoriaBoa;
        this.totalMercadoriaMa = totalMercadoriaMa;
        this.dataChegadaCarga = dataChegadaCarga;
        this.codigoCarga = codigoCarga;
        this.codigoArmazem = codigoArmazem;
        this.codigoOperacao = codigoOperacao;
    }

    public Descarga() {
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

    public Date getDataChegadaCarga() {
        return dataChegadaCarga;
    }

    public void setDataChegadaCarga(Date dataChegadaCarga) {
        this.dataChegadaCarga = dataChegadaCarga;
    }

    public int getCodigoCarga() {
        return codigoCarga;
    }

    public void setCodigoCarga(int codigoCarga) {
        this.codigoCarga = codigoCarga;
    }

    public int getCodigoArmazem() {
        return codigoArmazem;
    }

    public void setCodigoArmazem(int codigoArmazem) {
        this.codigoArmazem = codigoArmazem;
    }

    public int getCodigoOperacao() {
        return codigoOperacao;
    }

    public void setCodigoOperacao(int codigoOperacao) {
        this.codigoOperacao = codigoOperacao;
    }
    
    
}
