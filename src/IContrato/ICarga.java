/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IContrato;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author NAUM
 */
public interface ICarga {

    int getCargaId();
    
    void setCargaId(int cargaId);
    
    IOperacao getOperacao();

    void setOperacao(IOperacao operacao);

    IContentor getContentor();

    void setContentor(IContentor contentor);

    IMercadoria getMercadoria();

    void setMercadoria(IMercadoria mercadoria);

    ITransporte getTransporte();

    void setTransporte(ITransporte transporte);

    IEndereco getEndereco();

    void setEndereco(IEndereco endereco);

    IArmazem getArmazem();

    void setArmazem(IArmazem armazem);

    int getTotalMercadoriaBoa();

    void setTotalMercadoriaBoa(int totalMercadoriaBoa);

    int getTotalMercadoriaMa();

    void setTotalMercadoriaMa(int totalMercadoriaMa);

    Date getDataInicioCarga();

    void setDataInicioCarga(Date dataInicioCarga);

    Time getHoraInicioCarga();

    void setHoraInicioCarga(Time horaInicioCarga);

    String getNota();

    void setNota(String nota);

}
