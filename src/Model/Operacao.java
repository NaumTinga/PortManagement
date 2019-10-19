/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import IContrato.IEmpresaContacto;
import IContrato.IOperacao;
import IContrato.IProveniencia;
import java.util.Date;

/**
 *Classe Principal Operacao 
 * 
 * @author NAUM
 */


public class Operacao implements IOperacao {
    
    private int operacaoId;
    private String navio;
    private Date dataChegadaNavio;
    private Date dataInicioOperacao;
    private IProveniencia codigoProveniencia;
    private IEmpresaContacto codigoEmpresaContacto;

    public Operacao(int operacaoId, String navio, Date dataChegadaNavio, Date dataInicioOperacao, IProveniencia codigoProveniencia, IEmpresaContacto codigoEmpresaContacto) {
        this.operacaoId = operacaoId;
        this.navio = navio;
        this.dataChegadaNavio = dataChegadaNavio;
        this.dataInicioOperacao = dataInicioOperacao;
        this.codigoProveniencia = codigoProveniencia;
        this.codigoEmpresaContacto = codigoEmpresaContacto;
    }

    public Operacao() {
    }

       @Override
    public int getOperacaoId() {
        return operacaoId;
    }

    @Override
    public void setOperacaoId(int operacaoId) {
        this.operacaoId = operacaoId;
    }
    
    @Override
    public String getNavio() {
        return navio;
    }

    @Override
    public void setNavio(String navio) {
        this.navio = navio;
    }

    @Override
    public Date getDataChegadaNavio() {
        return dataChegadaNavio;
    }

    @Override
    public void setDataChegadaNavio(Date dataChegadaNavio) {
        this.dataChegadaNavio = dataChegadaNavio;
    }

    @Override
    public Date getDataInicioOperacao() {
        return dataInicioOperacao;
    }

    @Override
    public void setDataInicioOperacao(Date dataInicioOperacao) {
        this.dataInicioOperacao = dataInicioOperacao;
    }

    @Override
    public IProveniencia getCodigoProveniencia() {
        return codigoProveniencia;
    }

    @Override
    public void setCodigoProveniencia(IProveniencia codigoProveniencia) {
        this.codigoProveniencia = codigoProveniencia;
    }

    @Override
    public IEmpresaContacto getCodigoEmpresaContacto() {
        return codigoEmpresaContacto;
    }

    @Override
    public void setCodigoEmpresaContacto(IEmpresaContacto codigoEmpresaContacto) {
        this.codigoEmpresaContacto = codigoEmpresaContacto;
    }
 
}
