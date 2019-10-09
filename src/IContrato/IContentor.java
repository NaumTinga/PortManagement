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
public interface IContentor {

    IOperacao getOperacao();

    int getCodigoContentor();

    int getNrContentor();

    void setOperacao(IOperacao operacao);

    void setCodigoContentor(int codigoContentor);

    void setNrContentor(int nrContentor);
}
