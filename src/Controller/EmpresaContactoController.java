/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.EmpresaContactoDAO;
import IContrato.IEmpresaContacto;
import IContrato.IOperacao;
import java.util.List;

/**
 *
 * @author NAUM
 */
public class EmpresaContactoController {
 
    private static EmpresaContactoDAO empresaContacoDao;
 
    public EmpresaContactoController() {
        empresaContacoDao = new EmpresaContactoDAO();
    }
 
    public void save(IEmpresaContacto empresaContacto) {
        empresaContacoDao.openCurrentSessionwithTransaction();
        empresaContacoDao.save(empresaContacto);
        empresaContacoDao.closeCurrentSessionwithTransaction();
    }

     public void update(IEmpresaContacto empresaContacto) {
        empresaContacoDao.openCurrentSessionwithTransaction();
        empresaContacoDao.update(empresaContacto);
        empresaContacoDao.closeCurrentSessionwithTransaction();
    }
 
    public IEmpresaContacto findById(int id) {
        empresaContacoDao.openCurrentSession();
        IEmpresaContacto empresaContacto = empresaContacoDao.findById(id);
        empresaContacoDao.closeCurrentSession();
        return empresaContacto;
    }
 
    public void delete(IEmpresaContacto empresaContacto) {
        empresaContacoDao.openCurrentSessionwithTransaction();
       // IOperacao operacao = operacaoDao.findById(id);
        empresaContacoDao.delete(empresaContacto);
        empresaContacoDao.closeCurrentSessionwithTransaction();
    }
 
    public List<IEmpresaContacto> findAll() {
        empresaContacoDao.openCurrentSession();
        List<IEmpresaContacto> empresaContacto = empresaContacoDao.findAll();
        empresaContacoDao.closeCurrentSession();
        return empresaContacto;
    }
 
    public void deleteAll() {
        empresaContacoDao.openCurrentSessionwithTransaction();
        empresaContacoDao.deleteAll();
        empresaContacoDao.closeCurrentSessionwithTransaction();
    }
 
}
