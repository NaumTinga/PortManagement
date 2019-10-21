/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptmanagement;

import Controller.EmpresaContactoController;
import IContrato.IEmpresaContacto;
import Model.EmpresaDeContacto;
;


/**
 *
 * @author NAUM
 */
public class PTManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      EmpresaContactoController empresaController = new EmpresaContactoController();
      EmpresaDeContacto empresa =  new EmpresaDeContacto();
      empresa.setNome("Saiba Mais MZ");
      empresaController.save(empresa);

    }
    
}
