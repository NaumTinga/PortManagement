/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *Classe Principal Operacao 
 * 
 * @author NAUM
 */
public class Operacao {
    
    private String navio;
    private Date dataChegadaNavio;
    private Date dataInicioOperacao;
    private int codigoProveniencia;
    private int empresaContacto;

    public Operacao(String navio, Date dataChegadaNavio, Date dataInicioOperacao, int codigoProveniencia, int empresaContacto) {
        this.navio = navio;
        this.dataChegadaNavio = dataChegadaNavio;
        this.dataInicioOperacao = dataInicioOperacao;
        this.codigoProveniencia = codigoProveniencia;
        this.empresaContacto = empresaContacto;
    }

    public Operacao() {
    }

    
    public String getNavio() {
        return navio;
    }

    public void setNavio(String navio) {
        this.navio = navio;
    }

    public Date getDataChegadaNavio() {
        return dataChegadaNavio;
    }

    public void setDataChegadaNavio(Date dataChegadaNavio) {
        this.dataChegadaNavio = dataChegadaNavio;
    }

    public Date getDataInicioOperacao() {
        return dataInicioOperacao;
    }

    public void setDataInicioOperacao(Date dataInicioOperacao) {
        this.dataInicioOperacao = dataInicioOperacao;
    }

    public int getCodigoProveniencia() {
        return codigoProveniencia;
    }

    public void setCodigoProveniencia(int codigoProveniencia) {
        this.codigoProveniencia = codigoProveniencia;
    }

    public int getEmpresaContacto() {
        return empresaContacto;
    }

    public void setEmpresaContacto(int empresaContacto) {
        this.empresaContacto = empresaContacto;
    }
    
    
    
}
