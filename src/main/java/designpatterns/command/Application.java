package designpatterns.command;

import java.util.ArrayList;
import java.util.List;

public class Application {

  private List<Document> documents;
  
  public Application() {
    documents = new ArrayList<>();
  }
  
  public void add(Document document) {
    this.documents.add(document);
  }

}
