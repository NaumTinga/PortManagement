/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import IContrato.IProveniencia;

/**
 *
 * @author NAUM
 */
public class Proveniencia implements IProveniencia{
    
    private int provenienciaId;
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
