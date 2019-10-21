/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import IContrato.IProveniencia;
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
@Table(name = "Proveniencia")
public class Proveniencia implements IProveniencia, Serializable{
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "provenienciaId")
    private int provenienciaId;
    
    @Column(name = "proveniencia")
    private String proveniencia;

    public Proveniencia(int provenienciaId, String proveniencia) {
        this.provenienciaId = provenienciaId;
        this.proveniencia = proveniencia;
    }

    public Proveniencia() {
    }
    
    

    @Override
    public int getProvenienciaId() {
        return provenienciaId;
    }

    @Override
    public void setProvenienciaId(int provenienciaId) {
        this.provenienciaId = provenienciaId;
    }

    @Override
    public String getProveniencia() {
        return proveniencia;
    }

    @Override
    public void setProveniencia(String proveniencia) {
        this.proveniencia = proveniencia;
    }
    
    
}
