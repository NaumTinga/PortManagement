/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import javax.swing.JPanel;

/**
 *
 * @author dalto
 */
public class PanelHelper 
{

  private JPanel container;
  private JPanel content;

  public PanelHelper(JPanel container, JPanel content) 
  {
    this.container = container;
    this.content = content;
    this.iniTializeComponent();
  }

  public JPanel getContainer() 
  {
    return container;
  }

  public void setContainer(JPanel container) 
  {
    this.container = container;
  }

  public JPanel getContent() 
  {
    return content;
  }

  public void setContent(JPanel content) 
  {
    this.content = content;
  }

  private void iniTializeComponent() 
  {
    this.removeContentFromContainer();
    this.revalidateContainer();
    this.repaintContainer();
    this.addContent(this.content);
    this.revalidateContainer();
    this.repaintContainer();
  }

  //Container
  private void removeContentFromContainer() 
  {
    this.container.removeAll();
  }

  private void revalidateContainer() 
  {
    this.container.revalidate();
  }

  private void repaintContainer() 
  {
    this.container.repaint();
  }

  private void addContent(JPanel panel) 
  {
    this.container.add(panel);
  }
  
  
//    this.container.removeAll();
//    this.container.revalidate();
//    this.container.repaint();
//    this.container.add(this.content);
//    this.container.revalidate();
//    this.container.repaint();

}
