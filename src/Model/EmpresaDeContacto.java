/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import IContrato.IEmpresaContacto;
import java.io.Serializable;
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
@Table(name = "empresaDeContacto")
public class EmpresaDeContacto implements Serializable,IEmpresaContacto
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int empresaContactoId;

    private String nome;


    @Override
    public long getEmpresaContactoId() 
    {
        return empresaContactoId;
    }

    @Override
    public void setEmpresaContactoId(int empresaContactoId) 
    {
        this.empresaContactoId = empresaContactoId;
    }

    @Override
    public String getNome() 
    {
        return nome;
    }

  /**
   *
   * @param nome
   */
  @Override
    public void setNome(String nome) 
    {
        this.nome = nome;
    }

}
