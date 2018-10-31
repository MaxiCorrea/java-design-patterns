package designpatterns.chain.approvers;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ApproverTest {

  private static Purchase[] PURCHASES = {
      new Purchase(0, 9_000, "A"), 
      new Purchase(1, 24_000, "B"), 
      new Purchase(2, 54_000, "C")
  };

  private ByteArrayOutputStream output;
  private PrintStream original;

  @Before
  public void setUp() {
    original = System.out;
    output = new ByteArrayOutputStream();
    System.setOut(new PrintStream(output));
  }

  @Test
  public void testTheDirectorHandlesThePurchase() {
    ApproverInvoker approverInvoker = new ApproverInvoker();
    approverInvoker.makeRequest(PURCHASES[0]);
    String expected = "Director Approved request 0 9000,0 A";
    assertEquals(expected , String.valueOf(output).trim());
  }

  @Test
  public void testTheVicePresidentHandlesThePurchase() {
    ApproverInvoker approverInvoker = new ApproverInvoker();
    approverInvoker.makeRequest(PURCHASES[1]);
    String expected = "VicePresident Approved request 1 24000,0 B";
    assertEquals(expected , String.valueOf(output).trim());
  }
  
  @Test
  public void testThePresidentHandlesThePurchase() {
    ApproverInvoker approverInvoker = new ApproverInvoker();
    approverInvoker.makeRequest(PURCHASES[2]);
    String expected = "President Approved request 2 54000,0 C";
    assertEquals(expected , String.valueOf(output).trim());
  }
  
  @After
  public void reset() {
    System.setOut(original);
  }
  
}
