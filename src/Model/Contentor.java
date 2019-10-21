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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author NAUM
 */

@Entity
@Table(name = "contentor")
public class Contentor implements IContentor, Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long contentorId;
    
    @Column(name = "numeroContentor")
    private int numeroContentor;
    
//    @ManyToOne
//    private IOperacao operacao;

//    public Contentor(int contentorId, int numeroContentor) 
//    {
//        super();
//        this.contentorId = contentorId;
//        this.numeroContentor = numeroContentor;
//    }


//    @Override
//    public IOperacao getOperacao() {
//        return operacao;
//    }

//    @Override
//    public void setOperacao(IOperacao operacao) {
//        this.operacao = operacao;
//    }

    @Override
    public long getContentorId() 
    {
        return contentorId;
    }

    @Override
    public void setContentorId(int contentorId) {
        this.contentorId = contentorId;
    }

    @Override
    public int getNumeroContentor()
    {
      return this.numeroContentor;
    }

    @Override
    public void setNumeroContentor(int numeroContentor) 
    {
      this.numeroContentor = numeroContentor;
    }

}
