/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import IContrato.IDao;
import IContrato.IDaoConfiguration;
import java.io.Serializable;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author dalto
 * @param <T>
 * @param <I>
 */
public class Dao<T,I> extends DaoFactory<T> implements IDao<T,I>
{
  
  
  
  public Dao() {
  }
  
  public Dao(Class<T> entity) 
  {
    super(entity);
  }
  
  
  @Override
  public T get(Class<T> entity, I Id) 
  {
    Session session = sectionFactory().openSession();
    Transaction transaction = session.beginTransaction();
    @SuppressWarnings("unchecked")
    T object;
    object = (T) session.get(entity, (Serializable) Id);
    transaction.commit();
    return object;
  }

  @Override
  public T save(T object) 
  {
    Session session = sectionFactory().openSession();
    Transaction transaction = session.beginTransaction();
    session.save(object);
    transaction.commit();
    return object;
  }

  @Override
  public void update(T object) 
  {
    Session session = sectionFactory().openSession();
    Transaction transaction = session.beginTransaction();
    session.update(object);
    transaction.commit();
  }

  @Override
  public void delete(T object) 
  {
    Session session = sectionFactory().openSession();
    Transaction transaction = session.beginTransaction();
    session.delete(object);
    transaction.commit();
  }
  
}
