/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import IContrato.IEndereco;
import IContrato.IOperacao;

/**
 *s
 * @author NAUM
 */
public class Endereco implements IEndereco  {
    
    private int codigoAdress;
    private IOperacao operacao;
    private String endereco;

    public Endereco(int codigoAdress, IOperacao operacao, String endereco) {
        this.codigoAdress = codigoAdress;
        this.operacao = operacao;
        this.endereco = endereco;
    }

    public Endereco() {
    }

    
    @Override
    public int getCodigoAdress() {
        return codigoAdress;
    }

    @Override
    public void setCodigoAdress(int codigoAdress) {
        this.codigoAdress = codigoAdress;
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
    public String getEndereco() {
        return endereco;
    }

    @Override
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
    
}
