/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IContrato;

/**
 *
 * @author dalto
 * @param <T>
 * @param <I>
 */
public interface IDaoImpl<T,I> {

  /**
   *
   * @param object
   */
  public void save(T object);

  /**
   *
   * @param object
   */
  public void update(T object);

  /**
   *
   * @param Id
   * @return
   */
  public T get(I Id);
}
