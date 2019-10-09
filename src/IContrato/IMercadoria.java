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
public interface IMercadoria {
    
    IOperacao getOperacao();
    
    int getCodigoMercadoria();
    
    String getDescricao();
    
    int getTotalMercadoria();
    
    int getTotalEstimativaPerdas();
    
    void setOperacao(IOperacao operacao);
    
    void setCodigoMercadoria(int codigoMercadoria);
    
    void setDescricao(String descricao);
            
    void setTotalMercadoria(int totalMercadoria);
            
    void setTotalEstimativaPerdas(int totalEstimativaPerdas);
    
}
