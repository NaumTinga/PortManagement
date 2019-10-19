/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import IContrato.IArmazem;
import IContrato.IOperacao;
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
@Table(name = "Armazem")
public class Armazem implements IArmazem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "operacao")
    private IOperacao operacao;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "armazemId")
    private int armazemId;
    
    @Column(name = "descricao")
    private String descricao;

    public Armazem(IOperacao operacao, int armazemId, String descricao) {
        this.operacao = operacao;
        this.armazemId = armazemId;
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
    public int getArmazemId() {
        return armazemId;
    }

    @Override
    public void setArmazemId(int armazemId) {
        this.armazemId = armazemId;
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
