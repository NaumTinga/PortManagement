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
public class Contentor {
    
    private int codigoOperacao;
    private int codigoContentor;
    private int nrContentor;

    public Contentor(int codigoOperacao, int codigoContentor, int nrContentor) {
        this.codigoOperacao = codigoOperacao;
        this.codigoContentor = codigoContentor;
        this.nrContentor = nrContentor;
    }

    public Contentor() {
    }
    
    

    public int getCodigoOperacao() {
        return codigoOperacao;
    }

    public void setCodigoOperacao(int codigoOperacao) {
        this.codigoOperacao = codigoOperacao;
    }

    public int getCodigoContentor() {
        return codigoContentor;
    }

    public void setCodigoContentor(int codigoContentor) {
        this.codigoContentor = codigoContentor;
    }

    public int getNrContentor() {
        return nrContentor;
    }

    public void setNrContentor(int nrContentor) {
        this.nrContentor = nrContentor;
    }
    
    
    
}
