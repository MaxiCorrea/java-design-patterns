package designpatterns.composite;

import static java.util.Arrays.asList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CompositeTest {

  private List<ComponentMock> components;
  private Composite composite;

  @Before
  public void setup() {
    components = asList(new ComponentMock(), new ComponentMock(), new ComponentMock());
    composite = new Composite();
    for(Component componet : components) {
      composite.add(componet);
    }
  }

  @Test
  public void allOperationsAreInvoked() {
    composite.operation();
    allOperationsCalled();
  }


  private void allOperationsCalled() {
    for(Component component : components) {
      assertTrue(((ComponentMock) component).operationCalled);
    }
  }
  
  private class ComponentMock extends Component {

    boolean operationCalled = false;

    @Override
    void operation() {
      operationCalled = true;
    }

  }

}
