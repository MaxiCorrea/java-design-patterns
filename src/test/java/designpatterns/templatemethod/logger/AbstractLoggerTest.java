package designpatterns.templatemethod.logger;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class AbstractLoggerTest extends AbstractLogger {

  private boolean openDataStoreOperationCalled;
  private boolean logMessageCalled;
  private boolean closeDataStoreOperationCalled;
  
  public AbstractLoggerTest() {
    super(false);
  }

  @Before
  public void setup() {
    openDataStoreOperationCalled = false;
    logMessageCalled = false;
    closeDataStoreOperationCalled = false;
  }
  
  @Test
  public void shouldCallTheTemplateMethods() {
    assertFalse(openDataStoreOperationCalled);
    assertFalse(logMessageCalled);
    assertFalse(closeDataStoreOperationCalled);
    log("");
    assertTrue(openDataStoreOperationCalled);
    assertTrue(logMessageCalled);
    assertTrue(closeDataStoreOperationCalled);    
  }

  @Override
  void openDataStoreOperation() {
   openDataStoreOperationCalled = true; 
  }

  @Override
  void logMessage(String messageToLog) {
   logMessageCalled = true;
  }

  @Override
  void closeDataStoreOperation() {
    closeDataStoreOperationCalled = true;
  }

}
