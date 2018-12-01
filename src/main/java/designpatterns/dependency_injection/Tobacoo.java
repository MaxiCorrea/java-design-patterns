package designpatterns.dependency_injection;

public abstract class Tobacoo {

  public void smoke(Wizard wizard) {
    String wizardClassName = wizard.getClass().getSimpleName();
    String thisClassName = this.getClass().getSimpleName();
    System.out.println("smoking " + wizardClassName + " " + thisClassName);
  }
  
}
