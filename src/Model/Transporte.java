/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import IContrato.IOperacao;
import IContrato.ITransporte;

/**
 *
 * @author NAUM
 */
public class Transporte implements ITransporte {
    
    private IOperacao operacao;
    private String nomeMotorista;
    private String matriculaCamiao;
    private String matriculaAtrelado;
    private int transporteId;

    public Transporte(IOperacao operacao, String nomeMotorista, String matriculaCamiao, String matriculaAtrelado, int transporteId) {
        this.operacao = operacao;
        this.nomeMotorista = nomeMotorista;
        this.matriculaCamiao = matriculaCamiao;
        this.matriculaAtrelado = matriculaAtrelado;
        this.transporteId = transporteId;
    }

    
    
    public Transporte() {
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
    public String getNomeMotorista() {
        return nomeMotorista;
    }

    @Override
    public void setNomeMotorista(String nomeMotorista) {
        this.nomeMotorista = nomeMotorista;
    }

    @Override
    public String getMatriculaCamiao() {
        return matriculaCamiao;
    }

    @Override
    public void setMatriculaCamiao(String matriculaCamiao) {
        this.matriculaCamiao = matriculaCamiao;
    }

    @Override
    public String getMatriculaAtrelado() {
        return matriculaAtrelado;
    }

    @Override
    public void setMatriculaAtrelado(String matriculaAtrelado) {
        this.matriculaAtrelado = matriculaAtrelado;
    }

    @Override
    public int getTransporteId() {
        return transporteId;
    }

    @Override
    public void setTransporteId(int transporteId) {
        this.transporteId = transporteId;
    }
    
}
