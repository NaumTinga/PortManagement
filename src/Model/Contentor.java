/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import IContrato.IContentor;
import IContrato.IOperacao;

/**
 *
 * @author NAUM
 */
public class Contentor implements IContentor {

    private IOperacao operacao;
    private int codigoContentor;
    private int nrContentor;

    public Contentor(IOperacao operacao, int codigoContentor, int nrContentor) {
        this.operacao = operacao;
        this.codigoContentor = codigoContentor;
        this.nrContentor = nrContentor;
    }

    public Contentor() {
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
    public int getCodigoContentor() {
        return codigoContentor;
    }

    @Override
    public void setCodigoContentor(int codigoContentor) {
        this.codigoContentor = codigoContentor;
    }

    @Override
    public int getNrContentor() {
        return nrContentor;
    }

    @Override
    public void setNrContentor(int nrContentor) {
        this.nrContentor = nrContentor;
    }

}
