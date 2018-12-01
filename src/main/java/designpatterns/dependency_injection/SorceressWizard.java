package designpatterns.dependency_injection;

public class SorceressWizard implements Wizard {

  private Tobacoo tobacoo;
  
  public void setTobacoo(Tobacoo tobacoo) {
    this.tobacoo = tobacoo;
  }
  
  @Override
  public void smoke() {
    tobacoo.smoke(this);
  }

}
