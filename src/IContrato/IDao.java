/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IContrato;

import java.io.Serializable;

/**
 *
 * @author dalto
 * @param <T>
 * @param <I>
 */
public interface IDao<T, I>  {

  /**
   *
   * @param entity
   * @param Id
   * @return
   */
  public T get(Class<T> entity, I Id);

  /**
   *
   * @param object
   * @return
   */
  public T save(T object);

  /**
   *
   * @param object
   */
  public void update(T object);

  /**
   *
   * @param object
   */
  public void delete(T object);
}
