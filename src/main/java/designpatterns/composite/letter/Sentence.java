package designpatterns.composite.letter;

import java.util.List;

public class Sentence extends LetterComposite {

  public Sentence(List<Word> words) {
    for(Word word : words) {
      add(word);
    }
  }
  
  @Override
  protected void printThisAfter() {
    System.out.print(".");
  }
  
}
