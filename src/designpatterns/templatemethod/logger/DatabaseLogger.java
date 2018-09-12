package designpatterns.templatemethod.logger;

public class DatabaseLogger extends AbstractLogger {

  public DatabaseLogger(boolean consoleLogging) {
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
