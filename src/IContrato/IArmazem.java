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
    
    int getArmazemId();
    
    String getDescricao();
    
    void setOperacao(IOperacao operacao);
    
    void setArmazemId(int ArmazemId);
    
    void setDescricao(String descricao);
}
