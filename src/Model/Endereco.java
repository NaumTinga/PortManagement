/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import IContrato.IEndereco;
import IContrato.IOperacao;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * s
 *
 * @author NAUM
 */
public class Endereco implements IEndereco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "enderecoId")
    private int enderecoId;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "operacao")
    private IOperacao operacao;

    @Column(name = "endereco")
    private String endereco;

    public Endereco(int enderecoId, IOperacao operacao, String endereco) {
        this.enderecoId = enderecoId;
        this.operacao = operacao;
        this.endereco = endereco;
    }

    public Endereco() {
    }

    @Override
    public int getEnderecoId() {
        return enderecoId;
    }

    @Override
    public void setEnderecoId(int enderecoId) {
        this.enderecoId = enderecoId;
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
