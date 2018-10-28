package designpatterns.templatemethod.logger;

public class FileLogger extends AbstractLogger {

  public FileLogger(boolean consoleLogging) {
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
