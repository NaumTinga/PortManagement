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
public class EmpresaDeContacto {
    
    private int codigoEmpresa;
    private String nome;

    public EmpresaDeContacto(int codigoEmpresa, String nome) {
        this.codigoEmpresa = codigoEmpresa;
        this.nome = nome;
    }

    public EmpresaDeContacto() {
    }

    public int getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(int codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
