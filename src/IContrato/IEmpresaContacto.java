/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IContrato;

/**
 *
 * @author NAUM
 */
public interface IEmpresaContacto {
    
    long getEmpresaContactoId();
    
    String getNome();
    
    void setEmpresaContactoId(long empresaContactoId);
    
    void setNome(String nome);
}
