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
public interface IEndereco {

    int getCodigoAdress();

    IOperacao getOperacao();

    String getEndereco();

    void setCodigoAdress(int codigoAdress);

    void setOperacao(IOperacao operacao);

    void setEndereco(String endereco);
}
