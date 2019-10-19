/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptmanagement;

import Controller.EmpresaContactoController;
import DAO.HibernateUtil;
import Model.EmpresaDeContacto;
import View.login.Login;
import org.hibernate.Session;

/**
 *
 * @author NAUM
 */
public class PTManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // new Login().setVisible(true);
        EmpresaContactoController empresaController = new EmpresaContactoController();
        EmpresaDeContacto empresa = new EmpresaDeContacto();
         
      
        //empresa.setEmpresaContactoId(1);
        empresa.setNome("Saiba Mais MZ");
        
        empresaController.save(empresa);
    }
    
}
