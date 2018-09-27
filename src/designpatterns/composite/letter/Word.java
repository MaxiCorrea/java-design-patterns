package designpatterns.composite.letter;

import java.util.List;

public class Word extends LetterComposite {

  public Word(List<Letter> letters) {
    for (Letter l : letters) {
      add(l);
    }
  }
  
  @Override
  protected void printThisBefore() {
    System.out.print(" ");
  }
  
}
