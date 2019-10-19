/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import IContrato.IEmpresaContacto;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author NAUM
 */
public class EmpresaDeContacto implements IEmpresaContacto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "empresaConatctoId")
    private int empresaContactoId;

    @Column(name = "nome")
    private String nome;

    public EmpresaDeContacto(int empresaContactoId, String nome) {
        this.empresaContactoId = empresaContactoId;
        this.nome = nome;
    }

    public EmpresaDeContacto() {
    }

    @Override
    public int getEmpresaContactoId() {
        return empresaContactoId;
    }

    @Override
    public void setEmpresaContactoId(int empresaContactoId) {
        this.empresaContactoId = empresaContactoId;
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
