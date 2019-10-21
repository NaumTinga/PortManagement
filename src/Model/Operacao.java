/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import IContrato.IEmpresaContacto;
import IContrato.IOperacao;
import IContrato.IProveniencia;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 * Classe Principal Operacao
 *
 * @author NAUM
 */
@Entity
@Table(name = "Operacao")
public class Operacao implements IOperacao, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "operacaoId")
    private int operacaoId;

    @Column(name = "navio")
    private String navio;

    @Column(name = "dataChegadaNavio")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataChegadaNavio;

    @Column(name = "dataInicioOperacao")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataInicioOperacao;

    @Column(name = "proveniencia")
    private IProveniencia proveniencia;

    @Column(name = "empresaContacto")
    private IEmpresaContacto empresaContacto;

    public Operacao(int operacaoId, String navio, Date dataChegadaNavio, Date dataInicioOperacao, IProveniencia proveniencia, IEmpresaContacto empresaContacto) {
        this.operacaoId = operacaoId;
        this.navio = navio;
        this.dataChegadaNavio = dataChegadaNavio;
        this.dataInicioOperacao = dataInicioOperacao;
        this.proveniencia = proveniencia;
        this.empresaContacto = empresaContacto;
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
    public IProveniencia getProveniencia() {
        return proveniencia;
    }

    @Override
    public void setProveniencia(IProveniencia proveniencia) {
        this.proveniencia = proveniencia;
    }

    @Override
    public IEmpresaContacto getEmpresaContacto() {
        return empresaContacto;
    }

    @Override
    public void setEmpresaContacto(IEmpresaContacto empresaContacto) {
        this.empresaContacto = empresaContacto;
    }

}
