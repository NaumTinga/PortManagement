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
public class Mercadoria {
    
    private int codigoOperacao;
    private int codigoMercadoria;
    private String descricao;
    private int totalMercadoria;
    private int totalEstimativaPerdas;

    public Mercadoria(int codigoOperacao, int codigoMercadoria, String descricao, int totalMercadoria, int totalEstimativaPerdas) {
        this.codigoOperacao = codigoOperacao;
        this.codigoMercadoria = codigoMercadoria;
        this.descricao = descricao;
        this.totalMercadoria = totalMercadoria;
        this.totalEstimativaPerdas = totalEstimativaPerdas;
    }

    public Mercadoria() {
    }

    public int getCodigoOperacao() {
        return codigoOperacao;
    }

    public void setCodigoOperacao(int codigoOperacao) {
        this.codigoOperacao = codigoOperacao;
    }

    public int getCodigoMercadoria() {
        return codigoMercadoria;
    }

    public void setCodigoMercadoria(int codigoMercadoria) {
        this.codigoMercadoria = codigoMercadoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getTotalMercadoria() {
        return totalMercadoria;
    }

    public void setTotalMercadoria(int totalMercadoria) {
        this.totalMercadoria = totalMercadoria;
    }

    public int getTotalEstimativaPerdas() {
        return totalEstimativaPerdas;
    }

    public void setTotalEstimativaPerdas(int totalEstimativaPerdas) {
        this.totalEstimativaPerdas = totalEstimativaPerdas;
    }
    
    
}
