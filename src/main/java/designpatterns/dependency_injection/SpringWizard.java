package designpatterns.dependency_injection;

import org.springframework.beans.factory.annotation.Autowired;

public class SpringWizard implements Wizard {

  @Autowired
  private Tobacoo tobacoo;
   
  @Override
  public void smoke() {
    tobacoo.smoke(this);
  }

}
