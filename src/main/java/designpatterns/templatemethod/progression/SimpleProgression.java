package designpatterns.templatemethod.progression;

public class SimpleProgression extends AbstractProgression {

  @Override
  int advance() {
    return getCurrentValue() + 1;
  }

}
