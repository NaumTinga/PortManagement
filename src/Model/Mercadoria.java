/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import IContrato.IMercadoria;
import IContrato.IOperacao;

/**
 *
 * @author NAUM
 */
public class Mercadoria implements IMercadoria {

    
    private IOperacao operacao;
    private int mercadoriaId;
    private String descricao;
    private int totalMercadoria;
    private int totalEstimativaPerdas;

    public Mercadoria(IOperacao operacao, int mercadoria, String descricao, int totalMercadoria, int totalEstimativaPerdas) {
        this.operacao = operacao;
        this.mercadoriaId = mercadoria;
        this.descricao = descricao;
        this.totalMercadoria = totalMercadoria;
        this.totalEstimativaPerdas = totalEstimativaPerdas;
    }

    public Mercadoria() {
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
    public int getMercadoriaId() {
        return mercadoriaId;
    }

    @Override
    public void setMercadoriaId(int mercadoriaId) {
        this.mercadoriaId = mercadoriaId;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getTotalMercadoria() {
        return totalMercadoria;
    }

    @Override
    public void setTotalMercadoria(int totalMercadoria) {
        this.totalMercadoria = totalMercadoria;
    }

    @Override
    public int getTotalEstimativaPerdas() {
        return totalEstimativaPerdas;
    }

    @Override
    public void setTotalEstimativaPerdas(int totalEstimativaPerdas) {
        this.totalEstimativaPerdas = totalEstimativaPerdas;
    }

}
