package designpatterns.dependency_injection;

import com.google.inject.Inject;

public class GuiceWizard implements Wizard {

  private Tobacoo tobacco;
  
  @Inject
  public GuiceWizard(Tobacoo tobacco) {
    this.tobacco = tobacco;
  }
  
  @Override
  public void smoke() {
    tobacco.smoke(this);
  }

}
