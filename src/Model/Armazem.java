/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import IContrato.IArmazem;
import IContrato.IOperacao;

/**
 *
 * @author NAUM
 */
public class Armazem implements IArmazem {

    private IOperacao operacao;
    private int codigoArmazem;
    private String descricao;

    public Armazem(IOperacao operacao, int codigoArmazem, String descricao) {
        this.operacao = operacao;
        this.codigoArmazem = codigoArmazem;
        this.descricao = descricao;
    }

    public Armazem() {
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
    public int getCodigoArmazem() {
        return codigoArmazem;
    }

    @Override
    public void setCodigoArmazem(int codigoArmazem) {
        this.codigoArmazem = codigoArmazem;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
