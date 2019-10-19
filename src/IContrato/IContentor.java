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

    int getContentorId();

    int getNrContentor();

    void setOperacao(IOperacao operacao);

    void setContentorId(int contentorId);

    void setNrContentor(int nrContentor);
}
