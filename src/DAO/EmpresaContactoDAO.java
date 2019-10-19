/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import IContrato.IEmpresaContacto;
import IContrato.IOperacao;
import java.util.List;

/**
 *
 * @author NAUM
 */
public class EmpresaContactoDAO extends DAOGenerico{

    public void save(IEmpresaContacto empresaContacto) {
        getCurrentSession().save(empresaContacto);
    }

    public void update(IEmpresaContacto empresaContacto) {
        getCurrentSession().update(empresaContacto);
    }

    public IEmpresaContacto findById(int id) {
        IEmpresaContacto empresaContacto = (IEmpresaContacto) getCurrentSession().get(IEmpresaContacto.class, id);
        return empresaContacto;
    }

    public void delete(IEmpresaContacto empresaContacto) {
        getCurrentSession().delete(empresaContacto);
    }

    @SuppressWarnings("unchecked")
    public List<IEmpresaContacto> findAll() {
        List<IEmpresaContacto> empresaContacto = (List<IEmpresaContacto>) getCurrentSession().createQuery("from Book").list();
        return empresaContacto;
    }

    public void deleteAll() {
        List<IEmpresaContacto> entityList = findAll();
        for (IEmpresaContacto empresaContacto : entityList) {
            delete(empresaContacto);
        }
    }
}
