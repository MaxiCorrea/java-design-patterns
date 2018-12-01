package designpatterns.dependency_injection;

public class SimpleWizard implements Wizard {

  private Tobacoo tobacoo;

  public SimpleWizard(Tobacoo tobacoo) {
    this.tobacoo = tobacoo;
  }

  @Override
  public void smoke() {
    tobacoo.smoke(this);
  }

}
