package designpatterns.dependency_injection;

import com.google.inject.AbstractModule;

public class TobaccoModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(Tobacoo.class).to(RevendellTobacoo.class);
  }

}
