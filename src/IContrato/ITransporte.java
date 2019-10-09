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
public interface ITransporte {

    IOperacao getOperacao();

    String getNomeMotorista();

    String getMatriculaCamiao();

    String getMatriculaAtrelado();

    int getCodigoTransporte();

    void setOperacao(IOperacao operacao);

    void setNomeMotorista(String nomeMotorista);

    void setMatriculaCamiao(String matriculaCamiao);

    void setMatriculaAtrelado(String matriculaAtrelado);

    void setCodigoTransporte(int codigoTransporte);
}
