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
public interface IArmazem {
    
    IOperacao getOperacao();
    
    int getCodigoArmazem();
    
    String getDescricao();
    
    void setOperacao(IOperacao operacao);
    
    void setCodigoArmazem(int codigoArmazem);
    
    void setDescricao(String descricao);
}
