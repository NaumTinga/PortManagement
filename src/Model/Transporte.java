/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author NAUM
 */
public class Transporte {
    
    private int codigoOperacao;
    private String nomeMotorista;
    private String matriculaCamiao;
    private String matriculaAtrelado;
    private int codigoTransporte;

    public Transporte(int codigoOperacao, String nomeMotorista, String matriculaCamiao, String matriculaAtrelado, int codigoTransporte) {
        this.codigoOperacao = codigoOperacao;
        this.nomeMotorista = nomeMotorista;
        this.matriculaCamiao = matriculaCamiao;
        this.matriculaAtrelado = matriculaAtrelado;
        this.codigoTransporte = codigoTransporte;
    }

    
    
    public Transporte() {
    }

    public int getCodigoOperacao() {
        return codigoOperacao;
    }

    public void setCodigoOperacao(int codigoOperacao) {
        this.codigoOperacao = codigoOperacao;
    }

    public String getNomeMotorista() {
        return nomeMotorista;
    }

    public void setNomeMotorista(String nomeMotorista) {
        this.nomeMotorista = nomeMotorista;
    }

    public String getMatriculaCamiao() {
        return matriculaCamiao;
    }

    public void setMatriculaCamiao(String matriculaCamiao) {
        this.matriculaCamiao = matriculaCamiao;
    }

    public String getMatriculaAtrelado() {
        return matriculaAtrelado;
    }

    public void setMatriculaAtrelado(String matriculaAtrelado) {
        this.matriculaAtrelado = matriculaAtrelado;
    }

    public int getCodigoTransporte() {
        return codigoTransporte;
    }

    public void setCodigoTransporte(int codigoTransporte) {
        this.codigoTransporte = codigoTransporte;
    }
    
    
    
    
}
