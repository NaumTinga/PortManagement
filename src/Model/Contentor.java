/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import IContrato.IContentor;
import IContrato.IOperacao;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author NAUM
 */

@Entity
@Table(name = "Contentor")
public class Contentor implements IContentor, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private IOperacao operacao;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int contentorId;
    
    @Column(name = "nrContentor")
    private int nrContentor;

    public Contentor(IOperacao operacao, int contentorId, int nrContentor) {
        this.operacao = operacao;
        this.contentorId = contentorId;
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
    public int getContentorId() {
        return contentorId;
    }

    @Override
    public void setContentorId(int contentorId) {
        this.contentorId = contentorId;
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
