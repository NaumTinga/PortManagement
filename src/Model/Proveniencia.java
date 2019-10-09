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
    
    private int codigoProveniencia;
    private String proveniencia;

    public Proveniencia(int codigoProveniencia, String proveniencia) {
        this.codigoProveniencia = codigoProveniencia;
        this.proveniencia = proveniencia;
    }

    public Proveniencia() {
    }
    
    

    @Override
    public int getCodigoProveniencia() {
        return codigoProveniencia;
    }

    @Override
    public void setCodigoProveniencia(int codigoProveniencia) {
        this.codigoProveniencia = codigoProveniencia;
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
