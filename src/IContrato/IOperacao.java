/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IContrato;

import java.util.Date;

/**
 *
 * @author NAUM
 */
public interface IOperacao {
    
    int getOperacaoId();
    
    String getNavio();
    
    Date getDataChegadaNavio();
    
    Date getDataInicioOperacao();
    
    IProveniencia getProveniencia();
    
    IEmpresaContacto getEmpresaContacto();
    
    void setOperacaoId(int operacaoId);
    
    void setNavio(String navio);
    
    void setDataChegadaNavio(Date dataInicioOperacao);
    
    void setDataInicioOperacao(Date dataInicioOperacao);
    
    void setProveniencia(IProveniencia proveniencia);
    
    void setEmpresaContacto(IEmpresaContacto empresaContacto);
    
}
