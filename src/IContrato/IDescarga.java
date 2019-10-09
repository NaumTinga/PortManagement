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
public interface IDescarga {

    int getTotalMercadoriaBoa();

    void setTotalMercadoriaBoa(int totalMercadoriaBoa);

    int getTotalMercadoriaMa();

    void setTotalMercadoriaMa(int totalMercadoriaMa);

    Date getDataChegadaCarga();

    void setDataChegadaCarga(Date dataChegadaCarga);

    ICarga getCarga();

    void setCarga(ICarga carga);

    IArmazem getArmazem();

    void setArmazem(IArmazem armazem);

    IOperacao getOperacao();

    void setOperacao(IOperacao operacao);

}
