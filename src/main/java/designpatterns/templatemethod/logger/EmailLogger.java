package designpatterns.templatemethod.logger;

public class EmailLogger extends AbstractLogger {

  public EmailLogger(boolean consoleLogging) {
    super(consoleLogging);
  }

  @Override
  void openDataStoreOperation() {
    
  }

  @Override
  void logMessage(String messageToLog) {
    
  }

  @Override
  void closeDataStoreOperation() {
    
  }

}
