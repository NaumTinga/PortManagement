package DAO;

import IContrato.IContentor;
import IContrato.IEmpresaContacto;
import Model.Contentor;
import Model.EmpresaDeContacto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 *
 * @author dalto
 */
public class DaoFactory<T> {
  private Configuration configuration;
  
  public DaoFactory() {

  }

  /**
   *
   * @param entityClass
   */
  public DaoFactory(Class<?> entityClass) 
  {
    this.configuration = new Configuration().configure().addAnnotatedClass(entityClass);
  }

  public SessionFactory sectionFactory()
  {
    ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
            .applySettings(configuration.getProperties()).build();

    SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
    return sessionFactory;
  }

}
