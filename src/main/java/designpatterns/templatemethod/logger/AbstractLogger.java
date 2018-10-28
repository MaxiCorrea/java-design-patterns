package designpatterns.templatemethod.logger;

public abstract class AbstractLogger {

  private boolean consoleLogging;

  public AbstractLogger(boolean consoleLogging) {
    this.consoleLogging = consoleLogging;
  }

  public boolean isConsoleLogging() {
    return consoleLogging;
  }

  public void setConsoleLogging(boolean consoleLogging) {
    this.consoleLogging = consoleLogging;
  }

  public final void log(Object message) {
    String messageToLog = serializeMessage(message);
    openDataStoreOperation();
    logMessage(messageToLog);
    closeDataStoreOperation();
    if (consoleLogging) {
      logToConsole(messageToLog);
    }
  }

  abstract void openDataStoreOperation();

  abstract void logMessage(String messageToLog);

  abstract void closeDataStoreOperation();

  private String serializeMessage(Object message) {
    return message.toString();
  }

  private void logToConsole(String messageToLog) {
    System.out.println("Writing in Console : " + messageToLog);
  }

}
