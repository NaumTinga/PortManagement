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
public class Proveniencia {
    
    private int codigoProveniencia;
    private String proveniencia;

    public Proveniencia(int codigoProveniencia, String proveniencia) {
        this.codigoProveniencia = codigoProveniencia;
        this.proveniencia = proveniencia;
    }

    public Proveniencia() {
    }
    
    

    public int getCodigoProveniencia() {
        return codigoProveniencia;
    }

    public void setCodigoProveniencia(int codigoProveniencia) {
        this.codigoProveniencia = codigoProveniencia;
    }

    public String getProveniencia() {
        return proveniencia;
    }

    public void setProveniencia(String proveniencia) {
        this.proveniencia = proveniencia;
    }
    
    
}
