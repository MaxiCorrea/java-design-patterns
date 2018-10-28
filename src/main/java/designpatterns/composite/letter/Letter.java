package designpatterns.composite.letter;

public class Letter extends LetterComposite {

  private final char c;

  public Letter(char c) {
    this.c = c;
  }

  @Override
  protected void printThisBefore() {
    System.out.print(c);
  }

}
