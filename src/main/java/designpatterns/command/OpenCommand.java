package designpatterns.command;

public class OpenCommand extends Command {

  private final Application application;
  
  public OpenCommand(Application application) {
    this.application = application;
  }
  
  @Override
  public void execute() {
    String nameDocument = askUser();
    if(nameDocument != null) {
      Document document = new Document(nameDocument);
      application.add(document);
      document.open();
    }
  }

  private String askUser() {
    return "";
  }
  
}
