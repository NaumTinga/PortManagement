/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import IContrato.IEmpresaContacto;
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
@Table(name = "EmpresaDeContacto")
public class EmpresaDeContacto implements IEmpresaContacto, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "empresaConatctoId")
    private long empresaContactoId;

    @Column(name = "nome")
    private String nome;

    public EmpresaDeContacto(long empresaContactoId, String nome) {
        this.empresaContactoId = empresaContactoId;
        this.nome = nome;
    }

    public EmpresaDeContacto() {
    }

    @Override
    public long getEmpresaContactoId() {
        return empresaContactoId;
    }

    @Override
    public void setEmpresaContactoId(long empresaContactoId) {
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
