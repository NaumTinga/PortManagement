/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *s
 * @author NAUM
 */
public class Endereco {
    
    private int codigoAdress;
    private int codigoOperacao;
    private String endereco;

    public Endereco(int codigoAdress, int codigoOperacao, String endereco) {
        this.codigoAdress = codigoAdress;
        this.codigoOperacao = codigoOperacao;
        this.endereco = endereco;
    }

    public Endereco() {
    }

    
    public int getCodigoAdress() {
        return codigoAdress;
    }

    public void setCodigoAdress(int codigoAdress) {
        this.codigoAdress = codigoAdress;
    }

    public int getCodigoOperacao() {
        return codigoOperacao;
    }

    public void setCodigoOperacao(int codigoOperacao) {
        this.codigoOperacao = codigoOperacao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
    
}
