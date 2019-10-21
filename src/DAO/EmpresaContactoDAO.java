/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import IContrato.IEmpresaContactoDAO;
import Model.EmpresaDeContacto;


/**
 *
 * @author NAUM
 */
public class EmpresaContactoDAO implements IEmpresaContactoDAO{
  private final Dao<EmpresaDeContacto, Integer> dao;
  
  public EmpresaContactoDAO()
  {     
    this.dao = new Dao<>(EmpresaDeContacto.class);
  }

  @Override
  public void save(EmpresaDeContacto object) {
    this.dao.save(object);
  }

  @Override
  public void update(EmpresaDeContacto object) {
    this.dao.update(object);
  }

  @Override
  public EmpresaDeContacto get(Integer Id) {
    return (EmpresaDeContacto) this.dao.get(EmpresaDeContacto.class, Id);
  }


}
