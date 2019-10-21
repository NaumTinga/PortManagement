/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IContrato;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author dalto
 */
public interface IDaoConfiguration {

  public Session getSection();

  /**
   *
   * @return
   */
  public Transaction transaction();
  
}
