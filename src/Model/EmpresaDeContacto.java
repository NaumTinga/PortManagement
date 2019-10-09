/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import IContrato.IEmpresaContacto;

/**
 *
 * @author NAUM
 */
public class EmpresaDeContacto implements IEmpresaContacto {
    
    private int codigoEmpresaContacto;
    private String nome;

    public EmpresaDeContacto(int codigoEmpresaContacto, String nome) {
        this.codigoEmpresaContacto = codigoEmpresaContacto;
        this.nome = nome;
    }

    public EmpresaDeContacto() {
    }

    @Override
    public int getCodigoEmpresaContacto() {
        return codigoEmpresaContacto;
    }

    @Override
    public void setCodigoEmpresaContacto(int codigoEmpresaContacto) {
        this.codigoEmpresaContacto = codigoEmpresaContacto;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
