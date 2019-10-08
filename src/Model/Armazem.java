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
public class Armazem {
    
    private int codigoOperacao;
    private int codigoArmazem;
    private String descricao;

    public Armazem(int codigoOperacao, int codigoArmazem, String descricao) {
        this.codigoOperacao = codigoOperacao;
        this.codigoArmazem = codigoArmazem;
        this.descricao = descricao;
    }

    public Armazem() {
    }

    public int getCodigoOperacao() {
        return codigoOperacao;
    }

    public void setCodigoOperacao(int codigoOperacao) {
        this.codigoOperacao = codigoOperacao;
    }

    public int getCodigoArmazem() {
        return codigoArmazem;
    }

    public void setCodigoArmazem(int codigoArmazem) {
        this.codigoArmazem = codigoArmazem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
